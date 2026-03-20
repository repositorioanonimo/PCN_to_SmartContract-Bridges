/**
 */
package pcn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import pcn.PCNDecisionStep;
import pcn.PCNProcessStep;
import pcn.PcnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCN Decision Process Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcn.impl.PCNDecisionStepImpl#getPCNPositiveDecision <em>PCN Positive Decision</em>}</li>
 *   <li>{@link pcn.impl.PCNDecisionStepImpl#getPCNNegativeDecision <em>PCN Negative Decision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCNDecisionStepImpl extends PCNProcessStepWithTagsImpl implements PCNDecisionStep {
	/**
	 * The cached value of the '{@link #getPCNPositiveDecision() <em>PCN Positive Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCNPositiveDecision()
	 * @generated
	 * @ordered
	 */
	protected PCNProcessStep pcnPositiveDecision;

	/**
	 * The cached value of the '{@link #getPCNNegativeDecision() <em>PCN Negative Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCNNegativeDecision()
	 * @generated
	 * @ordered
	 */
	protected PCNProcessStep pcnNegativeDecision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCNDecisionStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcnPackage.Literals.PCN_DECISION_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNProcessStep getPCNPositiveDecision() {
		if (pcnPositiveDecision != null && pcnPositiveDecision.eIsProxy()) {
			InternalEObject oldPCNPositiveDecision = (InternalEObject)pcnPositiveDecision;
			pcnPositiveDecision = (PCNProcessStep)eResolveProxy(oldPCNPositiveDecision);
			if (pcnPositiveDecision != oldPCNPositiveDecision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcnPackage.PCN_DECISION_STEP__PCN_POSITIVE_DECISION, oldPCNPositiveDecision, pcnPositiveDecision));
			}
		}
		return pcnPositiveDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNProcessStep basicGetPCNPositiveDecision() {
		return pcnPositiveDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPCNPositiveDecision(PCNProcessStep newPCNPositiveDecision, NotificationChain msgs) {
		PCNProcessStep oldPCNPositiveDecision = pcnPositiveDecision;
		pcnPositiveDecision = newPCNPositiveDecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_DECISION_STEP__PCN_POSITIVE_DECISION, oldPCNPositiveDecision, newPCNPositiveDecision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPCNPositiveDecision(PCNProcessStep newPCNPositiveDecision) {
		if (newPCNPositiveDecision != pcnPositiveDecision) {
			NotificationChain msgs = null;
			if (pcnPositiveDecision != null)
				msgs = ((InternalEObject)pcnPositiveDecision).eInverseRemove(this, PcnPackage.PCN_PROCESS_STEP__PCN_POSITIVE_DECISION_SOURCE, PCNProcessStep.class, msgs);
			if (newPCNPositiveDecision != null)
				msgs = ((InternalEObject)newPCNPositiveDecision).eInverseAdd(this, PcnPackage.PCN_PROCESS_STEP__PCN_POSITIVE_DECISION_SOURCE, PCNProcessStep.class, msgs);
			msgs = basicSetPCNPositiveDecision(newPCNPositiveDecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_DECISION_STEP__PCN_POSITIVE_DECISION, newPCNPositiveDecision, newPCNPositiveDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNProcessStep getPCNNegativeDecision() {
		if (pcnNegativeDecision != null && pcnNegativeDecision.eIsProxy()) {
			InternalEObject oldPCNNegativeDecision = (InternalEObject)pcnNegativeDecision;
			pcnNegativeDecision = (PCNProcessStep)eResolveProxy(oldPCNNegativeDecision);
			if (pcnNegativeDecision != oldPCNNegativeDecision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcnPackage.PCN_DECISION_STEP__PCN_NEGATIVE_DECISION, oldPCNNegativeDecision, pcnNegativeDecision));
			}
		}
		return pcnNegativeDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNProcessStep basicGetPCNNegativeDecision() {
		return pcnNegativeDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPCNNegativeDecision(PCNProcessStep newPCNNegativeDecision, NotificationChain msgs) {
		PCNProcessStep oldPCNNegativeDecision = pcnNegativeDecision;
		pcnNegativeDecision = newPCNNegativeDecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_DECISION_STEP__PCN_NEGATIVE_DECISION, oldPCNNegativeDecision, newPCNNegativeDecision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPCNNegativeDecision(PCNProcessStep newPCNNegativeDecision) {
		if (newPCNNegativeDecision != pcnNegativeDecision) {
			NotificationChain msgs = null;
			if (pcnNegativeDecision != null)
				msgs = ((InternalEObject)pcnNegativeDecision).eInverseRemove(this, PcnPackage.PCN_PROCESS_STEP__PCN_NEGATIVE_DECISION_SOURCE, PCNProcessStep.class, msgs);
			if (newPCNNegativeDecision != null)
				msgs = ((InternalEObject)newPCNNegativeDecision).eInverseAdd(this, PcnPackage.PCN_PROCESS_STEP__PCN_NEGATIVE_DECISION_SOURCE, PCNProcessStep.class, msgs);
			msgs = basicSetPCNNegativeDecision(newPCNNegativeDecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_DECISION_STEP__PCN_NEGATIVE_DECISION, newPCNNegativeDecision, newPCNNegativeDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcnPackage.PCN_DECISION_STEP__PCN_POSITIVE_DECISION:
				if (pcnPositiveDecision != null)
					msgs = ((InternalEObject)pcnPositiveDecision).eInverseRemove(this, PcnPackage.PCN_PROCESS_STEP__PCN_POSITIVE_DECISION_SOURCE, PCNProcessStep.class, msgs);
				return basicSetPCNPositiveDecision((PCNProcessStep)otherEnd, msgs);
			case PcnPackage.PCN_DECISION_STEP__PCN_NEGATIVE_DECISION:
				if (pcnNegativeDecision != null)
					msgs = ((InternalEObject)pcnNegativeDecision).eInverseRemove(this, PcnPackage.PCN_PROCESS_STEP__PCN_NEGATIVE_DECISION_SOURCE, PCNProcessStep.class, msgs);
				return basicSetPCNNegativeDecision((PCNProcessStep)otherEnd, msgs);
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
			case PcnPackage.PCN_DECISION_STEP__PCN_POSITIVE_DECISION:
				return basicSetPCNPositiveDecision(null, msgs);
			case PcnPackage.PCN_DECISION_STEP__PCN_NEGATIVE_DECISION:
				return basicSetPCNNegativeDecision(null, msgs);
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
			case PcnPackage.PCN_DECISION_STEP__PCN_POSITIVE_DECISION:
				if (resolve) return getPCNPositiveDecision();
				return basicGetPCNPositiveDecision();
			case PcnPackage.PCN_DECISION_STEP__PCN_NEGATIVE_DECISION:
				if (resolve) return getPCNNegativeDecision();
				return basicGetPCNNegativeDecision();
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
			case PcnPackage.PCN_DECISION_STEP__PCN_POSITIVE_DECISION:
				setPCNPositiveDecision((PCNProcessStep)newValue);
				return;
			case PcnPackage.PCN_DECISION_STEP__PCN_NEGATIVE_DECISION:
				setPCNNegativeDecision((PCNProcessStep)newValue);
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
			case PcnPackage.PCN_DECISION_STEP__PCN_POSITIVE_DECISION:
				setPCNPositiveDecision((PCNProcessStep)null);
				return;
			case PcnPackage.PCN_DECISION_STEP__PCN_NEGATIVE_DECISION:
				setPCNNegativeDecision((PCNProcessStep)null);
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
			case PcnPackage.PCN_DECISION_STEP__PCN_POSITIVE_DECISION:
				return pcnPositiveDecision != null;
			case PcnPackage.PCN_DECISION_STEP__PCN_NEGATIVE_DECISION:
				return pcnNegativeDecision != null;
		}
		return super.eIsSet(featureID);
	}

} //PCNDecisionStepImpl
