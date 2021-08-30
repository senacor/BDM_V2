/**
 */
package com.senacor.bdm.model.metamodel;

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
 *   <li>{@link com.senacor.bdm.model.metamodel.LogDocument#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getLogDocument()
 * @model
 * @generated
 */
public interface LogDocument extends Document {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link com.senacor.bdm.model.metamodel.Member}.
	 * It is bidirectional and its opposite is '{@link com.senacor.bdm.model.metamodel.Member#getLogdocument <em>Logdocument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getLogDocument_Members()
	 * @see com.senacor.bdm.model.metamodel.Member#getLogdocument
	 * @model opposite="logdocument" containment="true"
	 * @generated
	 */
	EList<Member> getMembers();

} // LogDocument
