package com.senacor.bdm.tests.validation

import com.senacor.bdm.tests.DslInjectorProvider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static com.senacor.bdm.validation.biz.MemberValidator.*
import static org.junit.jupiter.api.Assertions.*
import org.eclipse.xtext.diagnostics.Severity
import com.senacor.bdm.model.metamodel.BaseEntity

@ExtendWith(InjectionExtension)
@InjectWith(DslInjectorProvider)
class MemberValidationTest extends AbstractBizModelValidationTest {

	@Test
	def void testMemberIsFirstUpper() {
		b.createBaseEntity_Complete("Kredit")
		assertTrue(b.throwsNoErrors)
		
		b.createBaseEntity_Complete("kunde")
		
		assertTrue(b.throwsOnlyError(MEMBER_IS_FIRST_UPPER))
	}	
	
	@Test
	def void testMemberHasNoDuplicateChilds(){
		val doc = b.createDocument("Konto")
		
		doc.members += b.createBaseEntity_Complete(doc, "Konto")
		val entity = doc.members.last as BaseEntity
		
		entity.fields += b.createField(entity, "MeinTestFeld1")
		assertTrue(b.throwsOnlyError(MEMBER_NO_DUPLICATE_NAMES_INSIDE_MEMBER))
		
	}
}
