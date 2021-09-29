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
 *   <li>{@link com.senacor.bdm.model.metamodel.Entity#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getEntity()
 * @model abstract="true"
 * @generated
 */
public interface Entity extends Member {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link com.senacor.bdm.model.metamodel.FieldDeclaration}.
	 * It is bidirectional and its opposite is '{@link com.senacor.bdm.model.metamodel.FieldDeclaration#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getEntity_Fields()
	 * @see com.senacor.bdm.model.metamodel.FieldDeclaration#getEntity
	 * @model opposite="entity" containment="true"
	 * @generated
	 */
	EList<FieldDeclaration> getFields();

} // Entity
