package com.senacor.bdm.validation.biz

import com.senacor.bdm.model.metamodel.BaseEntity
import com.senacor.bdm.validation.AbstractBdmValidator
import org.eclipse.xtext.validation.Check

import static com.senacor.bdm.model.metamodel.MetamodelPackage.Literals.*

class BaseEntityValidator extends AbstractBdmValidator {
	public static val String CODE__PREFIX = CODE__PREFIX_ALL + "member.";

	public static val String BASEENTITY_MUST_HAVE_AT_LEAST_ONE_FIELD = CODE__PREFIX + "BaseEntityOneField";
	public static val String BASEENTITY_MUST_HAVE_AT_LEAST_ONE_BK = CODE__PREFIX + "BaseEntityOneBK";

	@Check
	def checkBaseEntityHasAtLeastOneField(BaseEntity b) {
		if (b.fields.isNullOrEmpty){
			error("Eine BaseEntity muss mindestens ein Field besitzen", b, INAMED_ELEMENT__NAME,
				BASEENTITY_MUST_HAVE_AT_LEAST_ONE_FIELD)
		}
	}
	
	@Check
	def checkBaseEntityHasAtLeastOneBusinessKey(BaseEntity b) {
		if (b.businesskeys.isNullOrEmpty){
			error("Eine BaseEntity muss mindestens einen Business Key besitzen", b, INAMED_ELEMENT__NAME,
				BASEENTITY_MUST_HAVE_AT_LEAST_ONE_BK)
		}
	}
}
