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
	
	
	/** Returns true if and only if at least one issue of the provided issueCode and severity is thrown after validating the 
	 * model currently contained in the provided builder <b>and</b> no unexpected issues are thrown. 
	 */
	def boolean throwsOnlyIssueOfType(AbstractModelBuilder it, String issueCode, Severity severity) {
		val issues = allIssuesOfGivenSeverity(severity)
		val expectedIssues= issues.filter[code == issueCode]
		val unexpectedIssues= issues.filter[code != issueCode]
		
		val expectedIssuesFound = !expectedIssues.nullOrEmpty
		val unexpectedIssuesFound = !unexpectedIssues.nullOrEmpty
		
		if (!expectedIssuesFound) {
			println('''Missing expected Issue: «issueCode»''')
		}
		if (unexpectedIssuesFound) {
			println('''The following unexpected issues were thrown:''')
			for (issue : unexpectedIssues) {
				println('''«issue.code» - «issue»''')
			}
		}
		
		return expectedIssuesFound && !unexpectedIssuesFound
	}
	
	/** Returns all Issues of given severity. */
	def allIssuesOfGivenSeverity(AbstractModelBuilder builder, Severity severityType) {
		val rset = builder.resourceSet
		
		val allIssues = rset.resources.flatMap[
			valTestHelper.validate(it)
		]
		
		val allIssuesOfGivenSeverity= allIssues.filter[
			severity == severityType
		]
		return allIssuesOfGivenSeverity
	}
	
	
	/** Returns true if and only if there are no validation errors present in the underlying model contained
	 * by the provided builder. Warnings will not be checked and may thus be present.
	 */
	def boolean throwsNoErrors(AbstractModelBuilder it) {
		val errors = allIssuesOfGivenSeverity(Severity.ERROR)
		val errorsExist = !errors.nullOrEmpty
		
		if (errorsExist) {
			println('''The following errors occurred:''')
			for (error : allIssuesOfGivenSeverity(Severity.ERROR)) {
				println('''«error.code» - «error»''')
			}
		}
		
		return !errorsExist
	}

}
