/**
 */
package pcn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pcn.PCNProbabilitiesTag;
import pcn.PcnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCN Probabilities Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcn.impl.PCNProbabilitiesTagImpl#getYesProbability <em>Yes Probability</em>}</li>
 *   <li>{@link pcn.impl.PCNProbabilitiesTagImpl#getNoProbability <em>No Probability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCNProbabilitiesTagImpl extends PCNTagImpl implements PCNProbabilitiesTag {
	/**
	 * The default value of the '{@link #getYesProbability() <em>Yes Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYesProbability()
	 * @generated
	 * @ordered
	 */
	protected static final String YES_PROBABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYesProbability() <em>Yes Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYesProbability()
	 * @generated
	 * @ordered
	 */
	protected String yesProbability = YES_PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoProbability() <em>No Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoProbability()
	 * @generated
	 * @ordered
	 */
	protected static final String NO_PROBABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNoProbability() <em>No Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoProbability()
	 * @generated
	 * @ordered
	 */
	protected String noProbability = NO_PROBABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCNProbabilitiesTagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcnPackage.Literals.PCN_PROBABILITIES_TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYesProbability() {
		return yesProbability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYesProbability(String newYesProbability) {
		String oldYesProbability = yesProbability;
		yesProbability = newYesProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_PROBABILITIES_TAG__YES_PROBABILITY, oldYesProbability, yesProbability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNoProbability() {
		return noProbability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoProbability(String newNoProbability) {
		String oldNoProbability = noProbability;
		noProbability = newNoProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_PROBABILITIES_TAG__NO_PROBABILITY, oldNoProbability, noProbability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcnPackage.PCN_PROBABILITIES_TAG__YES_PROBABILITY:
				return getYesProbability();
			case PcnPackage.PCN_PROBABILITIES_TAG__NO_PROBABILITY:
				return getNoProbability();
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
			case PcnPackage.PCN_PROBABILITIES_TAG__YES_PROBABILITY:
				setYesProbability((String)newValue);
				return;
			case PcnPackage.PCN_PROBABILITIES_TAG__NO_PROBABILITY:
				setNoProbability((String)newValue);
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
			case PcnPackage.PCN_PROBABILITIES_TAG__YES_PROBABILITY:
				setYesProbability(YES_PROBABILITY_EDEFAULT);
				return;
			case PcnPackage.PCN_PROBABILITIES_TAG__NO_PROBABILITY:
				setNoProbability(NO_PROBABILITY_EDEFAULT);
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
			case PcnPackage.PCN_PROBABILITIES_TAG__YES_PROBABILITY:
				return YES_PROBABILITY_EDEFAULT == null ? yesProbability != null : !YES_PROBABILITY_EDEFAULT.equals(yesProbability);
			case PcnPackage.PCN_PROBABILITIES_TAG__NO_PROBABILITY:
				return NO_PROBABILITY_EDEFAULT == null ? noProbability != null : !NO_PROBABILITY_EDEFAULT.equals(noProbability);
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
		result.append(" (yesProbability: ");
		result.append(yesProbability);
		result.append(", noProbability: ");
		result.append(noProbability);
		result.append(')');
		return result.toString();
	}

} //PCNProbabilitiesTagImpl
