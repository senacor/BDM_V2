/**
 */
package com.senacor.bdm.model.logmetamodel.impl;

import com.senacor.bdm.model.logmetamodel.DataTypes;
import com.senacor.bdm.model.logmetamodel.Field;
import com.senacor.bdm.model.logmetamodel.IDescribable;
import com.senacor.bdm.model.logmetamodel.LogDocument;
import com.senacor.bdm.model.logmetamodel.LogmetamodelPackage;
import com.senacor.bdm.model.logmetamodel.member;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.senacor.bdm.model.logmetamodel.impl.FieldImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.senacor.bdm.model.logmetamodel.impl.FieldImpl#getLogdocument <em>Logdocument</em>}</li>
 *   <li>{@link com.senacor.bdm.model.logmetamodel.impl.FieldImpl#getDtype <em>Dtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends INamedElementImpl implements Field {
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
	 * The default value of the '{@link #getDtype() <em>Dtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtype()
	 * @generated
	 * @ordered
	 */
	protected static final DataTypes DTYPE_EDEFAULT = DataTypes.NONE;

	/**
	 * The cached value of the '{@link #getDtype() <em>Dtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtype()
	 * @generated
	 * @ordered
	 */
	protected DataTypes dtype = DTYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogmetamodelPackage.Literals.FIELD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.FIELD__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogDocument getLogdocument() {
		if (eContainerFeatureID() != LogmetamodelPackage.FIELD__LOGDOCUMENT) return null;
		return (LogDocument)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogdocument(LogDocument newLogdocument, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLogdocument, LogmetamodelPackage.FIELD__LOGDOCUMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogdocument(LogDocument newLogdocument) {
		if (newLogdocument != eInternalContainer() || (eContainerFeatureID() != LogmetamodelPackage.FIELD__LOGDOCUMENT && newLogdocument != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.FIELD__LOGDOCUMENT, newLogdocument, newLogdocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypes getDtype() {
		return dtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDtype(DataTypes newDtype) {
		DataTypes oldDtype = dtype;
		dtype = newDtype == null ? DTYPE_EDEFAULT : newDtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogmetamodelPackage.FIELD__DTYPE, oldDtype, dtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LogmetamodelPackage.FIELD__LOGDOCUMENT:
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
			case LogmetamodelPackage.FIELD__LOGDOCUMENT:
				return basicSetLogdocument(null, msgs);
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
			case LogmetamodelPackage.FIELD__LOGDOCUMENT:
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
			case LogmetamodelPackage.FIELD__DESCRIPTION:
				return getDescription();
			case LogmetamodelPackage.FIELD__LOGDOCUMENT:
				return getLogdocument();
			case LogmetamodelPackage.FIELD__DTYPE:
				return getDtype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LogmetamodelPackage.FIELD__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LogmetamodelPackage.FIELD__LOGDOCUMENT:
				setLogdocument((LogDocument)newValue);
				return;
			case LogmetamodelPackage.FIELD__DTYPE:
				setDtype((DataTypes)newValue);
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
			case LogmetamodelPackage.FIELD__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case LogmetamodelPackage.FIELD__LOGDOCUMENT:
				setLogdocument((LogDocument)null);
				return;
			case LogmetamodelPackage.FIELD__DTYPE:
				setDtype(DTYPE_EDEFAULT);
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
			case LogmetamodelPackage.FIELD__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LogmetamodelPackage.FIELD__LOGDOCUMENT:
				return getLogdocument() != null;
			case LogmetamodelPackage.FIELD__DTYPE:
				return dtype != DTYPE_EDEFAULT;
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
				case LogmetamodelPackage.FIELD__DESCRIPTION: return LogmetamodelPackage.IDESCRIBABLE__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == member.class) {
			switch (derivedFeatureID) {
				case LogmetamodelPackage.FIELD__LOGDOCUMENT: return LogmetamodelPackage.MEMBER__LOGDOCUMENT;
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
				case LogmetamodelPackage.IDESCRIBABLE__DESCRIPTION: return LogmetamodelPackage.FIELD__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == member.class) {
			switch (baseFeatureID) {
				case LogmetamodelPackage.MEMBER__LOGDOCUMENT: return LogmetamodelPackage.FIELD__LOGDOCUMENT;
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
		result.append(", dtype: ");
		result.append(dtype);
		result.append(')');
		return result.toString();
	}

} //FieldImpl
