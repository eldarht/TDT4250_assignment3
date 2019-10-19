/**
 */
package courceList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courceList.Work#getWeight <em>Weight</em>}</li>
 *   <li>{@link courceList.Work#getEvaluationForm <em>Evaluation Form</em>}</li>
 * </ul>
 *
 * @see courceList.CourceListPackage#getWork()
 * @model
 * @generated
 */
public interface Work extends EObject {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see courceList.CourceListPackage#getWork_Weight()
	 * @model
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link courceList.Work#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Evaluation Form</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link courceList.EvaluationForm#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Form</em>' container reference.
	 * @see #setEvaluationForm(EvaluationForm)
	 * @see courceList.CourceListPackage#getWork_EvaluationForm()
	 * @see courceList.EvaluationForm#getWork
	 * @model opposite="work" transient="false"
	 * @generated
	 */
	EvaluationForm getEvaluationForm();

	/**
	 * Sets the value of the '{@link courceList.Work#getEvaluationForm <em>Evaluation Form</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation Form</em>' container reference.
	 * @see #getEvaluationForm()
	 * @generated
	 */
	void setEvaluationForm(EvaluationForm value);

} // Work
