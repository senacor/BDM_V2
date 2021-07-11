/**
 */
package com.senacor.bdm.model.logmetamodel;

import com.senacor.bdm.model.commonmetamodel.Document;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.senacor.bdm.model.logmetamodel.LogDocument#getBaseentities <em>Baseentities</em>}</li>
 * </ul>
 *
 * @see com.senacor.bdm.model.logmetamodel.LogmetamodelPackage#getLogDocument()
 * @model
 * @generated
 */
public interface LogDocument extends Document {
	/**
	 * Returns the value of the '<em><b>Baseentities</b></em>' containment reference list.
	 * The list contents are of type {@link com.senacor.bdm.model.logmetamodel.BaseEntity}.
	 * It is bidirectional and its opposite is '{@link com.senacor.bdm.model.logmetamodel.BaseEntity#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baseentities</em>' containment reference list.
	 * @see com.senacor.bdm.model.logmetamodel.LogmetamodelPackage#getLogDocument_Baseentities()
	 * @see com.senacor.bdm.model.logmetamodel.BaseEntity#getDocument
	 * @model opposite="document" containment="true"
	 * @generated
	 */
	EList<BaseEntity> getBaseentities();

} // LogDocument
