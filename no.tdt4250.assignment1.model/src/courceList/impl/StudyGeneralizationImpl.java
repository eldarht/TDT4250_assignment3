/**
 */
package courceList.impl;

import courceList.Campus;
import courceList.CourceListPackage;
import courceList.Department;
import courceList.EducationLevel;
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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link courceList.impl.StudyGeneralizationImpl#getStudyProgram <em>Study Program</em>}</li>
 *   <li>{@link courceList.impl.StudyGeneralizationImpl#getDepartment <em>Department</em>}</li>
 *   <li>{@link courceList.impl.StudyGeneralizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link courceList.impl.StudyGeneralizationImpl#getEducationLevel <em>Education Level</em>}</li>
 *   <li>{@link courceList.impl.StudyGeneralizationImpl#getNrOfYears <em>Nr Of Years</em>}</li>
 *   <li>{@link courceList.impl.StudyGeneralizationImpl#getCampus <em>Campus</em>}</li>
 *   <li>{@link courceList.impl.StudyGeneralizationImpl#getAbbreviation <em>Abbreviation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyGeneralizationImpl extends MinimalEObjectImpl.Container implements StudyGeneralization {
	/**
	 * The cached value of the '{@link #getStudyProgram() <em>Study Program</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyProgram()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyProgram> studyProgram;

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
	 * The default value of the '{@link #getEducationLevel() <em>Education Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEducationLevel()
	 * @generated
	 * @ordered
	 */
	protected static final EducationLevel EDUCATION_LEVEL_EDEFAULT = EducationLevel.BACHELOR;

	/**
	 * The cached value of the '{@link #getEducationLevel() <em>Education Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEducationLevel()
	 * @generated
	 * @ordered
	 */
	protected EducationLevel educationLevel = EDUCATION_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNrOfYears() <em>Nr Of Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfYears()
	 * @generated
	 * @ordered
	 */
	protected static final int NR_OF_YEARS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNrOfYears() <em>Nr Of Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNrOfYears()
	 * @generated
	 * @ordered
	 */
	protected int nrOfYears = NR_OF_YEARS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCampus() <em>Campus</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCampus()
	 * @generated
	 * @ordered
	 */
	protected EList<Campus> campus;

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
	protected StudyGeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourceListPackage.Literals.STUDY_GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StudyProgram> getStudyProgram() {
		if (studyProgram == null) {
			studyProgram = new EObjectContainmentWithInverseEList<StudyProgram>(StudyProgram.class, this, CourceListPackage.STUDY_GENERALIZATION__STUDY_PROGRAM, CourceListPackage.STUDY_PROGRAM__GENERALIZATION);
		}
		return studyProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department getDepartment() {
		if (eContainerFeatureID() != CourceListPackage.STUDY_GENERALIZATION__DEPARTMENT) return null;
		return (Department)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepartment(Department newDepartment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDepartment, CourceListPackage.STUDY_GENERALIZATION__DEPARTMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepartment(Department newDepartment) {
		if (newDepartment != eInternalContainer() || (eContainerFeatureID() != CourceListPackage.STUDY_GENERALIZATION__DEPARTMENT && newDepartment != null)) {
			if (EcoreUtil.isAncestor(this, newDepartment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDepartment != null)
				msgs = ((InternalEObject)newDepartment).eInverseAdd(this, CourceListPackage.DEPARTMENT__STUDY_PROGRAM, Department.class, msgs);
			msgs = basicSetDepartment(newDepartment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.STUDY_GENERALIZATION__DEPARTMENT, newDepartment, newDepartment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.STUDY_GENERALIZATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EducationLevel getEducationLevel() {
		return educationLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEducationLevel(EducationLevel newEducationLevel) {
		EducationLevel oldEducationLevel = educationLevel;
		educationLevel = newEducationLevel == null ? EDUCATION_LEVEL_EDEFAULT : newEducationLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.STUDY_GENERALIZATION__EDUCATION_LEVEL, oldEducationLevel, educationLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNrOfYears() {
		return nrOfYears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNrOfYears(int newNrOfYears) {
		int oldNrOfYears = nrOfYears;
		nrOfYears = newNrOfYears;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.STUDY_GENERALIZATION__NR_OF_YEARS, oldNrOfYears, nrOfYears));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Campus> getCampus() {
		if (campus == null) {
			campus = new EDataTypeUniqueEList<Campus>(Campus.class, this, CourceListPackage.STUDY_GENERALIZATION__CAMPUS);
		}
		return campus;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.STUDY_GENERALIZATION__ABBREVIATION, oldAbbreviation, abbreviation));
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
			case CourceListPackage.STUDY_GENERALIZATION__STUDY_PROGRAM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStudyProgram()).basicAdd(otherEnd, msgs);
			case CourceListPackage.STUDY_GENERALIZATION__DEPARTMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDepartment((Department)otherEnd, msgs);
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
			case CourceListPackage.STUDY_GENERALIZATION__STUDY_PROGRAM:
				return ((InternalEList<?>)getStudyProgram()).basicRemove(otherEnd, msgs);
			case CourceListPackage.STUDY_GENERALIZATION__DEPARTMENT:
				return basicSetDepartment(null, msgs);
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
			case CourceListPackage.STUDY_GENERALIZATION__DEPARTMENT:
				return eInternalContainer().eInverseRemove(this, CourceListPackage.DEPARTMENT__STUDY_PROGRAM, Department.class, msgs);
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
			case CourceListPackage.STUDY_GENERALIZATION__STUDY_PROGRAM:
				return getStudyProgram();
			case CourceListPackage.STUDY_GENERALIZATION__DEPARTMENT:
				return getDepartment();
			case CourceListPackage.STUDY_GENERALIZATION__NAME:
				return getName();
			case CourceListPackage.STUDY_GENERALIZATION__EDUCATION_LEVEL:
				return getEducationLevel();
			case CourceListPackage.STUDY_GENERALIZATION__NR_OF_YEARS:
				return getNrOfYears();
			case CourceListPackage.STUDY_GENERALIZATION__CAMPUS:
				return getCampus();
			case CourceListPackage.STUDY_GENERALIZATION__ABBREVIATION:
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
			case CourceListPackage.STUDY_GENERALIZATION__STUDY_PROGRAM:
				getStudyProgram().clear();
				getStudyProgram().addAll((Collection<? extends StudyProgram>)newValue);
				return;
			case CourceListPackage.STUDY_GENERALIZATION__DEPARTMENT:
				setDepartment((Department)newValue);
				return;
			case CourceListPackage.STUDY_GENERALIZATION__NAME:
				setName((String)newValue);
				return;
			case CourceListPackage.STUDY_GENERALIZATION__EDUCATION_LEVEL:
				setEducationLevel((EducationLevel)newValue);
				return;
			case CourceListPackage.STUDY_GENERALIZATION__NR_OF_YEARS:
				setNrOfYears((Integer)newValue);
				return;
			case CourceListPackage.STUDY_GENERALIZATION__CAMPUS:
				getCampus().clear();
				getCampus().addAll((Collection<? extends Campus>)newValue);
				return;
			case CourceListPackage.STUDY_GENERALIZATION__ABBREVIATION:
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
			case CourceListPackage.STUDY_GENERALIZATION__STUDY_PROGRAM:
				getStudyProgram().clear();
				return;
			case CourceListPackage.STUDY_GENERALIZATION__DEPARTMENT:
				setDepartment((Department)null);
				return;
			case CourceListPackage.STUDY_GENERALIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CourceListPackage.STUDY_GENERALIZATION__EDUCATION_LEVEL:
				setEducationLevel(EDUCATION_LEVEL_EDEFAULT);
				return;
			case CourceListPackage.STUDY_GENERALIZATION__NR_OF_YEARS:
				setNrOfYears(NR_OF_YEARS_EDEFAULT);
				return;
			case CourceListPackage.STUDY_GENERALIZATION__CAMPUS:
				getCampus().clear();
				return;
			case CourceListPackage.STUDY_GENERALIZATION__ABBREVIATION:
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
			case CourceListPackage.STUDY_GENERALIZATION__STUDY_PROGRAM:
				return studyProgram != null && !studyProgram.isEmpty();
			case CourceListPackage.STUDY_GENERALIZATION__DEPARTMENT:
				return getDepartment() != null;
			case CourceListPackage.STUDY_GENERALIZATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CourceListPackage.STUDY_GENERALIZATION__EDUCATION_LEVEL:
				return educationLevel != EDUCATION_LEVEL_EDEFAULT;
			case CourceListPackage.STUDY_GENERALIZATION__NR_OF_YEARS:
				return nrOfYears != NR_OF_YEARS_EDEFAULT;
			case CourceListPackage.STUDY_GENERALIZATION__CAMPUS:
				return campus != null && !campus.isEmpty();
			case CourceListPackage.STUDY_GENERALIZATION__ABBREVIATION:
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
		result.append(", educationLevel: ");
		result.append(educationLevel);
		result.append(", nrOfYears: ");
		result.append(nrOfYears);
		result.append(", campus: ");
		result.append(campus);
		result.append(", abbreviation: ");
		result.append(abbreviation);
		result.append(')');
		return result.toString();
	}

} //StudyGeneralizationImpl
