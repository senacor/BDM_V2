/**
 */
package com.senacor.bdm.model.metamodel.impl;

import com.senacor.bdm.model.metamodel.Field;
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
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.FieldImpl#getLogdocument <em>Logdocument</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.FieldImpl#getFielddeclarations <em>Fielddeclarations</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.FieldImpl#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends INamedElementImpl implements Field {
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
		return MetamodelPackage.Literals.FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogDocument getLogdocument() {
		if (eContainerFeatureID() != MetamodelPackage.FIELD__LOGDOCUMENT)
			return null;
		return (LogDocument) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogdocument(LogDocument newLogdocument, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newLogdocument, MetamodelPackage.FIELD__LOGDOCUMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogdocument(LogDocument newLogdocument) {
		if (newLogdocument != eInternalContainer()
				|| (eContainerFeatureID() != MetamodelPackage.FIELD__LOGDOCUMENT && newLogdocument != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.FIELD__LOGDOCUMENT, newLogdocument,
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
					MetamodelPackage.FIELD__FIELDDECLARATIONS, MetamodelPackage.FIELD_DECLARATION__MEMBER);
		}
		return fielddeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member getMember() {
		if (eContainerFeatureID() != MetamodelPackage.FIELD__MEMBER)
			return null;
		return (Member) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMember(Member newMember, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newMember, MetamodelPackage.FIELD__MEMBER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMember(Member newMember) {
		if (newMember != eInternalContainer()
				|| (eContainerFeatureID() != MetamodelPackage.FIELD__MEMBER && newMember != null)) {
			if (EcoreUtil.isAncestor(this, newMember))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMember != null)
				msgs = ((InternalEObject) newMember).eInverseAdd(this, MetamodelPackage.MEMBER__FIELDDECLARATIONS,
						Member.class, msgs);
			msgs = basicSetMember(newMember, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.FIELD__MEMBER, newMember,
					newMember));
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
		case MetamodelPackage.FIELD__LOGDOCUMENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetLogdocument((LogDocument) otherEnd, msgs);
		case MetamodelPackage.FIELD__FIELDDECLARATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFielddeclarations()).basicAdd(otherEnd,
					msgs);
		case MetamodelPackage.FIELD__MEMBER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetMember((Member) otherEnd, msgs);
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
		case MetamodelPackage.FIELD__LOGDOCUMENT:
			return basicSetLogdocument(null, msgs);
		case MetamodelPackage.FIELD__FIELDDECLARATIONS:
			return ((InternalEList<?>) getFielddeclarations()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.FIELD__MEMBER:
			return basicSetMember(null, msgs);
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
		case MetamodelPackage.FIELD__LOGDOCUMENT:
			return eInternalContainer().eInverseRemove(this, MetamodelPackage.LOG_DOCUMENT__MEMBERS, LogDocument.class,
					msgs);
		case MetamodelPackage.FIELD__MEMBER:
			return eInternalContainer().eInverseRemove(this, MetamodelPackage.MEMBER__FIELDDECLARATIONS, Member.class,
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
		case MetamodelPackage.FIELD__LOGDOCUMENT:
			return getLogdocument();
		case MetamodelPackage.FIELD__FIELDDECLARATIONS:
			return getFielddeclarations();
		case MetamodelPackage.FIELD__MEMBER:
			return getMember();
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
		case MetamodelPackage.FIELD__LOGDOCUMENT:
			setLogdocument((LogDocument) newValue);
			return;
		case MetamodelPackage.FIELD__FIELDDECLARATIONS:
			getFielddeclarations().clear();
			getFielddeclarations().addAll((Collection<? extends FieldDeclaration>) newValue);
			return;
		case MetamodelPackage.FIELD__MEMBER:
			setMember((Member) newValue);
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
		case MetamodelPackage.FIELD__LOGDOCUMENT:
			setLogdocument((LogDocument) null);
			return;
		case MetamodelPackage.FIELD__FIELDDECLARATIONS:
			getFielddeclarations().clear();
			return;
		case MetamodelPackage.FIELD__MEMBER:
			setMember((Member) null);
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
		case MetamodelPackage.FIELD__LOGDOCUMENT:
			return getLogdocument() != null;
		case MetamodelPackage.FIELD__FIELDDECLARATIONS:
			return fielddeclarations != null && !fielddeclarations.isEmpty();
		case MetamodelPackage.FIELD__MEMBER:
			return getMember() != null;
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
			case MetamodelPackage.FIELD__LOGDOCUMENT:
				return MetamodelPackage.MEMBER__LOGDOCUMENT;
			case MetamodelPackage.FIELD__FIELDDECLARATIONS:
				return MetamodelPackage.MEMBER__FIELDDECLARATIONS;
			default:
				return -1;
			}
		}
		if (baseClass == FieldDeclaration.class) {
			switch (derivedFeatureID) {
			case MetamodelPackage.FIELD__MEMBER:
				return MetamodelPackage.FIELD_DECLARATION__MEMBER;
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
				return MetamodelPackage.FIELD__LOGDOCUMENT;
			case MetamodelPackage.MEMBER__FIELDDECLARATIONS:
				return MetamodelPackage.FIELD__FIELDDECLARATIONS;
			default:
				return -1;
			}
		}
		if (baseClass == FieldDeclaration.class) {
			switch (baseFeatureID) {
			case MetamodelPackage.FIELD_DECLARATION__MEMBER:
				return MetamodelPackage.FIELD__MEMBER;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FieldImpl
