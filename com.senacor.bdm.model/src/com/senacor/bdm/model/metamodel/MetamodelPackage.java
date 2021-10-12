/**
 */
package com.senacor.bdm.model.metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.senacor.bdm.model.metamodel.MetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface MetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelPackage eINSTANCE = com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.metamodel.Document <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.metamodel.Document
	 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.metamodel.impl.LogDocumentImpl <em>Log Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.metamodel.impl.LogDocumentImpl
	 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getLogDocument()
	 * @generated
	 */
	int LOG_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_DOCUMENT__NAME = DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_DOCUMENT__MEMBERS = DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Importcontainer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_DOCUMENT__IMPORTCONTAINER = DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Log Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_DOCUMENT_FEATURE_COUNT = DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Log Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_DOCUMENT_OPERATION_COUNT = DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.metamodel.INamedElement <em>INamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.metamodel.INamedElement
	 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getINamedElement()
	 * @generated
	 */
	int INAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>INamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>INamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.metamodel.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.metamodel.impl.MemberImpl
	 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NAME = INAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Logdocument</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__LOGDOCUMENT = INAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = INAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = INAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.metamodel.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.metamodel.impl.EntityImpl
	 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Logdocument</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__LOGDOCUMENT = MEMBER__LOGDOCUMENT;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FIELDS = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.metamodel.impl.BaseEntityImpl <em>Base Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.metamodel.impl.BaseEntityImpl
	 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getBaseEntity()
	 * @generated
	 */
	int BASE_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY__NAME = INAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Logdocument</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY__LOGDOCUMENT = INAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY__FIELDS = INAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Businesskeys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY__BUSINESSKEYS = INAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Base Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY_FEATURE_COUNT = INAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Base Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY_OPERATION_COUNT = INAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.metamodel.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.metamodel.impl.FieldImpl
	 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 6;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.metamodel.impl.BusinessKeyImpl <em>Business Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.metamodel.impl.BusinessKeyImpl
	 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getBusinessKey()
	 * @generated
	 */
	int BUSINESS_KEY = 7;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.metamodel.impl.FieldDeclarationImpl <em>Field Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.metamodel.impl.FieldDeclarationImpl
	 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getFieldDeclaration()
	 * @generated
	 */
	int FIELD_DECLARATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__NAME = INAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__ENTITY = INAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION_FEATURE_COUNT = INAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION_OPERATION_COUNT = INAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = FIELD_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ENTITY = FIELD_DECLARATION__ENTITY;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = FIELD_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = FIELD_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_KEY__NAME = INAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_KEY__FIELDS = INAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Baseentity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_KEY__BASEENTITY = INAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Business Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_KEY_FEATURE_COUNT = INAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Business Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_KEY_OPERATION_COUNT = INAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.metamodel.impl.ImportContainerImpl <em>Import Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.metamodel.impl.ImportContainerImpl
	 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getImportContainer()
	 * @generated
	 */
	int IMPORT_CONTAINER = 9;

	/**
	 * The feature id for the '<em><b>Document</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_CONTAINER__DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_CONTAINER__IMPORTS = 1;

	/**
	 * The number of structural features of the '<em>Import Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Import Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.metamodel.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.metamodel.impl.ImportImpl
	 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 10;

	/**
	 * The feature id for the '<em><b>Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ITEM = 0;

	/**
	 * The feature id for the '<em><b>Importcontainer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTCONTAINER = 1;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link com.senacor.bdm.model.metamodel.LogDocument <em>Log Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Document</em>'.
	 * @see com.senacor.bdm.model.metamodel.LogDocument
	 * @generated
	 */
	EClass getLogDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link com.senacor.bdm.model.metamodel.LogDocument#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see com.senacor.bdm.model.metamodel.LogDocument#getMembers()
	 * @see #getLogDocument()
	 * @generated
	 */
	EReference getLogDocument_Members();

	/**
	 * Returns the meta object for the containment reference '{@link com.senacor.bdm.model.metamodel.LogDocument#getImportcontainer <em>Importcontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Importcontainer</em>'.
	 * @see com.senacor.bdm.model.metamodel.LogDocument#getImportcontainer()
	 * @see #getLogDocument()
	 * @generated
	 */
	EReference getLogDocument_Importcontainer();

	/**
	 * Returns the meta object for class '{@link com.senacor.bdm.model.metamodel.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see com.senacor.bdm.model.metamodel.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for the container reference '{@link com.senacor.bdm.model.metamodel.Member#getLogdocument <em>Logdocument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Logdocument</em>'.
	 * @see com.senacor.bdm.model.metamodel.Member#getLogdocument()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Logdocument();

	/**
	 * Returns the meta object for class '{@link com.senacor.bdm.model.metamodel.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see com.senacor.bdm.model.metamodel.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link com.senacor.bdm.model.metamodel.Document#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.senacor.bdm.model.metamodel.Document#getName()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Name();

	/**
	 * Returns the meta object for class '{@link com.senacor.bdm.model.metamodel.INamedElement <em>INamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INamed Element</em>'.
	 * @see com.senacor.bdm.model.metamodel.INamedElement
	 * @generated
	 */
	EClass getINamedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.senacor.bdm.model.metamodel.INamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.senacor.bdm.model.metamodel.INamedElement#getName()
	 * @see #getINamedElement()
	 * @generated
	 */
	EAttribute getINamedElement_Name();

	/**
	 * Returns the meta object for class '{@link com.senacor.bdm.model.metamodel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see com.senacor.bdm.model.metamodel.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link com.senacor.bdm.model.metamodel.Entity#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see com.senacor.bdm.model.metamodel.Entity#getFields()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Fields();

	/**
	 * Returns the meta object for class '{@link com.senacor.bdm.model.metamodel.BaseEntity <em>Base Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Entity</em>'.
	 * @see com.senacor.bdm.model.metamodel.BaseEntity
	 * @generated
	 */
	EClass getBaseEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link com.senacor.bdm.model.metamodel.BaseEntity#getBusinesskeys <em>Businesskeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Businesskeys</em>'.
	 * @see com.senacor.bdm.model.metamodel.BaseEntity#getBusinesskeys()
	 * @see #getBaseEntity()
	 * @generated
	 */
	EReference getBaseEntity_Businesskeys();

	/**
	 * Returns the meta object for class '{@link com.senacor.bdm.model.metamodel.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see com.senacor.bdm.model.metamodel.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for class '{@link com.senacor.bdm.model.metamodel.BusinessKey <em>Business Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Key</em>'.
	 * @see com.senacor.bdm.model.metamodel.BusinessKey
	 * @generated
	 */
	EClass getBusinessKey();

	/**
	 * Returns the meta object for the reference list '{@link com.senacor.bdm.model.metamodel.BusinessKey#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see com.senacor.bdm.model.metamodel.BusinessKey#getFields()
	 * @see #getBusinessKey()
	 * @generated
	 */
	EReference getBusinessKey_Fields();

	/**
	 * Returns the meta object for the container reference '{@link com.senacor.bdm.model.metamodel.BusinessKey#getBaseentity <em>Baseentity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Baseentity</em>'.
	 * @see com.senacor.bdm.model.metamodel.BusinessKey#getBaseentity()
	 * @see #getBusinessKey()
	 * @generated
	 */
	EReference getBusinessKey_Baseentity();

	/**
	 * Returns the meta object for class '{@link com.senacor.bdm.model.metamodel.FieldDeclaration <em>Field Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Declaration</em>'.
	 * @see com.senacor.bdm.model.metamodel.FieldDeclaration
	 * @generated
	 */
	EClass getFieldDeclaration();

	/**
	 * Returns the meta object for the container reference '{@link com.senacor.bdm.model.metamodel.FieldDeclaration#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entity</em>'.
	 * @see com.senacor.bdm.model.metamodel.FieldDeclaration#getEntity()
	 * @see #getFieldDeclaration()
	 * @generated
	 */
	EReference getFieldDeclaration_Entity();

	/**
	 * Returns the meta object for class '{@link com.senacor.bdm.model.metamodel.ImportContainer <em>Import Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Container</em>'.
	 * @see com.senacor.bdm.model.metamodel.ImportContainer
	 * @generated
	 */
	EClass getImportContainer();

	/**
	 * Returns the meta object for the container reference '{@link com.senacor.bdm.model.metamodel.ImportContainer#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Document</em>'.
	 * @see com.senacor.bdm.model.metamodel.ImportContainer#getDocument()
	 * @see #getImportContainer()
	 * @generated
	 */
	EReference getImportContainer_Document();

	/**
	 * Returns the meta object for the containment reference list '{@link com.senacor.bdm.model.metamodel.ImportContainer#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see com.senacor.bdm.model.metamodel.ImportContainer#getImports()
	 * @see #getImportContainer()
	 * @generated
	 */
	EReference getImportContainer_Imports();

	/**
	 * Returns the meta object for class '{@link com.senacor.bdm.model.metamodel.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see com.senacor.bdm.model.metamodel.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link com.senacor.bdm.model.metamodel.Import#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item</em>'.
	 * @see com.senacor.bdm.model.metamodel.Import#getItem()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Item();

	/**
	 * Returns the meta object for the container reference '{@link com.senacor.bdm.model.metamodel.Import#getImportcontainer <em>Importcontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Importcontainer</em>'.
	 * @see com.senacor.bdm.model.metamodel.Import#getImportcontainer()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_Importcontainer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetamodelFactory getMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.senacor.bdm.model.metamodel.impl.LogDocumentImpl <em>Log Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.metamodel.impl.LogDocumentImpl
		 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getLogDocument()
		 * @generated
		 */
		EClass LOG_DOCUMENT = eINSTANCE.getLogDocument();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_DOCUMENT__MEMBERS = eINSTANCE.getLogDocument_Members();

		/**
		 * The meta object literal for the '<em><b>Importcontainer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_DOCUMENT__IMPORTCONTAINER = eINSTANCE.getLogDocument_Importcontainer();

		/**
		 * The meta object literal for the '{@link com.senacor.bdm.model.metamodel.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.metamodel.impl.MemberImpl
		 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '<em><b>Logdocument</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__LOGDOCUMENT = eINSTANCE.getMember_Logdocument();

		/**
		 * The meta object literal for the '{@link com.senacor.bdm.model.metamodel.Document <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.metamodel.Document
		 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__NAME = eINSTANCE.getDocument_Name();

		/**
		 * The meta object literal for the '{@link com.senacor.bdm.model.metamodel.INamedElement <em>INamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.metamodel.INamedElement
		 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getINamedElement()
		 * @generated
		 */
		EClass INAMED_ELEMENT = eINSTANCE.getINamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INAMED_ELEMENT__NAME = eINSTANCE.getINamedElement_Name();

		/**
		 * The meta object literal for the '{@link com.senacor.bdm.model.metamodel.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.metamodel.impl.EntityImpl
		 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__FIELDS = eINSTANCE.getEntity_Fields();

		/**
		 * The meta object literal for the '{@link com.senacor.bdm.model.metamodel.impl.BaseEntityImpl <em>Base Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.metamodel.impl.BaseEntityImpl
		 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getBaseEntity()
		 * @generated
		 */
		EClass BASE_ENTITY = eINSTANCE.getBaseEntity();

		/**
		 * The meta object literal for the '<em><b>Businesskeys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_ENTITY__BUSINESSKEYS = eINSTANCE.getBaseEntity_Businesskeys();

		/**
		 * The meta object literal for the '{@link com.senacor.bdm.model.metamodel.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.metamodel.impl.FieldImpl
		 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '{@link com.senacor.bdm.model.metamodel.impl.BusinessKeyImpl <em>Business Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.metamodel.impl.BusinessKeyImpl
		 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getBusinessKey()
		 * @generated
		 */
		EClass BUSINESS_KEY = eINSTANCE.getBusinessKey();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_KEY__FIELDS = eINSTANCE.getBusinessKey_Fields();

		/**
		 * The meta object literal for the '<em><b>Baseentity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_KEY__BASEENTITY = eINSTANCE.getBusinessKey_Baseentity();

		/**
		 * The meta object literal for the '{@link com.senacor.bdm.model.metamodel.impl.FieldDeclarationImpl <em>Field Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.metamodel.impl.FieldDeclarationImpl
		 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getFieldDeclaration()
		 * @generated
		 */
		EClass FIELD_DECLARATION = eINSTANCE.getFieldDeclaration();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_DECLARATION__ENTITY = eINSTANCE.getFieldDeclaration_Entity();

		/**
		 * The meta object literal for the '{@link com.senacor.bdm.model.metamodel.impl.ImportContainerImpl <em>Import Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.metamodel.impl.ImportContainerImpl
		 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getImportContainer()
		 * @generated
		 */
		EClass IMPORT_CONTAINER = eINSTANCE.getImportContainer();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_CONTAINER__DOCUMENT = eINSTANCE.getImportContainer_Document();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_CONTAINER__IMPORTS = eINSTANCE.getImportContainer_Imports();

		/**
		 * The meta object literal for the '{@link com.senacor.bdm.model.metamodel.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.metamodel.impl.ImportImpl
		 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__ITEM = eINSTANCE.getImport_Item();

		/**
		 * The meta object literal for the '<em><b>Importcontainer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__IMPORTCONTAINER = eINSTANCE.getImport_Importcontainer();

	}

} //MetamodelPackage
