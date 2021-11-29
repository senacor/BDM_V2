package com.senacor.bdm.modelsupport

import com.senacor.bdm.model.metamodel.INamedElement
import com.senacor.bdm.model.metamodel.Import
import com.senacor.bdm.model.metamodel.LogDocument
import com.senacor.bdm.model.metamodel.Member
import java.util.Map
import java.util.Optional
import javax.inject.Inject
import javax.inject.Singleton
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName

import static extension java.util.Optional.*

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
		doc.getImportedQualifiedNamesBySimpleName.isImported(qnc.toQualifiedName(simpleName))
	}

	private def boolean isImported(Map<String, QualifiedName> qualifiedToSimpleNames, QualifiedName qualifiedName) {
		qualifiedToSimpleNames.containsValue(qualifiedName)
	}

}
