package com.senacor.bdm.generator.entity

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.senacor.bdm.model.metamodel.Member
import com.senacor.bdm.model.metamodel.BaseEntity

class entity_yaml extends AbstractGenerator{
	
	val OUTPUTPATH = '../gen/yaml/entity/'
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (e : input.allContents.toIterable.filter(Member)) {
                fsa.generateFile(OUTPUTPATH+e.name.toLowerCase+".yaml",e.compile)
        }
		
	}
	
	
	def compile(Member member){
		var txt = member.name+":\n"
		txt = txt +"\t"+"tables:"+"\n"
		if (member instanceof BaseEntity) {
			txt = txt+"\t"+"\t"+member.name
			
		}
	}
	
	def gen_entity(BaseEntity entity) 
		'''
		«entity.name»
		'''
	
}