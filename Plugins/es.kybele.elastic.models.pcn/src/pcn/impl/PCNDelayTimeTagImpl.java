/**
 */
package pcn.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pcn.PCNDelayTimeTag;
import pcn.PcnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCN Delay Time Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcn.impl.PCNDelayTimeTagImpl#getDelayTime <em>Delay Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCNDelayTimeTagImpl extends PCNTagImpl implements PCNDelayTimeTag {
	/**
	 * The default value of the '{@link #getDelayTime() <em>Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayTime()
	 * @generated
	 * @ordered
	 */
	protected static final String DELAY_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelayTime() <em>Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayTime()
	 * @generated
	 * @ordered
	 */
	protected String delayTime = DELAY_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCNDelayTimeTagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcnPackage.Literals.PCN_DELAY_TIME_TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelayTime() {
		return delayTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelayTime(String newDelayTime) {
		String oldDelayTime = delayTime;
		delayTime = newDelayTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcnPackage.PCN_DELAY_TIME_TAG__DELAY_TIME, oldDelayTime, delayTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcnPackage.PCN_DELAY_TIME_TAG__DELAY_TIME:
				return getDelayTime();
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
			case PcnPackage.PCN_DELAY_TIME_TAG__DELAY_TIME:
				setDelayTime((String)newValue);
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
			case PcnPackage.PCN_DELAY_TIME_TAG__DELAY_TIME:
				setDelayTime(DELAY_TIME_EDEFAULT);
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
			case PcnPackage.PCN_DELAY_TIME_TAG__DELAY_TIME:
				return DELAY_TIME_EDEFAULT == null ? delayTime != null : !DELAY_TIME_EDEFAULT.equals(delayTime);
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
		result.append(" (delayTime: ");
		result.append(delayTime);
		result.append(')');
		return result.toString();
	}

} //PCNDelayTimeTagImpl
