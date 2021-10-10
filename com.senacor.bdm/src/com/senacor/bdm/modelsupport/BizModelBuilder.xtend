package com.senacor.bdm.modelsupport

import com.senacor.bdm.model.metamodel.BaseEntity
import com.senacor.bdm.model.metamodel.Entity
import com.senacor.bdm.model.metamodel.Field
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
	
	/** Creates a new, empty {@link ImportContainer} with the provided name. */
	def createImportContainer(String documentName){
		val doc = createDocument(documentName)
		
		return fact.createImportContainer => [
			document = doc
		]
	}

	/** Creates a new {@link Import} with the provided name. */
	def createImport(String providedName){
		return fact.createImport => [
			item = providedName
		]
	}
	
}