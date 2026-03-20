/**
 */
package pcn.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pcn.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pcn.PcnPackage
 * @generated
 */
public class PcnAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PcnPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcnAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PcnPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PcnSwitch<Adapter> modelSwitch =
		new PcnSwitch<Adapter>() {
			@Override
			public Adapter casePCNDiagram(PCNDiagram object) {
				return createPCNDiagramAdapter();
			}
			@Override
			public Adapter casePCNProcessEntity(PCNProcessEntity object) {
				return createPCNProcessEntityAdapter();
			}
			@Override
			public Adapter casePCNProcessStep(PCNProcessStep object) {
				return createPCNProcessStepAdapter();
			}
			@Override
			public Adapter casePCNProcessStepWithTags(PCNProcessStepWithTags object) {
				return createPCNProcessStepWithTagsAdapter();
			}
			@Override
			public Adapter casePCNReference(PCNReference object) {
				return createPCNReferenceAdapter();
			}
			@Override
			public Adapter casePCNStandardStep(PCNStandardStep object) {
				return createPCNStandardStepAdapter();
			}
			@Override
			public Adapter casePCNDoAndWaitStep(PCNDoAndWaitStep object) {
				return createPCNDoAndWaitStepAdapter();
			}
			@Override
			public Adapter casePCNWaitStep(PCNWaitStep object) {
				return createPCNWaitStepAdapter();
			}
			@Override
			public Adapter casePCNDecisionStep(PCNDecisionStep object) {
				return createPCNDecisionStepAdapter();
			}
			@Override
			public Adapter casePCNTag(PCNTag object) {
				return createPCNTagAdapter();
			}
			@Override
			public Adapter casePCNMonetaryTag(PCNMonetaryTag object) {
				return createPCNMonetaryTagAdapter();
			}
			@Override
			public Adapter casePCNMonetaryBenefit(PCNMonetaryBenefit object) {
				return createPCNMonetaryBenefitAdapter();
			}
			@Override
			public Adapter casePCNMonetaryCost(PCNMonetaryCost object) {
				return createPCNMonetaryCostAdapter();
			}
			@Override
			public Adapter casePCNNonMonetaryTag(PCNNonMonetaryTag object) {
				return createPCNNonMonetaryTagAdapter();
			}
			@Override
			public Adapter casePCNNonMonetaryBenefit(PCNNonMonetaryBenefit object) {
				return createPCNNonMonetaryBenefitAdapter();
			}
			@Override
			public Adapter casePCNNonMonetaryCost(PCNNonMonetaryCost object) {
				return createPCNNonMonetaryCostAdapter();
			}
			@Override
			public Adapter casePCNInnovationStep(PCNInnovationStep object) {
				return createPCNInnovationStepAdapter();
			}
			@Override
			public Adapter casePCNOutsourcedStep(PCNOutsourcedStep object) {
				return createPCNOutsourcedStepAdapter();
			}
			@Override
			public Adapter casePCNRegularProcessStep(PCNRegularProcessStep object) {
				return createPCNRegularProcessStepAdapter();
			}
			@Override
			public Adapter casePCNTextualTag(PCNTextualTag object) {
				return createPCNTextualTagAdapter();
			}
			@Override
			public Adapter casePCNDelayTimeTag(PCNDelayTimeTag object) {
				return createPCNDelayTimeTagAdapter();
			}
			@Override
			public Adapter casePCNProbabilitiesTag(PCNProbabilitiesTag object) {
				return createPCNProbabilitiesTagAdapter();
			}
			@Override
			public Adapter casePCNSyncTag(PCNSyncTag object) {
				return createPCNSyncTagAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNDiagram <em>PCN Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNDiagram
	 * @generated
	 */
	public Adapter createPCNDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNProcessEntity <em>PCN Process Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNProcessEntity
	 * @generated
	 */
	public Adapter createPCNProcessEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNProcessStep <em>PCN Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNProcessStep
	 * @generated
	 */
	public Adapter createPCNProcessStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNProcessStepWithTags <em>PCN Process Step With Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNProcessStepWithTags
	 * @generated
	 */
	public Adapter createPCNProcessStepWithTagsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNReference <em>PCN Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNReference
	 * @generated
	 */
	public Adapter createPCNReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNStandardStep <em>PCN Standard Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNStandardStep
	 * @generated
	 */
	public Adapter createPCNStandardStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNDoAndWaitStep <em>PCN Do And Wait Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNDoAndWaitStep
	 * @generated
	 */
	public Adapter createPCNDoAndWaitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNWaitStep <em>PCN Wait Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNWaitStep
	 * @generated
	 */
	public Adapter createPCNWaitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNDecisionStep <em>PCN Decision Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNDecisionStep
	 * @generated
	 */
	public Adapter createPCNDecisionStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNTag <em>PCN Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNTag
	 * @generated
	 */
	public Adapter createPCNTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNMonetaryTag <em>PCN Monetary Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNMonetaryTag
	 * @generated
	 */
	public Adapter createPCNMonetaryTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNMonetaryBenefit <em>PCN Monetary Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNMonetaryBenefit
	 * @generated
	 */
	public Adapter createPCNMonetaryBenefitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNMonetaryCost <em>PCN Monetary Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNMonetaryCost
	 * @generated
	 */
	public Adapter createPCNMonetaryCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNNonMonetaryTag <em>PCN Non Monetary Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNNonMonetaryTag
	 * @generated
	 */
	public Adapter createPCNNonMonetaryTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNNonMonetaryBenefit <em>PCN Non Monetary Benefit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNNonMonetaryBenefit
	 * @generated
	 */
	public Adapter createPCNNonMonetaryBenefitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNNonMonetaryCost <em>PCN Non Monetary Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNNonMonetaryCost
	 * @generated
	 */
	public Adapter createPCNNonMonetaryCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNInnovationStep <em>PCN Innovation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNInnovationStep
	 * @generated
	 */
	public Adapter createPCNInnovationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNOutsourcedStep <em>PCN Outsourced Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNOutsourcedStep
	 * @generated
	 */
	public Adapter createPCNOutsourcedStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNRegularProcessStep <em>PCN Regular Process Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNRegularProcessStep
	 * @generated
	 */
	public Adapter createPCNRegularProcessStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNTextualTag <em>PCN Textual Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNTextualTag
	 * @generated
	 */
	public Adapter createPCNTextualTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNDelayTimeTag <em>PCN Delay Time Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNDelayTimeTag
	 * @generated
	 */
	public Adapter createPCNDelayTimeTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNProbabilitiesTag <em>PCN Probabilities Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNProbabilitiesTag
	 * @generated
	 */
	public Adapter createPCNProbabilitiesTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcn.PCNSyncTag <em>PCN Sync Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcn.PCNSyncTag
	 * @generated
	 */
	public Adapter createPCNSyncTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PcnAdapterFactory
