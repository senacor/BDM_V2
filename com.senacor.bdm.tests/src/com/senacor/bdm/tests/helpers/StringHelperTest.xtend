package com.senacor.bdm.tests.helpers

import com.senacor.bdm.tests.DslInjectorProvider
import com.senacor.bdm.tests.validation.AbstractBizModelValidationTest
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static com.senacor.bdm.helpers.StringHelper.*
import static org.junit.jupiter.api.Assertions.*

@ExtendWith(InjectionExtension)
@InjectWith(DslInjectorProvider)
class StringHelperTest extends AbstractBizModelValidationTest {
	
	@Test
	def void isFirstUpperTest() {
		assertTrue(isFirstUpper('Test'))
		assertFalse(isFirstUpper('test'))
	}
	
	@Test
	def void ifFirstLowerTest(){
		assertTrue(isFirstLower('test'))
		assertFalse(isFirstLower('Test'))
		
	}
	@Test
	def void getLastSegmentTest(){
		assertEquals('last', getLastSegment('first.middle.last'))
		
	}
	@Test
	def void getFilenameWithoutExtensionTest(){
		val doc = createDocument('TestDocument.edwm')
		assertEquals('TestDocument', getFilenameWithoutExtension(doc.eResource.URI))
		
	}

}