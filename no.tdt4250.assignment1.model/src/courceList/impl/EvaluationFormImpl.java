/**
 */
package courceList.impl;

import courceList.CourceListPackage;
import courceList.CourceSpecification;
import courceList.EvaluationForm;
import courceList.EvaluationType;
import courceList.Exam;
import courceList.Work;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link courceList.impl.EvaluationFormImpl#getExam <em>Exam</em>}</li>
 *   <li>{@link courceList.impl.EvaluationFormImpl#getWork <em>Work</em>}</li>
 *   <li>{@link courceList.impl.EvaluationFormImpl#getCource <em>Cource</em>}</li>
 *   <li>{@link courceList.impl.EvaluationFormImpl#getEvaluationType <em>Evaluation Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationFormImpl extends MinimalEObjectImpl.Container implements EvaluationForm {
	/**
	 * The cached value of the '{@link #getExam() <em>Exam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExam()
	 * @generated
	 * @ordered
	 */
	protected Exam exam;

	/**
	 * The cached value of the '{@link #getWork() <em>Work</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWork()
	 * @generated
	 * @ordered
	 */
	protected Work work;

	/**
	 * The default value of the '{@link #getEvaluationType() <em>Evaluation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationType()
	 * @generated
	 * @ordered
	 */
	protected static final EvaluationType EVALUATION_TYPE_EDEFAULT = EvaluationType.GRADE;

	/**
	 * The cached value of the '{@link #getEvaluationType() <em>Evaluation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationType()
	 * @generated
	 * @ordered
	 */
	protected EvaluationType evaluationType = EVALUATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourceListPackage.Literals.EVALUATION_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exam getExam() {
		return exam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExam(Exam newExam, NotificationChain msgs) {
		Exam oldExam = exam;
		exam = newExam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CourceListPackage.EVALUATION_FORM__EXAM, oldExam, newExam);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExam(Exam newExam) {
		if (newExam != exam) {
			NotificationChain msgs = null;
			if (exam != null)
				msgs = ((InternalEObject)exam).eInverseRemove(this, CourceListPackage.EXAM__EVALUATION_FORM, Exam.class, msgs);
			if (newExam != null)
				msgs = ((InternalEObject)newExam).eInverseAdd(this, CourceListPackage.EXAM__EVALUATION_FORM, Exam.class, msgs);
			msgs = basicSetExam(newExam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.EVALUATION_FORM__EXAM, newExam, newExam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Work getWork() {
		return work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWork(Work newWork, NotificationChain msgs) {
		Work oldWork = work;
		work = newWork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CourceListPackage.EVALUATION_FORM__WORK, oldWork, newWork);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWork(Work newWork) {
		if (newWork != work) {
			NotificationChain msgs = null;
			if (work != null)
				msgs = ((InternalEObject)work).eInverseRemove(this, CourceListPackage.WORK__EVALUATION_FORM, Work.class, msgs);
			if (newWork != null)
				msgs = ((InternalEObject)newWork).eInverseAdd(this, CourceListPackage.WORK__EVALUATION_FORM, Work.class, msgs);
			msgs = basicSetWork(newWork, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.EVALUATION_FORM__WORK, newWork, newWork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourceSpecification getCource() {
		if (eContainerFeatureID() != CourceListPackage.EVALUATION_FORM__COURCE) return null;
		return (CourceSpecification)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCource(CourceSpecification newCource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCource, CourceListPackage.EVALUATION_FORM__COURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCource(CourceSpecification newCource) {
		if (newCource != eInternalContainer() || (eContainerFeatureID() != CourceListPackage.EVALUATION_FORM__COURCE && newCource != null)) {
			if (EcoreUtil.isAncestor(this, newCource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCource != null)
				msgs = ((InternalEObject)newCource).eInverseAdd(this, CourceListPackage.COURCE_SPECIFICATION__EVALUATION_FORM, CourceSpecification.class, msgs);
			msgs = basicSetCource(newCource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.EVALUATION_FORM__COURCE, newCource, newCource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationType getEvaluationType() {
		return evaluationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluationType(EvaluationType newEvaluationType) {
		EvaluationType oldEvaluationType = evaluationType;
		evaluationType = newEvaluationType == null ? EVALUATION_TYPE_EDEFAULT : newEvaluationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.EVALUATION_FORM__EVALUATION_TYPE, oldEvaluationType, evaluationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CourceListPackage.EVALUATION_FORM__EXAM:
				if (exam != null)
					msgs = ((InternalEObject)exam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CourceListPackage.EVALUATION_FORM__EXAM, null, msgs);
				return basicSetExam((Exam)otherEnd, msgs);
			case CourceListPackage.EVALUATION_FORM__WORK:
				if (work != null)
					msgs = ((InternalEObject)work).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CourceListPackage.EVALUATION_FORM__WORK, null, msgs);
				return basicSetWork((Work)otherEnd, msgs);
			case CourceListPackage.EVALUATION_FORM__COURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCource((CourceSpecification)otherEnd, msgs);
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
			case CourceListPackage.EVALUATION_FORM__EXAM:
				return basicSetExam(null, msgs);
			case CourceListPackage.EVALUATION_FORM__WORK:
				return basicSetWork(null, msgs);
			case CourceListPackage.EVALUATION_FORM__COURCE:
				return basicSetCource(null, msgs);
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
			case CourceListPackage.EVALUATION_FORM__COURCE:
				return eInternalContainer().eInverseRemove(this, CourceListPackage.COURCE_SPECIFICATION__EVALUATION_FORM, CourceSpecification.class, msgs);
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
			case CourceListPackage.EVALUATION_FORM__EXAM:
				return getExam();
			case CourceListPackage.EVALUATION_FORM__WORK:
				return getWork();
			case CourceListPackage.EVALUATION_FORM__COURCE:
				return getCource();
			case CourceListPackage.EVALUATION_FORM__EVALUATION_TYPE:
				return getEvaluationType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CourceListPackage.EVALUATION_FORM__EXAM:
				setExam((Exam)newValue);
				return;
			case CourceListPackage.EVALUATION_FORM__WORK:
				setWork((Work)newValue);
				return;
			case CourceListPackage.EVALUATION_FORM__COURCE:
				setCource((CourceSpecification)newValue);
				return;
			case CourceListPackage.EVALUATION_FORM__EVALUATION_TYPE:
				setEvaluationType((EvaluationType)newValue);
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
			case CourceListPackage.EVALUATION_FORM__EXAM:
				setExam((Exam)null);
				return;
			case CourceListPackage.EVALUATION_FORM__WORK:
				setWork((Work)null);
				return;
			case CourceListPackage.EVALUATION_FORM__COURCE:
				setCource((CourceSpecification)null);
				return;
			case CourceListPackage.EVALUATION_FORM__EVALUATION_TYPE:
				setEvaluationType(EVALUATION_TYPE_EDEFAULT);
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
			case CourceListPackage.EVALUATION_FORM__EXAM:
				return exam != null;
			case CourceListPackage.EVALUATION_FORM__WORK:
				return work != null;
			case CourceListPackage.EVALUATION_FORM__COURCE:
				return getCource() != null;
			case CourceListPackage.EVALUATION_FORM__EVALUATION_TYPE:
				return evaluationType != EVALUATION_TYPE_EDEFAULT;
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
		result.append(" (evaluationType: ");
		result.append(evaluationType);
		result.append(')');
		return result.toString();
	}

} //EvaluationFormImpl
