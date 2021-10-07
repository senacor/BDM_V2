package com.senacor.bdm.tests.testsupport

import com.senacor.bdm.model.metamodel.BaseEntity
import com.senacor.bdm.modelsupport.BizModelBuilder
import javax.inject.Singleton

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
}