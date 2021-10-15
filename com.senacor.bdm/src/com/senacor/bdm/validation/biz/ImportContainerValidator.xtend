package com.senacor.bdm.validation.biz

import com.senacor.bdm.model.metamodel.Import
import com.senacor.bdm.model.metamodel.ImportContainer
import com.senacor.bdm.validation.AbstractBdmValidator
import org.eclipse.xtext.validation.Check
import static com.senacor.bdm.helpers.StringHelper.*


import static com.senacor.bdm.model.metamodel.MetamodelPackage.Literals.*
import java.util.regex.Pattern

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
	 * 3. itereirt über die einzelnen import segmente   
	 * 4. checkt ob alle parent import sections klein beginnen
	 * 5. drope aktuelles element
	 */
	@Check
	def checkImportSyntaxFirstPart(Import impt){
		
		
		var import_item = impt.item
		var import_subsections = import_item.split(Pattern.quote("."))
		var length_of_import = import_subsections.length
		
		var itter = 0
		while (length_of_import > 1){
			if(!isFirstLower(import_subsections.get(itter))){
				error("die parent elemente eines importes muessen kein geschrieben werden", impt, IMPORT__ITEM,
				IMPORTCONTAINER_IMPORT_SUBSECTION_MUST_BEGIN_LOWER)
			}
			import_subsections = import_subsections.drop(1)
			length_of_import = length_of_import - 1
		}
		
		
	}
	
	/**
	 * 1. holt sich das import item
	 * 2. splitet den import an allen "punkten"
	 * 3  checkt ob das letzte element mit grossbuchstaben beginnt
	 */
	@Check
	def checkImportSyntaxLastPart(Import impt){
		
		
		var import_item = impt.item
		var import_subsections = import_item.split(Pattern.quote("."))
		
		
		if(!isFirstUpper(import_subsections.last)){
			error("das letzte element eines imports muss gross geschrieben werden", impt, IMPORT__ITEM,
			IMPORTCONTAINER_IMPORT_SUBSECTION_MUST_BEGIN_UPPER)
		}
	
		
		
	}
}

