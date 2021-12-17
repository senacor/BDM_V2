/*
 * generated by Xtext 2.25.0
 */
package com.senacor.bdm.scoping

import com.google.inject.Inject
import com.senacor.bdm.helpers.IndexHelper
import com.senacor.bdm.model.metamodel.BusinessKey
import com.senacor.bdm.modelsupport.CommonModelSupport
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.AliasedEObjectDescription
import org.eclipse.xtext.scoping.impl.SimpleScope

import static com.senacor.bdm.model.metamodel.MetamodelPackage.Literals.*

import static extension com.senacor.bdm.helpers.StringHelper.*
import com.senacor.bdm.helpers.MemberHelper

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */

class DslScopeProvider extends AbstractDslScopeProvider {

	@Inject extension IndexHelper
	@Inject extension CommonModelSupport commonModelSupport
	@Inject extension MemberHelper

	override getScope(EObject context, EReference reference) {

		if (reference == BUSINESS_KEY__FIELDS) {
			if (context instanceof BusinessKey) {
				val doc = context.document
	
				var qNsOfImportedAndOwnBaseEntities = newArrayList
				qNsOfImportedAndOwnBaseEntities.addAll(doc.importcontainer.imports.map[qualifiedName])
				qNsOfImportedAndOwnBaseEntities.addAll(doc.members.map[qualifiedName.orElseThrow])
	
				var allFields = context.searchIndexByType(FIELD)
				
				// TODO: 
				// 1) implement Case 1.
				// 2) refactor (and test!) QualifiedName helper methods (-> e.g., in static public QualifiedNameHelper )
				// 3) Implement "Shadowing" for Scopes (more specific names should "hide" more general ones)
				// 		Hint: Scopes can be stacked / be contained in other scopes. Build a hierarchy of scopes!
				// 		Hint2: See documenation! https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
				
//				1. MeinTestFeld1 -> com.senacor.test.ThatsMe.MeinTestFeld1
//				2. ThatsMe.MeinTestFeld1 -> com.senacor.test.ThatsMe.MeinTestFeld1
//				3. com.senacor.test.ThatsMe.MeinTestFeld1 -> com.senacor.test.ThatsMe.MeinTestFeld1
	
				val importedFields = allFields
					.filter[doc.isSimpleNameImported(it.qualifiedName.memberSimpleName)]
					.map[
						rename(it, qualifiedName.prefixedName)
					]
					.toList
	
				var candidates = newArrayList
				candidates += importedFields
				candidates += allFields
				
 				val scope = new SimpleScope(candidates)
	
				return scope
			}
		}
		return super.getScope(context, reference)
	}
	
	/** Creates a new IEObjectDescription that delegates to the provided one but uses a different alias. */
	def IEObjectDescription rename(IEObjectDescription description, QualifiedName alias) {
		new AliasedEObjectDescription(alias, description)
	}	
}
