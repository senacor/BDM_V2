package com.senacor.bdm.modelsupport

import com.senacor.bdm.model.metamodel.LogDocument
import com.senacor.bdm.model.metamodel.Member
import java.util.Optional
import javax.inject.Inject
import javax.inject.Singleton
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName

import static extension java.util.Optional.*
import com.senacor.bdm.model.metamodel.Import
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

/** Contains helper methods that simplify dealing with the "generic", i.e., common, part of our metamodel. 
 * All methods should not be static, i.e, they may use other injected classes.
 */
@Singleton
class CommonModelSupport {
	
	@Inject
	@FinalFieldsConstructor
	new(){}
	
	val IQualifiedNameProvider qnp
	val IQualifiedNameConverter qnc
	
	/** Returns the qualified name of the provided member. */
	def getQualifiedName(Member member) {
		qnp.getFullyQualifiedName(member).ofNullable
	}
	
	def Optional<QualifiedName> getFullyQualifiedName(LogDocument doc, String simpleName) {
		doc.getImportedQualifiedNamesBySimpleName.get(simpleName).ofNullable
	}
	
	/** Returns a map that maps each imported simple name to its qualified name. If multiple 
	 * imported items have the same simple name it is unspecified which qualified name will be contained in the map.
	 */
	private def getImportedQualifiedNamesBySimpleName(LogDocument doc) {
		doc.importcontainer.imports.map[qualifiedName].toMap[lastSegment]
	} 
	
	/** Converts the string of the import to a qualified name. */
	def QualifiedName getQualifiedName(Import imp) {
		qnc.toQualifiedName(imp.item)
	}
	
}