package com.senacor.bdm.tests.validation

import com.senacor.bdm.tests.DslInjectorProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static org.junit.jupiter.api.Assertions.*

import static com.senacor.bdm.validation.biz.INamedElementValidator.*

@ExtendWith(InjectionExtension)
@InjectWith(DslInjectorProvider)
class INamedElementValidationTest extends AbstractValidationTest {

	@Test
	def void testINamedElementIsFirstUpper() {
		val extension it = newBizBuilder()
		
		val be = createBaseEntity("Test")
		be.createField("TestFeld")
		
		assertTrue(throwsNoErrors)
		
		
	}
	
	@Test
	def void test_INAMED_ELEMENT__IS_FIRST_UPPER() {
		val extension it = newBizBuilder()
		
		val be = createBaseEntity("Test")
		be.createField("testFeld")
		
		
		assertTrue(throwsOnlyError(INAMED_ELEMENT__IS_FIRST_UPPER))
	}
	
}
