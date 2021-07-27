/**
 */
package com.senacor.bdm.model.logmetamodel.impl;

import com.senacor.bdm.model.logmetamodel.*;

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
public class LogmetamodelFactoryImpl extends EFactoryImpl implements LogmetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogmetamodelFactory init() {
		try {
			LogmetamodelFactory theLogmetamodelFactory = (LogmetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(LogmetamodelPackage.eNS_URI);
			if (theLogmetamodelFactory != null) {
				return theLogmetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogmetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogmetamodelFactoryImpl() {
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
			case LogmetamodelPackage.LOG_DOCUMENT: return createLogDocument();
			case LogmetamodelPackage.BASE_ENTITY: return createBaseEntity();
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
	public BaseEntity createBaseEntity() {
		BaseEntityImpl baseEntity = new BaseEntityImpl();
		return baseEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogmetamodelPackage getLogmetamodelPackage() {
		return (LogmetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LogmetamodelPackage getPackage() {
		return LogmetamodelPackage.eINSTANCE;
	}

} //LogmetamodelFactoryImpl
