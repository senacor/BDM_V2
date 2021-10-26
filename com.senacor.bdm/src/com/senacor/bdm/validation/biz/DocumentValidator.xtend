package com.senacor.bdm.validation.biz

import com.senacor.bdm.model.metamodel.LogDocument
import com.senacor.bdm.validation.AbstractBdmValidator
import org.eclipse.xtext.validation.Check

import static com.senacor.bdm.model.metamodel.MetamodelPackage.Literals.*
import org.eclipse.xtext.util.Strings

import static extension com.senacor.bdm.helpers.StringHelper.*

class DocumentValidator extends AbstractBdmValidator {
	public static val String CODE__PREFIX = CODE__PREFIX_ALL + "document.";

	public static val String DOCUMENT__NEEDS_PACKAGE = CODE__PREFIX + "NeedsPackage";
	public static val String DOCUMENT__PACKAGE_SECTIONS_START_LOWER_CASE = CODE__PREFIX + "PackageSectionsShouldStartLowerCase"
	public static val String DOCUMENT__FILE_NAME_IDENTICAL_TO_ONLY_MEMBER = CODE__PREFIX + "IfOnlyOneMemberFileNameHasToBeIdenticalToMember"

	@Check
	def checkDocumentHasPackage(LogDocument d) {
		if (d.name.nullOrEmpty) {
			error("Dieses Dokument benötigt eine Package Deklaration", d, DOCUMENT__NAME, DOCUMENT__NEEDS_PACKAGE)
		}
	}

	@Check
	def checkDocumentPackageSectionsStartWithLower(LogDocument d) {
		val sections = Strings.split(d.name, ".")
		for (section : sections) {
			if (section.isFirstUpper) {
				error(
					"Dieses Dokument enthält eine Package Deklaration, die aus Sektionen mit Großbuchstaben am Anfang besteht",
					d, DOCUMENT__NAME, DOCUMENT__PACKAGE_SECTIONS_START_LOWER_CASE)
			}
		}
	}

	@Check
	def checkIfDocumentHasOnlyOneMemberItIsNamedLikeIt(LogDocument d) {
		val documentName = d.eResource.URI.filenameWithoutExtension

		if (d.members.size == 1 && documentName != d.members.last.name) {
			error("Enthält ein Dokument nur ein Member, müssen der Name des Members und der Dateiname identisch sein.", d,
				DOCUMENT__NAME, DOCUMENT__FILE_NAME_IDENTICAL_TO_ONLY_MEMBER)
		}

	}

}
