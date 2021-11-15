package com.senacor.bdm.modelsupport

import com.senacor.bdm.model.metamodel.BaseEntity
import com.senacor.bdm.model.metamodel.BusinessKey
import com.senacor.bdm.model.metamodel.Entity
import com.senacor.bdm.model.metamodel.Field
import com.senacor.bdm.model.metamodel.Import
import com.senacor.bdm.model.metamodel.LogDocument
import com.senacor.bdm.model.metamodel.Member
import javax.inject.Inject
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

class BizModelBuilder extends AbstractModelBuilder {
	
	@Inject
	@FinalFieldsConstructor
	new() {}
	
	/** Creates a new, empty {@link BaseEntity} with the provided name in a new document. The document will be named like the entity. */
	def createBaseEntity(String providedName) {
		val doc = createDocument(providedName)
		createBaseEntity(doc, providedName)
	}
	
	/** Creates a new, empty {@link BaseEntity} with the provided name in the provided document. */
	def createBaseEntity(LogDocument doc, String providedName) {
		return fact.createBaseEntity => [
			name = providedName
			logdocument = doc
		]
	}
		
	/** Creates a new {@link Field} in the provided entity. */
	def createField(Entity ent, String providedName) {
		return fact.createField => [
			name = providedName
			entity = ent
		]
	}
	
	/** Creates a new {@link BusinessKey} in the provided {@link BaseEntity}. */
	def createBusinessKey(BaseEntity ent, String providedName) {
		return fact.createBusinessKey => [
			name = providedName
			baseentity = ent
		]
	}

	/** Returns the document's import container or creates a new one if it does not exists yet. 
	 * Never returns null.*/
	private def getOrCreateImportContainer(LogDocument doc){
		var r = doc.importcontainer
		if (r === null) {
			r = fact.createImportContainer => [
				document = doc
			]
		}  
		return r
	}
		
	/** Creates a new {@link Import} with the provided name and adds it to the provided document's import container. 
	 * The container will be created if it did not exist yet. Never returns null. */
	def createImport(LogDocument doc, String providedName){
		return fact.createImport => [
			item = providedName
			importcontainer = getOrCreateImportContainer(doc)
		]
	}
	/** Imports the provided Member into to provided document. If the imported member has no qualified name, an empty String is imported. */
	def createImport(LogDocument doc, Member m){
		createImport(doc, m.qualifiedName.map[toString].orElse(""))
	}
	
	
}