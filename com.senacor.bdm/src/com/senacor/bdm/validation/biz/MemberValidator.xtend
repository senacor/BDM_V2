package com.senacor.bdm.validation.biz

import com.senacor.bdm.model.metamodel.Member
import com.senacor.bdm.validation.AbstractDslValidator
import org.eclipse.xtext.validation.Check
import com.senacor.bdm.model.metamodel.MetamodelPackage
import static com.senacor.bdm.model.metamodel.MetamodelPackage.Literals.*
class MemberValidator extends AbstractDslValidator {
	public static val String CODE__PREFIX_ALL = "com.senacor.bdm.validation.";
	
	public static val String CODE__PREFIX = CODE__PREFIX_ALL + "member.";
	
	public static val String MEMBER_IS_FIRST_UPPER 	= CODE__PREFIX + "IsFirstUpper";
	
	
	@Check
	def checkMemberStartsWithCapitalLetter(Member m) {
		if (!m.name.isFirstUpper()) {
			error("Der Name dieses Elements muss mit einem Großbuchstaben beginnen", m, INAMED_ELEMENT__NAME)
		}
	}
	
	/** Returns true if and only if the provided string starts with an upper case character. 
	 * Returns false if the argument is null.
	 */
	def isFirstUpper(String string) {
		if (string.nullOrEmpty)
			return false
		Character.isUpperCase(string.charAt(0))
	}
	
	
}
