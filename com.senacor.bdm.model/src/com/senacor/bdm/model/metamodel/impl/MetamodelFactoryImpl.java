/**
 */
package com.senacor.bdm.model.metamodel.impl;

import com.senacor.bdm.model.metamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodelFactoryImpl extends EFactoryImpl implements MetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetamodelFactory init() {
		try {
			MetamodelFactory theMetamodelFactory = (MetamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(MetamodelPackage.eNS_URI);
			if (theMetamodelFactory != null) {
				return theMetamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MetamodelPackage.LOG_DOCUMENT:
			return createLogDocument();
		case MetamodelPackage.TECH_DOCUMENT:
			return createTechDocument();
		case MetamodelPackage.MAPPING_DOCUMENT:
			return createMappingDocument();
		case MetamodelPackage.EXTENSION_SATELITE:
			return createExtensionSatelite();
		case MetamodelPackage.BASE_ENTITY:
			return createBaseEntity();
		case MetamodelPackage.FIELD:
			return createField();
		case MetamodelPackage.BUSINESS_KEY:
			return createBusinessKey();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogDocument createLogDocument() {
		LogDocumentImpl logDocument = new LogDocumentImpl();
		return logDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechDocument createTechDocument() {
		TechDocumentImpl techDocument = new TechDocumentImpl();
		return techDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingDocument createMappingDocument() {
		MappingDocumentImpl mappingDocument = new MappingDocumentImpl();
		return mappingDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionSatelite createExtensionSatelite() {
		ExtensionSateliteImpl extensionSatelite = new ExtensionSateliteImpl();
		return extensionSatelite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseEntity createBaseEntity() {
		BaseEntityImpl baseEntity = new BaseEntityImpl();
		return baseEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessKey createBusinessKey() {
		BusinessKeyImpl businessKey = new BusinessKeyImpl();
		return businessKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelPackage getMetamodelPackage() {
		return (MetamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetamodelPackage getPackage() {
		return MetamodelPackage.eINSTANCE;
	}

} //MetamodelFactoryImpl
