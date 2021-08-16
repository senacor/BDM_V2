/**
 */
package com.senacor.bdm.model.logmetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see com.senacor.bdm.model.logmetamodel.LogmetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface LogmetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logmetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/logmetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "logmetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogmetamodelPackage eINSTANCE = com.senacor.bdm.model.logmetamodel.impl.LogmetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.logmetamodel.Document <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.logmetamodel.Document
	 * @see com.senacor.bdm.model.logmetamodel.impl.LogmetamodelPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 0;

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
	 * The meta object id for the '{@link com.senacor.bdm.model.logmetamodel.impl.LogDocumentImpl <em>Log Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.logmetamodel.impl.LogDocumentImpl
	 * @see com.senacor.bdm.model.logmetamodel.impl.LogmetamodelPackageImpl#getLogDocument()
	 * @generated
	 */
	int LOG_DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_DOCUMENT__NAME = DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_DOCUMENT__MEMBER = DOCUMENT_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link com.senacor.bdm.model.logmetamodel.IDescribable <em>IDescribable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.logmetamodel.IDescribable
	 * @see com.senacor.bdm.model.logmetamodel.impl.LogmetamodelPackageImpl#getIDescribable()
	 * @generated
	 */
	int IDESCRIBABLE = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDESCRIBABLE__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>IDescribable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDESCRIBABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IDescribable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDESCRIBABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.logmetamodel.impl.memberImpl <em>member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.logmetamodel.impl.memberImpl
	 * @see com.senacor.bdm.model.logmetamodel.impl.LogmetamodelPackageImpl#getmember()
	 * @generated
	 */
	int MEMBER = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__DESCRIPTION = IDESCRIBABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Logdocument</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__LOGDOCUMENT = IDESCRIBABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = IDESCRIBABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = IDESCRIBABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.logmetamodel.impl.INamedElementImpl <em>INamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.logmetamodel.impl.INamedElementImpl
	 * @see com.senacor.bdm.model.logmetamodel.impl.LogmetamodelPackageImpl#getINamedElement()
	 * @generated
	 */
	int INAMED_ELEMENT = 4;

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
	 * The meta object id for the '{@link com.senacor.bdm.model.logmetamodel.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.logmetamodel.impl.EntityImpl
	 * @see com.senacor.bdm.model.logmetamodel.impl.LogmetamodelPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = INAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DESCRIPTION = INAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logdocument</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__LOGDOCUMENT = INAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FIELDS = INAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = INAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = INAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.logmetamodel.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.logmetamodel.impl.FieldImpl
	 * @see com.senacor.bdm.model.logmetamodel.impl.LogmetamodelPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = INAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DESCRIPTION = INAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logdocument</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__LOGDOCUMENT = INAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DTYPE = INAMED_ELEMENT_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link com.senacor.bdm.model.logmetamodel.DataTypes <em>Data Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.logmetamodel.DataTypes
	 * @see com.senacor.bdm.model.logmetamodel.impl.LogmetamodelPackageImpl#getDataTypes()
	 * @generated
	 */
	int DATA_TYPES = 7;


	/**
	 * Returns the meta object for class '{@link com.senacor.bdm.model.logmetamodel.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see com.senacor.bdm.model.logmetamodel.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link com.senacor.bdm.model.logmetamodel.Document#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.senacor.bdm.model.logmetamodel.Document#getName()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Name();

	/**
	 * Returns the meta object for class '{@link com.senacor.bdm.model.logmetamodel.LogDocument <em>Log Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Document</em>'.
	 * @see com.senacor.bdm.model.logmetamodel.LogDocument
	 * @generated
	 */
	EClass getLogDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link com.senacor.bdm.model.logmetamodel.LogDocument#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member</em>'.
	 * @see com.senacor.bdm.model.logmetamodel.LogDocument#getMember()
	 * @see #getLogDocument()
	 * @generated
	 */
	EReference getLogDocument_Member();

	/**
	 * Returns the meta object for class '{@link com.senacor.bdm.model.logmetamodel.member <em>member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>member</em>'.
	 * @see com.senacor.bdm.model.logmetamodel.member
	 * @generated
	 */
	EClass getmember();

	/**
	 * Returns the meta object for the container reference '{@link com.senacor.bdm.model.logmetamodel.member#getLogdocument <em>Logdocument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Logdocument</em>'.
	 * @see com.senacor.bdm.model.logmetamodel.member#getLogdocument()
	 * @see #getmember()
	 * @generated
	 */
	EReference getmember_Logdocument();

	/**
	 * Returns the meta object for class '{@link com.senacor.bdm.model.logmetamodel.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see com.senacor.bdm.model.logmetamodel.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link com.senacor.bdm.model.logmetamodel.Entity#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see com.senacor.bdm.model.logmetamodel.Entity#getFields()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Fields();

	/**
	 * Returns the meta object for class '{@link com.senacor.bdm.model.logmetamodel.INamedElement <em>INamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INamed Element</em>'.
	 * @see com.senacor.bdm.model.logmetamodel.INamedElement
	 * @generated
	 */
	EClass getINamedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.senacor.bdm.model.logmetamodel.INamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.senacor.bdm.model.logmetamodel.INamedElement#getName()
	 * @see #getINamedElement()
	 * @generated
	 */
	EAttribute getINamedElement_Name();

	/**
	 * Returns the meta object for class '{@link com.senacor.bdm.model.logmetamodel.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see com.senacor.bdm.model.logmetamodel.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link com.senacor.bdm.model.logmetamodel.Field#getDtype <em>Dtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtype</em>'.
	 * @see com.senacor.bdm.model.logmetamodel.Field#getDtype()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Dtype();

	/**
	 * Returns the meta object for class '{@link com.senacor.bdm.model.logmetamodel.IDescribable <em>IDescribable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDescribable</em>'.
	 * @see com.senacor.bdm.model.logmetamodel.IDescribable
	 * @generated
	 */
	EClass getIDescribable();

	/**
	 * Returns the meta object for the attribute '{@link com.senacor.bdm.model.logmetamodel.IDescribable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.senacor.bdm.model.logmetamodel.IDescribable#getDescription()
	 * @see #getIDescribable()
	 * @generated
	 */
	EAttribute getIDescribable_Description();

	/**
	 * Returns the meta object for enum '{@link com.senacor.bdm.model.logmetamodel.DataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Types</em>'.
	 * @see com.senacor.bdm.model.logmetamodel.DataTypes
	 * @generated
	 */
	EEnum getDataTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogmetamodelFactory getLogmetamodelFactory();

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
		 * The meta object literal for the '{@link com.senacor.bdm.model.logmetamodel.Document <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.logmetamodel.Document
		 * @see com.senacor.bdm.model.logmetamodel.impl.LogmetamodelPackageImpl#getDocument()
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
		 * The meta object literal for the '{@link com.senacor.bdm.model.logmetamodel.impl.LogDocumentImpl <em>Log Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.logmetamodel.impl.LogDocumentImpl
		 * @see com.senacor.bdm.model.logmetamodel.impl.LogmetamodelPackageImpl#getLogDocument()
		 * @generated
		 */
		EClass LOG_DOCUMENT = eINSTANCE.getLogDocument();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_DOCUMENT__MEMBER = eINSTANCE.getLogDocument_Member();

		/**
		 * The meta object literal for the '{@link com.senacor.bdm.model.logmetamodel.impl.memberImpl <em>member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.logmetamodel.impl.memberImpl
		 * @see com.senacor.bdm.model.logmetamodel.impl.LogmetamodelPackageImpl#getmember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getmember();

		/**
		 * The meta object literal for the '<em><b>Logdocument</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__LOGDOCUMENT = eINSTANCE.getmember_Logdocument();

		/**
		 * The meta object literal for the '{@link com.senacor.bdm.model.logmetamodel.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.logmetamodel.impl.EntityImpl
		 * @see com.senacor.bdm.model.logmetamodel.impl.LogmetamodelPackageImpl#getEntity()
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
		 * The meta object literal for the '{@link com.senacor.bdm.model.logmetamodel.impl.INamedElementImpl <em>INamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.logmetamodel.impl.INamedElementImpl
		 * @see com.senacor.bdm.model.logmetamodel.impl.LogmetamodelPackageImpl#getINamedElement()
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
		 * The meta object literal for the '{@link com.senacor.bdm.model.logmetamodel.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.logmetamodel.impl.FieldImpl
		 * @see com.senacor.bdm.model.logmetamodel.impl.LogmetamodelPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Dtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__DTYPE = eINSTANCE.getField_Dtype();

		/**
		 * The meta object literal for the '{@link com.senacor.bdm.model.logmetamodel.IDescribable <em>IDescribable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.logmetamodel.IDescribable
		 * @see com.senacor.bdm.model.logmetamodel.impl.LogmetamodelPackageImpl#getIDescribable()
		 * @generated
		 */
		EClass IDESCRIBABLE = eINSTANCE.getIDescribable();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDESCRIBABLE__DESCRIPTION = eINSTANCE.getIDescribable_Description();

		/**
		 * The meta object literal for the '{@link com.senacor.bdm.model.logmetamodel.DataTypes <em>Data Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.logmetamodel.DataTypes
		 * @see com.senacor.bdm.model.logmetamodel.impl.LogmetamodelPackageImpl#getDataTypes()
		 * @generated
		 */
		EEnum DATA_TYPES = eINSTANCE.getDataTypes();

	}

} //LogmetamodelPackage
