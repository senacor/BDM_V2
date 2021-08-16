/**
 */
package com.senacor.bdm.model.logmetamodel;

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
 *   <li>{@link com.senacor.bdm.model.logmetamodel.Entity#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see com.senacor.bdm.model.logmetamodel.LogmetamodelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends INamedElement, member {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link com.senacor.bdm.model.logmetamodel.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see com.senacor.bdm.model.logmetamodel.LogmetamodelPackage#getEntity_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

} // Entity
