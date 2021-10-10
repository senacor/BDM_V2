package com.senacor.bdm.tests.testsupport

import com.senacor.bdm.model.metamodel.BaseEntity
import com.senacor.bdm.modelsupport.BizModelBuilder
import javax.inject.Singleton
import com.senacor.bdm.model.metamodel.ImportContainer

@Singleton
class BizModelBuilderTestSupport {
	
	/** Creates a new, empty {@link BaseEntity} with the provided name in a new document. 
	 * The document will be named like the entity.
	 * <p>
	 * The returned element will be valid in the sense that no validator will produce any errors.
	 */
	def createBaseEntity_Complete(extension BizModelBuilder builder, String providedName) {
		createBaseEntity(providedName) => [
			createField("MeinTestFeld1")
			createBusinessKey("MeinBk1")
		]
	}
	
	/** Creates a new, empty {@link ImportContainer} with an default {@link Import} com.senacor.Test1. 
	 * <p>
	 * The returned element will be valid in the sense that no validator will produce any errors.
	 */
	def createImportContainer_Complete(extension BizModelBuilder builder, String documentName) {
		createImportContainer(documentName) => [
			imports.add(createImport("com.senacor.Test1"))
		]
	}
	
	/** Creates a new {@link Import} with an empty "" name. */
	def createEmptyImport(extension BizModelBuilder builder){
		return createImport("") 
	}
	
}