package com.senacor.bdm.validation.biz

import com.senacor.bdm.model.metamodel.Import
import com.senacor.bdm.model.metamodel.ImportContainer
import com.senacor.bdm.validation.AbstractBdmValidator
import org.eclipse.xtext.validation.Check

import static com.senacor.bdm.model.metamodel.MetamodelPackage.Literals.*

class ImportContainerValidator extends AbstractBdmValidator {

	public static val String CODE__PREFIX = CODE__PREFIX_ALL + "Import.";

	public static val String IMPORT_MUST_HAVE_AT_LEAST_ONE_ITEM = CODE__PREFIX + "ImportOneItem";

	public static val String IMPORTCONTAINER_IMPORT_MUST_BE_UNIQUE = CODE__PREFIX + "ImportIsUnique";

	@Check
	def checkImportHasAtLeastOneItem(Import imp) {
		if (imp.item.nullOrEmpty)
			error("Ein Import muss mindestens ein nicht leeres Item besitzen", imp, IMPORT__ITEM,
				IMPORT_MUST_HAVE_AT_LEAST_ONE_ITEM)

	}

	@Check
	def checkImportisUnique(ImportContainer ic) {
		val allImports = ic.imports
		
		ic.imports.forEach[println(it.item)]
		
		for (import : allImports) {
			if (ic.imports.filter[it.item == import.item].size > 1)
				warning("Import doppelt vorhanden", import, IMPORT__ITEM, IMPORTCONTAINER_IMPORT_MUST_BE_UNIQUE)
		}

	}
}
