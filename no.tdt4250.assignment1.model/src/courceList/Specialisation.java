/**
 */
package courceList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courceList.Specialisation#getCource <em>Cource</em>}</li>
 *   <li>{@link courceList.Specialisation#getStudyProgram <em>Study Program</em>}</li>
 *   <li>{@link courceList.Specialisation#getName <em>Name</em>}</li>
 *   <li>{@link courceList.Specialisation#getStartSemester <em>Start Semester</em>}</li>
 *   <li>{@link courceList.Specialisation#getFurtherSpecialisation <em>Further Specialisation</em>}</li>
 *   <li>{@link courceList.Specialisation#getHostSpecialisation <em>Host Specialisation</em>}</li>
 * </ul>
 *
 * @see courceList.CourceListPackage#getSpecialisation()
 * @model
 * @generated
 */
public interface Specialisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Cource</b></em>' containment reference list.
	 * The list contents are of type {@link courceList.StudyCourceRelation}.
	 * It is bidirectional and its opposite is '{@link courceList.StudyCourceRelation#getSpecialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cource</em>' containment reference list.
	 * @see courceList.CourceListPackage#getSpecialisation_Cource()
	 * @see courceList.StudyCourceRelation#getSpecialisation
	 * @model opposite="specialisation" containment="true" required="true"
	 * @generated
	 */
	EList<StudyCourceRelation> getCource();

	/**
	 * Returns the value of the '<em><b>Study Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link courceList.StudyProgram#getCource <em>Cource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Program</em>' container reference.
	 * @see #setStudyProgram(StudyProgram)
	 * @see courceList.CourceListPackage#getSpecialisation_StudyProgram()
	 * @see courceList.StudyProgram#getCource
	 * @model opposite="cource" transient="false"
	 * @generated
	 */
	StudyProgram getStudyProgram();

	/**
	 * Sets the value of the '{@link courceList.Specialisation#getStudyProgram <em>Study Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Program</em>' container reference.
	 * @see #getStudyProgram()
	 * @generated
	 */
	void setStudyProgram(StudyProgram value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see courceList.CourceListPackage#getSpecialisation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link courceList.Specialisation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Start Semester</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Semester</em>' attribute.
	 * @see #setStartSemester(int)
	 * @see courceList.CourceListPackage#getSpecialisation_StartSemester()
	 * @model
	 * @generated
	 */
	int getStartSemester();

	/**
	 * Sets the value of the '{@link courceList.Specialisation#getStartSemester <em>Start Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Semester</em>' attribute.
	 * @see #getStartSemester()
	 * @generated
	 */
	void setStartSemester(int value);

	/**
	 * Returns the value of the '<em><b>Further Specialisation</b></em>' containment reference list.
	 * The list contents are of type {@link courceList.Specialisation}.
	 * It is bidirectional and its opposite is '{@link courceList.Specialisation#getHostSpecialisation <em>Host Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Further Specialisation</em>' containment reference list.
	 * @see courceList.CourceListPackage#getSpecialisation_FurtherSpecialisation()
	 * @see courceList.Specialisation#getHostSpecialisation
	 * @model opposite="hostSpecialisation" containment="true"
	 * @generated
	 */
	EList<Specialisation> getFurtherSpecialisation();

	/**
	 * Returns the value of the '<em><b>Host Specialisation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link courceList.Specialisation#getFurtherSpecialisation <em>Further Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Specialisation</em>' container reference.
	 * @see #setHostSpecialisation(Specialisation)
	 * @see courceList.CourceListPackage#getSpecialisation_HostSpecialisation()
	 * @see courceList.Specialisation#getFurtherSpecialisation
	 * @model opposite="furtherSpecialisation" transient="false"
	 * @generated
	 */
	Specialisation getHostSpecialisation();

	/**
	 * Sets the value of the '{@link courceList.Specialisation#getHostSpecialisation <em>Host Specialisation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Specialisation</em>' container reference.
	 * @see #getHostSpecialisation()
	 * @generated
	 */
	void setHostSpecialisation(Specialisation value);

} // Specialisation
