/**
 */
package courceList.tests;

import courceList.CourceListFactory;
import courceList.EvaluationForm;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Evaluation Form</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvaluationFormTest extends TestCase {

	/**
	 * The fixture for this Evaluation Form test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationForm fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EvaluationFormTest.class);
	}

	/**
	 * Constructs a new Evaluation Form test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationFormTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Evaluation Form test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EvaluationForm fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Evaluation Form test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationForm getFixture() {
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
		setFixture(CourceListFactory.eINSTANCE.createEvaluationForm());
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

} //EvaluationFormTest
