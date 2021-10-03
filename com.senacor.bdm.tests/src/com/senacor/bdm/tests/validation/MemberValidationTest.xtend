package com.senacor.bdm.tests.validation

import com.senacor.bdm.tests.DslInjectorProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static com.senacor.bdm.validation.biz.MemberValidator.*
import static org.junit.jupiter.api.Assertions.*

@ExtendWith(InjectionExtension)
@InjectWith(DslInjectorProvider)
class MemberValidationTest extends AbstractBizModelValidationTest {

	@Test
	def void testMemberIsFirstUpper() {
		val be = createBaseEntity("Kredit")
		be.createField("Field1")
		be.createBusinessKey("Bk1")
		assertTrue(b.throwsNoErrors)
		
		val be2 = createBaseEntity("kunde")
		be2.createField("Field1")
		be2.createBusinessKey("Bk1")
		
		assertTrue(b.throwsOnlyError(MEMBER_IS_FIRST_UPPER))
	}	
}
