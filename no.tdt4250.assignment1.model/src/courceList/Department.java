/**
 */
package courceList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courceList.Department#getStudyProgram <em>Study Program</em>}</li>
 *   <li>{@link courceList.Department#getCourse <em>Course</em>}</li>
 *   <li>{@link courceList.Department#getProfessor <em>Professor</em>}</li>
 *   <li>{@link courceList.Department#getName <em>Name</em>}</li>
 *   <li>{@link courceList.Department#getAbbreviation <em>Abbreviation</em>}</li>
 * </ul>
 *
 * @see courceList.CourceListPackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Study Program</b></em>' containment reference list.
	 * The list contents are of type {@link courceList.StudyGeneralization}.
	 * It is bidirectional and its opposite is '{@link courceList.StudyGeneralization#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Program</em>' containment reference list.
	 * @see courceList.CourceListPackage#getDepartment_StudyProgram()
	 * @see courceList.StudyGeneralization#getDepartment
	 * @model opposite="department" containment="true" required="true"
	 * @generated
	 */
	EList<StudyGeneralization> getStudyProgram();

	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference list.
	 * The list contents are of type {@link courceList.Cource}.
	 * It is bidirectional and its opposite is '{@link courceList.Cource#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference list.
	 * @see courceList.CourceListPackage#getDepartment_Course()
	 * @see courceList.Cource#getDepartment
	 * @model opposite="department" containment="true" required="true"
	 * @generated
	 */
	EList<Cource> getCourse();

	/**
	 * Returns the value of the '<em><b>Professor</b></em>' containment reference list.
	 * The list contents are of type {@link courceList.Professor}.
	 * It is bidirectional and its opposite is '{@link courceList.Professor#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Professor</em>' containment reference list.
	 * @see courceList.CourceListPackage#getDepartment_Professor()
	 * @see courceList.Professor#getDepartment
	 * @model opposite="department" containment="true" required="true"
	 * @generated
	 */
	EList<Professor> getProfessor();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see courceList.CourceListPackage#getDepartment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link courceList.Department#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbreviation</em>' attribute.
	 * @see #setAbbreviation(String)
	 * @see courceList.CourceListPackage#getDepartment_Abbreviation()
	 * @model
	 * @generated
	 */
	String getAbbreviation();

	/**
	 * Sets the value of the '{@link courceList.Department#getAbbreviation <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbreviation</em>' attribute.
	 * @see #getAbbreviation()
	 * @generated
	 */
	void setAbbreviation(String value);

} // Department
