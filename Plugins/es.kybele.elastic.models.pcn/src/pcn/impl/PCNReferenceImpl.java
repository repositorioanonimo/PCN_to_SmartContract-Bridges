/**
 */
package pcn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pcn.PCNDecisionStep;
import pcn.PCNReference;
import pcn.PCNRegularProcessStep;
import pcn.PCNTag;
import pcn.PcnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCN Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcn.impl.PCNReferenceImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link pcn.impl.PCNReferenceImpl#getPCNStandardDependencySource <em>PCN Standard Dependency Source</em>}</li>
 *   <li>{@link pcn.impl.PCNReferenceImpl#getPCNDelayedDependencySource <em>PCN Delayed Dependency Source</em>}</li>
 *   <li>{@link pcn.impl.PCNReferenceImpl#getPCNPositiveDecisionSource <em>PCN Positive Decision Source</em>}</li>
 *   <li>{@link pcn.impl.PCNReferenceImpl#getPCNNegativeDecisionSource <em>PCN Negative Decision Source</em>}</li>
 *   <li>{@link pcn.impl.PCNReferenceImpl#getLetter <em>Letter</em>}</li>
 *   <li>{@link pcn.impl.PCNReferenceImpl#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCNReferenceImpl extends MinimalEObjectImpl.Container implements PCNReference {
	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNTag> tags;

	/**
	 * The cached value of the '{@link #getPCNStandardDependencySource() <em>PCN Standard Dependency Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCNStandardDependencySource()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNRegularProcessStep> pcnStandardDependencySource;

	/**
	 * The cached value of the '{@link #getPCNDelayedDependencySource() <em>PCN Delayed Dependency Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCNDelayedDependencySource()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNRegularProcessStep> pcnDelayedDependencySource;

	/**
	 * The cached value of the '{@link #getPCNPositiveDecisionSource() <em>PCN Positive Decision Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCNPositiveDecisionSource()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNDecisionStep> pcnPositiveDecisionSource;

	/**
	 * The cached value of the '{@link #getPCNNegativeDecisionSource() <em>PCN Negative Decision Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCNNegativeDecisionSource()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNDecisionStep> pcnNegativeDecisionSource;

	/**
	 * The default value of the '{@link #getLetter() <em>Letter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetter()
	 * @generated
	 * @ordered
	 */
	protected static final String LETTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLetter() <em>Letter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLetter()
	 * @generated
	 * @ordered
	 */
	protected String letter = LETTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCNReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcnPackage.Literals.PCN_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNTag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<PCNTag>(PCNTag.class, this, PcnPackage.PCN_REFERENCE__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNRegularProcessStep> getPCNStandardDependencySource() {
		if (pcnStandardDependencySource == null) {
			pcnStandardDependencySource = new EObjectWithInverseResolvingEList.ManyInverse<PCNRegularProcessStep>(PCNRegularProcessStep.class, this, PcnPackage.PCN_REFERENCE__PCN_STANDARD_DEPENDENCY_SOURCE, PcnPackage.PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY);
		}
		return pcnStandardDependencySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNRegularProcessStep> getPCNDelayedDependencySource() {
		if (pcnDelayedDependencySource == null) {
			pcnDelayedDependencySource = new EObjectWithInverseResolvingEList.ManyInverse<PCNRegularProcessStep>(PCNRegularProcessStep.class, this, PcnPackage.PCN_REFERENCE__PCN_DELAYED_DEPENDENCY_SOURCE, PcnPackage.PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY);
		}
		return pcnDelayedDependencySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNDecisionStep> getPCNPositiveDecisionSource() {
		if (pcnPositiveDecisionSource == null) {
			pcnPositiveDecisionSource = new EObjectWithInverseResolvingEList<PCNDecisionStep>(PCNDecisionStep.class, this, PcnPackage.PCN_REFERENCE__PCN_POSITIVE_DECISION_SOURCE, PcnPackage.PCN_DECISION_STEP__PCN_POSITIVE_DECISION);
		}
		return pcnPositiveDecisionSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNDecisionStep> getPCNNegativeDecisionSource() {
		if (pcnNegativeDecisionSource == null) {
			pcnNegativeDecisionSource = new EObjectWithInverseResolvingEList<PCNDecisionStep>(PCNDecisionStep.class, this, PcnPackage.PCN_REFERENCE__PCN_NEGATIVE_DECISION_SOURCE, PcnPackage.PCN_DECISION_STEP__PCN_NEGATIVE_DECISION);
		}
		return pcnNegativeDecisionSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLetter() {
		return letter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLetter(String newLetter) {
		String oldLetter = letter;
		letter = newLetter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_REFERENCE__LETTER, oldLetter, letter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(String newNumber) {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_REFERENCE__NUMBER, oldNumber, number));
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
			case PcnPackage.PCN_REFERENCE__PCN_STANDARD_DEPENDENCY_SOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPCNStandardDependencySource()).basicAdd(otherEnd, msgs);
			case PcnPackage.PCN_REFERENCE__PCN_DELAYED_DEPENDENCY_SOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPCNDelayedDependencySource()).basicAdd(otherEnd, msgs);
			case PcnPackage.PCN_REFERENCE__PCN_POSITIVE_DECISION_SOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPCNPositiveDecisionSource()).basicAdd(otherEnd, msgs);
			case PcnPackage.PCN_REFERENCE__PCN_NEGATIVE_DECISION_SOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPCNNegativeDecisionSource()).basicAdd(otherEnd, msgs);
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
			case PcnPackage.PCN_REFERENCE__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_REFERENCE__PCN_STANDARD_DEPENDENCY_SOURCE:
				return ((InternalEList<?>)getPCNStandardDependencySource()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_REFERENCE__PCN_DELAYED_DEPENDENCY_SOURCE:
				return ((InternalEList<?>)getPCNDelayedDependencySource()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_REFERENCE__PCN_POSITIVE_DECISION_SOURCE:
				return ((InternalEList<?>)getPCNPositiveDecisionSource()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_REFERENCE__PCN_NEGATIVE_DECISION_SOURCE:
				return ((InternalEList<?>)getPCNNegativeDecisionSource()).basicRemove(otherEnd, msgs);
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
			case PcnPackage.PCN_REFERENCE__TAGS:
				return getTags();
			case PcnPackage.PCN_REFERENCE__PCN_STANDARD_DEPENDENCY_SOURCE:
				return getPCNStandardDependencySource();
			case PcnPackage.PCN_REFERENCE__PCN_DELAYED_DEPENDENCY_SOURCE:
				return getPCNDelayedDependencySource();
			case PcnPackage.PCN_REFERENCE__PCN_POSITIVE_DECISION_SOURCE:
				return getPCNPositiveDecisionSource();
			case PcnPackage.PCN_REFERENCE__PCN_NEGATIVE_DECISION_SOURCE:
				return getPCNNegativeDecisionSource();
			case PcnPackage.PCN_REFERENCE__LETTER:
				return getLetter();
			case PcnPackage.PCN_REFERENCE__NUMBER:
				return getNumber();
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
			case PcnPackage.PCN_REFERENCE__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends PCNTag>)newValue);
				return;
			case PcnPackage.PCN_REFERENCE__PCN_STANDARD_DEPENDENCY_SOURCE:
				getPCNStandardDependencySource().clear();
				getPCNStandardDependencySource().addAll((Collection<? extends PCNRegularProcessStep>)newValue);
				return;
			case PcnPackage.PCN_REFERENCE__PCN_DELAYED_DEPENDENCY_SOURCE:
				getPCNDelayedDependencySource().clear();
				getPCNDelayedDependencySource().addAll((Collection<? extends PCNRegularProcessStep>)newValue);
				return;
			case PcnPackage.PCN_REFERENCE__PCN_POSITIVE_DECISION_SOURCE:
				getPCNPositiveDecisionSource().clear();
				getPCNPositiveDecisionSource().addAll((Collection<? extends PCNDecisionStep>)newValue);
				return;
			case PcnPackage.PCN_REFERENCE__PCN_NEGATIVE_DECISION_SOURCE:
				getPCNNegativeDecisionSource().clear();
				getPCNNegativeDecisionSource().addAll((Collection<? extends PCNDecisionStep>)newValue);
				return;
			case PcnPackage.PCN_REFERENCE__LETTER:
				setLetter((String)newValue);
				return;
			case PcnPackage.PCN_REFERENCE__NUMBER:
				setNumber((String)newValue);
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
			case PcnPackage.PCN_REFERENCE__TAGS:
				getTags().clear();
				return;
			case PcnPackage.PCN_REFERENCE__PCN_STANDARD_DEPENDENCY_SOURCE:
				getPCNStandardDependencySource().clear();
				return;
			case PcnPackage.PCN_REFERENCE__PCN_DELAYED_DEPENDENCY_SOURCE:
				getPCNDelayedDependencySource().clear();
				return;
			case PcnPackage.PCN_REFERENCE__PCN_POSITIVE_DECISION_SOURCE:
				getPCNPositiveDecisionSource().clear();
				return;
			case PcnPackage.PCN_REFERENCE__PCN_NEGATIVE_DECISION_SOURCE:
				getPCNNegativeDecisionSource().clear();
				return;
			case PcnPackage.PCN_REFERENCE__LETTER:
				setLetter(LETTER_EDEFAULT);
				return;
			case PcnPackage.PCN_REFERENCE__NUMBER:
				setNumber(NUMBER_EDEFAULT);
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
			case PcnPackage.PCN_REFERENCE__TAGS:
				return tags != null && !tags.isEmpty();
			case PcnPackage.PCN_REFERENCE__PCN_STANDARD_DEPENDENCY_SOURCE:
				return pcnStandardDependencySource != null && !pcnStandardDependencySource.isEmpty();
			case PcnPackage.PCN_REFERENCE__PCN_DELAYED_DEPENDENCY_SOURCE:
				return pcnDelayedDependencySource != null && !pcnDelayedDependencySource.isEmpty();
			case PcnPackage.PCN_REFERENCE__PCN_POSITIVE_DECISION_SOURCE:
				return pcnPositiveDecisionSource != null && !pcnPositiveDecisionSource.isEmpty();
			case PcnPackage.PCN_REFERENCE__PCN_NEGATIVE_DECISION_SOURCE:
				return pcnNegativeDecisionSource != null && !pcnNegativeDecisionSource.isEmpty();
			case PcnPackage.PCN_REFERENCE__LETTER:
				return LETTER_EDEFAULT == null ? letter != null : !LETTER_EDEFAULT.equals(letter);
			case PcnPackage.PCN_REFERENCE__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (letter: ");
		result.append(letter);
		result.append(", number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //PCNReferenceImpl
