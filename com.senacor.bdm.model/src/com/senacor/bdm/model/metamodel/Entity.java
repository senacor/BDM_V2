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
 *   <li>{@link com.senacor.bdm.model.metamodel.Entity#getBusinesskeys <em>Businesskeys</em>}</li>
 * </ul>
 *
 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getEntity()
 * @model abstract="true"
 * @generated
 */
public interface Entity extends Member {
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
