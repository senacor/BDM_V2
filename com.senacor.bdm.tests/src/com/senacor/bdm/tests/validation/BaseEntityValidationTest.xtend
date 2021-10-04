package com.senacor.bdm.tests.validation

import com.senacor.bdm.tests.DslInjectorProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static org.junit.jupiter.api.Assertions.*
import static com.senacor.bdm.validation.biz.BaseEntityValidator.*

@ExtendWith(InjectionExtension)
@InjectWith(DslInjectorProvider)
class BaseEntityValidationTest extends AbstractBizModelValidationTest {

	@Test
	def void baseEntityHasAtLeastOneField() {
		val be = createBaseEntity("Kredit")
		be.createBusinessKey("Bk1")
		
		assertTrue(b.throwsOnlyError(BASEENTITY_MUST_HAVE_AT_LEAST_ONE_FIELD))
		
		be.createField("Field1")
		assertTrue(b.throwsNoErrors)
	}
	
	@Test
	def void baseEntityHasAtLeastOneBK() {
		val be = createBaseEntity("Kredit")
		be.createField("Field1")
		
		assertTrue(b.throwsOnlyError(BASEENTITY_MUST_HAVE_AT_LEAST_ONE_BK))
		
		be.createBusinessKey("Bk")
		assertTrue(b.throwsNoErrors)
	}
}
