/**
 */
package courceList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Cource Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courceList.StudyCourceRelation#getCource <em>Cource</em>}</li>
 *   <li>{@link courceList.StudyCourceRelation#getStatus <em>Status</em>}</li>
 *   <li>{@link courceList.StudyCourceRelation#getYear <em>Year</em>}</li>
 *   <li>{@link courceList.StudyCourceRelation#getSpecialisation <em>Specialisation</em>}</li>
 * </ul>
 *
 * @see courceList.CourceListPackage#getStudyCourceRelation()
 * @model
 * @generated
 */
public interface StudyCourceRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Cource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cource</em>' reference.
	 * @see #setCource(CourceSpecification)
	 * @see courceList.CourceListPackage#getStudyCourceRelation_Cource()
	 * @model required="true"
	 * @generated
	 */
	CourceSpecification getCource();

	/**
	 * Sets the value of the '{@link courceList.StudyCourceRelation#getCource <em>Cource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cource</em>' reference.
	 * @see #getCource()
	 * @generated
	 */
	void setCource(CourceSpecification value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see courceList.CourceListPackage#getStudyCourceRelation_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link courceList.StudyCourceRelation#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see courceList.CourceListPackage#getStudyCourceRelation_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link courceList.StudyCourceRelation#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Specialisation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link courceList.Specialisation#getCource <em>Cource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisation</em>' container reference.
	 * @see #setSpecialisation(Specialisation)
	 * @see courceList.CourceListPackage#getStudyCourceRelation_Specialisation()
	 * @see courceList.Specialisation#getCource
	 * @model opposite="cource" transient="false"
	 * @generated
	 */
	Specialisation getSpecialisation();

	/**
	 * Sets the value of the '{@link courceList.StudyCourceRelation#getSpecialisation <em>Specialisation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialisation</em>' container reference.
	 * @see #getSpecialisation()
	 * @generated
	 */
	void setSpecialisation(Specialisation value);

} // StudyCourceRelation
