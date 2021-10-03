package com.senacor.bdm.tests.validation

import com.senacor.bdm.tests.DslInjectorProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static com.senacor.bdm.validation.biz.INamedElementValidator.*
import static org.junit.jupiter.api.Assertions.*

@ExtendWith(InjectionExtension)
@InjectWith(DslInjectorProvider)
class INamedElementValidationTest extends AbstractBizModelValidationTest {

	@Test
	def void testINamedElementIsFirstUpper() {
		val be = createBaseEntity("Test")
		be.createField("TestFeld")
		be.createBusinessKey("Bk1")
		assertTrue(b.throwsNoErrors)

	}

	@Test
	def void test_INAMED_ELEMENT__IS_FIRST_UPPER() {
		val be = createBaseEntity("Test")
		be.createField("testFeld")
		be.createBusinessKey("Bk1")

		assertTrue(b.throwsOnlyError(INAMED_ELEMENT__IS_FIRST_UPPER))
	}

}
