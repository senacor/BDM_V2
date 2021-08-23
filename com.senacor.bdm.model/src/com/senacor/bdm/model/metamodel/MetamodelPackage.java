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
	 * The meta object id for the '{@link com.senacor.bdm.model.metamodel.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.metamodel.impl.DocumentImpl
	 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getDocument()
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
	 * The feature id for the '<em><b>Baseentities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__BASEENTITIES = 1;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.senacor.bdm.model.metamodel.impl.BaseEntityImpl <em>Base Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.senacor.bdm.model.metamodel.impl.BaseEntityImpl
	 * @see com.senacor.bdm.model.metamodel.impl.MetamodelPackageImpl#getBaseEntity()
	 * @generated
	 */
	int BASE_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Document</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ENTITY__DOCUMENT = 1;

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
	 * Returns the meta object for the containment reference list '{@link com.senacor.bdm.model.metamodel.Document#getBaseentities <em>Baseentities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Baseentities</em>'.
	 * @see com.senacor.bdm.model.metamodel.Document#getBaseentities()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Baseentities();

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
	 * Returns the meta object for the attribute '{@link com.senacor.bdm.model.metamodel.BaseEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.senacor.bdm.model.metamodel.BaseEntity#getName()
	 * @see #getBaseEntity()
	 * @generated
	 */
	EAttribute getBaseEntity_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.senacor.bdm.model.metamodel.BaseEntity#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Document</em>'.
	 * @see com.senacor.bdm.model.metamodel.BaseEntity#getDocument()
	 * @see #getBaseEntity()
	 * @generated
	 */
	EReference getBaseEntity_Document();

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
		 * The meta object literal for the '{@link com.senacor.bdm.model.metamodel.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.senacor.bdm.model.metamodel.impl.DocumentImpl
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
		 * The meta object literal for the '<em><b>Baseentities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__BASEENTITIES = eINSTANCE.getDocument_Baseentities();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_ENTITY__NAME = eINSTANCE.getBaseEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_ENTITY__DOCUMENT = eINSTANCE.getBaseEntity_Document();

	}

} //MetamodelPackage
