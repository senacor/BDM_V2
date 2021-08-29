/**
 */
package com.senacor.bdm.model.metamodel.impl;

import com.senacor.bdm.model.metamodel.BaseEntity;
import com.senacor.bdm.model.metamodel.BusinessKey;
import com.senacor.bdm.model.metamodel.Entity;
import com.senacor.bdm.model.metamodel.ExtensionSatelite;
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
 * An implementation of the model object '<em><b>Extension Satelite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.ExtensionSateliteImpl#getLogdocument <em>Logdocument</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.ExtensionSateliteImpl#getFielddeclarations <em>Fielddeclarations</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.ExtensionSateliteImpl#getEntitysatelite <em>Entitysatelite</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.ExtensionSateliteImpl#getMainsatelit <em>Mainsatelit</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.ExtensionSateliteImpl#getBusinesskeys <em>Businesskeys</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.impl.ExtensionSateliteImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionSateliteImpl extends INamedElementImpl implements ExtensionSatelite {
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
	protected ExtensionSateliteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.EXTENSION_SATELITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogDocument getLogdocument() {
		if (eContainerFeatureID() != MetamodelPackage.EXTENSION_SATELITE__LOGDOCUMENT)
			return null;
		return (LogDocument) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogdocument(LogDocument newLogdocument, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newLogdocument, MetamodelPackage.EXTENSION_SATELITE__LOGDOCUMENT,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogdocument(LogDocument newLogdocument) {
		if (newLogdocument != eInternalContainer()
				|| (eContainerFeatureID() != MetamodelPackage.EXTENSION_SATELITE__LOGDOCUMENT
						&& newLogdocument != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.EXTENSION_SATELITE__LOGDOCUMENT,
					newLogdocument, newLogdocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldDeclaration> getFielddeclarations() {
		if (fielddeclarations == null) {
			fielddeclarations = new EObjectContainmentWithInverseEList<FieldDeclaration>(FieldDeclaration.class, this,
					MetamodelPackage.EXTENSION_SATELITE__FIELDDECLARATIONS, MetamodelPackage.FIELD_DECLARATION__MEMBER);
		}
		return fielddeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionSatelite> getEntitysatelite() {
		if (entitysatelite == null) {
			entitysatelite = new EObjectContainmentWithInverseEList<ExtensionSatelite>(ExtensionSatelite.class, this,
					MetamodelPackage.EXTENSION_SATELITE__ENTITYSATELITE, MetamodelPackage.EXTENSION_SATELITE__ENTITY);
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
					MetamodelPackage.EXTENSION_SATELITE__MAINSATELIT, oldMainsatelit, newMainsatelit);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.EXTENSION_SATELITE__MAINSATELIT,
					newMainsatelit, newMainsatelit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessKey> getBusinesskeys() {
		if (businesskeys == null) {
			businesskeys = new EObjectContainmentWithInverseEList<BusinessKey>(BusinessKey.class, this,
					MetamodelPackage.EXTENSION_SATELITE__BUSINESSKEYS, MetamodelPackage.BUSINESS_KEY__ENTITY);
		}
		return businesskeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntity() {
		if (eContainerFeatureID() != MetamodelPackage.EXTENSION_SATELITE__ENTITY)
			return null;
		return (Entity) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newEntity, MetamodelPackage.EXTENSION_SATELITE__ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Entity newEntity) {
		if (newEntity != eInternalContainer()
				|| (eContainerFeatureID() != MetamodelPackage.EXTENSION_SATELITE__ENTITY && newEntity != null)) {
			if (EcoreUtil.isAncestor(this, newEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEntity != null)
				msgs = ((InternalEObject) newEntity).eInverseAdd(this, MetamodelPackage.ENTITY__ENTITYSATELITE,
						Entity.class, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.EXTENSION_SATELITE__ENTITY,
					newEntity, newEntity));
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
		case MetamodelPackage.EXTENSION_SATELITE__LOGDOCUMENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetLogdocument((LogDocument) otherEnd, msgs);
		case MetamodelPackage.EXTENSION_SATELITE__FIELDDECLARATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFielddeclarations()).basicAdd(otherEnd,
					msgs);
		case MetamodelPackage.EXTENSION_SATELITE__ENTITYSATELITE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEntitysatelite()).basicAdd(otherEnd, msgs);
		case MetamodelPackage.EXTENSION_SATELITE__MAINSATELIT:
			if (mainsatelit != null)
				msgs = ((InternalEObject) mainsatelit).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MetamodelPackage.EXTENSION_SATELITE__MAINSATELIT, null, msgs);
			return basicSetMainsatelit((BaseEntity) otherEnd, msgs);
		case MetamodelPackage.EXTENSION_SATELITE__BUSINESSKEYS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getBusinesskeys()).basicAdd(otherEnd, msgs);
		case MetamodelPackage.EXTENSION_SATELITE__ENTITY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetEntity((Entity) otherEnd, msgs);
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
		case MetamodelPackage.EXTENSION_SATELITE__LOGDOCUMENT:
			return basicSetLogdocument(null, msgs);
		case MetamodelPackage.EXTENSION_SATELITE__FIELDDECLARATIONS:
			return ((InternalEList<?>) getFielddeclarations()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.EXTENSION_SATELITE__ENTITYSATELITE:
			return ((InternalEList<?>) getEntitysatelite()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.EXTENSION_SATELITE__MAINSATELIT:
			return basicSetMainsatelit(null, msgs);
		case MetamodelPackage.EXTENSION_SATELITE__BUSINESSKEYS:
			return ((InternalEList<?>) getBusinesskeys()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.EXTENSION_SATELITE__ENTITY:
			return basicSetEntity(null, msgs);
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
		case MetamodelPackage.EXTENSION_SATELITE__LOGDOCUMENT:
			return eInternalContainer().eInverseRemove(this, MetamodelPackage.LOG_DOCUMENT__MEMBERS, LogDocument.class,
					msgs);
		case MetamodelPackage.EXTENSION_SATELITE__ENTITY:
			return eInternalContainer().eInverseRemove(this, MetamodelPackage.ENTITY__ENTITYSATELITE, Entity.class,
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
		case MetamodelPackage.EXTENSION_SATELITE__LOGDOCUMENT:
			return getLogdocument();
		case MetamodelPackage.EXTENSION_SATELITE__FIELDDECLARATIONS:
			return getFielddeclarations();
		case MetamodelPackage.EXTENSION_SATELITE__ENTITYSATELITE:
			return getEntitysatelite();
		case MetamodelPackage.EXTENSION_SATELITE__MAINSATELIT:
			return getMainsatelit();
		case MetamodelPackage.EXTENSION_SATELITE__BUSINESSKEYS:
			return getBusinesskeys();
		case MetamodelPackage.EXTENSION_SATELITE__ENTITY:
			return getEntity();
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
		case MetamodelPackage.EXTENSION_SATELITE__LOGDOCUMENT:
			setLogdocument((LogDocument) newValue);
			return;
		case MetamodelPackage.EXTENSION_SATELITE__FIELDDECLARATIONS:
			getFielddeclarations().clear();
			getFielddeclarations().addAll((Collection<? extends FieldDeclaration>) newValue);
			return;
		case MetamodelPackage.EXTENSION_SATELITE__ENTITYSATELITE:
			getEntitysatelite().clear();
			getEntitysatelite().addAll((Collection<? extends ExtensionSatelite>) newValue);
			return;
		case MetamodelPackage.EXTENSION_SATELITE__MAINSATELIT:
			setMainsatelit((BaseEntity) newValue);
			return;
		case MetamodelPackage.EXTENSION_SATELITE__BUSINESSKEYS:
			getBusinesskeys().clear();
			getBusinesskeys().addAll((Collection<? extends BusinessKey>) newValue);
			return;
		case MetamodelPackage.EXTENSION_SATELITE__ENTITY:
			setEntity((Entity) newValue);
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
		case MetamodelPackage.EXTENSION_SATELITE__LOGDOCUMENT:
			setLogdocument((LogDocument) null);
			return;
		case MetamodelPackage.EXTENSION_SATELITE__FIELDDECLARATIONS:
			getFielddeclarations().clear();
			return;
		case MetamodelPackage.EXTENSION_SATELITE__ENTITYSATELITE:
			getEntitysatelite().clear();
			return;
		case MetamodelPackage.EXTENSION_SATELITE__MAINSATELIT:
			setMainsatelit((BaseEntity) null);
			return;
		case MetamodelPackage.EXTENSION_SATELITE__BUSINESSKEYS:
			getBusinesskeys().clear();
			return;
		case MetamodelPackage.EXTENSION_SATELITE__ENTITY:
			setEntity((Entity) null);
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
		case MetamodelPackage.EXTENSION_SATELITE__LOGDOCUMENT:
			return getLogdocument() != null;
		case MetamodelPackage.EXTENSION_SATELITE__FIELDDECLARATIONS:
			return fielddeclarations != null && !fielddeclarations.isEmpty();
		case MetamodelPackage.EXTENSION_SATELITE__ENTITYSATELITE:
			return entitysatelite != null && !entitysatelite.isEmpty();
		case MetamodelPackage.EXTENSION_SATELITE__MAINSATELIT:
			return mainsatelit != null;
		case MetamodelPackage.EXTENSION_SATELITE__BUSINESSKEYS:
			return businesskeys != null && !businesskeys.isEmpty();
		case MetamodelPackage.EXTENSION_SATELITE__ENTITY:
			return getEntity() != null;
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
			case MetamodelPackage.EXTENSION_SATELITE__LOGDOCUMENT:
				return MetamodelPackage.MEMBER__LOGDOCUMENT;
			case MetamodelPackage.EXTENSION_SATELITE__FIELDDECLARATIONS:
				return MetamodelPackage.MEMBER__FIELDDECLARATIONS;
			default:
				return -1;
			}
		}
		if (baseClass == Entity.class) {
			switch (derivedFeatureID) {
			case MetamodelPackage.EXTENSION_SATELITE__ENTITYSATELITE:
				return MetamodelPackage.ENTITY__ENTITYSATELITE;
			case MetamodelPackage.EXTENSION_SATELITE__MAINSATELIT:
				return MetamodelPackage.ENTITY__MAINSATELIT;
			case MetamodelPackage.EXTENSION_SATELITE__BUSINESSKEYS:
				return MetamodelPackage.ENTITY__BUSINESSKEYS;
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
				return MetamodelPackage.EXTENSION_SATELITE__LOGDOCUMENT;
			case MetamodelPackage.MEMBER__FIELDDECLARATIONS:
				return MetamodelPackage.EXTENSION_SATELITE__FIELDDECLARATIONS;
			default:
				return -1;
			}
		}
		if (baseClass == Entity.class) {
			switch (baseFeatureID) {
			case MetamodelPackage.ENTITY__ENTITYSATELITE:
				return MetamodelPackage.EXTENSION_SATELITE__ENTITYSATELITE;
			case MetamodelPackage.ENTITY__MAINSATELIT:
				return MetamodelPackage.EXTENSION_SATELITE__MAINSATELIT;
			case MetamodelPackage.ENTITY__BUSINESSKEYS:
				return MetamodelPackage.EXTENSION_SATELITE__BUSINESSKEYS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ExtensionSateliteImpl
