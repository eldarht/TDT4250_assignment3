/**
 */
package courceList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courceList.EvaluationForm#getExam <em>Exam</em>}</li>
 *   <li>{@link courceList.EvaluationForm#getWork <em>Work</em>}</li>
 *   <li>{@link courceList.EvaluationForm#getCource <em>Cource</em>}</li>
 *   <li>{@link courceList.EvaluationForm#getEvaluationType <em>Evaluation Type</em>}</li>
 * </ul>
 *
 * @see courceList.CourceListPackage#getEvaluationForm()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='weightMustBeComplete'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 weightMustBeComplete=' if not self.exam.oclIsUndefined() then \n\tif not self.work.oclIsUndefined() then\n\t\tself.exam.weight + self.work.weight = 100\n\telse\n\t\tself.exam.weight = 100\n\tendif\nelse\n\tif not self.work.oclIsUndefined() then\n\t\tself.work.weight = 100\n\telse\n\t\tfalse\n\tendif\nendif'"
 * @generated
 */
public interface EvaluationForm extends EObject {
	/**
	 * Returns the value of the '<em><b>Exam</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link courceList.Exam#getEvaluationForm <em>Evaluation Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam</em>' containment reference.
	 * @see #setExam(Exam)
	 * @see courceList.CourceListPackage#getEvaluationForm_Exam()
	 * @see courceList.Exam#getEvaluationForm
	 * @model opposite="evaluationForm" containment="true"
	 * @generated
	 */
	Exam getExam();

	/**
	 * Sets the value of the '{@link courceList.EvaluationForm#getExam <em>Exam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exam</em>' containment reference.
	 * @see #getExam()
	 * @generated
	 */
	void setExam(Exam value);

	/**
	 * Returns the value of the '<em><b>Work</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link courceList.Work#getEvaluationForm <em>Evaluation Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work</em>' containment reference.
	 * @see #setWork(Work)
	 * @see courceList.CourceListPackage#getEvaluationForm_Work()
	 * @see courceList.Work#getEvaluationForm
	 * @model opposite="evaluationForm" containment="true"
	 * @generated
	 */
	Work getWork();

	/**
	 * Sets the value of the '{@link courceList.EvaluationForm#getWork <em>Work</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work</em>' containment reference.
	 * @see #getWork()
	 * @generated
	 */
	void setWork(Work value);

	/**
	 * Returns the value of the '<em><b>Cource</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link courceList.CourceSpecification#getEvaluationForm <em>Evaluation Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cource</em>' container reference.
	 * @see #setCource(CourceSpecification)
	 * @see courceList.CourceListPackage#getEvaluationForm_Cource()
	 * @see courceList.CourceSpecification#getEvaluationForm
	 * @model opposite="evaluationForm" transient="false"
	 * @generated
	 */
	CourceSpecification getCource();

	/**
	 * Sets the value of the '{@link courceList.EvaluationForm#getCource <em>Cource</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cource</em>' container reference.
	 * @see #getCource()
	 * @generated
	 */
	void setCource(CourceSpecification value);

	/**
	 * Returns the value of the '<em><b>Evaluation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link courceList.EvaluationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Type</em>' attribute.
	 * @see courceList.EvaluationType
	 * @see #setEvaluationType(EvaluationType)
	 * @see courceList.CourceListPackage#getEvaluationForm_EvaluationType()
	 * @model required="true"
	 * @generated
	 */
	EvaluationType getEvaluationType();

	/**
	 * Sets the value of the '{@link courceList.EvaluationForm#getEvaluationType <em>Evaluation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation Type</em>' attribute.
	 * @see courceList.EvaluationType
	 * @see #getEvaluationType()
	 * @generated
	 */
	void setEvaluationType(EvaluationType value);

} // EvaluationForm
