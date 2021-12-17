package com.senacor.bdm.modelsupport

import com.senacor.bdm.model.metamodel.INamedElement
import com.senacor.bdm.model.metamodel.Import
import com.senacor.bdm.model.metamodel.LogDocument
import com.senacor.bdm.model.metamodel.Member
import java.util.Map
import java.util.Optional
import javax.inject.Inject
import javax.inject.Singleton
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName

import static extension java.util.Optional.*
import com.senacor.bdm.model.metamodel.Entity
import static extension com.senacor.bdm.helpers.IndexHelper.*

/** Contains helper methods that simplify dealing with the "generic", i.e., common, part of our metamodel. 
 * All methods should not be static, i.e, they may use other injected classes.
 */
@Singleton
class CommonModelSupport {

	@Inject
	@FinalFieldsConstructor
	new() {
	}

	val IQualifiedNameProvider qnp
	val IQualifiedNameConverter qnc

	/** Returns the containing element of the provided type or null if it does not exist. */
	def <T extends EObject> T getContainerOfType(EObject o, Class<T> clazz) {
		EcoreUtil2.getContainerOfType(o, clazz)
	}

	/** Returns the containing {@link Member} or null if it does not exist. */
	def getMember(EObject o) {
		getContainerOfType(o, Member)
	}

	/** Returns the containing LogDocument or null if it does not exist. */
	def getDocument(EObject o) {
		EcoreUtil2.getContainerOfType(o, LogDocument)
	}

	/****************************/
	/*  Qualified Name Returner */
	/** Returns the qualified name of the provided member. */
	def getQualifiedName(Member member) {
		qnp.getFullyQualifiedName(member).ofNullable
	}

	/** Returns the qualified name of the provided INamedElement. */
	def getQualifiedName(INamedElement iNamedElement) {
		qnp.getFullyQualifiedName(iNamedElement)
	}

	/** Returns a map that maps each imported simple name to its qualified name. If multiple 
	 * imported items have the same simple name it is unspecified which qualified name will be contained in the map.
	 */
	def Optional<QualifiedName> getFullyQualifiedNameOfImports(LogDocument doc, String simpleName) {
		doc.getImportedQualifiedNamesBySimpleName.get(simpleName).ofNullable
	}

	private def getImportedQualifiedNamesBySimpleName(LogDocument doc) {
		doc.importcontainer.imports.map[qualifiedName].toMap[lastSegment]
	}

	/****************************/
	/* Qualified Name Converter */
	/** Converts the string of to a qualified name. */
	def getQualifiedName(String qn) {
		if (qn === null)
			throw new IllegalArgumentException("The qualified Name must not be null")
		return qnc.toQualifiedName(qn)
	}

	/** Converts the string of the import to a qualified name. */
	def QualifiedName getQualifiedName(Import imp) {
		qnc.toQualifiedName(imp.item)
	}

	/****************************/
	/* Qualified Name Checks    */
	/** Checks if provided qualified name is imported in the provided document */
	def boolean isQualifiedNameImported(LogDocument doc, QualifiedName qn) {
		doc.getImportedQualifiedNamesBySimpleName.isImported(qn)
	}

	/** Checks if provided simple name is imported in the provided document */
	def boolean isSimpleNameImported(LogDocument doc, String simpleName) {
		doc.getImportedQualifiedNamesBySimpleName.isImported(simpleName)
	}

	private def boolean isImported(Map<String, QualifiedName> qualifiedToSimpleNames, QualifiedName qualifiedName) {
		qualifiedToSimpleNames.containsValue(qualifiedName)
	}

	private def boolean isImported(Map<String, QualifiedName> qualifiedToSimpleNames, String simpleName) {
		qualifiedToSimpleNames.containsKey(simpleName)
	}

	/** Returns true if the provided simpleName of the field is part of an entity of the provided document. */
	def isFieldOfDocument(LogDocument doc, String simpleName) {
		val entities = doc.members.filter[it instanceof Entity].map[it as Entity].toList
		for(entity : entities)
			if(entity.fields.filter[name==simpleName].size > 0)
				return true
		
		return false
	}

}
