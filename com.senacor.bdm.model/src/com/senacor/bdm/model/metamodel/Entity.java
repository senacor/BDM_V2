/**
 */
package com.senacor.bdm.model.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.senacor.bdm.model.metamodel.Entity#getEntitysatelite <em>Entitysatelite</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.Entity#getMainsatelit <em>Mainsatelit</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.Entity#getBusinesskeys <em>Businesskeys</em>}</li>
 * </ul>
 *
 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getEntity()
 * @model abstract="true"
 * @generated
 */
public interface Entity extends Member {
	/**
	 * Returns the value of the '<em><b>Entitysatelite</b></em>' containment reference list.
	 * The list contents are of type {@link com.senacor.bdm.model.metamodel.ExtensionSatelite}.
	 * It is bidirectional and its opposite is '{@link com.senacor.bdm.model.metamodel.ExtensionSatelite#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entitysatelite</em>' containment reference list.
	 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getEntity_Entitysatelite()
	 * @see com.senacor.bdm.model.metamodel.ExtensionSatelite#getEntity
	 * @model opposite="entity" containment="true"
	 * @generated
	 */
	EList<ExtensionSatelite> getEntitysatelite();

	/**
	 * Returns the value of the '<em><b>Mainsatelit</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.senacor.bdm.model.metamodel.BaseEntity#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mainsatelit</em>' containment reference.
	 * @see #setMainsatelit(BaseEntity)
	 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getEntity_Mainsatelit()
	 * @see com.senacor.bdm.model.metamodel.BaseEntity#getEntity
	 * @model opposite="entity" containment="true"
	 * @generated
	 */
	BaseEntity getMainsatelit();

	/**
	 * Sets the value of the '{@link com.senacor.bdm.model.metamodel.Entity#getMainsatelit <em>Mainsatelit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mainsatelit</em>' containment reference.
	 * @see #getMainsatelit()
	 * @generated
	 */
	void setMainsatelit(BaseEntity value);

	/**
	 * Returns the value of the '<em><b>Businesskeys</b></em>' containment reference list.
	 * The list contents are of type {@link com.senacor.bdm.model.metamodel.BusinessKey}.
	 * It is bidirectional and its opposite is '{@link com.senacor.bdm.model.metamodel.BusinessKey#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Businesskeys</em>' containment reference list.
	 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getEntity_Businesskeys()
	 * @see com.senacor.bdm.model.metamodel.BusinessKey#getEntity
	 * @model opposite="entity" containment="true"
	 * @generated
	 */
	EList<BusinessKey> getBusinesskeys();

} // Entity
