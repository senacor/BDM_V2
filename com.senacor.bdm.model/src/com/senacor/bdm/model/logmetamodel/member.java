/**
 */
package com.senacor.bdm.model.logmetamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.senacor.bdm.model.logmetamodel.member#getLogdocument <em>Logdocument</em>}</li>
 * </ul>
 *
 * @see com.senacor.bdm.model.logmetamodel.LogmetamodelPackage#getmember()
 * @model abstract="true"
 * @generated
 */
public interface member extends IDescribable {
	/**
	 * Returns the value of the '<em><b>Logdocument</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.senacor.bdm.model.logmetamodel.LogDocument#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logdocument</em>' container reference.
	 * @see #setLogdocument(LogDocument)
	 * @see com.senacor.bdm.model.logmetamodel.LogmetamodelPackage#getmember_Logdocument()
	 * @see com.senacor.bdm.model.logmetamodel.LogDocument#getMember
	 * @model opposite="member" transient="false"
	 * @generated
	 */
	LogDocument getLogdocument();

	/**
	 * Sets the value of the '{@link com.senacor.bdm.model.logmetamodel.member#getLogdocument <em>Logdocument</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logdocument</em>' container reference.
	 * @see #getLogdocument()
	 * @generated
	 */
	void setLogdocument(LogDocument value);

} // member
