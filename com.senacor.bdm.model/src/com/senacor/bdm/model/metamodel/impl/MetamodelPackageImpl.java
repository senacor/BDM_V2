/**
 */
package com.senacor.bdm.model.metamodel.impl;

import com.senacor.bdm.model.metamodel.BaseEntity;
import com.senacor.bdm.model.metamodel.BusinessKey;
import com.senacor.bdm.model.metamodel.Document;
import com.senacor.bdm.model.metamodel.Entity;
import com.senacor.bdm.model.metamodel.Field;
import com.senacor.bdm.model.metamodel.FieldDeclaration;
import com.senacor.bdm.model.metamodel.INamedElement;
import com.senacor.bdm.model.metamodel.LogDocument;
import com.senacor.bdm.model.metamodel.Member;
import com.senacor.bdm.model.metamodel.MetamodelFactory;
import com.senacor.bdm.model.metamodel.MetamodelPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodelPackageImpl extends EPackageImpl implements MetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDeclarationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetamodelPackageImpl() {
		super(eNS_URI, MetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetamodelPackage init() {
		if (isInited)
			return (MetamodelPackage) EPackage.Registry.INSTANCE.getEPackage(MetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MetamodelPackageImpl theMetamodelPackage = registeredMetamodelPackage instanceof MetamodelPackageImpl
				? (MetamodelPackageImpl) registeredMetamodelPackage
				: new MetamodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theMetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetamodelPackage.eNS_URI, theMetamodelPackage);
		return theMetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogDocument() {
		return logDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogDocument_Members() {
		return (EReference) logDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMember() {
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMember_Logdocument() {
		return (EReference) memberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMember_Fielddeclarations() {
		return (EReference) memberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_Name() {
		return (EAttribute) documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getINamedElement() {
		return iNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINamedElement_Name() {
		return (EAttribute) iNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Businesskeys() {
		return (EReference) entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseEntity() {
		return baseEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessKey() {
		return businessKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessKey_Fielddeclaration() {
		return (EReference) businessKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessKey_Entity() {
		return (EReference) businessKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldDeclaration() {
		return fieldDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldDeclaration_Member() {
		return (EReference) fieldDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelFactory getMetamodelFactory() {
		return (MetamodelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		logDocumentEClass = createEClass(LOG_DOCUMENT);
		createEReference(logDocumentEClass, LOG_DOCUMENT__MEMBERS);

		memberEClass = createEClass(MEMBER);
		createEReference(memberEClass, MEMBER__LOGDOCUMENT);
		createEReference(memberEClass, MEMBER__FIELDDECLARATIONS);

		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__NAME);

		iNamedElementEClass = createEClass(INAMED_ELEMENT);
		createEAttribute(iNamedElementEClass, INAMED_ELEMENT__NAME);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__BUSINESSKEYS);

		baseEntityEClass = createEClass(BASE_ENTITY);

		fieldEClass = createEClass(FIELD);

		businessKeyEClass = createEClass(BUSINESS_KEY);
		createEReference(businessKeyEClass, BUSINESS_KEY__FIELDDECLARATION);
		createEReference(businessKeyEClass, BUSINESS_KEY__ENTITY);

		fieldDeclarationEClass = createEClass(FIELD_DECLARATION);
		createEReference(fieldDeclarationEClass, FIELD_DECLARATION__MEMBER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		logDocumentEClass.getESuperTypes().add(this.getDocument());
		memberEClass.getESuperTypes().add(this.getINamedElement());
		entityEClass.getESuperTypes().add(this.getMember());
		baseEntityEClass.getESuperTypes().add(this.getINamedElement());
		baseEntityEClass.getESuperTypes().add(this.getEntity());
		fieldEClass.getESuperTypes().add(this.getFieldDeclaration());
		businessKeyEClass.getESuperTypes().add(this.getINamedElement());
		fieldDeclarationEClass.getESuperTypes().add(this.getINamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(logDocumentEClass, LogDocument.class, "LogDocument", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogDocument_Members(), this.getMember(), this.getMember_Logdocument(), "members", null, 0, -1,
				LogDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberEClass, Member.class, "Member", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMember_Logdocument(), this.getLogDocument(), this.getLogDocument_Members(), "logdocument",
				null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMember_Fielddeclarations(), this.getFieldDeclaration(), this.getFieldDeclaration_Member(),
				"fielddeclarations", null, 0, -1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocument_Name(), ecorePackage.getEString(), "name", null, 0, 1, Document.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iNamedElementEClass, INamedElement.class, "INamedElement", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getINamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, INamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_Businesskeys(), this.getBusinessKey(), this.getBusinessKey_Entity(), "businesskeys",
				null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseEntityEClass, BaseEntity.class, "BaseEntity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(businessKeyEClass, BusinessKey.class, "BusinessKey", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBusinessKey_Fielddeclaration(), this.getFieldDeclaration(), null, "fielddeclaration", null, 0,
				-1, BusinessKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessKey_Entity(), this.getEntity(), this.getEntity_Businesskeys(), "entity", null, 0, 1,
				BusinessKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldDeclarationEClass, FieldDeclaration.class, "FieldDeclaration", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldDeclaration_Member(), this.getMember(), this.getMember_Fielddeclarations(), "member",
				null, 0, 1, FieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MetamodelPackageImpl
