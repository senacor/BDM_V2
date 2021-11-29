package com.senacor.bdm.helpers

import com.google.inject.Inject
import com.senacor.bdm.modelsupport.CommonModelSupport
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.IResourceDescriptions
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider

class IndexHelper {
	val extension IResourceServiceProvider.Registry
	val extension ResourceDescriptionsProvider
	val extension IContainer.Manager 
	val extension CommonModelSupport

	@Inject
	@FinalFieldsConstructor
	new() {
	}

	
	def getVisibleResources(Resource resource) {
		var visibleResources = new ArrayList<IResourceDescription>
		val index = resource.index
		val descr = index.getResourceDescription(resource.URI)
		for (visibleContainer : descr.getVisibleContainers(index)) 
			for (visibleResourceDesc : visibleContainer.resourceDescriptions) 
				visibleResources.add(visibleResourceDesc)
			
		return visibleResources
	}

	/** Returns all {@link IEObjectDescription}s of the provided type with the specified fully qualified name. */
	def searchIndexByName(EObject from, EClass type, String name) {
		searchIndexByName(from, type, name.qualifiedName)
	}

	/** Returns all {@link IEObjectDescription}s of the provided type with the specified fully qualified name. */
	def searchIndexByName(EObject from, EClass type, QualifiedName name) {
		if (from === null)
			return emptyList
		val r = from.eResource
		getVisibleEObjectDescriptionsByName(r, type, name)
	}

	/** Returns all {@link IEObjectDescription}s of the provided type. */
	def searchIndexByType(EObject from, EClass type) {
		from.eResource.getVisibleEObjectDescriptions(type)
	}

	/** Returns all eObject descriptions of a provided type that are visible from a provided object o. */
	private def getVisibleEObjectDescriptions(Resource resource, EClass type) {
		resource.getVisibleContainers.map[it.getExportedObjectsByType(type)].flatten
	}

	/** Returns all eObject descriptions of a provided type that are visible from a provided object o. */
	private def getVisibleEObjectDescriptionsByName(Resource resource, EClass type, QualifiedName fqn) {
		resource.getVisibleContainers.map [it.getExportedObjects(type, fqn, false)].flatten
	}

	/** Returns all containers that are visible from a provided resource r. A container is, e.g., an Eclipse project or a class path item. */
	private def List<IContainer> getVisibleContainers(Resource resource) {
		if (resource === null)
			return emptyList
		val index = getIndex(resource)
		val rd = index.getResourceDescription(resource.URI)
		if (rd === null)
			return emptyList

		rd.getVisibleContainers(index)
	}

	private def IResourceDescriptions getIndex(Resource resource) {
		resource.getResourceDescriptions
	}

	/**
	 * Test Methode welche während des Kennenlernens des Index hilfreich war. Ich lasse sie noch stehen da sie vl. jemand anders noch von Nutzen ist
	 */
	def void printExportedObjects(Resource resource) {
		val resServiceProvider = resource.URI.getResourceServiceProvider
		val manager = resServiceProvider.getResourceDescriptionManager()
		val description = manager.getResourceDescription(resource)
		for (eod : description.exportedObjects) {
			println('''exported Objects: «eod.qualifiedName»''')
		}
	}

}
