package com.senacor.bdm.tests.validation

import com.senacor.bdm.tests.DslInjectorProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static com.senacor.bdm.validation.biz.ImportContainerValidator.*
import static org.junit.jupiter.api.Assertions.*
import org.eclipse.xtext.diagnostics.Severity

@ExtendWith(InjectionExtension)
@InjectWith(DslInjectorProvider)
class ImportContainerValidatorTest extends AbstractBizModelValidationTest {
	
	
	@Test
	def void importIsUnique(){
		val ic = b.createImportContainer_Complete("Kunde")
		ic.imports.add(b.createImport("com.senacor.Test2"))
		assertTrue(b.throwsNoErrors)

		ic.imports.add(b.createImport("com.senacor.Test2"))
		assertTrue(b.throwsOnlyIssueOfType(IMPORTCONTAINER_IMPORT_MUST_BE_UNIQUE, Severity.WARNING))
		
	}
	@Test
	def void importHasAtLeastOneItem(){
		val ic = b.createImportContainer("Kunde")

		ic.imports.add(b.createEmptyImport)
		assertTrue(b.throwsOnlyIssueOfType(IMPORT_MUST_HAVE_AT_LEAST_ONE_ITEM, Severity.ERROR))
		
	}
}