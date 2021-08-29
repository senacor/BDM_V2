/**
 */
package com.senacor.bdm.model.metamodel;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link com.senacor.bdm.model.metamodel.Member#getFielddeclarations <em>Fielddeclarations</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Fielddeclarations</b></em>' containment reference list.
	 * The list contents are of type {@link com.senacor.bdm.model.metamodel.FieldDeclaration}.
	 * It is bidirectional and its opposite is '{@link com.senacor.bdm.model.metamodel.FieldDeclaration#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fielddeclarations</em>' containment reference list.
	 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getMember_Fielddeclarations()
	 * @see com.senacor.bdm.model.metamodel.FieldDeclaration#getMember
	 * @model opposite="member" containment="true"
	 * @generated
	 */
	EList<FieldDeclaration> getFielddeclarations();

} // Member
