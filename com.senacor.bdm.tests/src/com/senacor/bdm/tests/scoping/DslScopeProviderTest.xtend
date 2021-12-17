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
		val docWithImports = b.createDocument("MyTestDocument")
		val entity = docWithImports.createBaseEntity('OwnEntity')
		entity.createField('OwnField')
		entity.createBusinessKey('OwnBusinessKey')

		val imported = b.createBaseEntity("Imported")
		imported.createField('ImportedField')
		docWithImports.createImport(imported)

		val docNotImported = b.createDocument("NotImportedtDocument")
		val entityNotImported = docNotImported.createBaseEntity('NotImportedEntity')
		entityNotImported.createField('NotImportedField')

		val scope = scopeProvider.getScope(entity.businesskeys.head, BUSINESS_KEY__FIELDS)

		val String expected = 
		'''	
			Imported.ImportedField -> com.senacor.test.Imported.ImportedField
			OwnEntity.OwnField -> com.senacor.test.OwnEntity.OwnField
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
