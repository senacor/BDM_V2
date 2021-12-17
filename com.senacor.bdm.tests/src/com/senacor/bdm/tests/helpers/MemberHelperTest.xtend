package com.senacor.bdm.tests.helpers

import com.google.inject.Inject
import com.senacor.bdm.tests.DslInjectorProvider
import com.senacor.bdm.tests.validation.AbstractBizModelValidationTest
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static org.junit.jupiter.api.Assertions.*
import com.senacor.bdm.helpers.MemberHelper

@ExtendWith(InjectionExtension)
@InjectWith(DslInjectorProvider)
class MemberHelperTest extends AbstractBizModelValidationTest {
	
	@Inject
	extension IQualifiedNameConverter qnc
	
	@Test
	def void getMemberSimpleNameTest() {
		val uut = new MemberHelper
				
		assertEquals('Test', uut.getMemberSimpleName(qnc.toQualifiedName('com.senacor.test.Test')))
	}

	@Test
	def void getPrefixedNameTest() {
		val uut = new MemberHelper
				
		assertEquals(qnc.toQualifiedName('Kredit.Feld'), uut.getPrefixedName(qnc.toQualifiedName('com.senacor.test.Kredit.Feld')))
	}

}