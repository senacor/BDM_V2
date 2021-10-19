package com.senacor.bdm.validation.biz

import com.senacor.bdm.model.metamodel.INamedElement
import com.senacor.bdm.model.metamodel.Member
import com.senacor.bdm.validation.AbstractBdmValidator
import java.util.ArrayList
import org.eclipse.xtext.validation.Check

import static com.senacor.bdm.model.metamodel.MetamodelPackage.Literals.*

import static extension com.senacor.bdm.helpers.StringHelper.*

class MemberValidator extends AbstractBdmValidator {
	public static val String CODE__PREFIX = CODE__PREFIX_ALL + "member.";
	
	public static val String MEMBER_IS_FIRST_UPPER 	= CODE__PREFIX + "IsFirstUpper";
	public static val String MEMBER_NO_DUPLICATE_NAMES_INSIDE_MEMBER 	= CODE__PREFIX + "NoDuplicateNamesInsideMember";
	
	
	@Check
	def checkMemberStartsWithCapitalLetter(Member m) {
		if (!m.name.isFirstUpper()) {
			error("Der Name dieses Elements muss mit einem Großbuchstaben beginnen.", m, INAMED_ELEMENT__NAME, MEMBER_IS_FIRST_UPPER)
		}
	}	
	
	@Check
	def checkMemberHasNoDuplicateChilds(Member m){

		var allChildNames = new ArrayList<String>
		
		for(child : m.eContents){
			var cin = child as INamedElement
			allChildNames += cin.name
		}
			
		for(name : allChildNames)
			if (allChildNames.filter[it == name].size > 1){
				error("Der Name eines Elements darf innerhalb eines Members nicht doppelt vergeben werden.", m, INAMED_ELEMENT__NAME, MEMBER_NO_DUPLICATE_NAMES_INSIDE_MEMBER)
			}
			
	}
}
