/**
 */
package courceList.impl;

import courceList.CourceListPackage;
import courceList.EvaluationForm;
import courceList.Exam;
import courceList.WorkForm;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link courceList.impl.ExamImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link courceList.impl.ExamImpl#getEvaluationForm <em>Evaluation Form</em>}</li>
 *   <li>{@link courceList.impl.ExamImpl#getForm <em>Form</em>}</li>
 *   <li>{@link courceList.impl.ExamImpl#getLenght <em>Lenght</em>}</li>
 *   <li>{@link courceList.impl.ExamImpl#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExamImpl extends MinimalEObjectImpl.Container implements Exam {
	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int WEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected int weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getForm() <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected static final WorkForm FORM_EDEFAULT = WorkForm.ORAL;

	/**
	 * The cached value of the '{@link #getForm() <em>Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForm()
	 * @generated
	 * @ordered
	 */
	protected WorkForm form = FORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getLenght() <em>Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLenght()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLenght() <em>Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLenght()
	 * @generated
	 * @ordered
	 */
	protected int lenght = LENGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourceListPackage.Literals.EXAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(int newWeight) {
		int oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.EXAM__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationForm getEvaluationForm() {
		if (eContainerFeatureID() != CourceListPackage.EXAM__EVALUATION_FORM) return null;
		return (EvaluationForm)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvaluationForm(EvaluationForm newEvaluationForm, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEvaluationForm, CourceListPackage.EXAM__EVALUATION_FORM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluationForm(EvaluationForm newEvaluationForm) {
		if (newEvaluationForm != eInternalContainer() || (eContainerFeatureID() != CourceListPackage.EXAM__EVALUATION_FORM && newEvaluationForm != null)) {
			if (EcoreUtil.isAncestor(this, newEvaluationForm))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEvaluationForm != null)
				msgs = ((InternalEObject)newEvaluationForm).eInverseAdd(this, CourceListPackage.EVALUATION_FORM__EXAM, EvaluationForm.class, msgs);
			msgs = basicSetEvaluationForm(newEvaluationForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.EXAM__EVALUATION_FORM, newEvaluationForm, newEvaluationForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkForm getForm() {
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForm(WorkForm newForm) {
		WorkForm oldForm = form;
		form = newForm == null ? FORM_EDEFAULT : newForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.EXAM__FORM, oldForm, form));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLenght() {
		return lenght;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLenght(int newLenght) {
		int oldLenght = lenght;
		lenght = newLenght;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.EXAM__LENGHT, oldLenght, lenght));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.EXAM__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CourceListPackage.EXAM__EVALUATION_FORM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEvaluationForm((EvaluationForm)otherEnd, msgs);
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
			case CourceListPackage.EXAM__EVALUATION_FORM:
				return basicSetEvaluationForm(null, msgs);
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
			case CourceListPackage.EXAM__EVALUATION_FORM:
				return eInternalContainer().eInverseRemove(this, CourceListPackage.EVALUATION_FORM__EXAM, EvaluationForm.class, msgs);
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
			case CourceListPackage.EXAM__WEIGHT:
				return getWeight();
			case CourceListPackage.EXAM__EVALUATION_FORM:
				return getEvaluationForm();
			case CourceListPackage.EXAM__FORM:
				return getForm();
			case CourceListPackage.EXAM__LENGHT:
				return getLenght();
			case CourceListPackage.EXAM__DATE:
				return getDate();
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
			case CourceListPackage.EXAM__WEIGHT:
				setWeight((Integer)newValue);
				return;
			case CourceListPackage.EXAM__EVALUATION_FORM:
				setEvaluationForm((EvaluationForm)newValue);
				return;
			case CourceListPackage.EXAM__FORM:
				setForm((WorkForm)newValue);
				return;
			case CourceListPackage.EXAM__LENGHT:
				setLenght((Integer)newValue);
				return;
			case CourceListPackage.EXAM__DATE:
				setDate((Date)newValue);
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
			case CourceListPackage.EXAM__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case CourceListPackage.EXAM__EVALUATION_FORM:
				setEvaluationForm((EvaluationForm)null);
				return;
			case CourceListPackage.EXAM__FORM:
				setForm(FORM_EDEFAULT);
				return;
			case CourceListPackage.EXAM__LENGHT:
				setLenght(LENGHT_EDEFAULT);
				return;
			case CourceListPackage.EXAM__DATE:
				setDate(DATE_EDEFAULT);
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
			case CourceListPackage.EXAM__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case CourceListPackage.EXAM__EVALUATION_FORM:
				return getEvaluationForm() != null;
			case CourceListPackage.EXAM__FORM:
				return form != FORM_EDEFAULT;
			case CourceListPackage.EXAM__LENGHT:
				return lenght != LENGHT_EDEFAULT;
			case CourceListPackage.EXAM__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
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
		result.append(" (weight: ");
		result.append(weight);
		result.append(", form: ");
		result.append(form);
		result.append(", lenght: ");
		result.append(lenght);
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //ExamImpl
