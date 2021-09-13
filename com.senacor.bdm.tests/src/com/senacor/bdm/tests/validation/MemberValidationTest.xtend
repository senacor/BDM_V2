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
class MemberValidationTest extends AbstractValidationTest {

	@Test
	def void testMemberIsFirstUpper() {
		val extension it = newBizBuilder()
		
		val doc = createDocument("Kredit")
		doc.createBaseEntity("Kredit")
		
		assertTrue(throwsNoErrors)
		
		doc.createBaseEntity("uknde")
		
		assertTrue(throwsOnlyError(MEMBER_IS_FIRST_UPPER))
	}
}
