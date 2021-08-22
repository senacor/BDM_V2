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
 *   <li>{@link com.senacor.bdm.model.metamodel.BaseEntity#getDocument <em>Document</em>}</li>
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
	 * Returns the value of the '<em><b>Document</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.senacor.bdm.model.metamodel.Document#getBaseentities <em>Baseentities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' container reference.
	 * @see #setDocument(Document)
	 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getBaseEntity_Document()
	 * @see com.senacor.bdm.model.metamodel.Document#getBaseentities
	 * @model opposite="baseentities" transient="false"
	 * @generated
	 */
	Document getDocument();

	/**
	 * Sets the value of the '{@link com.senacor.bdm.model.metamodel.BaseEntity#getDocument <em>Document</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' container reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Document value);

} // BaseEntity