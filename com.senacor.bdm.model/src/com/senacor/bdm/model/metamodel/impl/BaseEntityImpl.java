/**
 */
package com.senacor.bdm.model.metamodel.impl;

import com.senacor.bdm.model.metamodel.BaseEntity;
import com.senacor.bdm.model.metamodel.BusinessKey;
import com.senacor.bdm.model.metamodel.Entity;
import com.senacor.bdm.model.metamodel.FieldDeclaration;
import com.senacor.bdm.model.metamodel.LogDocument;
import com.senacor.bdm.model.metamodel.Member;
import com.senacor.bdm.model.metamodel.MetamodelPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.BaseEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.BaseEntityImpl#getLogdocument <em>Logdocument</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.BaseEntityImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.BaseEntityImpl#getBusinesskeys <em>Businesskeys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseEntityImpl extends MinimalEObjectImpl.Container implements BaseEntity {
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
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldDeclaration> fields;
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
	protected BaseEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.BASE_ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.BASE_ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogDocument getLogdocument() {
		if (eContainerFeatureID() != MetamodelPackage.BASE_ENTITY__LOGDOCUMENT)
			return null;
		return (LogDocument) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogdocument(LogDocument newLogdocument, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newLogdocument, MetamodelPackage.BASE_ENTITY__LOGDOCUMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogdocument(LogDocument newLogdocument) {
		if (newLogdocument != eInternalContainer()
				|| (eContainerFeatureID() != MetamodelPackage.BASE_ENTITY__LOGDOCUMENT && newLogdocument != null)) {
			if (EcoreUtil.isAncestor(this, newLogdocument))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLogdocument != null)
				msgs = ((InternalEObject) newLogdocument).eInverseAdd(this, MetamodelPackage.LOG_DOCUMENT__MEMBERS,
						LogDocument.class, msgs);
			msgs = basicSetLogdocument(newLogdocument, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.BASE_ENTITY__LOGDOCUMENT,
					newLogdocument, newLogdocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldDeclaration> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentWithInverseEList<FieldDeclaration>(FieldDeclaration.class, this,
					MetamodelPackage.BASE_ENTITY__FIELDS, MetamodelPackage.FIELD_DECLARATION__ENTITY);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessKey> getBusinesskeys() {
		if (businesskeys == null) {
			businesskeys = new EObjectContainmentWithInverseEList<BusinessKey>(BusinessKey.class, this,
					MetamodelPackage.BASE_ENTITY__BUSINESSKEYS, MetamodelPackage.BUSINESS_KEY__BASEENTITY);
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
		case MetamodelPackage.BASE_ENTITY__LOGDOCUMENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetLogdocument((LogDocument) otherEnd, msgs);
		case MetamodelPackage.BASE_ENTITY__FIELDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFields()).basicAdd(otherEnd, msgs);
		case MetamodelPackage.BASE_ENTITY__BUSINESSKEYS:
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
		case MetamodelPackage.BASE_ENTITY__LOGDOCUMENT:
			return basicSetLogdocument(null, msgs);
		case MetamodelPackage.BASE_ENTITY__FIELDS:
			return ((InternalEList<?>) getFields()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.BASE_ENTITY__BUSINESSKEYS:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case MetamodelPackage.BASE_ENTITY__LOGDOCUMENT:
			return eInternalContainer().eInverseRemove(this, MetamodelPackage.LOG_DOCUMENT__MEMBERS, LogDocument.class,
					msgs);
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
		case MetamodelPackage.BASE_ENTITY__NAME:
			return getName();
		case MetamodelPackage.BASE_ENTITY__LOGDOCUMENT:
			return getLogdocument();
		case MetamodelPackage.BASE_ENTITY__FIELDS:
			return getFields();
		case MetamodelPackage.BASE_ENTITY__BUSINESSKEYS:
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
		case MetamodelPackage.BASE_ENTITY__NAME:
			setName((String) newValue);
			return;
		case MetamodelPackage.BASE_ENTITY__LOGDOCUMENT:
			setLogdocument((LogDocument) newValue);
			return;
		case MetamodelPackage.BASE_ENTITY__FIELDS:
			getFields().clear();
			getFields().addAll((Collection<? extends FieldDeclaration>) newValue);
			return;
		case MetamodelPackage.BASE_ENTITY__BUSINESSKEYS:
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
		case MetamodelPackage.BASE_ENTITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodelPackage.BASE_ENTITY__LOGDOCUMENT:
			setLogdocument((LogDocument) null);
			return;
		case MetamodelPackage.BASE_ENTITY__FIELDS:
			getFields().clear();
			return;
		case MetamodelPackage.BASE_ENTITY__BUSINESSKEYS:
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
		case MetamodelPackage.BASE_ENTITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodelPackage.BASE_ENTITY__LOGDOCUMENT:
			return getLogdocument() != null;
		case MetamodelPackage.BASE_ENTITY__FIELDS:
			return fields != null && !fields.isEmpty();
		case MetamodelPackage.BASE_ENTITY__BUSINESSKEYS:
			return businesskeys != null && !businesskeys.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Member.class) {
			switch (derivedFeatureID) {
			case MetamodelPackage.BASE_ENTITY__LOGDOCUMENT:
				return MetamodelPackage.MEMBER__LOGDOCUMENT;
			default:
				return -1;
			}
		}
		if (baseClass == Entity.class) {
			switch (derivedFeatureID) {
			case MetamodelPackage.BASE_ENTITY__FIELDS:
				return MetamodelPackage.ENTITY__FIELDS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Member.class) {
			switch (baseFeatureID) {
			case MetamodelPackage.MEMBER__LOGDOCUMENT:
				return MetamodelPackage.BASE_ENTITY__LOGDOCUMENT;
			default:
				return -1;
			}
		}
		if (baseClass == Entity.class) {
			switch (baseFeatureID) {
			case MetamodelPackage.ENTITY__FIELDS:
				return MetamodelPackage.BASE_ENTITY__FIELDS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //BaseEntityImpl
