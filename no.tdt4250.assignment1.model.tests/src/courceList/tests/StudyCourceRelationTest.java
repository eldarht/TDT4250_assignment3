/**
 */
package courceList.tests;

import courceList.CourceListFactory;
import courceList.StudyCourceRelation;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Study Cource Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudyCourceRelationTest extends TestCase {

	/**
	 * The fixture for this Study Cource Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyCourceRelation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StudyCourceRelationTest.class);
	}

	/**
	 * Constructs a new Study Cource Relation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyCourceRelationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Study Cource Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StudyCourceRelation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Study Cource Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyCourceRelation getFixture() {
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
		setFixture(CourceListFactory.eINSTANCE.createStudyCourceRelation());
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

} //StudyCourceRelationTest
