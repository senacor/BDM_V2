/**
 */
package com.senacor.bdm.model.metamodel.impl;

import com.senacor.bdm.model.metamodel.BaseEntity;
import com.senacor.bdm.model.metamodel.BusinessKey;
import com.senacor.bdm.model.metamodel.FieldDeclaration;
import com.senacor.bdm.model.metamodel.MetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.BusinessKeyImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.BusinessKeyImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.BusinessKeyImpl#getBaseentity <em>Baseentity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessKeyImpl extends MinimalEObjectImpl.Container implements BusinessKey {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldDeclaration> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.BUSINESS_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.BUSINESS_KEY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldDeclaration> getFields() {
		if (fields == null) {
			fields = new EObjectResolvingEList<FieldDeclaration>(FieldDeclaration.class, this,
					MetamodelPackage.BUSINESS_KEY__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseEntity getBaseentity() {
		if (eContainerFeatureID() != MetamodelPackage.BUSINESS_KEY__BASEENTITY)
			return null;
		return (BaseEntity) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaseentity(BaseEntity newBaseentity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newBaseentity, MetamodelPackage.BUSINESS_KEY__BASEENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseentity(BaseEntity newBaseentity) {
		if (newBaseentity != eInternalContainer()
				|| (eContainerFeatureID() != MetamodelPackage.BUSINESS_KEY__BASEENTITY && newBaseentity != null)) {
			if (EcoreUtil.isAncestor(this, newBaseentity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBaseentity != null)
				msgs = ((InternalEObject) newBaseentity).eInverseAdd(this, MetamodelPackage.BASE_ENTITY__BUSINESSKEYS,
						BaseEntity.class, msgs);
			msgs = basicSetBaseentity(newBaseentity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.BUSINESS_KEY__BASEENTITY,
					newBaseentity, newBaseentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.BUSINESS_KEY__BASEENTITY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetBaseentity((BaseEntity) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.BUSINESS_KEY__BASEENTITY:
			return basicSetBaseentity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case MetamodelPackage.BUSINESS_KEY__BASEENTITY:
			return eInternalContainer().eInverseRemove(this, MetamodelPackage.BASE_ENTITY__BUSINESSKEYS,
					BaseEntity.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.BUSINESS_KEY__NAME:
			return getName();
		case MetamodelPackage.BUSINESS_KEY__FIELDS:
			return getFields();
		case MetamodelPackage.BUSINESS_KEY__BASEENTITY:
			return getBaseentity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetamodelPackage.BUSINESS_KEY__NAME:
			setName((String) newValue);
			return;
		case MetamodelPackage.BUSINESS_KEY__FIELDS:
			getFields().clear();
			getFields().addAll((Collection<? extends FieldDeclaration>) newValue);
			return;
		case MetamodelPackage.BUSINESS_KEY__BASEENTITY:
			setBaseentity((BaseEntity) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MetamodelPackage.BUSINESS_KEY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodelPackage.BUSINESS_KEY__FIELDS:
			getFields().clear();
			return;
		case MetamodelPackage.BUSINESS_KEY__BASEENTITY:
			setBaseentity((BaseEntity) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MetamodelPackage.BUSINESS_KEY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodelPackage.BUSINESS_KEY__FIELDS:
			return fields != null && !fields.isEmpty();
		case MetamodelPackage.BUSINESS_KEY__BASEENTITY:
			return getBaseentity() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BusinessKeyImpl
