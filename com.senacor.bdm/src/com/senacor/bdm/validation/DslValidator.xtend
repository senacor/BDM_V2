/*
 * generated by Xtext 2.25.0
 */
package com.senacor.bdm.validation

import com.senacor.bdm.validation.biz.DocumentValidator
import org.eclipse.xtext.validation.ComposedChecks
import com.senacor.bdm.validation.biz.INamedElementValidator
import com.senacor.bdm.validation.biz.BaseEntityValidator
import com.senacor.bdm.validation.biz.MemberValidator
import com.senacor.bdm.validation.biz.ImportContainerValidator

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@ComposedChecks(validators=#[
	BaseEntityValidator, 
	MemberValidator,
	DocumentValidator,
	INamedElementValidator,
	ImportContainerValidator
])
class DslValidator extends AbstractDslValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					DslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	
}
