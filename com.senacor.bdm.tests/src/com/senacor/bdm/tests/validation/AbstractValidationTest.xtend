package com.senacor.bdm.tests.validation

import com.senacor.bdm.modelsupport.AbstractModelBuilder
import com.senacor.bdm.modelsupport.BizModelBuilder
import javax.inject.Inject
import javax.inject.Provider
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.xtext.diagnostics.Severity

abstract class AbstractValidationTest {
	
	@Inject
	Provider<BizModelBuilder> bizModelProv

	@Inject
	ValidationTestHelper valTestHelper
	
	def newBizBuilder() {
		bizModelProv.get 
	}
	
	
	def boolean throwsOnlyError(AbstractModelBuilder builder, String errorCode) {
		val rset = builder.resourceSet
		
		val allIssues = rset.resources.flatMap[
			valTestHelper.validate(it)
		]
		
		val allErrors = allIssues.filter[
			severity <= Severity.ERROR
		]
		
		val expectedErrors = allErrors.filter[
			code == errorCode
		]
		val unexpectedErrors  = allErrors.filter[
			code != errorCode
		]
		
		val expectedErrorsFound = !expectedErrors.nullOrEmpty
		val unexpectedErrorsFound = !unexpectedErrors.nullOrEmpty
		
		if (!expectedErrorsFound) {
			println('''Missing expected Error: «errorCode»''')
		}
		if (unexpectedErrorsFound) {
			println('''The following unexpected errors were thrown:''')
			for (error : unexpectedErrors) {
				println('''«error.code» - «error»''')
			}
		}
		
		return !expectedErrorsFound && unexpectedErrorsFound
	}
	
	/** Returns true if and only if there are no validation errors present in the underlying model contained
	 * by the provided builder. Warnings will not be checked and may thus be present.
	 */
	def boolean throwsNoErrors(AbstractModelBuilder builder) {
		val rset = builder.resourceSet
		
		val allIssues = rset.resources.flatMap[
			valTestHelper.validate(it)
		]
		
		val allErrors = allIssues.filter[
			severity <= Severity.ERROR
		]
		
		val errorsExist = !allErrors.nullOrEmpty
		
		if (errorsExist) {
			println('''The following errors occurred:''')
			for (error : allErrors) {
				println('''«error.code» - «error»''')
			}
		}
		
		return !errorsExist
	}
}
