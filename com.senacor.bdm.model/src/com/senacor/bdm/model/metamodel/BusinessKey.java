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
 *   <li>{@link com.senacor.bdm.model.metamodel.BusinessKey#getFields <em>Fields</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.BusinessKey#getBaseentity <em>Baseentity</em>}</li>
 * </ul>
 *
 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getBusinessKey()
 * @model
 * @generated
 */
public interface BusinessKey extends INamedElement {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link com.senacor.bdm.model.metamodel.FieldDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getBusinessKey_Fields()
	 * @model
	 * @generated
	 */
	EList<FieldDeclaration> getFields();

	/**
	 * Returns the value of the '<em><b>Baseentity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.senacor.bdm.model.metamodel.BaseEntity#getBusinesskeys <em>Businesskeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baseentity</em>' container reference.
	 * @see #setBaseentity(BaseEntity)
	 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getBusinessKey_Baseentity()
	 * @see com.senacor.bdm.model.metamodel.BaseEntity#getBusinesskeys
	 * @model opposite="businesskeys" transient="false"
	 * @generated
	 */
	BaseEntity getBaseentity();

	/**
	 * Sets the value of the '{@link com.senacor.bdm.model.metamodel.BusinessKey#getBaseentity <em>Baseentity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baseentity</em>' container reference.
	 * @see #getBaseentity()
	 * @generated
	 */
	void setBaseentity(BaseEntity value);

} // BusinessKey
