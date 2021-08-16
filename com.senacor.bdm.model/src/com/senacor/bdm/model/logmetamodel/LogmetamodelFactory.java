/**
 */
package com.senacor.bdm.model.logmetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.senacor.bdm.model.logmetamodel.LogmetamodelPackage
 * @generated
 */
public interface LogmetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogmetamodelFactory eINSTANCE = com.senacor.bdm.model.logmetamodel.impl.LogmetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Log Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Document</em>'.
	 * @generated
	 */
	LogDocument createLogDocument();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LogmetamodelPackage getLogmetamodelPackage();

} //LogmetamodelFactory
