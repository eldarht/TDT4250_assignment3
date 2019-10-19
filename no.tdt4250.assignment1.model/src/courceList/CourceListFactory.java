/**
 */
package courceList;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see courceList.CourceListPackage
 * @generated
 */
public interface CourceListFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CourceListFactory eINSTANCE = courceList.impl.CourceListFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Department</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Department</em>'.
	 * @generated
	 */
	Department createDepartment();

	/**
	 * Returns a new object of class '<em>Cource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cource</em>'.
	 * @generated
	 */
	Cource createCource();

	/**
	 * Returns a new object of class '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Student</em>'.
	 * @generated
	 */
	Student createStudent();

	/**
	 * Returns a new object of class '<em>Study Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Study Program</em>'.
	 * @generated
	 */
	StudyProgram createStudyProgram();

	/**
	 * Returns a new object of class '<em>Exam</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exam</em>'.
	 * @generated
	 */
	Exam createExam();

	/**
	 * Returns a new object of class '<em>Evaluation Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluation Form</em>'.
	 * @generated
	 */
	EvaluationForm createEvaluationForm();

	/**
	 * Returns a new object of class '<em>Work</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work</em>'.
	 * @generated
	 */
	Work createWork();

	/**
	 * Returns a new object of class '<em>Study Cource Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Study Cource Relation</em>'.
	 * @generated
	 */
	StudyCourceRelation createStudyCourceRelation();

	/**
	 * Returns a new object of class '<em>Professor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Professor</em>'.
	 * @generated
	 */
	Professor createProfessor();

	/**
	 * Returns a new object of class '<em>Specialisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specialisation</em>'.
	 * @generated
	 */
	Specialisation createSpecialisation();

	/**
	 * Returns a new object of class '<em>Cource Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cource Specification</em>'.
	 * @generated
	 */
	CourceSpecification createCourceSpecification();

	/**
	 * Returns a new object of class '<em>Study Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Study Generalization</em>'.
	 * @generated
	 */
	StudyGeneralization createStudyGeneralization();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CourceListPackage getCourceListPackage();

} //CourceListFactory
