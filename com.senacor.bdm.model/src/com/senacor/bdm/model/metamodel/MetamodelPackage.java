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
	 * The number of structural features of the '<em>Log Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_DOCUMENT_FEATURE_COUNT = DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Log Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_DOCUMENT_OPERATION_COUNT = DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.metamodel.impl.INamedElementImpl <em>INamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.metamodel.impl.INamedElementImpl
	 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getINamedElement()
	 * @generated
	 */
	int INAMED_ELEMENT = 5;

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
	 * The feature id for the '<em><b>Fielddeclarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__FIELDDECLARATIONS = INAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = INAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = INAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.metamodel.impl.TechDocumentImpl <em>Tech Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.metamodel.impl.TechDocumentImpl
	 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getTechDocument()
	 * @generated
	 */
	int TECH_DOCUMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DOCUMENT__NAME = DOCUMENT__NAME;

	/**
	 * The number of structural features of the '<em>Tech Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DOCUMENT_FEATURE_COUNT = DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tech Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_DOCUMENT_OPERATION_COUNT = DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.metamodel.impl.MappingDocumentImpl <em>Mapping Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.metamodel.impl.MappingDocumentImpl
	 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getMappingDocument()
	 * @generated
	 */
	int MAPPING_DOCUMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_DOCUMENT__NAME = DOCUMENT__NAME;

	/**
	 * The number of structural features of the '<em>Mapping Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_DOCUMENT_FEATURE_COUNT = DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mapping Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_DOCUMENT_OPERATION_COUNT = DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.metamodel.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.metamodel.impl.EntityImpl
	 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 6;

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
	 * The feature id for the '<em><b>Fielddeclarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FIELDDECLARATIONS = MEMBER__FIELDDECLARATIONS;

	/**
	 * The feature id for the '<em><b>Entitysatelite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ENTITYSATELITE = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mainsatelit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__MAINSATELIT = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Businesskeys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__BUSINESSKEYS = MEMBER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.metamodel.impl.ExtensionSateliteImpl <em>Extension Satelite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.metamodel.impl.ExtensionSateliteImpl
	 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getExtensionSatelite()
	 * @generated
	 */
	int EXTENSION_SATELITE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_SATELITE__NAME = INAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Logdocument</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_SATELITE__LOGDOCUMENT = INAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fielddeclarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_SATELITE__FIELDDECLARATIONS = INAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entitysatelite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_SATELITE__ENTITYSATELITE = INAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mainsatelit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_SATELITE__MAINSATELIT = INAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Businesskeys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_SATELITE__BUSINESSKEYS = INAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_SATELITE__ENTITY = INAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Extension Satelite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_SATELITE_FEATURE_COUNT = INAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Extension Satelite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_SATELITE_OPERATION_COUNT = INAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.metamodel.impl.BaseEntityImpl <em>Base Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.metamodel.impl.BaseEntityImpl
	 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getBaseEntity()
	 * @generated
	 */
	int BASE_ENTITY = 8;

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
	 * The feature id for the '<em><b>Fielddeclarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY__FIELDDECLARATIONS = INAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entitysatelite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY__ENTITYSATELITE = INAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mainsatelit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY__MAINSATELIT = INAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Businesskeys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY__BUSINESSKEYS = INAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY__ENTITY = INAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Base Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY_FEATURE_COUNT = INAMED_ELEMENT_FEATURE_COUNT + 6;

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
	int FIELD = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = INAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Logdocument</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__LOGDOCUMENT = INAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fielddeclarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__FIELDDECLARATIONS = INAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__MEMBER = INAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = INAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = INAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.metamodel.impl.BusinessKeyImpl <em>Business Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.metamodel.impl.BusinessKeyImpl
	 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getBusinessKey()
	 * @generated
	 */
	int BUSINESS_KEY = 10;

	/**
	 * The feature id for the '<em><b>Fielddeclaration</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_KEY__FIELDDECLARATION = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_KEY__ENTITY = 1;

	/**
	 * The number of structural features of the '<em>Business Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_KEY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Business Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_KEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.metamodel.FieldDeclaration <em>Field Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.metamodel.FieldDeclaration
	 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getFieldDeclaration()
	 * @generated
	 */
	int FIELD_DECLARATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__NAME = MEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Logdocument</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__LOGDOCUMENT = MEMBER__LOGDOCUMENT;

	/**
	 * The feature id for the '<em><b>Fielddeclarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__FIELDDECLARATIONS = MEMBER__FIELDDECLARATIONS;

	/**
	 * The feature id for the '<em><b>Member</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION__MEMBER = MEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DECLARATION_OPERATION_COUNT = MEMBER_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the containment reference list '{@link com.senacor.bdm.model.metamodel.Member#getFielddeclarations <em>Fielddeclarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fielddeclarations</em>'.
	 * @see com.senacor.bdm.model.metamodel.Member#getFielddeclarations()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Fielddeclarations();

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
	 * Returns the meta object for class '{@link com.senacor.bdm.model.metamodel.TechDocument <em>Tech Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tech Document</em>'.
	 * @see com.senacor.bdm.model.metamodel.TechDocument
	 * @generated
	 */
	EClass getTechDocument();

	/**
	 * Returns the meta object for class '{@link com.senacor.bdm.model.metamodel.MappingDocument <em>Mapping Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Document</em>'.
	 * @see com.senacor.bdm.model.metamodel.MappingDocument
	 * @generated
	 */
	EClass getMappingDocument();

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
	 * Returns the meta object for the containment reference list '{@link com.senacor.bdm.model.metamodel.Entity#getEntitysatelite <em>Entitysatelite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entitysatelite</em>'.
	 * @see com.senacor.bdm.model.metamodel.Entity#getEntitysatelite()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Entitysatelite();

	/**
	 * Returns the meta object for the containment reference '{@link com.senacor.bdm.model.metamodel.Entity#getMainsatelit <em>Mainsatelit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mainsatelit</em>'.
	 * @see com.senacor.bdm.model.metamodel.Entity#getMainsatelit()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Mainsatelit();

	/**
	 * Returns the meta object for the containment reference list '{@link com.senacor.bdm.model.metamodel.Entity#getBusinesskeys <em>Businesskeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Businesskeys</em>'.
	 * @see com.senacor.bdm.model.metamodel.Entity#getBusinesskeys()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Businesskeys();

	/**
	 * Returns the meta object for class '{@link com.senacor.bdm.model.metamodel.ExtensionSatelite <em>Extension Satelite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Satelite</em>'.
	 * @see com.senacor.bdm.model.metamodel.ExtensionSatelite
	 * @generated
	 */
	EClass getExtensionSatelite();

	/**
	 * Returns the meta object for the container reference '{@link com.senacor.bdm.model.metamodel.ExtensionSatelite#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entity</em>'.
	 * @see com.senacor.bdm.model.metamodel.ExtensionSatelite#getEntity()
	 * @see #getExtensionSatelite()
	 * @generated
	 */
	EReference getExtensionSatelite_Entity();

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
	 * Returns the meta object for the container reference '{@link com.senacor.bdm.model.metamodel.BaseEntity#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entity</em>'.
	 * @see com.senacor.bdm.model.metamodel.BaseEntity#getEntity()
	 * @see #getBaseEntity()
	 * @generated
	 */
	EReference getBaseEntity_Entity();

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
	 * Returns the meta object for the reference list '{@link com.senacor.bdm.model.metamodel.BusinessKey#getFielddeclaration <em>Fielddeclaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fielddeclaration</em>'.
	 * @see com.senacor.bdm.model.metamodel.BusinessKey#getFielddeclaration()
	 * @see #getBusinessKey()
	 * @generated
	 */
	EReference getBusinessKey_Fielddeclaration();

	/**
	 * Returns the meta object for the container reference '{@link com.senacor.bdm.model.metamodel.BusinessKey#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Entity</em>'.
	 * @see com.senacor.bdm.model.metamodel.BusinessKey#getEntity()
	 * @see #getBusinessKey()
	 * @generated
	 */
	EReference getBusinessKey_Entity();

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
	 * Returns the meta object for the container reference '{@link com.senacor.bdm.model.metamodel.FieldDeclaration#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Member</em>'.
	 * @see com.senacor.bdm.model.metamodel.FieldDeclaration#getMember()
	 * @see #getFieldDeclaration()
	 * @generated
	 */
	EReference getFieldDeclaration_Member();

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
		 * The meta object literal for the '<em><b>Fielddeclarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__FIELDDECLARATIONS = eINSTANCE.getMember_Fielddeclarations();

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
		 * The meta object literal for the '{@link com.senacor.bdm.model.metamodel.impl.TechDocumentImpl <em>Tech Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.metamodel.impl.TechDocumentImpl
		 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getTechDocument()
		 * @generated
		 */
		EClass TECH_DOCUMENT = eINSTANCE.getTechDocument();

		/**
		 * The meta object literal for the '{@link com.senacor.bdm.model.metamodel.impl.MappingDocumentImpl <em>Mapping Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.metamodel.impl.MappingDocumentImpl
		 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getMappingDocument()
		 * @generated
		 */
		EClass MAPPING_DOCUMENT = eINSTANCE.getMappingDocument();

		/**
		 * The meta object literal for the '{@link com.senacor.bdm.model.metamodel.impl.INamedElementImpl <em>INamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.metamodel.impl.INamedElementImpl
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
		 * The meta object literal for the '<em><b>Entitysatelite</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ENTITYSATELITE = eINSTANCE.getEntity_Entitysatelite();

		/**
		 * The meta object literal for the '<em><b>Mainsatelit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__MAINSATELIT = eINSTANCE.getEntity_Mainsatelit();

		/**
		 * The meta object literal for the '<em><b>Businesskeys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__BUSINESSKEYS = eINSTANCE.getEntity_Businesskeys();

		/**
		 * The meta object literal for the '{@link com.senacor.bdm.model.metamodel.impl.ExtensionSateliteImpl <em>Extension Satelite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.metamodel.impl.ExtensionSateliteImpl
		 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getExtensionSatelite()
		 * @generated
		 */
		EClass EXTENSION_SATELITE = eINSTANCE.getExtensionSatelite();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_SATELITE__ENTITY = eINSTANCE.getExtensionSatelite_Entity();

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
		 * The meta object literal for the '<em><b>Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_ENTITY__ENTITY = eINSTANCE.getBaseEntity_Entity();

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
		 * The meta object literal for the '<em><b>Fielddeclaration</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_KEY__FIELDDECLARATION = eINSTANCE.getBusinessKey_Fielddeclaration();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_KEY__ENTITY = eINSTANCE.getBusinessKey_Entity();

		/**
		 * The meta object literal for the '{@link com.senacor.bdm.model.metamodel.FieldDeclaration <em>Field Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.metamodel.FieldDeclaration
		 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getFieldDeclaration()
		 * @generated
		 */
		EClass FIELD_DECLARATION = eINSTANCE.getFieldDeclaration();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_DECLARATION__MEMBER = eINSTANCE.getFieldDeclaration_Member();

	}

} //MetamodelPackage
