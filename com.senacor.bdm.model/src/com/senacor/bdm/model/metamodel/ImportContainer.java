/**
 */
package com.senacor.bdm.model.metamodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.senacor.bdm.model.metamodel.ImportContainer#getDocument <em>Document</em>}</li>
 *   <li>{@link com.senacor.bdm.model.metamodel.ImportContainer#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getImportContainer()
 * @model
 * @generated
 */
public interface ImportContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Document</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.senacor.bdm.model.metamodel.LogDocument#getImportcontainer <em>Importcontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' container reference.
	 * @see #setDocument(LogDocument)
	 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getImportContainer_Document()
	 * @see com.senacor.bdm.model.metamodel.LogDocument#getImportcontainer
	 * @model opposite="importcontainer" transient="false"
	 * @generated
	 */
	LogDocument getDocument();

	/**
	 * Sets the value of the '{@link com.senacor.bdm.model.metamodel.ImportContainer#getDocument <em>Document</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' container reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(LogDocument value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link com.senacor.bdm.model.metamodel.Import}.
	 * It is bidirectional and its opposite is '{@link com.senacor.bdm.model.metamodel.Import#getImportcontainer <em>Importcontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see com.senacor.bdm.model.metamodel.MetamodelPackage#getImportContainer_Imports()
	 * @see com.senacor.bdm.model.metamodel.Import#getImportcontainer
	 * @model opposite="importcontainer" containment="true"
	 * @generated
	 */
	EList<Import> getImports();

} // ImportContainer
