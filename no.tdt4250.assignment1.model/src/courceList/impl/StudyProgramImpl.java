/**
 */
package courceList.impl;

import courceList.CourceListPackage;
import courceList.Specialisation;
import courceList.Student;
import courceList.StudyGeneralization;
import courceList.StudyProgram;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link courceList.impl.StudyProgramImpl#getCource <em>Cource</em>}</li>
 *   <li>{@link courceList.impl.StudyProgramImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link courceList.impl.StudyProgramImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link courceList.impl.StudyProgramImpl#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyProgramImpl extends MinimalEObjectImpl.Container implements StudyProgram {
	/**
	 * The cached value of the '{@link #getCource() <em>Cource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCource()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialisation> cource;

	/**
	 * The cached value of the '{@link #getStudent() <em>Student</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudent()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> student;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourceListPackage.Literals.STUDY_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialisation> getCource() {
		if (cource == null) {
			cource = new EObjectContainmentWithInverseEList<Specialisation>(Specialisation.class, this, CourceListPackage.STUDY_PROGRAM__COURCE, CourceListPackage.SPECIALISATION__STUDY_PROGRAM);
		}
		return cource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyGeneralization getGeneralization() {
		if (eContainerFeatureID() != CourceListPackage.STUDY_PROGRAM__GENERALIZATION) return null;
		return (StudyGeneralization)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralization(StudyGeneralization newGeneralization, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGeneralization, CourceListPackage.STUDY_PROGRAM__GENERALIZATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralization(StudyGeneralization newGeneralization) {
		if (newGeneralization != eInternalContainer() || (eContainerFeatureID() != CourceListPackage.STUDY_PROGRAM__GENERALIZATION && newGeneralization != null)) {
			if (EcoreUtil.isAncestor(this, newGeneralization))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGeneralization != null)
				msgs = ((InternalEObject)newGeneralization).eInverseAdd(this, CourceListPackage.STUDY_GENERALIZATION__STUDY_PROGRAM, StudyGeneralization.class, msgs);
			msgs = basicSetGeneralization(newGeneralization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.STUDY_PROGRAM__GENERALIZATION, newGeneralization, newGeneralization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getStudent() {
		if (student == null) {
			student = new EObjectContainmentWithInverseEList<Student>(Student.class, this, CourceListPackage.STUDY_PROGRAM__STUDENT, CourceListPackage.STUDENT__STUDY_PROGRAM);
		}
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.STUDY_PROGRAM__YEAR, oldYear, year));
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
			case CourceListPackage.STUDY_PROGRAM__COURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCource()).basicAdd(otherEnd, msgs);
			case CourceListPackage.STUDY_PROGRAM__GENERALIZATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGeneralization((StudyGeneralization)otherEnd, msgs);
			case CourceListPackage.STUDY_PROGRAM__STUDENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStudent()).basicAdd(otherEnd, msgs);
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
			case CourceListPackage.STUDY_PROGRAM__COURCE:
				return ((InternalEList<?>)getCource()).basicRemove(otherEnd, msgs);
			case CourceListPackage.STUDY_PROGRAM__GENERALIZATION:
				return basicSetGeneralization(null, msgs);
			case CourceListPackage.STUDY_PROGRAM__STUDENT:
				return ((InternalEList<?>)getStudent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CourceListPackage.STUDY_PROGRAM__GENERALIZATION:
				return eInternalContainer().eInverseRemove(this, CourceListPackage.STUDY_GENERALIZATION__STUDY_PROGRAM, StudyGeneralization.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CourceListPackage.STUDY_PROGRAM__COURCE:
				return getCource();
			case CourceListPackage.STUDY_PROGRAM__GENERALIZATION:
				return getGeneralization();
			case CourceListPackage.STUDY_PROGRAM__STUDENT:
				return getStudent();
			case CourceListPackage.STUDY_PROGRAM__YEAR:
				return getYear();
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
			case CourceListPackage.STUDY_PROGRAM__COURCE:
				getCource().clear();
				getCource().addAll((Collection<? extends Specialisation>)newValue);
				return;
			case CourceListPackage.STUDY_PROGRAM__GENERALIZATION:
				setGeneralization((StudyGeneralization)newValue);
				return;
			case CourceListPackage.STUDY_PROGRAM__STUDENT:
				getStudent().clear();
				getStudent().addAll((Collection<? extends Student>)newValue);
				return;
			case CourceListPackage.STUDY_PROGRAM__YEAR:
				setYear((Integer)newValue);
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
			case CourceListPackage.STUDY_PROGRAM__COURCE:
				getCource().clear();
				return;
			case CourceListPackage.STUDY_PROGRAM__GENERALIZATION:
				setGeneralization((StudyGeneralization)null);
				return;
			case CourceListPackage.STUDY_PROGRAM__STUDENT:
				getStudent().clear();
				return;
			case CourceListPackage.STUDY_PROGRAM__YEAR:
				setYear(YEAR_EDEFAULT);
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
			case CourceListPackage.STUDY_PROGRAM__COURCE:
				return cource != null && !cource.isEmpty();
			case CourceListPackage.STUDY_PROGRAM__GENERALIZATION:
				return getGeneralization() != null;
			case CourceListPackage.STUDY_PROGRAM__STUDENT:
				return student != null && !student.isEmpty();
			case CourceListPackage.STUDY_PROGRAM__YEAR:
				return year != YEAR_EDEFAULT;
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
		result.append(" (year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

} //StudyProgramImpl
