package com.senacor.bdm.modelsupport

import com.senacor.bdm.model.metamodel.LogDocument
import com.senacor.bdm.model.metamodel.MetamodelFactory
import javax.inject.Inject
import javax.inject.Provider
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.resource.XtextResourceSet

abstract class AbstractModelBuilder {
	protected val static fact = MetamodelFactory.eINSTANCE 
	
	protected val extension CommonModelSupport
	
	@Inject
	@FinalFieldsConstructor
	new() {}
	 
	/** The package new documents will currently be created in. */
	@Accessors
	var String currentPackage = "com.senacor.test"
	
	var ResourceSet rset 
	
	@Inject
	def init(Provider<XtextResourceSet> rsetProv) {
		rset = rsetProv.get
	} 
	
	/** Creates a new Document in the current package. */
	def createDocument(String filename) {
		createDocument(currentPackage, filename)
	}
	
	/** Creates a new Document with the provided package name. */
	def createDocument(String pack, String filename) {
		val doc =  fact.createLogDocument => [
			name = pack
		]
		addToModel(doc, filename)
		return doc
	}
	
	/** Creates a new Resource for the provided document. */
	protected final def void addToModel(LogDocument doc, String filename) {
		val path = doc.name.replace(".", "/")
		val res = rset.createResource(URI.createURI('''file:/«path»/«filename».«fileExtension»'''))
		res.contents += doc
	}
	
	def getFileExtension() {
		"bdm"
	}
	
	/** Returns the resource set that contains the underlying model, i.e., all stored documents. */
	def ResourceSet getResourceSet() {
		rset
	}
}