package com.senacor.bdm.tests.validation

import com.senacor.bdm.tests.DslInjectorProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static com.senacor.bdm.validation.biz.DocumentValidator.*
import static org.junit.jupiter.api.Assertions.*

@ExtendWith(InjectionExtension)
@InjectWith(DslInjectorProvider)
class DocumentValidationTest extends AbstractBizModelValidationTest {

	@Test
	def void testDocumentHasPackage() {
		createDocument("test")
		
		assertTrue(b.throwsNoErrors)
	}
	
	@Test
	def void testDocumentHasNoPackage() {
		val doc = createDocument("test")
		doc.name = null
		
		assertTrue(b.throwsOnlyError(DOCUMENT__NEEDS_PACKAGE))
	}
	
	@Test
	def void testDocumentHasEmptyPackage() {
		val doc = createDocument("test")
		doc.name = ""
		
		assertTrue(b.throwsOnlyError(DOCUMENT__NEEDS_PACKAGE))
	}
	
	
	@Test
	def void testDocumentPackageIsAlwaysStartingLowerCase() {
		createDocument("iAm.starting.lOwer","test")
		
		assertTrue(b.throwsNoErrors)
	}

	@Test
	def void testDocumentPackageIsNotAlwaysStartingLowerCase() {
		createDocument("Iam.starting.uPper","test")
		
		assertTrue(b.throwsOnlyError(DOCUMENT__PACKAGE_SECTIONS_START_LOWER_CASE))
	}
}
