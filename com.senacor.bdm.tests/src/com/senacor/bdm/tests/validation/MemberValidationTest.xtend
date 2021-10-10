package com.senacor.bdm.tests.validation

import com.senacor.bdm.tests.DslInjectorProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static com.senacor.bdm.validation.biz.MemberValidator.*
import static org.junit.jupiter.api.Assertions.*
import org.eclipse.xtext.diagnostics.Severity

@ExtendWith(InjectionExtension)
@InjectWith(DslInjectorProvider)
class MemberValidationTest extends AbstractBizModelValidationTest {

	@Test
	def void testMemberIsFirstUpper() {
		b.createBaseEntity_Complete("Kredit")
		assertTrue(b.throwsNoErrors)
		
		b.createBaseEntity_Complete("kunde")
		
		assertTrue(b.throwsOnlyIssueOfType(MEMBER_IS_FIRST_UPPER, Severity.ERROR))
	}	
}
