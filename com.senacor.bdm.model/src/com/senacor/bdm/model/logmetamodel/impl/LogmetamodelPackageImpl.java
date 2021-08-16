/**
 */
package com.senacor.bdm.model.logmetamodel.impl;

import com.senacor.bdm.model.logmetamodel.DataTypes;
import com.senacor.bdm.model.logmetamodel.Document;
import com.senacor.bdm.model.logmetamodel.Entity;
import com.senacor.bdm.model.logmetamodel.Field;
import com.senacor.bdm.model.logmetamodel.IDescribable;
import com.senacor.bdm.model.logmetamodel.INamedElement;
import com.senacor.bdm.model.logmetamodel.LogDocument;
import com.senacor.bdm.model.logmetamodel.LogmetamodelFactory;
import com.senacor.bdm.model.logmetamodel.LogmetamodelPackage;

import com.senacor.bdm.model.logmetamodel.member;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogmetamodelPackageImpl extends EPackageImpl implements LogmetamodelPackage {
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
	private EClass entityEClass = null;

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
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iDescribableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypesEEnum = null;

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
	 * @see com.senacor.bdm.model.logmetamodel.LogmetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogmetamodelPackageImpl() {
		super(eNS_URI, LogmetamodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LogmetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogmetamodelPackage init() {
		if (isInited) return (LogmetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(LogmetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLogmetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LogmetamodelPackageImpl theLogmetamodelPackage = registeredLogmetamodelPackage instanceof LogmetamodelPackageImpl ? (LogmetamodelPackageImpl)registeredLogmetamodelPackage : new LogmetamodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theLogmetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theLogmetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogmetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LogmetamodelPackage.eNS_URI, theLogmetamodelPackage);
		return theLogmetamodelPackage;
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
		return (EAttribute)documentEClass.getEStructuralFeatures().get(0);
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
	public EReference getLogDocument_Member() {
		return (EReference)logDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmember() {
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmember_Logdocument() {
		return (EReference)memberEClass.getEStructuralFeatures().get(0);
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
	public EReference getEntity_Fields() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
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
		return (EAttribute)iNamedElementEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getField_Dtype() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIDescribable() {
		return iDescribableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIDescribable_Description() {
		return (EAttribute)iDescribableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataTypes() {
		return dataTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogmetamodelFactory getLogmetamodelFactory() {
		return (LogmetamodelFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__NAME);

		logDocumentEClass = createEClass(LOG_DOCUMENT);
		createEReference(logDocumentEClass, LOG_DOCUMENT__MEMBER);

		memberEClass = createEClass(MEMBER);
		createEReference(memberEClass, MEMBER__LOGDOCUMENT);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__FIELDS);

		iNamedElementEClass = createEClass(INAMED_ELEMENT);
		createEAttribute(iNamedElementEClass, INAMED_ELEMENT__NAME);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__DTYPE);

		iDescribableEClass = createEClass(IDESCRIBABLE);
		createEAttribute(iDescribableEClass, IDESCRIBABLE__DESCRIPTION);

		// Create enums
		dataTypesEEnum = createEEnum(DATA_TYPES);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		logDocumentEClass.getESuperTypes().add(this.getDocument());
		memberEClass.getESuperTypes().add(this.getIDescribable());
		entityEClass.getESuperTypes().add(this.getINamedElement());
		entityEClass.getESuperTypes().add(this.getmember());
		fieldEClass.getESuperTypes().add(this.getINamedElement());
		fieldEClass.getESuperTypes().add(this.getmember());

		// Initialize classes, features, and operations; add parameters
		initEClass(documentEClass, Document.class, "Document", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocument_Name(), ecorePackage.getEString(), "name", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logDocumentEClass, LogDocument.class, "LogDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogDocument_Member(), this.getmember(), this.getmember_Logdocument(), "member", null, 0, -1, LogDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberEClass, member.class, "member", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getmember_Logdocument(), this.getLogDocument(), this.getLogDocument_Member(), "logdocument", null, 0, 1, member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_Fields(), this.getField(), null, "fields", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iNamedElementEClass, INamedElement.class, "INamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getINamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, INamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Dtype(), this.getDataTypes(), "dtype", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iDescribableEClass, IDescribable.class, "IDescribable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIDescribable_Description(), ecorePackage.getEString(), "description", null, 0, 1, IDescribable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataTypesEEnum, DataTypes.class, "DataTypes");
		addEEnumLiteral(dataTypesEEnum, DataTypes.NONE);
		addEEnumLiteral(dataTypesEEnum, DataTypes.STRING);
		addEEnumLiteral(dataTypesEEnum, DataTypes.NUMBER);

		// Create resource
		createResource(eNS_URI);
	}

} //LogmetamodelPackageImpl
