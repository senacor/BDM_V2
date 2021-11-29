package com.senacor.bdm.tests.scoping

import com.google.inject.Inject
import com.senacor.bdm.helpers.IndexHelper
import com.senacor.bdm.tests.DslInjectorProvider
import com.senacor.bdm.tests.validation.AbstractBizModelValidationTest
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static com.senacor.bdm.model.metamodel.MetamodelPackage.Literals.*
import static org.junit.jupiter.api.Assertions.*

@ExtendWith(InjectionExtension)
@InjectWith(DslInjectorProvider)
class IndexHelperTest extends AbstractBizModelValidationTest {

	@Inject
	IndexHelper indexHelper

	@Test
	def void provideIndexTest() {
		val ent1 = b.createBaseEntity_Complete("Kunde")
		ent1.createField("Name")
		
		val ent2 = b.createBaseEntity_Complete("Vertrag")
		ent2.createField("Datum")
		
		val visibleFromIndex = indexHelper.searchIndexByType(ent1, FIELD)
		/* createBaseEntity legt bereits ein Testfeld an, daher Prüfung auf 4 */
		assertTrue(visibleFromIndex.length == 4)
	}
}
