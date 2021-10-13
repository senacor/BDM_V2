package com.senacor.bdm.validation.biz

import com.senacor.bdm.model.metamodel.Import
import com.senacor.bdm.model.metamodel.ImportContainer
import com.senacor.bdm.validation.AbstractBdmValidator
import org.eclipse.xtext.validation.Check
import static com.senacor.bdm.helpers.StringHelper.*


import static com.senacor.bdm.model.metamodel.MetamodelPackage.Literals.*

class ImportContainerValidator extends AbstractBdmValidator {

	public static val String CODE__PREFIX = CODE__PREFIX_ALL + "Import.";

	public static val String IMPORT_MUST_HAVE_AT_LEAST_ONE_ITEM = CODE__PREFIX + "ImportOneItem";

	public static val String IMPORTCONTAINER_IMPORT_MUST_BE_UNIQUE = CODE__PREFIX + "ImportIsUnique";
	
	public static val String IMPORTCONTAINER_IMPORT_SUBSECTION_MUST_BEGIN_LOWER = CODE__PREFIX + "ImportSubSectionLower";
	
	public static val String IMPORTCONTAINER_IMPORT_SUBSECTION_MUST_BEGIN_UPPER = CODE__PREFIX + "ImportSubSectionUpper";

	@Check
	def checkImportHasAtLeastOneItem(Import imp) {
		if (imp.item.nullOrEmpty)
			error("Ein Import muss mindestens ein nicht leeres Item besitzen", imp, IMPORT__ITEM,
				IMPORT_MUST_HAVE_AT_LEAST_ONE_ITEM)

	}

	@Check
	def checkImportisUnique(ImportContainer ic) {
		val allImports = ic.imports
				
		for (import : allImports) {
			if (ic.imports.filter[it.item == import.item].size > 1)
				warning("Import doppelt vorhanden", import, IMPORT__ITEM, IMPORTCONTAINER_IMPORT_MUST_BE_UNIQUE)
		}

	}
	
	/**
	 * 1. holt sich das import item
	 * 2. splitet den import an allen "punkten"
	 * 3. itereirt über die einzelnen import segmente und checkt die gross/klein schreibung  
	 * 3.a. checkt ob alle parent import sections klein beginnen
	 * 3.b  checkt ob das letzte element mit grossbuchstaben beginnt
	 */
	@Check
	def checkImportSyntax(Import impt){
		
		
		var import_item = impt.item
		var import_subsections = import_item.split('.')
		var length_of_import = import_subsections.length
		for(var itter=0 ; itter< length_of_import-2; itter++){
			val _sub_string = import_subsections.get(itter)
			if(!isFirstLower(_sub_string) ){
				error("Nur das konkrete Element eines Importes darf gross geschrieben werden!",impt, IMPORT__ITEM,
				IMPORTCONTAINER_IMPORT_SUBSECTION_MUST_BEGIN_LOWER)
			}
		}
		if(!isFirstUpper(import_subsections.get(length_of_import-1))){
			error("Das konkrete Element eines Importes muss gross geschrieben werden!",impt, IMPORT__ITEM,
				IMPORTCONTAINER_IMPORT_SUBSECTION_MUST_BEGIN_UPPER)
		}
	}
}

