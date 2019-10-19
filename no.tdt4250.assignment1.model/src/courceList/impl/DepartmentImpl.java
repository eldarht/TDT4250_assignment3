/**
 */
package courceList.impl;

import courceList.Cource;
import courceList.CourceListPackage;
import courceList.Department;
import courceList.Professor;
import courceList.StudyGeneralization;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link courceList.impl.DepartmentImpl#getStudyProgram <em>Study Program</em>}</li>
 *   <li>{@link courceList.impl.DepartmentImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link courceList.impl.DepartmentImpl#getProfessor <em>Professor</em>}</li>
 *   <li>{@link courceList.impl.DepartmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link courceList.impl.DepartmentImpl#getAbbreviation <em>Abbreviation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartmentImpl extends MinimalEObjectImpl.Container implements Department {
	/**
	 * The cached value of the '{@link #getStudyProgram() <em>Study Program</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyProgram()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyGeneralization> studyProgram;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected EList<Cource> course;

	/**
	 * The cached value of the '{@link #getProfessor() <em>Professor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfessor()
	 * @generated
	 * @ordered
	 */
	protected EList<Professor> professor;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviation()
	 * @generated
	 * @ordered
	 */
	protected static final String ABBREVIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviation()
	 * @generated
	 * @ordered
	 */
	protected String abbreviation = ABBREVIATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourceListPackage.Literals.DEPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StudyGeneralization> getStudyProgram() {
		if (studyProgram == null) {
			studyProgram = new EObjectContainmentWithInverseEList<StudyGeneralization>(StudyGeneralization.class, this, CourceListPackage.DEPARTMENT__STUDY_PROGRAM, CourceListPackage.STUDY_GENERALIZATION__DEPARTMENT);
		}
		return studyProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cource> getCourse() {
		if (course == null) {
			course = new EObjectContainmentWithInverseEList<Cource>(Cource.class, this, CourceListPackage.DEPARTMENT__COURSE, CourceListPackage.COURCE__DEPARTMENT);
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Professor> getProfessor() {
		if (professor == null) {
			professor = new EObjectContainmentWithInverseEList<Professor>(Professor.class, this, CourceListPackage.DEPARTMENT__PROFESSOR, CourceListPackage.PROFESSOR__DEPARTMENT);
		}
		return professor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.DEPARTMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbbreviation() {
		return abbreviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbbreviation(String newAbbreviation) {
		String oldAbbreviation = abbreviation;
		abbreviation = newAbbreviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.DEPARTMENT__ABBREVIATION, oldAbbreviation, abbreviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CourceListPackage.DEPARTMENT__STUDY_PROGRAM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStudyProgram()).basicAdd(otherEnd, msgs);
			case CourceListPackage.DEPARTMENT__COURSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCourse()).basicAdd(otherEnd, msgs);
			case CourceListPackage.DEPARTMENT__PROFESSOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProfessor()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CourceListPackage.DEPARTMENT__STUDY_PROGRAM:
				return ((InternalEList<?>)getStudyProgram()).basicRemove(otherEnd, msgs);
			case CourceListPackage.DEPARTMENT__COURSE:
				return ((InternalEList<?>)getCourse()).basicRemove(otherEnd, msgs);
			case CourceListPackage.DEPARTMENT__PROFESSOR:
				return ((InternalEList<?>)getProfessor()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CourceListPackage.DEPARTMENT__STUDY_PROGRAM:
				return getStudyProgram();
			case CourceListPackage.DEPARTMENT__COURSE:
				return getCourse();
			case CourceListPackage.DEPARTMENT__PROFESSOR:
				return getProfessor();
			case CourceListPackage.DEPARTMENT__NAME:
				return getName();
			case CourceListPackage.DEPARTMENT__ABBREVIATION:
				return getAbbreviation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CourceListPackage.DEPARTMENT__STUDY_PROGRAM:
				getStudyProgram().clear();
				getStudyProgram().addAll((Collection<? extends StudyGeneralization>)newValue);
				return;
			case CourceListPackage.DEPARTMENT__COURSE:
				getCourse().clear();
				getCourse().addAll((Collection<? extends Cource>)newValue);
				return;
			case CourceListPackage.DEPARTMENT__PROFESSOR:
				getProfessor().clear();
				getProfessor().addAll((Collection<? extends Professor>)newValue);
				return;
			case CourceListPackage.DEPARTMENT__NAME:
				setName((String)newValue);
				return;
			case CourceListPackage.DEPARTMENT__ABBREVIATION:
				setAbbreviation((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CourceListPackage.DEPARTMENT__STUDY_PROGRAM:
				getStudyProgram().clear();
				return;
			case CourceListPackage.DEPARTMENT__COURSE:
				getCourse().clear();
				return;
			case CourceListPackage.DEPARTMENT__PROFESSOR:
				getProfessor().clear();
				return;
			case CourceListPackage.DEPARTMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CourceListPackage.DEPARTMENT__ABBREVIATION:
				setAbbreviation(ABBREVIATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CourceListPackage.DEPARTMENT__STUDY_PROGRAM:
				return studyProgram != null && !studyProgram.isEmpty();
			case CourceListPackage.DEPARTMENT__COURSE:
				return course != null && !course.isEmpty();
			case CourceListPackage.DEPARTMENT__PROFESSOR:
				return professor != null && !professor.isEmpty();
			case CourceListPackage.DEPARTMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CourceListPackage.DEPARTMENT__ABBREVIATION:
				return ABBREVIATION_EDEFAULT == null ? abbreviation != null : !ABBREVIATION_EDEFAULT.equals(abbreviation);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", abbreviation: ");
		result.append(abbreviation);
		result.append(')');
		return result.toString();
	}

} //DepartmentImpl
