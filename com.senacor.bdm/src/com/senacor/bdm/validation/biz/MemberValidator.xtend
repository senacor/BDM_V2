package com.senacor.bdm.validation.biz

import com.senacor.bdm.model.metamodel.Member
import com.senacor.bdm.validation.AbstractBdmValidator
import org.eclipse.xtext.validation.Check

import static com.senacor.bdm.model.metamodel.MetamodelPackage.Literals.*

import static extension com.senacor.bdm.helpers.StringHelper.*

class MemberValidator extends AbstractBdmValidator {
	public static val String CODE__PREFIX = CODE__PREFIX_ALL + "member.";
	
	public static val String MEMBER_IS_FIRST_UPPER 	= CODE__PREFIX + "IsFirstUpper";
	
	
	@Check
	def checkMemberStartsWithCapitalLetter(Member m) {
		if (!m.name.isFirstUpper()) {
			error("Der Name dieses Elements muss mit einem Großbuchstaben beginnen", m, INAMED_ELEMENT__NAME, MEMBER_IS_FIRST_UPPER)
		}
	}
	
	
	
}
