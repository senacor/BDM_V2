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
	
	/**
	 * Creates a valid import container (containing already one valid import) and adds a second valid Import.
	 * Then adds a third import with the same name (item) as the second.
	 */
	@Test
	def void importIsUnique(){
		val ic = b.createImportContainer_Complete("Kunde")
		ic.imports.add(b.createImport("com.senacor.Test2"))
		//assertTrue(b.throwsNoErrors)

		ic.imports.add(b.createImport("com.senacor.Test2"))
		assertTrue(b.throwsOnlyWarning(IMPORTCONTAINER_IMPORT_MUST_BE_UNIQUE))
		
	}
	@Test
	def void importHasAtLeastOneItem(){
		val ic = b.createImportContainer("Kunde")

		ic.imports.add(b.createEmptyImport)
		assertFalse(b.throwsOnlyError(IMPORT_MUST_HAVE_AT_LEAST_ONE_ITEM))	
	}
	
	
	@Test
	def void importSectionsUpperCase(){
		val ic = b.createImportContainer_Complete("Kunde")
		ic.imports.add(b.createImport("com.senacor.test2"))

		assertFalse(b.throwsOnlyError(IMPORTCONTAINER_IMPORT_SUBSECTION_MUST_BEGIN_UPPER))
	}
	
	@Test
	def void importSectionsLowerCase(){
		val ic = b.createImportContainer_Complete("Kunde")

		ic.imports.add(b.createImport("com.Senacor.Test2"))		
		assertTrue(b.throwsOnlyError(IMPORTCONTAINER_IMPORT_SUBSECTION_MUST_BEGIN_LOWER))
		
	}
	
	@Test
	def void importNoDuplicatesInLastSegment(){
		val ic = b.createImportContainer_Complete("Kunde")

		ic.imports.add(b.createImport("com.senacor.Test2"))
		ic.imports.add(b.createImport("de.senacor.Test2"))		
		assertFalse(b.throwsOnlyError(IMPORT_LAST_SEGMENT_IS_UNIQUE))
		
	}
}