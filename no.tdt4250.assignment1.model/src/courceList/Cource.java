/**
 */
package courceList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courceList.Cource#getCode <em>Code</em>}</li>
 *   <li>{@link courceList.Cource#getName <em>Name</em>}</li>
 *   <li>{@link courceList.Cource#getLocation <em>Location</em>}</li>
 *   <li>{@link courceList.Cource#getDepartment <em>Department</em>}</li>
 *   <li>{@link courceList.Cource#getCorseSpecifications <em>Corse Specifications</em>}</li>
 * </ul>
 *
 * @see courceList.CourceListPackage#getCource()
 * @model
 * @generated
 */
public interface Cource extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see courceList.CourceListPackage#getCource_Code()
	 * @model required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link courceList.Cource#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see courceList.CourceListPackage#getCource_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link courceList.Cource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The literals are from the enumeration {@link courceList.Campus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see courceList.Campus
	 * @see #setLocation(Campus)
	 * @see courceList.CourceListPackage#getCource_Location()
	 * @model
	 * @generated
	 */
	Campus getLocation();

	/**
	 * Sets the value of the '{@link courceList.Cource#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see courceList.Campus
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Campus value);

	/**
	 * Returns the value of the '<em><b>Department</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link courceList.Department#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department</em>' container reference.
	 * @see #setDepartment(Department)
	 * @see courceList.CourceListPackage#getCource_Department()
	 * @see courceList.Department#getCourse
	 * @model opposite="course" transient="false"
	 * @generated
	 */
	Department getDepartment();

	/**
	 * Sets the value of the '{@link courceList.Cource#getDepartment <em>Department</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department</em>' container reference.
	 * @see #getDepartment()
	 * @generated
	 */
	void setDepartment(Department value);

	/**
	 * Returns the value of the '<em><b>Corse Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link courceList.CourceSpecification}.
	 * It is bidirectional and its opposite is '{@link courceList.CourceSpecification#getCource <em>Cource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corse Specifications</em>' containment reference list.
	 * @see courceList.CourceListPackage#getCource_CorseSpecifications()
	 * @see courceList.CourceSpecification#getCource
	 * @model opposite="cource" containment="true" required="true"
	 * @generated
	 */
	EList<CourceSpecification> getCorseSpecifications();

} // Cource
