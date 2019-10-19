/**
 */
package courceList.impl;

import courceList.CourceListPackage;
import courceList.CourceSpecification;
import courceList.Specialisation;
import courceList.StudyCourceRelation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Cource Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link courceList.impl.StudyCourceRelationImpl#getCource <em>Cource</em>}</li>
 *   <li>{@link courceList.impl.StudyCourceRelationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link courceList.impl.StudyCourceRelationImpl#getYear <em>Year</em>}</li>
 *   <li>{@link courceList.impl.StudyCourceRelationImpl#getSpecialisation <em>Specialisation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyCourceRelationImpl extends MinimalEObjectImpl.Container implements StudyCourceRelation {
	/**
	 * The cached value of the '{@link #getCource() <em>Cource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCource()
	 * @generated
	 * @ordered
	 */
	protected CourceSpecification cource;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

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
	protected StudyCourceRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourceListPackage.Literals.STUDY_COURCE_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourceSpecification getCource() {
		if (cource != null && cource.eIsProxy()) {
			InternalEObject oldCource = (InternalEObject)cource;
			cource = (CourceSpecification)eResolveProxy(oldCource);
			if (cource != oldCource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CourceListPackage.STUDY_COURCE_RELATION__COURCE, oldCource, cource));
			}
		}
		return cource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourceSpecification basicGetCource() {
		return cource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCource(CourceSpecification newCource) {
		CourceSpecification oldCource = cource;
		cource = newCource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.STUDY_COURCE_RELATION__COURCE, oldCource, cource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.STUDY_COURCE_RELATION__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.STUDY_COURCE_RELATION__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialisation getSpecialisation() {
		if (eContainerFeatureID() != CourceListPackage.STUDY_COURCE_RELATION__SPECIALISATION) return null;
		return (Specialisation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialisation(Specialisation newSpecialisation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpecialisation, CourceListPackage.STUDY_COURCE_RELATION__SPECIALISATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialisation(Specialisation newSpecialisation) {
		if (newSpecialisation != eInternalContainer() || (eContainerFeatureID() != CourceListPackage.STUDY_COURCE_RELATION__SPECIALISATION && newSpecialisation != null)) {
			if (EcoreUtil.isAncestor(this, newSpecialisation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecialisation != null)
				msgs = ((InternalEObject)newSpecialisation).eInverseAdd(this, CourceListPackage.SPECIALISATION__COURCE, Specialisation.class, msgs);
			msgs = basicSetSpecialisation(newSpecialisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourceListPackage.STUDY_COURCE_RELATION__SPECIALISATION, newSpecialisation, newSpecialisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CourceListPackage.STUDY_COURCE_RELATION__SPECIALISATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpecialisation((Specialisation)otherEnd, msgs);
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
			case CourceListPackage.STUDY_COURCE_RELATION__SPECIALISATION:
				return basicSetSpecialisation(null, msgs);
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
			case CourceListPackage.STUDY_COURCE_RELATION__SPECIALISATION:
				return eInternalContainer().eInverseRemove(this, CourceListPackage.SPECIALISATION__COURCE, Specialisation.class, msgs);
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
			case CourceListPackage.STUDY_COURCE_RELATION__COURCE:
				if (resolve) return getCource();
				return basicGetCource();
			case CourceListPackage.STUDY_COURCE_RELATION__STATUS:
				return getStatus();
			case CourceListPackage.STUDY_COURCE_RELATION__YEAR:
				return getYear();
			case CourceListPackage.STUDY_COURCE_RELATION__SPECIALISATION:
				return getSpecialisation();
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
			case CourceListPackage.STUDY_COURCE_RELATION__COURCE:
				setCource((CourceSpecification)newValue);
				return;
			case CourceListPackage.STUDY_COURCE_RELATION__STATUS:
				setStatus((String)newValue);
				return;
			case CourceListPackage.STUDY_COURCE_RELATION__YEAR:
				setYear((Integer)newValue);
				return;
			case CourceListPackage.STUDY_COURCE_RELATION__SPECIALISATION:
				setSpecialisation((Specialisation)newValue);
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
			case CourceListPackage.STUDY_COURCE_RELATION__COURCE:
				setCource((CourceSpecification)null);
				return;
			case CourceListPackage.STUDY_COURCE_RELATION__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case CourceListPackage.STUDY_COURCE_RELATION__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case CourceListPackage.STUDY_COURCE_RELATION__SPECIALISATION:
				setSpecialisation((Specialisation)null);
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
			case CourceListPackage.STUDY_COURCE_RELATION__COURCE:
				return cource != null;
			case CourceListPackage.STUDY_COURCE_RELATION__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case CourceListPackage.STUDY_COURCE_RELATION__YEAR:
				return year != YEAR_EDEFAULT;
			case CourceListPackage.STUDY_COURCE_RELATION__SPECIALISATION:
				return getSpecialisation() != null;
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
		result.append(" (status: ");
		result.append(status);
		result.append(", year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

} //StudyCourceRelationImpl
