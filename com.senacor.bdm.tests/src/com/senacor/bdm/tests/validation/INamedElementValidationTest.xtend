package com.senacor.bdm.tests.validation

import com.senacor.bdm.tests.DslInjectorProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static org.junit.jupiter.api.Assertions.*

@ExtendWith(InjectionExtension)
@InjectWith(DslInjectorProvider)
class INamedElementValidationTest extends AbstractValidationTest {

	@Test
	def void testINamedElementIsFirstUpper() {
		val extension it = newBizBuilder()
		
		createBaseEntity("Test")
		
		assertTrue(throwsNoErrors)
	}
	
}
