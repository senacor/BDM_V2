/**
 */
package com.senacor.bdm.model.logmetamodel.impl;

import com.senacor.bdm.model.commonmetamodel.CommonmetamodelPackage;

import com.senacor.bdm.model.logmetamodel.BaseEntity;
import com.senacor.bdm.model.logmetamodel.LogDocument;
import com.senacor.bdm.model.logmetamodel.LogmetamodelFactory;
import com.senacor.bdm.model.logmetamodel.LogmetamodelPackage;

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
public class LogmetamodelPackageImpl extends EPackageImpl implements LogmetamodelPackage {
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
	private EClass baseEntityEClass = null;

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

		// Initialize simple dependencies
		CommonmetamodelPackage.eINSTANCE.eClass();

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
	public EClass getLogDocument() {
		return logDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogDocument_Baseentities() {
		return (EReference)logDocumentEClass.getEStructuralFeatures().get(0);
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
	public EReference getBaseEntity_Document() {
		return (EReference)baseEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseEntity_Name() {
		return (EAttribute)baseEntityEClass.getEStructuralFeatures().get(1);
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
		logDocumentEClass = createEClass(LOG_DOCUMENT);
		createEReference(logDocumentEClass, LOG_DOCUMENT__BASEENTITIES);

		baseEntityEClass = createEClass(BASE_ENTITY);
		createEReference(baseEntityEClass, BASE_ENTITY__DOCUMENT);
		createEAttribute(baseEntityEClass, BASE_ENTITY__NAME);
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

		// Obtain other dependent packages
		CommonmetamodelPackage theCommonmetamodelPackage = (CommonmetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(CommonmetamodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		logDocumentEClass.getESuperTypes().add(theCommonmetamodelPackage.getDocument());

		// Initialize classes, features, and operations; add parameters
		initEClass(logDocumentEClass, LogDocument.class, "LogDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogDocument_Baseentities(), this.getBaseEntity(), this.getBaseEntity_Document(), "baseentities", null, 0, -1, LogDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseEntityEClass, BaseEntity.class, "BaseEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseEntity_Document(), this.getLogDocument(), this.getLogDocument_Baseentities(), "document", null, 0, 1, BaseEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, BaseEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //LogmetamodelPackageImpl
