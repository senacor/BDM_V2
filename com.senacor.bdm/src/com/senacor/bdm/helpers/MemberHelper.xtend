package com.senacor.bdm.helpers

import com.senacor.bdm.model.metamodel.Import
import java.util.regex.Pattern
import org.eclipse.xtext.resource.XtextResourceSet

class MemberHelper {

	def static isImportShortName(Import imp) {
		if (imp.item.split(Pattern.quote(".")).length === 1) {
			return true
		}

	}

	def getAllURIs() {

		var resourceSet = new XtextResourceSet()
		return resourceSet.URIResourceMap

	}

	def qNametoFullQName(Import imp) {
		if (isImportShortName(imp)) {
			val allResources = allURIs
			for (resource : allResources.keySet()) {
				if (resource.lastSegment === imp.item.toString) {
					return resource
				}

			}
		} else {
			return imp
		}

	}

}
