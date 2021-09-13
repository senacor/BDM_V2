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
	
	/** Returns true if and only if at least one error of the provided errorCode is thrown after validating the 
	 * model currently contained in the provided builder <b>and</b> no unexpected errors are thrown. If false
	 * is returned, any  
	 */
	def boolean throwsOnlyError(AbstractModelBuilder it, String errorCode) {
		val errors = allErrors
		val expectedErrors = errors.filter[code == errorCode]
		val unexpectedErrors  = errors.filter[code != errorCode]
		
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
		
		return expectedErrorsFound && !unexpectedErrorsFound
	}
	
	/** Returns true if and only if there are no validation errors present in the underlying model contained
	 * by the provided builder. Warnings will not be checked and may thus be present.
	 */
	def boolean throwsNoErrors(AbstractModelBuilder it) {
		val errors = allErrors
		val errorsExist = !errors.nullOrEmpty
		
		if (errorsExist) {
			println('''The following errors occurred:''')
			for (error : allErrors) {
				println('''«error.code» - «error»''')
			}
		}
		
		return !errorsExist
	}
	
	/** Returns all Issues of level ERROR or above. */
	def getAllErrors(AbstractModelBuilder builder) {
		val rset = builder.resourceSet
		
		val allIssues = rset.resources.flatMap[
			valTestHelper.validate(it)
		]
		
		val allErrors = allIssues.filter[
			severity <= Severity.ERROR
		]
		return allErrors
	}
}
