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
		val imported = b.createBaseEntity_Complete("Imported")
		
		b.createBaseEntity_Complete("NotImported")
		
		val thatsMe = b.createBaseEntity_Complete("ThatsMe")
		thatsMe.document.createImport(imported)
		
		val scope = scopeProvider.getScope(thatsMe.businesskeys.head, BUSINESS_KEY__FIELDS)
		
		val String expected =
			'''	
			Imported.MeinTestFeld1 -> com.senacor.test.Imported.MeinTestFeld1
			com.senacor.test.Imported.MeinTestFeld1 -> com.senacor.test.Imported.MeinTestFeld1
			com.senacor.test.NotImported.MeinTestFeld1 -> com.senacor.test.NotImported.MeinTestFeld1
			MeinTestFeld1 -> com.senacor.test.ThatsMe.MeinTestFeld1
			ThatsMe.MeinTestFeld1 -> com.senacor.test.ThatsMe.MeinTestFeld1
			com.senacor.test.ThatsMe.MeinTestFeld1 -> com.senacor.test.ThatsMe.MeinTestFeld1
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
