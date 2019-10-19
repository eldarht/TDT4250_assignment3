/**
 */
package courceList.impl;

import courceList.Cource;
import courceList.CourceListPackage;
import courceList.CourceSpecification;
import courceList.EvaluationForm;
import courceList.Professor;
import courceList.Semester;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cource Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link courceList.impl.CourceSpecificationImpl#getCource <em>Cource</em>}</li>
 *   <li>{@link courceList.impl.CourceSpecificationImpl#getCoordinator <em>Coordinator</em>}</li>
 *   <li>{@link courceList.impl.CourceSpecificationImpl#getEvaluationForm <em>Evaluation Form</em>}</li>
 *   <li>{@link courceList.impl.CourceSpecificationImpl#getSpecificationYear <em>Specification Year</em>}</li>
 *   <li>{@link courceList.impl.CourceSpecificationImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link courceList.impl.CourceSpecificationImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link courceList.impl.CourceSpecificationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link courceList.impl.CourceSpecificationImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link courceList.impl.CourceSpecificationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourceSpecificationImpl extends MinimalEObjectImpl.Container implements CourceSpecification {
	/**
	 * The cached value of the '{@link #getCoordinator() <em>Coordinator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinator()
	 * @generated
	 * @ordered
	 */
	protected Professor coordinator;

	/**
	 * The cached value of the '{@link #getEvaluationForm() <em>Evaluation Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationForm()
	 * @generated
	 * @ordered
	 */
	protected EvaluationForm evaluationForm;

	/**
	 * The default value of the '{@link #getSpecificationYear() <em>Specification Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationYear()
	 * @generated
	 * @ordered
	 */
	protected static final int SPECIFICATION_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpecificationYear() <em>Specification Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationYear()
	 * @generated
	 * @ordered
	 */
	protected int specificationYear = SPECIFICATION_YEAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semester;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float CREDITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected float credits = CREDITS_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)CourceListPackage.Literals.COURCE_SPECIFICATION__NAME).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourceListPackage.Literals.COURCE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cource getCource() {
		if (eContainerFeatureID() != CourceListPackage.COURCE_SPECIFICATION__COURCE) return null;
		return (Cource)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCource(Cource newCource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCource, CourceListPackage.COURCE_SPECIFICATION__COURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCource(Cource newCource) {
		if (newCource != eInternalContainer() || (eContainerFeatureID() != CourceListPackage.COURCE_SPECIFICATION__COURCE && newCource != null)) {
			if (EcoreUtil.isAncestor(this, newCource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCource != null)
				msgs = ((InternalEObject)newCource).eInverseAdd(this, CourceListPackage.COURCE__CORSE_SPECIFICATIONS, Cource.class, msgs);
			msgs = basicSetCource(newCource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.COURCE_SPECIFICATION__COURCE, newCource, newCource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professor getCoordinator() {
		if (coordinator != null && coordinator.eIsProxy()) {
			InternalEObject oldCoordinator = (InternalEObject)coordinator;
			coordinator = (Professor)eResolveProxy(oldCoordinator);
			if (coordinator != oldCoordinator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CourceListPackage.COURCE_SPECIFICATION__COORDINATOR, oldCoordinator, coordinator));
			}
		}
		return coordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Professor basicGetCoordinator() {
		return coordinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinator(Professor newCoordinator) {
		Professor oldCoordinator = coordinator;
		coordinator = newCoordinator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.COURCE_SPECIFICATION__COORDINATOR, oldCoordinator, coordinator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationForm getEvaluationForm() {
		return evaluationForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvaluationForm(EvaluationForm newEvaluationForm, NotificationChain msgs) {
		EvaluationForm oldEvaluationForm = evaluationForm;
		evaluationForm = newEvaluationForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CourceListPackage.COURCE_SPECIFICATION__EVALUATION_FORM, oldEvaluationForm, newEvaluationForm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluationForm(EvaluationForm newEvaluationForm) {
		if (newEvaluationForm != evaluationForm) {
			NotificationChain msgs = null;
			if (evaluationForm != null)
				msgs = ((InternalEObject)evaluationForm).eInverseRemove(this, CourceListPackage.EVALUATION_FORM__COURCE, EvaluationForm.class, msgs);
			if (newEvaluationForm != null)
				msgs = ((InternalEObject)newEvaluationForm).eInverseAdd(this, CourceListPackage.EVALUATION_FORM__COURCE, EvaluationForm.class, msgs);
			msgs = basicSetEvaluationForm(newEvaluationForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.COURCE_SPECIFICATION__EVALUATION_FORM, newEvaluationForm, newEvaluationForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpecificationYear() {
		return specificationYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificationYear(int newSpecificationYear) {
		int oldSpecificationYear = specificationYear;
		specificationYear = newSpecificationYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.COURCE_SPECIFICATION__SPECIFICATION_YEAR, oldSpecificationYear, specificationYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semester> getSemester() {
		if (semester == null) {
			semester = new EDataTypeUniqueEList<Semester>(Semester.class, this, CourceListPackage.COURCE_SPECIFICATION__SEMESTER);
		}
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.COURCE_SPECIFICATION__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.COURCE_SPECIFICATION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredits(float newCredits) {
		float oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.COURCE_SPECIFICATION__CREDITS, oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)NAME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CourceListPackage.COURCE_SPECIFICATION__COURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCource((Cource)otherEnd, msgs);
			case CourceListPackage.COURCE_SPECIFICATION__EVALUATION_FORM:
				if (evaluationForm != null)
					msgs = ((InternalEObject)evaluationForm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CourceListPackage.COURCE_SPECIFICATION__EVALUATION_FORM, null, msgs);
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
			case CourceListPackage.COURCE_SPECIFICATION__COURCE:
				return basicSetCource(null, msgs);
			case CourceListPackage.COURCE_SPECIFICATION__EVALUATION_FORM:
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
			case CourceListPackage.COURCE_SPECIFICATION__COURCE:
				return eInternalContainer().eInverseRemove(this, CourceListPackage.COURCE__CORSE_SPECIFICATIONS, Cource.class, msgs);
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
			case CourceListPackage.COURCE_SPECIFICATION__COURCE:
				return getCource();
			case CourceListPackage.COURCE_SPECIFICATION__COORDINATOR:
				if (resolve) return getCoordinator();
				return basicGetCoordinator();
			case CourceListPackage.COURCE_SPECIFICATION__EVALUATION_FORM:
				return getEvaluationForm();
			case CourceListPackage.COURCE_SPECIFICATION__SPECIFICATION_YEAR:
				return getSpecificationYear();
			case CourceListPackage.COURCE_SPECIFICATION__SEMESTER:
				return getSemester();
			case CourceListPackage.COURCE_SPECIFICATION__LANGUAGE:
				return getLanguage();
			case CourceListPackage.COURCE_SPECIFICATION__VERSION:
				return getVersion();
			case CourceListPackage.COURCE_SPECIFICATION__CREDITS:
				return getCredits();
			case CourceListPackage.COURCE_SPECIFICATION__NAME:
				return getName();
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
			case CourceListPackage.COURCE_SPECIFICATION__COURCE:
				setCource((Cource)newValue);
				return;
			case CourceListPackage.COURCE_SPECIFICATION__COORDINATOR:
				setCoordinator((Professor)newValue);
				return;
			case CourceListPackage.COURCE_SPECIFICATION__EVALUATION_FORM:
				setEvaluationForm((EvaluationForm)newValue);
				return;
			case CourceListPackage.COURCE_SPECIFICATION__SPECIFICATION_YEAR:
				setSpecificationYear((Integer)newValue);
				return;
			case CourceListPackage.COURCE_SPECIFICATION__SEMESTER:
				getSemester().clear();
				getSemester().addAll((Collection<? extends Semester>)newValue);
				return;
			case CourceListPackage.COURCE_SPECIFICATION__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case CourceListPackage.COURCE_SPECIFICATION__VERSION:
				setVersion((String)newValue);
				return;
			case CourceListPackage.COURCE_SPECIFICATION__CREDITS:
				setCredits((Float)newValue);
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
			case CourceListPackage.COURCE_SPECIFICATION__COURCE:
				setCource((Cource)null);
				return;
			case CourceListPackage.COURCE_SPECIFICATION__COORDINATOR:
				setCoordinator((Professor)null);
				return;
			case CourceListPackage.COURCE_SPECIFICATION__EVALUATION_FORM:
				setEvaluationForm((EvaluationForm)null);
				return;
			case CourceListPackage.COURCE_SPECIFICATION__SPECIFICATION_YEAR:
				setSpecificationYear(SPECIFICATION_YEAR_EDEFAULT);
				return;
			case CourceListPackage.COURCE_SPECIFICATION__SEMESTER:
				getSemester().clear();
				return;
			case CourceListPackage.COURCE_SPECIFICATION__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case CourceListPackage.COURCE_SPECIFICATION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CourceListPackage.COURCE_SPECIFICATION__CREDITS:
				setCredits(CREDITS_EDEFAULT);
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
			case CourceListPackage.COURCE_SPECIFICATION__COURCE:
				return getCource() != null;
			case CourceListPackage.COURCE_SPECIFICATION__COORDINATOR:
				return coordinator != null;
			case CourceListPackage.COURCE_SPECIFICATION__EVALUATION_FORM:
				return evaluationForm != null;
			case CourceListPackage.COURCE_SPECIFICATION__SPECIFICATION_YEAR:
				return specificationYear != SPECIFICATION_YEAR_EDEFAULT;
			case CourceListPackage.COURCE_SPECIFICATION__SEMESTER:
				return semester != null && !semester.isEmpty();
			case CourceListPackage.COURCE_SPECIFICATION__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case CourceListPackage.COURCE_SPECIFICATION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CourceListPackage.COURCE_SPECIFICATION__CREDITS:
				return credits != CREDITS_EDEFAULT;
			case CourceListPackage.COURCE_SPECIFICATION__NAME:
				return NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(" (specificationYear: ");
		result.append(specificationYear);
		result.append(", semester: ");
		result.append(semester);
		result.append(", language: ");
		result.append(language);
		result.append(", version: ");
		result.append(version);
		result.append(", credits: ");
		result.append(credits);
		result.append(')');
		return result.toString();
	}

} //CourceSpecificationImpl
