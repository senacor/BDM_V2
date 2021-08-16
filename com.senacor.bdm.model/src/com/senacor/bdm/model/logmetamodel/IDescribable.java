/**
 */
package com.senacor.bdm.model.logmetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDescribable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.senacor.bdm.model.logmetamodel.IDescribable#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.senacor.bdm.model.logmetamodel.LogmetamodelPackage#getIDescribable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IDescribable extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.senacor.bdm.model.logmetamodel.LogmetamodelPackage#getIDescribable_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.senacor.bdm.model.logmetamodel.IDescribable#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // IDescribable
