/**
 */
package com.senacor.bdm.model.metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension Satelite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.senacor.bdm.model.metamodel.ExtensionSatelite#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getExtensionSatelite()
 * @model
 * @generated
 */
public interface ExtensionSatelite extends INamedElement, Entity {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.senacor.bdm.model.metamodel.Entity#getEntitysatelite <em>Entitysatelite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' container reference.
	 * @see #setEntity(Entity)
	 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getExtensionSatelite_Entity()
	 * @see com.senacor.bdm.model.metamodel.Entity#getEntitysatelite
	 * @model opposite="entitysatelite" transient="false"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link com.senacor.bdm.model.metamodel.ExtensionSatelite#getEntity <em>Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' container reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // ExtensionSatelite
