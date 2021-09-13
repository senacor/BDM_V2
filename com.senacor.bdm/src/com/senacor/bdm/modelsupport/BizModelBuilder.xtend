package com.senacor.bdm.modelsupport

import com.senacor.bdm.model.metamodel.BaseEntity
import com.senacor.bdm.model.metamodel.LogDocument

class BizModelBuilder extends AbstractModelBuilder {
	
	
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
	
}