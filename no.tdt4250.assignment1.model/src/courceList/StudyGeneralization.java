/**
 */
package courceList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courceList.StudyGeneralization#getStudyProgram <em>Study Program</em>}</li>
 *   <li>{@link courceList.StudyGeneralization#getDepartment <em>Department</em>}</li>
 *   <li>{@link courceList.StudyGeneralization#getName <em>Name</em>}</li>
 *   <li>{@link courceList.StudyGeneralization#getEducationLevel <em>Education Level</em>}</li>
 *   <li>{@link courceList.StudyGeneralization#getNrOfYears <em>Nr Of Years</em>}</li>
 *   <li>{@link courceList.StudyGeneralization#getCampus <em>Campus</em>}</li>
 *   <li>{@link courceList.StudyGeneralization#getAbbreviation <em>Abbreviation</em>}</li>
 * </ul>
 *
 * @see courceList.CourceListPackage#getStudyGeneralization()
 * @model
 * @generated
 */
public interface StudyGeneralization extends EObject {
	/**
	 * Returns the value of the '<em><b>Study Program</b></em>' containment reference list.
	 * The list contents are of type {@link courceList.StudyProgram}.
	 * It is bidirectional and its opposite is '{@link courceList.StudyProgram#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Program</em>' containment reference list.
	 * @see courceList.CourceListPackage#getStudyGeneralization_StudyProgram()
	 * @see courceList.StudyProgram#getGeneralization
	 * @model opposite="generalization" containment="true" required="true"
	 * @generated
	 */
	EList<StudyProgram> getStudyProgram();

	/**
	 * Returns the value of the '<em><b>Department</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link courceList.Department#getStudyProgram <em>Study Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' container reference.
	 * @see #setDepartment(Department)
	 * @see courceList.CourceListPackage#getStudyGeneralization_Department()
	 * @see courceList.Department#getStudyProgram
	 * @model opposite="studyProgram" transient="false"
	 * @generated
	 */
	Department getDepartment();

	/**
	 * Sets the value of the '{@link courceList.StudyGeneralization#getDepartment <em>Department</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' container reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(Department value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see courceList.CourceListPackage#getStudyGeneralization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link courceList.StudyGeneralization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Education Level</b></em>' attribute.
	 * The literals are from the enumeration {@link courceList.EducationLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Education Level</em>' attribute.
	 * @see courceList.EducationLevel
	 * @see #setEducationLevel(EducationLevel)
	 * @see courceList.CourceListPackage#getStudyGeneralization_EducationLevel()
	 * @model
	 * @generated
	 */
	EducationLevel getEducationLevel();

	/**
	 * Sets the value of the '{@link courceList.StudyGeneralization#getEducationLevel <em>Education Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Education Level</em>' attribute.
	 * @see courceList.EducationLevel
	 * @see #getEducationLevel()
	 * @generated
	 */
	void setEducationLevel(EducationLevel value);

	/**
	 * Returns the value of the '<em><b>Nr Of Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nr Of Years</em>' attribute.
	 * @see #setNrOfYears(int)
	 * @see courceList.CourceListPackage#getStudyGeneralization_NrOfYears()
	 * @model
	 * @generated
	 */
	int getNrOfYears();

	/**
	 * Sets the value of the '{@link courceList.StudyGeneralization#getNrOfYears <em>Nr Of Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nr Of Years</em>' attribute.
	 * @see #getNrOfYears()
	 * @generated
	 */
	void setNrOfYears(int value);

	/**
	 * Returns the value of the '<em><b>Campus</b></em>' attribute list.
	 * The list contents are of type {@link courceList.Campus}.
	 * The literals are from the enumeration {@link courceList.Campus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campus</em>' attribute list.
	 * @see courceList.Campus
	 * @see courceList.CourceListPackage#getStudyGeneralization_Campus()
	 * @model required="true"
	 * @generated
	 */
	EList<Campus> getCampus();

	/**
	 * Returns the value of the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbreviation</em>' attribute.
	 * @see #setAbbreviation(String)
	 * @see courceList.CourceListPackage#getStudyGeneralization_Abbreviation()
	 * @model
	 * @generated
	 */
	String getAbbreviation();

	/**
	 * Sets the value of the '{@link courceList.StudyGeneralization#getAbbreviation <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbreviation</em>' attribute.
	 * @see #getAbbreviation()
	 * @generated
	 */
	void setAbbreviation(String value);

} // StudyGeneralization
