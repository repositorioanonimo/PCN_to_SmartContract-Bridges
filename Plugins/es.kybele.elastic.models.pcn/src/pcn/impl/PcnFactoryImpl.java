/**
 */
package pcn.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pcn.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PcnFactoryImpl extends EFactoryImpl implements PcnFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PcnFactory init() {
		try {
			PcnFactory thePcnFactory = (PcnFactory)EPackage.Registry.INSTANCE.getEFactory(PcnPackage.eNS_URI);
			if (thePcnFactory != null) {
				return thePcnFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PcnFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcnFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PcnPackage.PCN_DIAGRAM: return createPCNDiagram();
			case PcnPackage.PCN_PROCESS_ENTITY: return createPCNProcessEntity();
			case PcnPackage.PCN_REFERENCE: return createPCNReference();
			case PcnPackage.PCN_STANDARD_STEP: return createPCNStandardStep();
			case PcnPackage.PCN_DO_AND_WAIT_STEP: return createPCNDoAndWaitStep();
			case PcnPackage.PCN_WAIT_STEP: return createPCNWaitStep();
			case PcnPackage.PCN_DECISION_STEP: return createPCNDecisionStep();
			case PcnPackage.PCN_MONETARY_TAG: return createPCNMonetaryTag();
			case PcnPackage.PCN_MONETARY_BENEFIT: return createPCNMonetaryBenefit();
			case PcnPackage.PCN_MONETARY_COST: return createPCNMonetaryCost();
			case PcnPackage.PCN_NON_MONETARY_TAG: return createPCNNonMonetaryTag();
			case PcnPackage.PCN_NON_MONETARY_BENEFIT: return createPCNNonMonetaryBenefit();
			case PcnPackage.PCN_NON_MONETARY_COST: return createPCNNonMonetaryCost();
			case PcnPackage.PCN_INNOVATION_STEP: return createPCNInnovationStep();
			case PcnPackage.PCN_OUTSOURCED_STEP: return createPCNOutsourcedStep();
			case PcnPackage.PCN_REGULAR_PROCESS_STEP: return createPCNRegularProcessStep();
			case PcnPackage.PCN_TEXTUAL_TAG: return createPCNTextualTag();
			case PcnPackage.PCN_DELAY_TIME_TAG: return createPCNDelayTimeTag();
			case PcnPackage.PCN_PROBABILITIES_TAG: return createPCNProbabilitiesTag();
			case PcnPackage.PCN_SYNC_TAG: return createPCNSyncTag();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNDiagram createPCNDiagram() {
		PCNDiagramImpl pcnDiagram = new PCNDiagramImpl();
		return pcnDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNProcessEntity createPCNProcessEntity() {
		PCNProcessEntityImpl pcnProcessEntity = new PCNProcessEntityImpl();
		return pcnProcessEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNReference createPCNReference() {
		PCNReferenceImpl pcnReference = new PCNReferenceImpl();
		return pcnReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNStandardStep createPCNStandardStep() {
		PCNStandardStepImpl pcnStandardStep = new PCNStandardStepImpl();
		return pcnStandardStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNDoAndWaitStep createPCNDoAndWaitStep() {
		PCNDoAndWaitStepImpl pcnDoAndWaitStep = new PCNDoAndWaitStepImpl();
		return pcnDoAndWaitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNWaitStep createPCNWaitStep() {
		PCNWaitStepImpl pcnWaitStep = new PCNWaitStepImpl();
		return pcnWaitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNDecisionStep createPCNDecisionStep() {
		PCNDecisionStepImpl pcnDecisionStep = new PCNDecisionStepImpl();
		return pcnDecisionStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNMonetaryTag createPCNMonetaryTag() {
		PCNMonetaryTagImpl pcnMonetaryTag = new PCNMonetaryTagImpl();
		return pcnMonetaryTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNMonetaryBenefit createPCNMonetaryBenefit() {
		PCNMonetaryBenefitImpl pcnMonetaryBenefit = new PCNMonetaryBenefitImpl();
		return pcnMonetaryBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNMonetaryCost createPCNMonetaryCost() {
		PCNMonetaryCostImpl pcnMonetaryCost = new PCNMonetaryCostImpl();
		return pcnMonetaryCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNNonMonetaryTag createPCNNonMonetaryTag() {
		PCNNonMonetaryTagImpl pcnNonMonetaryTag = new PCNNonMonetaryTagImpl();
		return pcnNonMonetaryTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNNonMonetaryBenefit createPCNNonMonetaryBenefit() {
		PCNNonMonetaryBenefitImpl pcnNonMonetaryBenefit = new PCNNonMonetaryBenefitImpl();
		return pcnNonMonetaryBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNNonMonetaryCost createPCNNonMonetaryCost() {
		PCNNonMonetaryCostImpl pcnNonMonetaryCost = new PCNNonMonetaryCostImpl();
		return pcnNonMonetaryCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNInnovationStep createPCNInnovationStep() {
		PCNInnovationStepImpl pcnInnovationStep = new PCNInnovationStepImpl();
		return pcnInnovationStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNOutsourcedStep createPCNOutsourcedStep() {
		PCNOutsourcedStepImpl pcnOutsourcedStep = new PCNOutsourcedStepImpl();
		return pcnOutsourcedStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNRegularProcessStep createPCNRegularProcessStep() {
		PCNRegularProcessStepImpl pcnRegularProcessStep = new PCNRegularProcessStepImpl();
		return pcnRegularProcessStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNTextualTag createPCNTextualTag() {
		PCNTextualTagImpl pcnTextualTag = new PCNTextualTagImpl();
		return pcnTextualTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNDelayTimeTag createPCNDelayTimeTag() {
		PCNDelayTimeTagImpl pcnDelayTimeTag = new PCNDelayTimeTagImpl();
		return pcnDelayTimeTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNProbabilitiesTag createPCNProbabilitiesTag() {
		PCNProbabilitiesTagImpl pcnProbabilitiesTag = new PCNProbabilitiesTagImpl();
		return pcnProbabilitiesTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNSyncTag createPCNSyncTag() {
		PCNSyncTagImpl pcnSyncTag = new PCNSyncTagImpl();
		return pcnSyncTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcnPackage getPcnPackage() {
		return (PcnPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PcnPackage getPackage() {
		return PcnPackage.eINSTANCE;
	}

} //PcnFactoryImpl
