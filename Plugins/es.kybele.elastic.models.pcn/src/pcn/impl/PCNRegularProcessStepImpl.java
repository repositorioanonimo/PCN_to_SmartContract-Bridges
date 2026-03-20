/**
 */
package pcn.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import pcn.PCNProcessStep;
import pcn.PCNRegularProcessStep;
import pcn.PcnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCN Regular Process Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcn.impl.PCNRegularProcessStepImpl#getPCNStandardDependency <em>PCN Standard Dependency</em>}</li>
 *   <li>{@link pcn.impl.PCNRegularProcessStepImpl#getPCNDelayedDependency <em>PCN Delayed Dependency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCNRegularProcessStepImpl extends PCNProcessStepWithTagsImpl implements PCNRegularProcessStep {
	/**
	 * The cached value of the '{@link #getPCNStandardDependency() <em>PCN Standard Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCNStandardDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNProcessStep> pcnStandardDependency;

	/**
	 * The cached value of the '{@link #getPCNDelayedDependency() <em>PCN Delayed Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCNDelayedDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<PCNProcessStep> pcnDelayedDependency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCNRegularProcessStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcnPackage.Literals.PCN_REGULAR_PROCESS_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNProcessStep> getPCNStandardDependency() {
		if (pcnStandardDependency == null) {
			pcnStandardDependency = new EObjectWithInverseResolvingEList.ManyInverse<PCNProcessStep>(PCNProcessStep.class, this, PcnPackage.PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY, PcnPackage.PCN_PROCESS_STEP__PCN_STANDARD_DEPENDENCY_SOURCE);
		}
		return pcnStandardDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCNProcessStep> getPCNDelayedDependency() {
		if (pcnDelayedDependency == null) {
			pcnDelayedDependency = new EObjectWithInverseResolvingEList.ManyInverse<PCNProcessStep>(PCNProcessStep.class, this, PcnPackage.PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY, PcnPackage.PCN_PROCESS_STEP__PCN_DELAYED_DEPENDENCY_SOURCE);
		}
		return pcnDelayedDependency;
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
			case PcnPackage.PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPCNStandardDependency()).basicAdd(otherEnd, msgs);
			case PcnPackage.PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPCNDelayedDependency()).basicAdd(otherEnd, msgs);
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
			case PcnPackage.PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY:
				return ((InternalEList<?>)getPCNStandardDependency()).basicRemove(otherEnd, msgs);
			case PcnPackage.PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY:
				return ((InternalEList<?>)getPCNDelayedDependency()).basicRemove(otherEnd, msgs);
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
			case PcnPackage.PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY:
				return getPCNStandardDependency();
			case PcnPackage.PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY:
				return getPCNDelayedDependency();
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
			case PcnPackage.PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY:
				getPCNStandardDependency().clear();
				getPCNStandardDependency().addAll((Collection<? extends PCNProcessStep>)newValue);
				return;
			case PcnPackage.PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY:
				getPCNDelayedDependency().clear();
				getPCNDelayedDependency().addAll((Collection<? extends PCNProcessStep>)newValue);
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
			case PcnPackage.PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY:
				getPCNStandardDependency().clear();
				return;
			case PcnPackage.PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY:
				getPCNDelayedDependency().clear();
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
			case PcnPackage.PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY:
				return pcnStandardDependency != null && !pcnStandardDependency.isEmpty();
			case PcnPackage.PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY:
				return pcnDelayedDependency != null && !pcnDelayedDependency.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PCNRegularProcessStepImpl
