package com.senacor.bdm.tests.scoping

import com.google.inject.Inject
import com.senacor.bdm.scoping.DslScopeProvider
import com.senacor.bdm.tests.DslInjectorProvider
import com.senacor.bdm.tests.validation.AbstractBizModelValidationTest
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static com.senacor.bdm.model.metamodel.MetamodelPackage.Literals.*
import static org.junit.jupiter.api.Assertions.*

@ExtendWith(InjectionExtension)
@InjectWith(DslInjectorProvider)
class DslScopeProviderTest extends AbstractBizModelValidationTest {

	@Inject
	DslScopeProvider scopeProvider

	@Test
	def void provideIndexTest() {
		val vertrag = b.createBaseEntity_Complete("Vertrag")
		
		val kredit = b.createBaseEntity_Complete("Kredit")
		kredit.document.createImport(vertrag)
		
		val kunde = b.createBaseEntity_Complete("Kunde")
		kunde.document.createImport(vertrag)
		
		val scope = scopeProvider.getScope(kunde.businesskeys.head, BUSINESS_KEY__FIELDS)
		
		val String expected =
			'''	
			com.senacor.test.Kredit.MeinTestFeld1 -> com.senacor.test.Kredit.MeinTestFeld1
			MeinTestFeld1 -> com.senacor.test.Kunde.MeinTestFeld1
			Kunde.MeinTestFeld1 -> com.senacor.test.Kunde.MeinTestFeld1
			com.senacor.test.Kunde.MeinTestFeld1 -> com.senacor.test.Kunde.MeinTestFeld1
			Vertrag.MeinTestFeld1 -> com.senacor.test.Vertrag.MeinTestFeld1
			com.senacor.test.Vertrag.MeinTestFeld1 -> com.senacor.test.Vertrag.MeinTestFeld1
			'''
		
		assertEquals(expected, scope.print)
	}
	
	def String print(IScope scope) {
		'''
		«FOR e : scope.allElements.sortBy[qualifiedName]»
			«e.name» -> «e.qualifiedName»
		«ENDFOR»
		'''
	}
	
	
}
