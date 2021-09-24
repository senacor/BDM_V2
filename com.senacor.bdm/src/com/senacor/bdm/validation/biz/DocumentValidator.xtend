package com.senacor.bdm.validation.biz

import com.senacor.bdm.model.metamodel.LogDocument
import com.senacor.bdm.validation.AbstractBdmValidator
import org.eclipse.xtext.validation.Check

import static com.senacor.bdm.model.metamodel.MetamodelPackage.Literals.*

class DocumentValidator extends AbstractBdmValidator {
	public static val String CODE__PREFIX = CODE__PREFIX_ALL + "document.";
	
	public static val String DOCUMENT__NEEDS_PACKAGE = CODE__PREFIX + "NeedsPackage";
	
	
	@Check
	def checkDocumentHasPackage(LogDocument d) {
		if (d.name.nullOrEmpty) {
			error("Dieses Dokument benötigt eine Package Deklaration", d, DOCUMENT__NAME, DOCUMENT__NEEDS_PACKAGE)
		}
	}
	
	
	
}
