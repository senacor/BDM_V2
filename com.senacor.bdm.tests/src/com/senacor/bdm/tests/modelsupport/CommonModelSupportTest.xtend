package com.senacor.bdm.tests.modelsupport

import com.senacor.bdm.tests.DslInjectorProvider
import com.senacor.bdm.tests.validation.AbstractBizModelValidationTest
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static org.junit.jupiter.api.Assertions.*

@ExtendWith(InjectionExtension)
@InjectWith(DslInjectorProvider)
class CommonModelSupportTest extends AbstractBizModelValidationTest {
	
	@Test
	def void testRetrieveFqnForImportedMember() {
		val ent = b.createBaseEntity_Complete("Test")
		
		val doc = b.createDocument("MyTestDocument")
		doc.createImport(ent)
		
		assertEquals("com.senacor.test.Test", doc.getFullyQualifiedName("Test").map[toString].get)
	}

}
