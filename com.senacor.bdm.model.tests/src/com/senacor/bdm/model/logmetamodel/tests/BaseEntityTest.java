/**
 */
package com.senacor.bdm.model.logmetamodel.tests;

import com.senacor.bdm.model.logmetamodel.BaseEntity;
import com.senacor.bdm.model.logmetamodel.LogmetamodelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Base Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BaseEntityTest extends TestCase {

	/**
	 * The fixture for this Base Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseEntity fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BaseEntityTest.class);
	}

	/**
	 * Constructs a new Base Entity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseEntityTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Base Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BaseEntity fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Base Entity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseEntity getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LogmetamodelFactory.eINSTANCE.createBaseEntity());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //BaseEntityTest
