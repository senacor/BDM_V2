package com.senacor.bdm.helpers

import com.senacor.bdm.model.metamodel.Import
import java.util.regex.Pattern
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.XtextResourceSet
import static extension com.senacor.bdm.helpers.StringHelper.*

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

	/** Returns the simple name of the member name contained in the provided QN. For example, this would return {@code Kredit} for
	 * {@code com.senacor.test.Kredit.Feld}. 
	 */
	def String getMemberSimpleName(QualifiedName qn) {
		qn.segments.dropWhile[isFirstLower].head
	}

	/** Returns the prefixed name of the provided QN. For example, this would return {@code Kredit.Feld} for
	 * {@code com.senacor.test.Kredit.Feld}. 
	 */
	def QualifiedName getPrefixedName(QualifiedName qn) {
		val count = qn.segments.dropWhile[isFirstLower].size
		qn.skipFirst(qn.segmentCount - count)
	}

}
