/**
 */
package courceList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courceList.Student#getStudyProgram <em>Study Program</em>}</li>
 *   <li>{@link courceList.Student#getNr <em>Nr</em>}</li>
 * </ul>
 *
 * @see courceList.CourceListPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject {
	/**
	 * Returns the value of the '<em><b>Study Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link courceList.StudyProgram#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Program</em>' container reference.
	 * @see #setStudyProgram(StudyProgram)
	 * @see courceList.CourceListPackage#getStudent_StudyProgram()
	 * @see courceList.StudyProgram#getStudent
	 * @model opposite="student" required="true" transient="false"
	 * @generated
	 */
	StudyProgram getStudyProgram();

	/**
	 * Sets the value of the '{@link courceList.Student#getStudyProgram <em>Study Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Program</em>' container reference.
	 * @see #getStudyProgram()
	 * @generated
	 */
	void setStudyProgram(StudyProgram value);

	/**
	 * Returns the value of the '<em><b>Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr</em>' attribute.
	 * @see #setNr(int)
	 * @see courceList.CourceListPackage#getStudent_Nr()
	 * @model
	 * @generated
	 */
	int getNr();

	/**
	 * Sets the value of the '{@link courceList.Student#getNr <em>Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr</em>' attribute.
	 * @see #getNr()
	 * @generated
	 */
	void setNr(int value);

} // Student
