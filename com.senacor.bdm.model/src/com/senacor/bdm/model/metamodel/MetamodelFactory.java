/**
 */
package com.senacor.bdm.model.metamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.senacor.bdm.model.metamodel.MetamodelPackage
 * @generated
 */
public interface MetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelFactory eINSTANCE = com.senacor.bdm.model.metamodel.impl.MetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Log Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Document</em>'.
	 * @generated
	 */
	LogDocument createLogDocument();

	/**
	 * Returns a new object of class '<em>Tech Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tech Document</em>'.
	 * @generated
	 */
	TechDocument createTechDocument();

	/**
	 * Returns a new object of class '<em>Mapping Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Document</em>'.
	 * @generated
	 */
	MappingDocument createMappingDocument();

	/**
	 * Returns a new object of class '<em>Extension Satelite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension Satelite</em>'.
	 * @generated
	 */
	ExtensionSatelite createExtensionSatelite();

	/**
	 * Returns a new object of class '<em>Base Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Entity</em>'.
	 * @generated
	 */
	BaseEntity createBaseEntity();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Business Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Key</em>'.
	 * @generated
	 */
	BusinessKey createBusinessKey();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetamodelPackage getMetamodelPackage();

} //MetamodelFactory
