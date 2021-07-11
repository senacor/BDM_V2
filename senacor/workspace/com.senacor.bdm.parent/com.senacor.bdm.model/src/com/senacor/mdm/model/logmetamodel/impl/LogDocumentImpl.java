/**
 */
package com.senacor.bdm.model.logmetamodel.impl;

import com.senacor.bdm.model.commonmetamodel.impl.DocumentImpl;

import com.senacor.bdm.model.logmetamodel.BaseEntity;
import com.senacor.bdm.model.logmetamodel.LogDocument;
import com.senacor.bdm.model.logmetamodel.LogmetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.senacor.bdm.model.logmetamodel.impl.LogDocumentImpl#getBaseentities <em>Baseentities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogDocumentImpl extends DocumentImpl implements LogDocument {
	/**
	 * The cached value of the '{@link #getBaseentities() <em>Baseentities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseentities()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseEntity> baseentities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogmetamodelPackage.Literals.LOG_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaseEntity> getBaseentities() {
		if (baseentities == null) {
			baseentities = new EObjectContainmentWithInverseEList<BaseEntity>(BaseEntity.class, this, LogmetamodelPackage.LOG_DOCUMENT__BASEENTITIES, LogmetamodelPackage.BASE_ENTITY__DOCUMENT);
		}
		return baseentities;
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
			case LogmetamodelPackage.LOG_DOCUMENT__BASEENTITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBaseentities()).basicAdd(otherEnd, msgs);
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
			case LogmetamodelPackage.LOG_DOCUMENT__BASEENTITIES:
				return ((InternalEList<?>)getBaseentities()).basicRemove(otherEnd, msgs);
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
			case LogmetamodelPackage.LOG_DOCUMENT__BASEENTITIES:
				return getBaseentities();
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
			case LogmetamodelPackage.LOG_DOCUMENT__BASEENTITIES:
				getBaseentities().clear();
				getBaseentities().addAll((Collection<? extends BaseEntity>)newValue);
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
			case LogmetamodelPackage.LOG_DOCUMENT__BASEENTITIES:
				getBaseentities().clear();
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
			case LogmetamodelPackage.LOG_DOCUMENT__BASEENTITIES:
				return baseentities != null && !baseentities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogDocumentImpl
