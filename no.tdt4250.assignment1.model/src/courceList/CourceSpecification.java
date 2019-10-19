/**
 */
package courceList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cource Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courceList.CourceSpecification#getCource <em>Cource</em>}</li>
 *   <li>{@link courceList.CourceSpecification#getCoordinator <em>Coordinator</em>}</li>
 *   <li>{@link courceList.CourceSpecification#getEvaluationForm <em>Evaluation Form</em>}</li>
 *   <li>{@link courceList.CourceSpecification#getSpecificationYear <em>Specification Year</em>}</li>
 *   <li>{@link courceList.CourceSpecification#getSemester <em>Semester</em>}</li>
 *   <li>{@link courceList.CourceSpecification#getLanguage <em>Language</em>}</li>
 *   <li>{@link courceList.CourceSpecification#getVersion <em>Version</em>}</li>
 *   <li>{@link courceList.CourceSpecification#getCredits <em>Credits</em>}</li>
 *   <li>{@link courceList.CourceSpecification#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see courceList.CourceListPackage#getCourceSpecification()
 * @model
 * @generated
 */
public interface CourceSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Cource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link courceList.Cource#getCorseSpecifications <em>Corse Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cource</em>' container reference.
	 * @see #setCource(Cource)
	 * @see courceList.CourceListPackage#getCourceSpecification_Cource()
	 * @see courceList.Cource#getCorseSpecifications
	 * @model opposite="corseSpecifications" required="true" transient="false"
	 * @generated
	 */
	Cource getCource();

	/**
	 * Sets the value of the '{@link courceList.CourceSpecification#getCource <em>Cource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cource</em>' container reference.
	 * @see #getCource()
	 * @generated
	 */
	void setCource(Cource value);

	/**
	 * Returns the value of the '<em><b>Coordinator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinator</em>' reference.
	 * @see #setCoordinator(Professor)
	 * @see courceList.CourceListPackage#getCourceSpecification_Coordinator()
	 * @model
	 * @generated
	 */
	Professor getCoordinator();

	/**
	 * Sets the value of the '{@link courceList.CourceSpecification#getCoordinator <em>Coordinator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinator</em>' reference.
	 * @see #getCoordinator()
	 * @generated
	 */
	void setCoordinator(Professor value);

	/**
	 * Returns the value of the '<em><b>Evaluation Form</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link courceList.EvaluationForm#getCource <em>Cource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Form</em>' containment reference.
	 * @see #setEvaluationForm(EvaluationForm)
	 * @see courceList.CourceListPackage#getCourceSpecification_EvaluationForm()
	 * @see courceList.EvaluationForm#getCource
	 * @model opposite="cource" containment="true"
	 * @generated
	 */
	EvaluationForm getEvaluationForm();

	/**
	 * Sets the value of the '{@link courceList.CourceSpecification#getEvaluationForm <em>Evaluation Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation Form</em>' containment reference.
	 * @see #getEvaluationForm()
	 * @generated
	 */
	void setEvaluationForm(EvaluationForm value);

	/**
	 * Returns the value of the '<em><b>Specification Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification Year</em>' attribute.
	 * @see #setSpecificationYear(int)
	 * @see courceList.CourceListPackage#getCourceSpecification_SpecificationYear()
	 * @model
	 * @generated
	 */
	int getSpecificationYear();

	/**
	 * Sets the value of the '{@link courceList.CourceSpecification#getSpecificationYear <em>Specification Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification Year</em>' attribute.
	 * @see #getSpecificationYear()
	 * @generated
	 */
	void setSpecificationYear(int value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' attribute list.
	 * The list contents are of type {@link courceList.Semester}.
	 * The literals are from the enumeration {@link courceList.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' attribute list.
	 * @see courceList.Semester
	 * @see courceList.CourceListPackage#getCourceSpecification_Semester()
	 * @model required="true" upper="2"
	 * @generated
	 */
	EList<Semester> getSemester();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see courceList.CourceListPackage#getCourceSpecification_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link courceList.CourceSpecification#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see courceList.CourceListPackage#getCourceSpecification_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link courceList.CourceSpecification#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(float)
	 * @see courceList.CourceListPackage#getCourceSpecification_Credits()
	 * @model required="true"
	 * @generated
	 */
	float getCredits();

	/**
	 * Sets the value of the '{@link courceList.CourceSpecification#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(float value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see courceList.CourceListPackage#getCourceSpecification_Name()
	 * @model required="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/acceleo/query/1.0 derivation='self.cource.name.concat(\' (\').concat(self.specificationYear.toString()).concat(\')\')'"
	 * @generated
	 */
	String getName();

} // CourceSpecification
