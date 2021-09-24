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
class DocumentValidationTest extends AbstractValidationTest {

	@Test
	def void testDocumentHasPackage() {
		val extension it = newBizBuilder()
		
		createDocument("test")
		
		assertTrue(throwsNoErrors)
	}
	
	@Test
	def void testDocumentHasNoPackage() {
		val extension it = newBizBuilder()
		
		val doc = createDocument("test")
		doc.name = null
		
		assertTrue(throwsOnlyError(DOCUMENT__NEEDS_PACKAGE))
	}
	
	@Test
	def void testDocumentHasEmptyPackage() {
		val extension it = newBizBuilder()
		
		val doc = createDocument("test")
		doc.name = ""
		
		assertTrue(throwsOnlyError(DOCUMENT__NEEDS_PACKAGE))
	}
}
