/**
 */
package com.senacor.bdm.model.logmetamodel.impl;

import com.senacor.bdm.model.logmetamodel.Entity;
import com.senacor.bdm.model.logmetamodel.Field;
import com.senacor.bdm.model.logmetamodel.IDescribable;
import com.senacor.bdm.model.logmetamodel.LogDocument;
import com.senacor.bdm.model.logmetamodel.LogmetamodelPackage;
import com.senacor.bdm.model.logmetamodel.member;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.senacor.bdm.model.logmetamodel.impl.EntityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.senacor.bdm.model.logmetamodel.impl.EntityImpl#getLogdocument <em>Logdocument</em>}</li>
 *   <li>{@link com.senacor.bdm.model.logmetamodel.impl.EntityImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends INamedElementImpl implements Entity {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

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
		return LogmetamodelPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.ENTITY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogDocument getLogdocument() {
		if (eContainerFeatureID() != LogmetamodelPackage.ENTITY__LOGDOCUMENT) return null;
		return (LogDocument)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogdocument(LogDocument newLogdocument, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLogdocument, LogmetamodelPackage.ENTITY__LOGDOCUMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogdocument(LogDocument newLogdocument) {
		if (newLogdocument != eInternalContainer() || (eContainerFeatureID() != LogmetamodelPackage.ENTITY__LOGDOCUMENT && newLogdocument != null)) {
			if (EcoreUtil.isAncestor(this, newLogdocument))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLogdocument != null)
				msgs = ((InternalEObject)newLogdocument).eInverseAdd(this, LogmetamodelPackage.LOG_DOCUMENT__MEMBER, LogDocument.class, msgs);
			msgs = basicSetLogdocument(newLogdocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.ENTITY__LOGDOCUMENT, newLogdocument, newLogdocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<Field>(Field.class, this, LogmetamodelPackage.ENTITY__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogmetamodelPackage.ENTITY__LOGDOCUMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLogdocument((LogDocument)otherEnd, msgs);
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
			case LogmetamodelPackage.ENTITY__LOGDOCUMENT:
				return basicSetLogdocument(null, msgs);
			case LogmetamodelPackage.ENTITY__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
			case LogmetamodelPackage.ENTITY__LOGDOCUMENT:
				return eInternalContainer().eInverseRemove(this, LogmetamodelPackage.LOG_DOCUMENT__MEMBER, LogDocument.class, msgs);
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
			case LogmetamodelPackage.ENTITY__DESCRIPTION:
				return getDescription();
			case LogmetamodelPackage.ENTITY__LOGDOCUMENT:
				return getLogdocument();
			case LogmetamodelPackage.ENTITY__FIELDS:
				return getFields();
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
			case LogmetamodelPackage.ENTITY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LogmetamodelPackage.ENTITY__LOGDOCUMENT:
				setLogdocument((LogDocument)newValue);
				return;
			case LogmetamodelPackage.ENTITY__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
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
			case LogmetamodelPackage.ENTITY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case LogmetamodelPackage.ENTITY__LOGDOCUMENT:
				setLogdocument((LogDocument)null);
				return;
			case LogmetamodelPackage.ENTITY__FIELDS:
				getFields().clear();
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
			case LogmetamodelPackage.ENTITY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LogmetamodelPackage.ENTITY__LOGDOCUMENT:
				return getLogdocument() != null;
			case LogmetamodelPackage.ENTITY__FIELDS:
				return fields != null && !fields.isEmpty();
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
		if (baseClass == IDescribable.class) {
			switch (derivedFeatureID) {
				case LogmetamodelPackage.ENTITY__DESCRIPTION: return LogmetamodelPackage.IDESCRIBABLE__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == member.class) {
			switch (derivedFeatureID) {
				case LogmetamodelPackage.ENTITY__LOGDOCUMENT: return LogmetamodelPackage.MEMBER__LOGDOCUMENT;
				default: return -1;
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
		if (baseClass == IDescribable.class) {
			switch (baseFeatureID) {
				case LogmetamodelPackage.IDESCRIBABLE__DESCRIPTION: return LogmetamodelPackage.ENTITY__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == member.class) {
			switch (baseFeatureID) {
				case LogmetamodelPackage.MEMBER__LOGDOCUMENT: return LogmetamodelPackage.ENTITY__LOGDOCUMENT;
				default: return -1;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
