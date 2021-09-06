/**
 */
package com.senacor.bdm.model.metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.senacor.bdm.model.metamodel.FieldDeclaration#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getFieldDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface FieldDeclaration extends INamedElement {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.senacor.bdm.model.metamodel.Member#getFielddeclarations <em>Fielddeclarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' container reference.
	 * @see #setMember(Member)
	 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getFieldDeclaration_Member()
	 * @see com.senacor.bdm.model.metamodel.Member#getFielddeclarations
	 * @model opposite="fielddeclarations" transient="false"
	 * @generated
	 */
	Member getMember();

	/**
	 * Sets the value of the '{@link com.senacor.bdm.model.metamodel.FieldDeclaration#getMember <em>Member</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' container reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(Member value);

} // FieldDeclaration
