/**
 */
package com.senacor.bdm.model.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.senacor.bdm.model.metamodel.BusinessKey#getFielddeclaration <em>Fielddeclaration</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.BusinessKey#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getBusinessKey()
 * @model
 * @generated
 */
public interface BusinessKey extends INamedElement {
	/**
	 * Returns the value of the '<em><b>Fielddeclaration</b></em>' reference list.
	 * The list contents are of type {@link com.senacor.bdm.model.metamodel.FieldDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fielddeclaration</em>' reference list.
	 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getBusinessKey_Fielddeclaration()
	 * @model
	 * @generated
	 */
	EList<FieldDeclaration> getFielddeclaration();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.senacor.bdm.model.metamodel.Entity#getBusinesskeys <em>Businesskeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' container reference.
	 * @see #setEntity(Entity)
	 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getBusinessKey_Entity()
	 * @see com.senacor.bdm.model.metamodel.Entity#getBusinesskeys
	 * @model opposite="businesskeys" transient="false"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link com.senacor.bdm.model.metamodel.BusinessKey#getEntity <em>Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' container reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // BusinessKey
