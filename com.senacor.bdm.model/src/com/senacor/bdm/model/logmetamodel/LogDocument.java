/**
 */
package com.senacor.bdm.model.logmetamodel;

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
 *   <li>{@link com.senacor.bdm.model.logmetamodel.LogDocument#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see com.senacor.bdm.model.logmetamodel.LogmetamodelPackage#getLogDocument()
 * @model
 * @generated
 */
public interface LogDocument extends com.senacor.bdm.model.logmetamodel.Document {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link com.senacor.bdm.model.logmetamodel.member}.
	 * It is bidirectional and its opposite is '{@link com.senacor.bdm.model.logmetamodel.member#getLogdocument <em>Logdocument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see com.senacor.bdm.model.logmetamodel.LogmetamodelPackage#getLogDocument_Member()
	 * @see com.senacor.bdm.model.logmetamodel.member#getLogdocument
	 * @model opposite="logdocument" containment="true"
	 * @generated
	 */
	EList<member> getMember();

} // LogDocument
