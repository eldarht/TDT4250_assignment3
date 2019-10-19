/**
 */
package courceList;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courceList.Exam#getWeight <em>Weight</em>}</li>
 *   <li>{@link courceList.Exam#getEvaluationForm <em>Evaluation Form</em>}</li>
 *   <li>{@link courceList.Exam#getForm <em>Form</em>}</li>
 *   <li>{@link courceList.Exam#getLenght <em>Lenght</em>}</li>
 *   <li>{@link courceList.Exam#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see courceList.CourceListPackage#getExam()
 * @model
 * @generated
 */
public interface Exam extends EObject {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see courceList.CourceListPackage#getExam_Weight()
	 * @model
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link courceList.Exam#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Evaluation Form</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link courceList.EvaluationForm#getExam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Form</em>' container reference.
	 * @see #setEvaluationForm(EvaluationForm)
	 * @see courceList.CourceListPackage#getExam_EvaluationForm()
	 * @see courceList.EvaluationForm#getExam
	 * @model opposite="exam" transient="false"
	 * @generated
	 */
	EvaluationForm getEvaluationForm();

	/**
	 * Sets the value of the '{@link courceList.Exam#getEvaluationForm <em>Evaluation Form</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation Form</em>' container reference.
	 * @see #getEvaluationForm()
	 * @generated
	 */
	void setEvaluationForm(EvaluationForm value);

	/**
	 * Returns the value of the '<em><b>Form</b></em>' attribute.
	 * The literals are from the enumeration {@link courceList.WorkForm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' attribute.
	 * @see courceList.WorkForm
	 * @see #setForm(WorkForm)
	 * @see courceList.CourceListPackage#getExam_Form()
	 * @model
	 * @generated
	 */
	WorkForm getForm();

	/**
	 * Sets the value of the '{@link courceList.Exam#getForm <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' attribute.
	 * @see courceList.WorkForm
	 * @see #getForm()
	 * @generated
	 */
	void setForm(WorkForm value);

	/**
	 * Returns the value of the '<em><b>Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lenght</em>' attribute.
	 * @see #setLenght(int)
	 * @see courceList.CourceListPackage#getExam_Lenght()
	 * @model
	 * @generated
	 */
	int getLenght();

	/**
	 * Sets the value of the '{@link courceList.Exam#getLenght <em>Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lenght</em>' attribute.
	 * @see #getLenght()
	 * @generated
	 */
	void setLenght(int value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see courceList.CourceListPackage#getExam_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link courceList.Exam#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

} // Exam
