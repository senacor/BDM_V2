package com.senacor.bdm.modelsupport

import com.senacor.bdm.model.metamodel.BaseEntity
import com.senacor.bdm.model.metamodel.LogDocument

class BizModelBuilder extends AbstractModelBuilder {
	
	
	/** Creates a new, empty {@link BaseEntity} with the provided name in the provided document. */
	def createBaseEntity(LogDocument doc, String providedName) {
		return fact.createBaseEntity => [
			name = providedName
			logdocument = doc
		]
	}
	
}