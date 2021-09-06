/**
 */
package com.senacor.bdm.model.metamodel.impl;

import com.senacor.bdm.model.metamodel.BusinessKey;
import com.senacor.bdm.model.metamodel.Entity;
import com.senacor.bdm.model.metamodel.MetamodelPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.EntityImpl#getBusinesskeys <em>Businesskeys</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityImpl extends MemberImpl implements Entity {
	/**
	 * The cached value of the '{@link #getBusinesskeys() <em>Businesskeys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinesskeys()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessKey> businesskeys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessKey> getBusinesskeys() {
		if (businesskeys == null) {
			businesskeys = new EObjectContainmentWithInverseEList<BusinessKey>(BusinessKey.class, this,
					MetamodelPackage.ENTITY__BUSINESSKEYS, MetamodelPackage.BUSINESS_KEY__ENTITY);
		}
		return businesskeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.ENTITY__BUSINESSKEYS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getBusinesskeys()).basicAdd(otherEnd, msgs);
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
		case MetamodelPackage.ENTITY__BUSINESSKEYS:
			return ((InternalEList<?>) getBusinesskeys()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.ENTITY__BUSINESSKEYS:
			return getBusinesskeys();
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
		case MetamodelPackage.ENTITY__BUSINESSKEYS:
			getBusinesskeys().clear();
			getBusinesskeys().addAll((Collection<? extends BusinessKey>) newValue);
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
		case MetamodelPackage.ENTITY__BUSINESSKEYS:
			getBusinesskeys().clear();
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
		case MetamodelPackage.ENTITY__BUSINESSKEYS:
			return businesskeys != null && !businesskeys.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityImpl
