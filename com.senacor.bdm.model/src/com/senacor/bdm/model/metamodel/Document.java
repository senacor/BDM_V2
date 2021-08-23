/**
 */
package com.senacor.bdm.model.metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.senacor.bdm.model.metamodel.Document#getName <em>Name</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.Document#getBaseentities <em>Baseentities</em>}</li>
 * </ul>
 *
 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getDocument_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.senacor.bdm.model.metamodel.Document#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Baseentities</b></em>' containment reference list.
	 * The list contents are of type {@link com.senacor.bdm.model.metamodel.BaseEntity}.
	 * It is bidirectional and its opposite is '{@link com.senacor.bdm.model.metamodel.BaseEntity#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baseentities</em>' containment reference list.
	 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getDocument_Baseentities()
	 * @see com.senacor.bdm.model.metamodel.BaseEntity#getDocument
	 * @model opposite="document" containment="true"
	 * @generated
	 */
	EList<BaseEntity> getBaseentities();

} // Document
