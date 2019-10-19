/**
 */
package courceList.impl;

import courceList.CourceListPackage;
import courceList.Specialisation;
import courceList.StudyCourceRelation;
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
 * An implementation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link courceList.impl.SpecialisationImpl#getCource <em>Cource</em>}</li>
 *   <li>{@link courceList.impl.SpecialisationImpl#getStudyProgram <em>Study Program</em>}</li>
 *   <li>{@link courceList.impl.SpecialisationImpl#getName <em>Name</em>}</li>
 *   <li>{@link courceList.impl.SpecialisationImpl#getStartSemester <em>Start Semester</em>}</li>
 *   <li>{@link courceList.impl.SpecialisationImpl#getFurtherSpecialisation <em>Further Specialisation</em>}</li>
 *   <li>{@link courceList.impl.SpecialisationImpl#getHostSpecialisation <em>Host Specialisation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecialisationImpl extends MinimalEObjectImpl.Container implements Specialisation {
	/**
	 * The cached value of the '{@link #getCource() <em>Cource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCource()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyCourceRelation> cource;

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
	 * The default value of the '{@link #getStartSemester() <em>Start Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartSemester()
	 * @generated
	 * @ordered
	 */
	protected static final int START_SEMESTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartSemester() <em>Start Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartSemester()
	 * @generated
	 * @ordered
	 */
	protected int startSemester = START_SEMESTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFurtherSpecialisation() <em>Further Specialisation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFurtherSpecialisation()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialisation> furtherSpecialisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecialisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourceListPackage.Literals.SPECIALISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StudyCourceRelation> getCource() {
		if (cource == null) {
			cource = new EObjectContainmentWithInverseEList<StudyCourceRelation>(StudyCourceRelation.class, this, CourceListPackage.SPECIALISATION__COURCE, CourceListPackage.STUDY_COURCE_RELATION__SPECIALISATION);
		}
		return cource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyProgram getStudyProgram() {
		if (eContainerFeatureID() != CourceListPackage.SPECIALISATION__STUDY_PROGRAM) return null;
		return (StudyProgram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyProgram(StudyProgram newStudyProgram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStudyProgram, CourceListPackage.SPECIALISATION__STUDY_PROGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudyProgram(StudyProgram newStudyProgram) {
		if (newStudyProgram != eInternalContainer() || (eContainerFeatureID() != CourceListPackage.SPECIALISATION__STUDY_PROGRAM && newStudyProgram != null)) {
			if (EcoreUtil.isAncestor(this, newStudyProgram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStudyProgram != null)
				msgs = ((InternalEObject)newStudyProgram).eInverseAdd(this, CourceListPackage.STUDY_PROGRAM__COURCE, StudyProgram.class, msgs);
			msgs = basicSetStudyProgram(newStudyProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.SPECIALISATION__STUDY_PROGRAM, newStudyProgram, newStudyProgram));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.SPECIALISATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartSemester() {
		return startSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartSemester(int newStartSemester) {
		int oldStartSemester = startSemester;
		startSemester = newStartSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.SPECIALISATION__START_SEMESTER, oldStartSemester, startSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialisation> getFurtherSpecialisation() {
		if (furtherSpecialisation == null) {
			furtherSpecialisation = new EObjectContainmentWithInverseEList<Specialisation>(Specialisation.class, this, CourceListPackage.SPECIALISATION__FURTHER_SPECIALISATION, CourceListPackage.SPECIALISATION__HOST_SPECIALISATION);
		}
		return furtherSpecialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialisation getHostSpecialisation() {
		if (eContainerFeatureID() != CourceListPackage.SPECIALISATION__HOST_SPECIALISATION) return null;
		return (Specialisation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHostSpecialisation(Specialisation newHostSpecialisation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHostSpecialisation, CourceListPackage.SPECIALISATION__HOST_SPECIALISATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostSpecialisation(Specialisation newHostSpecialisation) {
		if (newHostSpecialisation != eInternalContainer() || (eContainerFeatureID() != CourceListPackage.SPECIALISATION__HOST_SPECIALISATION && newHostSpecialisation != null)) {
			if (EcoreUtil.isAncestor(this, newHostSpecialisation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHostSpecialisation != null)
				msgs = ((InternalEObject)newHostSpecialisation).eInverseAdd(this, CourceListPackage.SPECIALISATION__FURTHER_SPECIALISATION, Specialisation.class, msgs);
			msgs = basicSetHostSpecialisation(newHostSpecialisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.SPECIALISATION__HOST_SPECIALISATION, newHostSpecialisation, newHostSpecialisation));
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
			case CourceListPackage.SPECIALISATION__COURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCource()).basicAdd(otherEnd, msgs);
			case CourceListPackage.SPECIALISATION__STUDY_PROGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStudyProgram((StudyProgram)otherEnd, msgs);
			case CourceListPackage.SPECIALISATION__FURTHER_SPECIALISATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFurtherSpecialisation()).basicAdd(otherEnd, msgs);
			case CourceListPackage.SPECIALISATION__HOST_SPECIALISATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHostSpecialisation((Specialisation)otherEnd, msgs);
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
			case CourceListPackage.SPECIALISATION__COURCE:
				return ((InternalEList<?>)getCource()).basicRemove(otherEnd, msgs);
			case CourceListPackage.SPECIALISATION__STUDY_PROGRAM:
				return basicSetStudyProgram(null, msgs);
			case CourceListPackage.SPECIALISATION__FURTHER_SPECIALISATION:
				return ((InternalEList<?>)getFurtherSpecialisation()).basicRemove(otherEnd, msgs);
			case CourceListPackage.SPECIALISATION__HOST_SPECIALISATION:
				return basicSetHostSpecialisation(null, msgs);
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
			case CourceListPackage.SPECIALISATION__STUDY_PROGRAM:
				return eInternalContainer().eInverseRemove(this, CourceListPackage.STUDY_PROGRAM__COURCE, StudyProgram.class, msgs);
			case CourceListPackage.SPECIALISATION__HOST_SPECIALISATION:
				return eInternalContainer().eInverseRemove(this, CourceListPackage.SPECIALISATION__FURTHER_SPECIALISATION, Specialisation.class, msgs);
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
			case CourceListPackage.SPECIALISATION__COURCE:
				return getCource();
			case CourceListPackage.SPECIALISATION__STUDY_PROGRAM:
				return getStudyProgram();
			case CourceListPackage.SPECIALISATION__NAME:
				return getName();
			case CourceListPackage.SPECIALISATION__START_SEMESTER:
				return getStartSemester();
			case CourceListPackage.SPECIALISATION__FURTHER_SPECIALISATION:
				return getFurtherSpecialisation();
			case CourceListPackage.SPECIALISATION__HOST_SPECIALISATION:
				return getHostSpecialisation();
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
			case CourceListPackage.SPECIALISATION__COURCE:
				getCource().clear();
				getCource().addAll((Collection<? extends StudyCourceRelation>)newValue);
				return;
			case CourceListPackage.SPECIALISATION__STUDY_PROGRAM:
				setStudyProgram((StudyProgram)newValue);
				return;
			case CourceListPackage.SPECIALISATION__NAME:
				setName((String)newValue);
				return;
			case CourceListPackage.SPECIALISATION__START_SEMESTER:
				setStartSemester((Integer)newValue);
				return;
			case CourceListPackage.SPECIALISATION__FURTHER_SPECIALISATION:
				getFurtherSpecialisation().clear();
				getFurtherSpecialisation().addAll((Collection<? extends Specialisation>)newValue);
				return;
			case CourceListPackage.SPECIALISATION__HOST_SPECIALISATION:
				setHostSpecialisation((Specialisation)newValue);
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
			case CourceListPackage.SPECIALISATION__COURCE:
				getCource().clear();
				return;
			case CourceListPackage.SPECIALISATION__STUDY_PROGRAM:
				setStudyProgram((StudyProgram)null);
				return;
			case CourceListPackage.SPECIALISATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CourceListPackage.SPECIALISATION__START_SEMESTER:
				setStartSemester(START_SEMESTER_EDEFAULT);
				return;
			case CourceListPackage.SPECIALISATION__FURTHER_SPECIALISATION:
				getFurtherSpecialisation().clear();
				return;
			case CourceListPackage.SPECIALISATION__HOST_SPECIALISATION:
				setHostSpecialisation((Specialisation)null);
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
			case CourceListPackage.SPECIALISATION__COURCE:
				return cource != null && !cource.isEmpty();
			case CourceListPackage.SPECIALISATION__STUDY_PROGRAM:
				return getStudyProgram() != null;
			case CourceListPackage.SPECIALISATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CourceListPackage.SPECIALISATION__START_SEMESTER:
				return startSemester != START_SEMESTER_EDEFAULT;
			case CourceListPackage.SPECIALISATION__FURTHER_SPECIALISATION:
				return furtherSpecialisation != null && !furtherSpecialisation.isEmpty();
			case CourceListPackage.SPECIALISATION__HOST_SPECIALISATION:
				return getHostSpecialisation() != null;
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
		result.append(", startSemester: ");
		result.append(startSemester);
		result.append(')');
		return result.toString();
	}

} //SpecialisationImpl
