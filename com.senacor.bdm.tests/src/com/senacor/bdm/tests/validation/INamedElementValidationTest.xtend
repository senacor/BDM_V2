package com.senacor.bdm.tests.validation

import com.senacor.bdm.tests.DslInjectorProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static com.senacor.bdm.validation.biz.INamedElementValidator.*
import static org.junit.jupiter.api.Assertions.*
import org.eclipse.xtext.diagnostics.Severity

@ExtendWith(InjectionExtension)
@InjectWith(DslInjectorProvider)
class INamedElementValidationTest extends AbstractBizModelValidationTest {
	
	@Test
	def void testINamedElementIsFirstUpper() {
		b.createBaseEntity_Complete("Test")
		assertTrue(b.throwsNoErrors)

	}

	@Test
	def void test_INAMED_ELEMENT__IS_FIRST_UPPER1() {
		val be = b.createBaseEntity_Complete("Test")
		be.createField("testFeld")

		assertTrue(b.throwsOnlyError(INAMED_ELEMENT__IS_FIRST_UPPER))
	}
	
	@Test
	def void test_INAMED_ELEMENT__IS_FIRST_UPPER2() {
		val be = b.createBaseEntity_Complete("Test")
		be.createBusinessKey("bk1")

		assertTrue(b.throwsOnlyError(INAMED_ELEMENT__IS_FIRST_UPPER))
	}

}
