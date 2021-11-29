package com.senacor.bdm.tests.modelsupport

import com.google.inject.Inject
import com.senacor.bdm.tests.DslInjectorProvider
import com.senacor.bdm.tests.validation.AbstractBizModelValidationTest
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static org.junit.jupiter.api.Assertions.*

@ExtendWith(InjectionExtension)
@InjectWith(DslInjectorProvider)
class CommonModelSupportTest extends AbstractBizModelValidationTest {
	
	@Inject
	extension IQualifiedNameConverter qnc
	
	@Test
	def void testRetrieveFqnForImportedMember() {
		val ent = b.createBaseEntity_Complete("Test")
		
		val doc = b.createDocument("MyTestDocument")
		doc.createImport(ent)
		
		assertEquals("com.senacor.test.Test", doc.getFullyQualifiedNameOfImports("Test").map[toString].get)
	}

	@Test
	def void testCheckIsImported() {
	
		val doc = b.createDocument("MyTestDocument")
		doc.createImport("com.senacor.testimport")
		
		assertTrue(doc.isQualifiedNameImported(qnc.toQualifiedName("com.senacor.testimport")))
		
	}

}
