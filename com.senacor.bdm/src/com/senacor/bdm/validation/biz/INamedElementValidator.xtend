package com.senacor.bdm.validation.biz

import com.senacor.bdm.model.metamodel.INamedElement
import com.senacor.bdm.validation.AbstractBdmValidator
import org.eclipse.xtext.validation.Check

import static com.senacor.bdm.model.metamodel.MetamodelPackage.Literals.*

import static extension com.senacor.bdm.helpers.StringHelper.*

class INamedElementValidator extends AbstractBdmValidator {
	public static val String CODE__PREFIX = CODE__PREFIX_ALL + "iNamedElement.";
	
	public static val String INAMED_ELEMENT__IS_FIRST_UPPER 	= CODE__PREFIX + "IsFirstUpper";
	
	
	@Check
	def checkINamedElementStartsWithCapitalLetter(INamedElement element) {
		if (!element.name.isFirstUpper()) {
			error("Der Name dieses Elements muss mit einem Großbuchstaben beginnen", element, INAMED_ELEMENT__NAME, INAMED_ELEMENT__IS_FIRST_UPPER)
		}
	}
	
	
	
}
