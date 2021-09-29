/**
 */
package com.senacor.bdm.model.metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.senacor.bdm.model.metamodel.Member#getLogdocument <em>Logdocument</em>}</li>
 * </ul>
 *
 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getMember()
 * @model abstract="true"
 * @generated
 */
public interface Member extends INamedElement {
	/**
	 * Returns the value of the '<em><b>Logdocument</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.senacor.bdm.model.metamodel.LogDocument#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logdocument</em>' container reference.
	 * @see #setLogdocument(LogDocument)
	 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getMember_Logdocument()
	 * @see com.senacor.bdm.model.metamodel.LogDocument#getMembers
	 * @model opposite="members" transient="false"
	 * @generated
	 */
	LogDocument getLogdocument();

	/**
	 * Sets the value of the '{@link com.senacor.bdm.model.metamodel.Member#getLogdocument <em>Logdocument</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logdocument</em>' container reference.
	 * @see #getLogdocument()
	 * @generated
	 */
	void setLogdocument(LogDocument value);

} // Member
