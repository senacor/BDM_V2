/**
 */
package com.senacor.bdm.model.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.senacor.bdm.model.metamodel.BaseEntity#getName <em>Name</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.BaseEntity#getLogdocument <em>Logdocument</em>}</li>
 * </ul>
 *
 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getBaseEntity()
 * @model
 * @generated
 */
public interface BaseEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getBaseEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.senacor.bdm.model.metamodel.BaseEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Logdocument</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.senacor.bdm.model.metamodel.LogDocument#getBaseentities <em>Baseentities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logdocument</em>' container reference.
	 * @see #setLogdocument(LogDocument)
	 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getBaseEntity_Logdocument()
	 * @see com.senacor.bdm.model.metamodel.LogDocument#getBaseentities
	 * @model opposite="baseentities" transient="false"
	 * @generated
	 */
	LogDocument getLogdocument();

	/**
	 * Sets the value of the '{@link com.senacor.bdm.model.metamodel.BaseEntity#getLogdocument <em>Logdocument</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logdocument</em>' container reference.
	 * @see #getLogdocument()
	 * @generated
	 */
	void setLogdocument(LogDocument value);

} // BaseEntity
