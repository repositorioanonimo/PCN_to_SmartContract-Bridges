/**
 */
package pcn.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pcn.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see pcn.PcnPackage
 * @generated
 */
public class PcnSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PcnPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcnSwitch() {
		if (modelPackage == null) {
			modelPackage = PcnPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PcnPackage.PCN_DIAGRAM: {
				PCNDiagram pcnDiagram = (PCNDiagram)theEObject;
				T result = casePCNDiagram(pcnDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_PROCESS_ENTITY: {
				PCNProcessEntity pcnProcessEntity = (PCNProcessEntity)theEObject;
				T result = casePCNProcessEntity(pcnProcessEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_PROCESS_STEP: {
				PCNProcessStep pcnProcessStep = (PCNProcessStep)theEObject;
				T result = casePCNProcessStep(pcnProcessStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS: {
				PCNProcessStepWithTags pcnProcessStepWithTags = (PCNProcessStepWithTags)theEObject;
				T result = casePCNProcessStepWithTags(pcnProcessStepWithTags);
				if (result == null) result = casePCNProcessStep(pcnProcessStepWithTags);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_REFERENCE: {
				PCNReference pcnReference = (PCNReference)theEObject;
				T result = casePCNReference(pcnReference);
				if (result == null) result = casePCNProcessStep(pcnReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_STANDARD_STEP: {
				PCNStandardStep pcnStandardStep = (PCNStandardStep)theEObject;
				T result = casePCNStandardStep(pcnStandardStep);
				if (result == null) result = casePCNRegularProcessStep(pcnStandardStep);
				if (result == null) result = casePCNProcessStepWithTags(pcnStandardStep);
				if (result == null) result = casePCNProcessStep(pcnStandardStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_DO_AND_WAIT_STEP: {
				PCNDoAndWaitStep pcnDoAndWaitStep = (PCNDoAndWaitStep)theEObject;
				T result = casePCNDoAndWaitStep(pcnDoAndWaitStep);
				if (result == null) result = casePCNRegularProcessStep(pcnDoAndWaitStep);
				if (result == null) result = casePCNProcessStepWithTags(pcnDoAndWaitStep);
				if (result == null) result = casePCNProcessStep(pcnDoAndWaitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_WAIT_STEP: {
				PCNWaitStep pcnWaitStep = (PCNWaitStep)theEObject;
				T result = casePCNWaitStep(pcnWaitStep);
				if (result == null) result = casePCNRegularProcessStep(pcnWaitStep);
				if (result == null) result = casePCNProcessStepWithTags(pcnWaitStep);
				if (result == null) result = casePCNProcessStep(pcnWaitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_DECISION_STEP: {
				PCNDecisionStep pcnDecisionStep = (PCNDecisionStep)theEObject;
				T result = casePCNDecisionStep(pcnDecisionStep);
				if (result == null) result = casePCNProcessStepWithTags(pcnDecisionStep);
				if (result == null) result = casePCNProcessStep(pcnDecisionStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_TAG: {
				PCNTag pcnTag = (PCNTag)theEObject;
				T result = casePCNTag(pcnTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_MONETARY_TAG: {
				PCNMonetaryTag pcnMonetaryTag = (PCNMonetaryTag)theEObject;
				T result = casePCNMonetaryTag(pcnMonetaryTag);
				if (result == null) result = casePCNTag(pcnMonetaryTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_MONETARY_BENEFIT: {
				PCNMonetaryBenefit pcnMonetaryBenefit = (PCNMonetaryBenefit)theEObject;
				T result = casePCNMonetaryBenefit(pcnMonetaryBenefit);
				if (result == null) result = casePCNMonetaryTag(pcnMonetaryBenefit);
				if (result == null) result = casePCNTag(pcnMonetaryBenefit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_MONETARY_COST: {
				PCNMonetaryCost pcnMonetaryCost = (PCNMonetaryCost)theEObject;
				T result = casePCNMonetaryCost(pcnMonetaryCost);
				if (result == null) result = casePCNMonetaryTag(pcnMonetaryCost);
				if (result == null) result = casePCNTag(pcnMonetaryCost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_NON_MONETARY_TAG: {
				PCNNonMonetaryTag pcnNonMonetaryTag = (PCNNonMonetaryTag)theEObject;
				T result = casePCNNonMonetaryTag(pcnNonMonetaryTag);
				if (result == null) result = casePCNTag(pcnNonMonetaryTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_NON_MONETARY_BENEFIT: {
				PCNNonMonetaryBenefit pcnNonMonetaryBenefit = (PCNNonMonetaryBenefit)theEObject;
				T result = casePCNNonMonetaryBenefit(pcnNonMonetaryBenefit);
				if (result == null) result = casePCNNonMonetaryTag(pcnNonMonetaryBenefit);
				if (result == null) result = casePCNTag(pcnNonMonetaryBenefit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_NON_MONETARY_COST: {
				PCNNonMonetaryCost pcnNonMonetaryCost = (PCNNonMonetaryCost)theEObject;
				T result = casePCNNonMonetaryCost(pcnNonMonetaryCost);
				if (result == null) result = casePCNNonMonetaryTag(pcnNonMonetaryCost);
				if (result == null) result = casePCNTag(pcnNonMonetaryCost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_INNOVATION_STEP: {
				PCNInnovationStep pcnInnovationStep = (PCNInnovationStep)theEObject;
				T result = casePCNInnovationStep(pcnInnovationStep);
				if (result == null) result = casePCNRegularProcessStep(pcnInnovationStep);
				if (result == null) result = casePCNProcessStepWithTags(pcnInnovationStep);
				if (result == null) result = casePCNProcessStep(pcnInnovationStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_OUTSOURCED_STEP: {
				PCNOutsourcedStep pcnOutsourcedStep = (PCNOutsourcedStep)theEObject;
				T result = casePCNOutsourcedStep(pcnOutsourcedStep);
				if (result == null) result = casePCNRegularProcessStep(pcnOutsourcedStep);
				if (result == null) result = casePCNProcessStepWithTags(pcnOutsourcedStep);
				if (result == null) result = casePCNProcessStep(pcnOutsourcedStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_REGULAR_PROCESS_STEP: {
				PCNRegularProcessStep pcnRegularProcessStep = (PCNRegularProcessStep)theEObject;
				T result = casePCNRegularProcessStep(pcnRegularProcessStep);
				if (result == null) result = casePCNProcessStepWithTags(pcnRegularProcessStep);
				if (result == null) result = casePCNProcessStep(pcnRegularProcessStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_TEXTUAL_TAG: {
				PCNTextualTag pcnTextualTag = (PCNTextualTag)theEObject;
				T result = casePCNTextualTag(pcnTextualTag);
				if (result == null) result = casePCNTag(pcnTextualTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_DELAY_TIME_TAG: {
				PCNDelayTimeTag pcnDelayTimeTag = (PCNDelayTimeTag)theEObject;
				T result = casePCNDelayTimeTag(pcnDelayTimeTag);
				if (result == null) result = casePCNTag(pcnDelayTimeTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_PROBABILITIES_TAG: {
				PCNProbabilitiesTag pcnProbabilitiesTag = (PCNProbabilitiesTag)theEObject;
				T result = casePCNProbabilitiesTag(pcnProbabilitiesTag);
				if (result == null) result = casePCNTag(pcnProbabilitiesTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcnPackage.PCN_SYNC_TAG: {
				PCNSyncTag pcnSyncTag = (PCNSyncTag)theEObject;
				T result = casePCNSyncTag(pcnSyncTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNDiagram(PCNDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Process Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Process Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNProcessEntity(PCNProcessEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Process Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNProcessStep(PCNProcessStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Process Step With Tags</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Process Step With Tags</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNProcessStepWithTags(PCNProcessStepWithTags object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNReference(PCNReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Standard Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Standard Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNStandardStep(PCNStandardStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Do And Wait Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Do And Wait Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNDoAndWaitStep(PCNDoAndWaitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Wait Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Wait Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNWaitStep(PCNWaitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Decision Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Decision Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNDecisionStep(PCNDecisionStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNTag(PCNTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Monetary Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Monetary Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNMonetaryTag(PCNMonetaryTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Monetary Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Monetary Benefit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNMonetaryBenefit(PCNMonetaryBenefit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Monetary Cost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Monetary Cost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNMonetaryCost(PCNMonetaryCost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Non Monetary Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Non Monetary Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNNonMonetaryTag(PCNNonMonetaryTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Non Monetary Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Non Monetary Benefit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNNonMonetaryBenefit(PCNNonMonetaryBenefit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Non Monetary Cost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Non Monetary Cost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNNonMonetaryCost(PCNNonMonetaryCost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Innovation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Innovation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNInnovationStep(PCNInnovationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Outsourced Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Outsourced Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNOutsourcedStep(PCNOutsourcedStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Regular Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Regular Process Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNRegularProcessStep(PCNRegularProcessStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Textual Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Textual Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNTextualTag(PCNTextualTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Delay Time Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Delay Time Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNDelayTimeTag(PCNDelayTimeTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Probabilities Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Probabilities Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNProbabilitiesTag(PCNProbabilitiesTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCN Sync Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCN Sync Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCNSyncTag(PCNSyncTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PcnSwitch
