/**
 */
package com.senacor.bdm.model.metamodel.impl;

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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.MemberImpl#getLogdocument <em>Logdocument</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.MemberImpl#getFielddeclarations <em>Fielddeclarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MemberImpl extends INamedElementImpl implements Member {
	/**
	 * The cached value of the '{@link #getFielddeclarations() <em>Fielddeclarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFielddeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldDeclaration> fielddeclarations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogDocument getLogdocument() {
		if (eContainerFeatureID() != MetamodelPackage.MEMBER__LOGDOCUMENT)
			return null;
		return (LogDocument) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogdocument(LogDocument newLogdocument, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newLogdocument, MetamodelPackage.MEMBER__LOGDOCUMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogdocument(LogDocument newLogdocument) {
		if (newLogdocument != eInternalContainer()
				|| (eContainerFeatureID() != MetamodelPackage.MEMBER__LOGDOCUMENT && newLogdocument != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MEMBER__LOGDOCUMENT, newLogdocument,
					newLogdocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldDeclaration> getFielddeclarations() {
		if (fielddeclarations == null) {
			fielddeclarations = new EObjectContainmentWithInverseEList<FieldDeclaration>(FieldDeclaration.class, this,
					MetamodelPackage.MEMBER__FIELDDECLARATIONS, MetamodelPackage.FIELD_DECLARATION__MEMBER);
		}
		return fielddeclarations;
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
		case MetamodelPackage.MEMBER__LOGDOCUMENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetLogdocument((LogDocument) otherEnd, msgs);
		case MetamodelPackage.MEMBER__FIELDDECLARATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFielddeclarations()).basicAdd(otherEnd,
					msgs);
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
		case MetamodelPackage.MEMBER__LOGDOCUMENT:
			return basicSetLogdocument(null, msgs);
		case MetamodelPackage.MEMBER__FIELDDECLARATIONS:
			return ((InternalEList<?>) getFielddeclarations()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.MEMBER__LOGDOCUMENT:
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
		case MetamodelPackage.MEMBER__LOGDOCUMENT:
			return getLogdocument();
		case MetamodelPackage.MEMBER__FIELDDECLARATIONS:
			return getFielddeclarations();
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
		case MetamodelPackage.MEMBER__LOGDOCUMENT:
			setLogdocument((LogDocument) newValue);
			return;
		case MetamodelPackage.MEMBER__FIELDDECLARATIONS:
			getFielddeclarations().clear();
			getFielddeclarations().addAll((Collection<? extends FieldDeclaration>) newValue);
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
		case MetamodelPackage.MEMBER__LOGDOCUMENT:
			setLogdocument((LogDocument) null);
			return;
		case MetamodelPackage.MEMBER__FIELDDECLARATIONS:
			getFielddeclarations().clear();
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
		case MetamodelPackage.MEMBER__LOGDOCUMENT:
			return getLogdocument() != null;
		case MetamodelPackage.MEMBER__FIELDDECLARATIONS:
			return fielddeclarations != null && !fielddeclarations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MemberImpl
