package com.senacor.bdm.validation.biz

import com.senacor.bdm.model.metamodel.Import
import com.senacor.bdm.model.metamodel.ImportContainer
import com.senacor.bdm.validation.AbstractBdmValidator
import java.util.ArrayList
import java.util.regex.Pattern
import org.eclipse.xtext.validation.Check

import static extension com.senacor.bdm.helpers.StringHelper.*
import static com.senacor.bdm.model.metamodel.MetamodelPackage.Literals.*

class ImportContainerValidator extends AbstractBdmValidator {

	public static val String CODE__PREFIX = CODE__PREFIX_ALL + "Import.";

	public static val String IMPORT_MUST_HAVE_AT_LEAST_ONE_ITEM = CODE__PREFIX + "ImportOneItem";

	public static val String IMPORT_LAST_SEGMENT_IS_UNIQUE = CODE__PREFIX + "ImportLastSegment";

	public static val String IMPORTCONTAINER_IMPORT_MUST_BE_UNIQUE = CODE__PREFIX + "ImportIsUnique";

	public static val String IMPORTCONTAINER_IMPORT_SUBSECTION_MUST_BEGIN_LOWER = CODE__PREFIX +
		"ImportSubSectionLower";

	public static val String IMPORTCONTAINER_IMPORT_SUBSECTION_MUST_BEGIN_UPPER = CODE__PREFIX +
		"ImportSubSectionUpper";

	@Check
	def checkImportHasAtLeastOneItem(Import imp) {
		if (imp.item.nullOrEmpty)
			error("Ein Import muss mindestens ein nicht leeres Item besitzen", imp, IMPORT__ITEM,
				IMPORT_MUST_HAVE_AT_LEAST_ONE_ITEM)

	}

	@Check
	def checkImportisUnique(ImportContainer ic) {
		val allImports = ic.imports

		for (import : allImports)
			if (ic.imports.filter[it.item == import.item].size > 1)
				warning("Import doppelt vorhanden", import, IMPORT__ITEM, IMPORTCONTAINER_IMPORT_MUST_BE_UNIQUE)
	}

	@Check
	def checkNoImportsWithSameLaseSegment(ImportContainer ic) {
		for (import : ic.imports)
			if (ic.imports.filter[it.item.lastSegment == import.item.lastSegment].size > 1)
				error("Das letzte Segment eines Imports darf nur einmal vorhanden sein", import, IMPORT__ITEM,
					IMPORT_LAST_SEGMENT_IS_UNIQUE)
	}

	/**
	 * 1. holt sich das import item
	 * 2. splitet den import an allen "punkten"
	 * 3. itereirt über die einzelnen import segmente   
	 * 4. checkt ob alle parent import sections klein beginnen
	 * 5. drope aktuelles element
	 */
	@Check
	def checkImportSyntaxFirstPart(Import imp) {

		var import_item = imp.item
		var import_subsections = import_item.split(Pattern.quote("."))
		var length_of_import = import_subsections.length

		var itter = 0
		while (length_of_import > 1) {
			if (!isFirstLower(import_subsections.get(itter)) && !import_subsections.get(itter).isNullOrEmpty) {
				error("Die Parent Elemente eines Imports müssen klein geschrieben werden", imp, IMPORT__ITEM,
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
	def checkImportSyntaxLastPart(Import impt) {

		var import_item = impt.item
		var import_subsections = import_item.split(Pattern.quote("."))

		if (!isFirstUpper(import_subsections.last) && !import_subsections.last.isNullOrEmpty) {
			error("Das letzte Element eines Imports muss gross geschrieben werden", impt, IMPORT__ITEM,
				IMPORTCONTAINER_IMPORT_SUBSECTION_MUST_BEGIN_UPPER)
		}

	}
}
