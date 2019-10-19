/**
 */
package courceList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courceList.StudyProgram#getCource <em>Cource</em>}</li>
 *   <li>{@link courceList.StudyProgram#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link courceList.StudyProgram#getStudent <em>Student</em>}</li>
 *   <li>{@link courceList.StudyProgram#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @see courceList.CourceListPackage#getStudyProgram()
 * @model
 * @generated
 */
public interface StudyProgram extends EObject {
	/**
	 * Returns the value of the '<em><b>Cource</b></em>' containment reference list.
	 * The list contents are of type {@link courceList.Specialisation}.
	 * It is bidirectional and its opposite is '{@link courceList.Specialisation#getStudyProgram <em>Study Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cource</em>' containment reference list.
	 * @see courceList.CourceListPackage#getStudyProgram_Cource()
	 * @see courceList.Specialisation#getStudyProgram
	 * @model opposite="studyProgram" containment="true"
	 * @generated
	 */
	EList<Specialisation> getCource();

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link courceList.StudyGeneralization#getStudyProgram <em>Study Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization</em>' container reference.
	 * @see #setGeneralization(StudyGeneralization)
	 * @see courceList.CourceListPackage#getStudyProgram_Generalization()
	 * @see courceList.StudyGeneralization#getStudyProgram
	 * @model opposite="studyProgram" transient="false"
	 * @generated
	 */
	StudyGeneralization getGeneralization();

	/**
	 * Sets the value of the '{@link courceList.StudyProgram#getGeneralization <em>Generalization</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generalization</em>' container reference.
	 * @see #getGeneralization()
	 * @generated
	 */
	void setGeneralization(StudyGeneralization value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' containment reference list.
	 * The list contents are of type {@link courceList.Student}.
	 * It is bidirectional and its opposite is '{@link courceList.Student#getStudyProgram <em>Study Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' containment reference list.
	 * @see courceList.CourceListPackage#getStudyProgram_Student()
	 * @see courceList.Student#getStudyProgram
	 * @model opposite="studyProgram" containment="true"
	 * @generated
	 */
	EList<Student> getStudent();

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see courceList.CourceListPackage#getStudyProgram_Year()
	 * @model required="true"
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link courceList.StudyProgram#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

} // StudyProgram
