/**
 */
package com.senacor.bdm.model.logmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.senacor.bdm.model.logmetamodel.Field#getDtype <em>Dtype</em>}</li>
 * </ul>
 *
 * @see com.senacor.bdm.model.logmetamodel.LogmetamodelPackage#getField()
 * @model
 * @generated
 */
public interface Field extends INamedElement, member {
	/**
	 * Returns the value of the '<em><b>Dtype</b></em>' attribute.
	 * The literals are from the enumeration {@link com.senacor.bdm.model.logmetamodel.DataTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtype</em>' attribute.
	 * @see com.senacor.bdm.model.logmetamodel.DataTypes
	 * @see #setDtype(DataTypes)
	 * @see com.senacor.bdm.model.logmetamodel.LogmetamodelPackage#getField_Dtype()
	 * @model
	 * @generated
	 */
	DataTypes getDtype();

	/**
	 * Sets the value of the '{@link com.senacor.bdm.model.logmetamodel.Field#getDtype <em>Dtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtype</em>' attribute.
	 * @see com.senacor.bdm.model.logmetamodel.DataTypes
	 * @see #getDtype()
	 * @generated
	 */
	void setDtype(DataTypes value);

} // Field
