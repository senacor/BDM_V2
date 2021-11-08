package com.senacor.bdm.tests.validation

import com.senacor.bdm.tests.DslInjectorProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static com.senacor.bdm.validation.biz.BaseEntityValidator.*
import static org.junit.jupiter.api.Assertions.*
import org.eclipse.xtext.diagnostics.Severity

@ExtendWith(InjectionExtension)
@InjectWith(DslInjectorProvider)
class BaseEntityValidationTest extends AbstractBizModelValidationTest {

	@Test
	def void baseEntityHasAtLeastOneField() {
		val be = b.createBaseEntity_Complete("Kredit")
		assertTrue(b.throwsNoErrors)
		
		be.fields.clear
		assertTrue(b.throwsOnlyError(BASEENTITY_MUST_HAVE_AT_LEAST_ONE_FIELD))
	}
	
	@Test
	def void baseEntityHasAtLeastOneBK() {
		val be = b.createBaseEntity_Complete("Kredit")
		assertTrue(b.throwsNoErrors)
		
		be.businesskeys.clear
		assertTrue(b.throwsOnlyError(BASEENTITY_MUST_HAVE_AT_LEAST_ONE_BK))
	}
}
