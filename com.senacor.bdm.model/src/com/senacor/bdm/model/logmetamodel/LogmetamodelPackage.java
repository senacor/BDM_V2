/**
 */
package com.senacor.bdm.model.logmetamodel;

import com.senacor.bdm.model.commonmetamodel.CommonmetamodelPackage;

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
	 * The meta object id for the '{@link com.senacor.bdm.model.logmetamodel.impl.LogDocumentImpl <em>Log Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.logmetamodel.impl.LogDocumentImpl
	 * @see com.senacor.bdm.model.logmetamodel.impl.LogmetamodelPackageImpl#getLogDocument()
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
	int LOG_DOCUMENT__NAME = CommonmetamodelPackage.DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Baseentities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_DOCUMENT__BASEENTITIES = CommonmetamodelPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Log Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_DOCUMENT_FEATURE_COUNT = CommonmetamodelPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Log Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_DOCUMENT_OPERATION_COUNT = CommonmetamodelPackage.DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.logmetamodel.impl.BaseEntityImpl <em>Base Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.logmetamodel.impl.BaseEntityImpl
	 * @see com.senacor.bdm.model.logmetamodel.impl.LogmetamodelPackageImpl#getBaseEntity()
	 * @generated
	 */
	int BASE_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Document</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY__DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Base Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Base Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the containment reference list '{@link com.senacor.bdm.model.logmetamodel.LogDocument#getBaseentities <em>Baseentities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Baseentities</em>'.
	 * @see com.senacor.bdm.model.logmetamodel.LogDocument#getBaseentities()
	 * @see #getLogDocument()
	 * @generated
	 */
	EReference getLogDocument_Baseentities();

	/**
	 * Returns the meta object for class '{@link com.senacor.bdm.model.logmetamodel.BaseEntity <em>Base Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Entity</em>'.
	 * @see com.senacor.bdm.model.logmetamodel.BaseEntity
	 * @generated
	 */
	EClass getBaseEntity();

	/**
	 * Returns the meta object for the container reference '{@link com.senacor.bdm.model.logmetamodel.BaseEntity#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Document</em>'.
	 * @see com.senacor.bdm.model.logmetamodel.BaseEntity#getDocument()
	 * @see #getBaseEntity()
	 * @generated
	 */
	EReference getBaseEntity_Document();

	/**
	 * Returns the meta object for the attribute '{@link com.senacor.bdm.model.logmetamodel.BaseEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.senacor.bdm.model.logmetamodel.BaseEntity#getName()
	 * @see #getBaseEntity()
	 * @generated
	 */
	EAttribute getBaseEntity_Name();

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
		 * The meta object literal for the '{@link com.senacor.bdm.model.logmetamodel.impl.LogDocumentImpl <em>Log Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.logmetamodel.impl.LogDocumentImpl
		 * @see com.senacor.bdm.model.logmetamodel.impl.LogmetamodelPackageImpl#getLogDocument()
		 * @generated
		 */
		EClass LOG_DOCUMENT = eINSTANCE.getLogDocument();

		/**
		 * The meta object literal for the '<em><b>Baseentities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_DOCUMENT__BASEENTITIES = eINSTANCE.getLogDocument_Baseentities();

		/**
		 * The meta object literal for the '{@link com.senacor.bdm.model.logmetamodel.impl.BaseEntityImpl <em>Base Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.logmetamodel.impl.BaseEntityImpl
		 * @see com.senacor.bdm.model.logmetamodel.impl.LogmetamodelPackageImpl#getBaseEntity()
		 * @generated
		 */
		EClass BASE_ENTITY = eINSTANCE.getBaseEntity();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_ENTITY__DOCUMENT = eINSTANCE.getBaseEntity_Document();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_ENTITY__NAME = eINSTANCE.getBaseEntity_Name();

	}

} //LogmetamodelPackage
