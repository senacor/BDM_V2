package com.senacor.bdm.validation.biz

import com.senacor.bdm.model.metamodel.Import
import com.senacor.bdm.model.metamodel.ImportContainer
import com.senacor.bdm.validation.AbstractBdmValidator
import java.util.regex.Pattern
import org.eclipse.xtext.validation.Check

import static com.senacor.bdm.model.metamodel.MetamodelPackage.Literals.*

import static extension com.senacor.bdm.helpers.StringHelper.*

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

	@Check
	def checkImportSyntaxFirstPart(Import imp) {
		var importSubsections = imp.item.split(Pattern.quote("."))
		var lengthOfImport = importSubsections.length
		var sectionId = 0
		while (sectionId < lengthOfImport) {
			if (!isFirstLower(importSubsections.get(sectionId))) {
				error("die parent elemente eines imports muessen klein geschrieben werden", imp, IMPORT__ITEM,
					IMPORTCONTAINER_IMPORT_SUBSECTION_MUST_BEGIN_LOWER)
			}
			sectionId += 1
		}

	}

	@Check
	def checkImportSyntaxLastPart(Import impt) {
		var importSubsections = impt.item.split(Pattern.quote("."))
		if (!isFirstUpper(importSubsections.last)) {
			error("das letzte element eines imports muss gross geschrieben werden", impt, IMPORT__ITEM,
				IMPORTCONTAINER_IMPORT_SUBSECTION_MUST_BEGIN_UPPER)
		}

	}
}
