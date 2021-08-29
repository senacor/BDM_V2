/**
 */
package com.senacor.bdm.model.metamodel.impl;

import com.senacor.bdm.model.metamodel.BaseEntity;
import com.senacor.bdm.model.metamodel.BusinessKey;
import com.senacor.bdm.model.metamodel.Entity;
import com.senacor.bdm.model.metamodel.ExtensionSatelite;
import com.senacor.bdm.model.metamodel.MetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.EntityImpl#getEntitysatelite <em>Entitysatelite</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.EntityImpl#getMainsatelit <em>Mainsatelit</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.EntityImpl#getBusinesskeys <em>Businesskeys</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityImpl extends MemberImpl implements Entity {
	/**
	 * The cached value of the '{@link #getEntitysatelite() <em>Entitysatelite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitysatelite()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionSatelite> entitysatelite;

	/**
	 * The cached value of the '{@link #getMainsatelit() <em>Mainsatelit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainsatelit()
	 * @generated
	 * @ordered
	 */
	protected BaseEntity mainsatelit;

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
	public EList<ExtensionSatelite> getEntitysatelite() {
		if (entitysatelite == null) {
			entitysatelite = new EObjectContainmentWithInverseEList<ExtensionSatelite>(ExtensionSatelite.class, this,
					MetamodelPackage.ENTITY__ENTITYSATELITE, MetamodelPackage.EXTENSION_SATELITE__ENTITY);
		}
		return entitysatelite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseEntity getMainsatelit() {
		return mainsatelit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainsatelit(BaseEntity newMainsatelit, NotificationChain msgs) {
		BaseEntity oldMainsatelit = mainsatelit;
		mainsatelit = newMainsatelit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.ENTITY__MAINSATELIT, oldMainsatelit, newMainsatelit);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainsatelit(BaseEntity newMainsatelit) {
		if (newMainsatelit != mainsatelit) {
			NotificationChain msgs = null;
			if (mainsatelit != null)
				msgs = ((InternalEObject) mainsatelit).eInverseRemove(this, MetamodelPackage.BASE_ENTITY__ENTITY,
						BaseEntity.class, msgs);
			if (newMainsatelit != null)
				msgs = ((InternalEObject) newMainsatelit).eInverseAdd(this, MetamodelPackage.BASE_ENTITY__ENTITY,
						BaseEntity.class, msgs);
			msgs = basicSetMainsatelit(newMainsatelit, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ENTITY__MAINSATELIT, newMainsatelit,
					newMainsatelit));
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
		case MetamodelPackage.ENTITY__ENTITYSATELITE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEntitysatelite()).basicAdd(otherEnd, msgs);
		case MetamodelPackage.ENTITY__MAINSATELIT:
			if (mainsatelit != null)
				msgs = ((InternalEObject) mainsatelit).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.ENTITY__MAINSATELIT, null, msgs);
			return basicSetMainsatelit((BaseEntity) otherEnd, msgs);
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
		case MetamodelPackage.ENTITY__ENTITYSATELITE:
			return ((InternalEList<?>) getEntitysatelite()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.ENTITY__MAINSATELIT:
			return basicSetMainsatelit(null, msgs);
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
		case MetamodelPackage.ENTITY__ENTITYSATELITE:
			return getEntitysatelite();
		case MetamodelPackage.ENTITY__MAINSATELIT:
			return getMainsatelit();
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
		case MetamodelPackage.ENTITY__ENTITYSATELITE:
			getEntitysatelite().clear();
			getEntitysatelite().addAll((Collection<? extends ExtensionSatelite>) newValue);
			return;
		case MetamodelPackage.ENTITY__MAINSATELIT:
			setMainsatelit((BaseEntity) newValue);
			return;
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
		case MetamodelPackage.ENTITY__ENTITYSATELITE:
			getEntitysatelite().clear();
			return;
		case MetamodelPackage.ENTITY__MAINSATELIT:
			setMainsatelit((BaseEntity) null);
			return;
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
		case MetamodelPackage.ENTITY__ENTITYSATELITE:
			return entitysatelite != null && !entitysatelite.isEmpty();
		case MetamodelPackage.ENTITY__MAINSATELIT:
			return mainsatelit != null;
		case MetamodelPackage.ENTITY__BUSINESSKEYS:
			return businesskeys != null && !businesskeys.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityImpl
