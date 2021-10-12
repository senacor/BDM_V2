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
 *   <li>{@link com.senacor.bdm.model.metamodel.LogDocument#getImportcontainer <em>Importcontainer</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Importcontainer</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.senacor.bdm.model.metamodel.ImportContainer#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importcontainer</em>' containment reference.
	 * @see #setImportcontainer(ImportContainer)
	 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getLogDocument_Importcontainer()
	 * @see com.senacor.bdm.model.metamodel.ImportContainer#getDocument
	 * @model opposite="document" containment="true"
	 * @generated
	 */
	ImportContainer getImportcontainer();

	/**
	 * Sets the value of the '{@link com.senacor.bdm.model.metamodel.LogDocument#getImportcontainer <em>Importcontainer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importcontainer</em>' containment reference.
	 * @see #getImportcontainer()
	 * @generated
	 */
	void setImportcontainer(ImportContainer value);

} // LogDocument
