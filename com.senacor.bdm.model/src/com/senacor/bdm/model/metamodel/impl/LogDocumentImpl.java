/**
 */
package com.senacor.bdm.model.metamodel.impl;

import com.senacor.bdm.model.metamodel.ImportContainer;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.LogDocumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.LogDocumentImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.LogDocumentImpl#getImportcontainer <em>Importcontainer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogDocumentImpl extends MinimalEObjectImpl.Container implements LogDocument {
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
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Member> members;

	/**
	 * The cached value of the '{@link #getImportcontainer() <em>Importcontainer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportcontainer()
	 * @generated
	 * @ordered
	 */
	protected ImportContainer importcontainer;

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
		return MetamodelPackage.Literals.LOG_DOCUMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.LOG_DOCUMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getMembers() {
		if (members == null) {
			members = new EObjectContainmentWithInverseEList<Member>(Member.class, this,
					MetamodelPackage.LOG_DOCUMENT__MEMBERS, MetamodelPackage.MEMBER__LOGDOCUMENT);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportContainer getImportcontainer() {
		return importcontainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportcontainer(ImportContainer newImportcontainer, NotificationChain msgs) {
		ImportContainer oldImportcontainer = importcontainer;
		importcontainer = newImportcontainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.LOG_DOCUMENT__IMPORTCONTAINER, oldImportcontainer, newImportcontainer);
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
	public void setImportcontainer(ImportContainer newImportcontainer) {
		if (newImportcontainer != importcontainer) {
			NotificationChain msgs = null;
			if (importcontainer != null)
				msgs = ((InternalEObject) importcontainer).eInverseRemove(this,
						MetamodelPackage.IMPORT_CONTAINER__DOCUMENT, ImportContainer.class, msgs);
			if (newImportcontainer != null)
				msgs = ((InternalEObject) newImportcontainer).eInverseAdd(this,
						MetamodelPackage.IMPORT_CONTAINER__DOCUMENT, ImportContainer.class, msgs);
			msgs = basicSetImportcontainer(newImportcontainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.LOG_DOCUMENT__IMPORTCONTAINER,
					newImportcontainer, newImportcontainer));
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
		case MetamodelPackage.LOG_DOCUMENT__MEMBERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMembers()).basicAdd(otherEnd, msgs);
		case MetamodelPackage.LOG_DOCUMENT__IMPORTCONTAINER:
			if (importcontainer != null)
				msgs = ((InternalEObject) importcontainer).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.LOG_DOCUMENT__IMPORTCONTAINER, null, msgs);
			return basicSetImportcontainer((ImportContainer) otherEnd, msgs);
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
		case MetamodelPackage.LOG_DOCUMENT__MEMBERS:
			return ((InternalEList<?>) getMembers()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.LOG_DOCUMENT__IMPORTCONTAINER:
			return basicSetImportcontainer(null, msgs);
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
		case MetamodelPackage.LOG_DOCUMENT__NAME:
			return getName();
		case MetamodelPackage.LOG_DOCUMENT__MEMBERS:
			return getMembers();
		case MetamodelPackage.LOG_DOCUMENT__IMPORTCONTAINER:
			return getImportcontainer();
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
		case MetamodelPackage.LOG_DOCUMENT__NAME:
			setName((String) newValue);
			return;
		case MetamodelPackage.LOG_DOCUMENT__MEMBERS:
			getMembers().clear();
			getMembers().addAll((Collection<? extends Member>) newValue);
			return;
		case MetamodelPackage.LOG_DOCUMENT__IMPORTCONTAINER:
			setImportcontainer((ImportContainer) newValue);
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
		case MetamodelPackage.LOG_DOCUMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodelPackage.LOG_DOCUMENT__MEMBERS:
			getMembers().clear();
			return;
		case MetamodelPackage.LOG_DOCUMENT__IMPORTCONTAINER:
			setImportcontainer((ImportContainer) null);
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
		case MetamodelPackage.LOG_DOCUMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodelPackage.LOG_DOCUMENT__MEMBERS:
			return members != null && !members.isEmpty();
		case MetamodelPackage.LOG_DOCUMENT__IMPORTCONTAINER:
			return importcontainer != null;
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

} //LogDocumentImpl
