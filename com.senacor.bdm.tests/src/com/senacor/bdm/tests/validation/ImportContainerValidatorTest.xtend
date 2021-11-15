package com.senacor.bdm.tests.validation

import com.senacor.bdm.tests.DslInjectorProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static com.senacor.bdm.validation.biz.ImportContainerValidator.*
import static org.junit.jupiter.api.Assertions.*

@ExtendWith(InjectionExtension)
@InjectWith(DslInjectorProvider)
class ImportContainerValidatorTest extends AbstractBizModelValidationTest {
	
	/**
	 * Creates a valid import container (containing already one valid import) and adds a second valid Import.
	 * Then adds a third import with the same name (item) as the second.
	 */
	@Test
	def void importIsUnique(){
		createImports("Kunde", "com.senacor.Test2", "com.senacor.Test2")
		assertTrue(b.throwsOnlyWarning(IMPORTCONTAINER_IMPORT_MUST_BE_UNIQUE))
		
	}
	@Test
	def void importHasAtLeastOneItem(){
		createImports("Kunde", "")

		assertTrue(b.throwsOnlyError(IMPORT_MUST_HAVE_AT_LEAST_ONE_ITEM))	
	}
	
	
	@Test
	def void importSectionsUpperCase(){
		createImports("Kunde", "com.senacor.test2")

		assertTrue(b.throwsOnlyError(IMPORTCONTAINER_IMPORT_SUBSECTION_MUST_BEGIN_UPPER))
	}
	
	@Test
	def void importSectionsLowerCase(){
		createImports("Kunde", "com.Senacor.Test2")
		
		assertTrue(b.throwsOnlyError(IMPORTCONTAINER_IMPORT_SUBSECTION_MUST_BEGIN_LOWER))
		
	}
	
	@Test
	def void importNoDuplicatesInLastSegment(){
		createImports("Kunde", "com.senacor.Test2", "de.senacor.Test2")
		assertTrue(b.throwsOnlyError(IMPORT_LAST_SEGMENT_IS_UNIQUE))
		
	}
	
	private def createImports(String fileName, String... imports) {
		val doc = b.createDocument(fileName)
		imports.forEach[doc.createImport(it)]
	}
}