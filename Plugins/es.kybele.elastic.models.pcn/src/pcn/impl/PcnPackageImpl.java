/**
 */
package pcn.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pcn.PCNDecisionStep;
import pcn.PCNDelayTimeTag;
import pcn.PCNDiagram;
import pcn.PCNInnovationStep;
import pcn.PCNDoAndWaitStep;
import pcn.PCNMonetaryBenefit;
import pcn.PCNMonetaryCost;
import pcn.PCNMonetaryTag;
import pcn.PCNNonMonetaryBenefit;
import pcn.PCNNonMonetaryCost;
import pcn.PCNNonMonetaryTag;
import pcn.PCNOutsourcedStep;
import pcn.PCNProbabilitiesTag;
import pcn.PCNProcessEntity;
import pcn.PCNProcessStep;
import pcn.PCNProcessStepWithTags;
import pcn.PCNReference;
import pcn.PCNRegularProcessStep;
import pcn.PCNStandardStep;
import pcn.PCNSyncTag;
import pcn.PCNTag;
import pcn.PCNTextualTag;
import pcn.PCNWaitStep;
import pcn.PcnFactory;
import pcn.PcnPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PcnPackageImpl extends EPackageImpl implements PcnPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnProcessEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnProcessStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnProcessStepWithTagsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnStandardStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnDoAndWaitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnWaitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnDecisionStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnMonetaryTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnMonetaryBenefitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnMonetaryCostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnNonMonetaryTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnNonMonetaryBenefitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnNonMonetaryCostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnInnovationStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnOutsourcedStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnRegularProcessStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnTextualTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnDelayTimeTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnProbabilitiesTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcnSyncTagEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pcn.PcnPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PcnPackageImpl() {
		super(eNS_URI, PcnFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PcnPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PcnPackage init() {
		if (isInited) return (PcnPackage)EPackage.Registry.INSTANCE.getEPackage(PcnPackage.eNS_URI);

		// Obtain or create and register package
		PcnPackageImpl thePcnPackage = (PcnPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PcnPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PcnPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePcnPackage.createPackageContents();

		// Initialize created meta-data
		thePcnPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePcnPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PcnPackage.eNS_URI, thePcnPackage);
		return thePcnPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNDiagram() {
		return pcnDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNDiagram_DiagramEntities() {
		return (EReference)pcnDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNProcessEntity() {
		return pcnProcessEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCNProcessEntity_Name() {
		return (EAttribute)pcnProcessEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCNProcessEntity_Order() {
		return (EAttribute)pcnProcessEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessEntity_BackEntity() {
		return (EReference)pcnProcessEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessEntity_NextEntity() {
		return (EReference)pcnProcessEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessEntity_LeftDirectInteractions() {
		return (EReference)pcnProcessEntityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessEntity_LeftSurrogateInteractions() {
		return (EReference)pcnProcessEntityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessEntity_CenterIndependentInteractionsActivities() {
		return (EReference)pcnProcessEntityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessEntity_RightSurrogateInteractions() {
		return (EReference)pcnProcessEntityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessEntity_RightDirectInteractions() {
		return (EReference)pcnProcessEntityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPCNProcessEntity__GetDirectInteractions() {
		return pcnProcessEntityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPCNProcessEntity__GetSurrogateInteractions() {
		return pcnProcessEntityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPCNProcessEntity__GetIndependentInteractios() {
		return pcnProcessEntityEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNProcessStep() {
		return pcnProcessStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessStep_Tags() {
		return (EReference)pcnProcessStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessStep_PCNStandardDependencySource() {
		return (EReference)pcnProcessStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessStep_PCNDelayedDependencySource() {
		return (EReference)pcnProcessStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessStep_PCNPositiveDecisionSource() {
		return (EReference)pcnProcessStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessStep_PCNNegativeDecisionSource() {
		return (EReference)pcnProcessStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNProcessStepWithTags() {
		return pcnProcessStepWithTagsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessStepWithTags_NonMonetaryBenefits() {
		return (EReference)pcnProcessStepWithTagsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessStepWithTags_NonMonetaryCosts() {
		return (EReference)pcnProcessStepWithTagsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessStepWithTags_MonetaryBenefits() {
		return (EReference)pcnProcessStepWithTagsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessStepWithTags_MonetaryCosts() {
		return (EReference)pcnProcessStepWithTagsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCNProcessStepWithTags_Action() {
		return (EAttribute)pcnProcessStepWithTagsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessStepWithTags_TextualTags() {
		return (EReference)pcnProcessStepWithTagsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessStepWithTags_DelayTimeTags() {
		return (EReference)pcnProcessStepWithTagsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessStepWithTags_ProbabilitiesTags() {
		return (EReference)pcnProcessStepWithTagsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNProcessStepWithTags_SyncTags() {
		return (EReference)pcnProcessStepWithTagsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNReference() {
		return pcnReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCNReference_Letter() {
		return (EAttribute)pcnReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCNReference_Number() {
		return (EAttribute)pcnReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNStandardStep() {
		return pcnStandardStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNDoAndWaitStep() {
		return pcnDoAndWaitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNWaitStep() {
		return pcnWaitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNDecisionStep() {
		return pcnDecisionStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNDecisionStep_PCNPositiveDecision() {
		return (EReference)pcnDecisionStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNDecisionStep_PCNNegativeDecision() {
		return (EReference)pcnDecisionStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNTag() {
		return pcnTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNMonetaryTag() {
		return pcnMonetaryTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNMonetaryBenefit() {
		return pcnMonetaryBenefitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNMonetaryCost() {
		return pcnMonetaryCostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNNonMonetaryTag() {
		return pcnNonMonetaryTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNNonMonetaryBenefit() {
		return pcnNonMonetaryBenefitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNNonMonetaryCost() {
		return pcnNonMonetaryCostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNInnovationStep() {
		return pcnInnovationStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNOutsourcedStep() {
		return pcnOutsourcedStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNRegularProcessStep() {
		return pcnRegularProcessStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNRegularProcessStep_PCNStandardDependency() {
		return (EReference)pcnRegularProcessStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPCNRegularProcessStep_PCNDelayedDependency() {
		return (EReference)pcnRegularProcessStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNTextualTag() {
		return pcnTextualTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCNTextualTag_Tag() {
		return (EAttribute)pcnTextualTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNDelayTimeTag() {
		return pcnDelayTimeTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCNDelayTimeTag_DelayTime() {
		return (EAttribute)pcnDelayTimeTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNProbabilitiesTag() {
		return pcnProbabilitiesTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCNProbabilitiesTag_YesProbability() {
		return (EAttribute)pcnProbabilitiesTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPCNProbabilitiesTag_NoProbability() {
		return (EAttribute)pcnProbabilitiesTagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCNSyncTag() {
		return pcnSyncTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcnFactory getPcnFactory() {
		return (PcnFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pcnDiagramEClass = createEClass(PCN_DIAGRAM);
		createEReference(pcnDiagramEClass, PCN_DIAGRAM__DIAGRAM_ENTITIES);

		pcnProcessEntityEClass = createEClass(PCN_PROCESS_ENTITY);
		createEAttribute(pcnProcessEntityEClass, PCN_PROCESS_ENTITY__NAME);
		createEAttribute(pcnProcessEntityEClass, PCN_PROCESS_ENTITY__ORDER);
		createEReference(pcnProcessEntityEClass, PCN_PROCESS_ENTITY__BACK_ENTITY);
		createEReference(pcnProcessEntityEClass, PCN_PROCESS_ENTITY__NEXT_ENTITY);
		createEReference(pcnProcessEntityEClass, PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS);
		createEReference(pcnProcessEntityEClass, PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS);
		createEReference(pcnProcessEntityEClass, PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES);
		createEReference(pcnProcessEntityEClass, PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS);
		createEReference(pcnProcessEntityEClass, PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS);
		createEOperation(pcnProcessEntityEClass, PCN_PROCESS_ENTITY___GET_DIRECT_INTERACTIONS);
		createEOperation(pcnProcessEntityEClass, PCN_PROCESS_ENTITY___GET_SURROGATE_INTERACTIONS);
		createEOperation(pcnProcessEntityEClass, PCN_PROCESS_ENTITY___GET_INDEPENDENT_INTERACTIOS);

		pcnProcessStepEClass = createEClass(PCN_PROCESS_STEP);
		createEReference(pcnProcessStepEClass, PCN_PROCESS_STEP__TAGS);
		createEReference(pcnProcessStepEClass, PCN_PROCESS_STEP__PCN_STANDARD_DEPENDENCY_SOURCE);
		createEReference(pcnProcessStepEClass, PCN_PROCESS_STEP__PCN_DELAYED_DEPENDENCY_SOURCE);
		createEReference(pcnProcessStepEClass, PCN_PROCESS_STEP__PCN_POSITIVE_DECISION_SOURCE);
		createEReference(pcnProcessStepEClass, PCN_PROCESS_STEP__PCN_NEGATIVE_DECISION_SOURCE);

		pcnProcessStepWithTagsEClass = createEClass(PCN_PROCESS_STEP_WITH_TAGS);
		createEReference(pcnProcessStepWithTagsEClass, PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS);
		createEReference(pcnProcessStepWithTagsEClass, PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS);
		createEReference(pcnProcessStepWithTagsEClass, PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS);
		createEReference(pcnProcessStepWithTagsEClass, PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS);
		createEAttribute(pcnProcessStepWithTagsEClass, PCN_PROCESS_STEP_WITH_TAGS__ACTION);
		createEReference(pcnProcessStepWithTagsEClass, PCN_PROCESS_STEP_WITH_TAGS__TEXTUAL_TAGS);
		createEReference(pcnProcessStepWithTagsEClass, PCN_PROCESS_STEP_WITH_TAGS__DELAY_TIME_TAGS);
		createEReference(pcnProcessStepWithTagsEClass, PCN_PROCESS_STEP_WITH_TAGS__PROBABILITIES_TAGS);
		createEReference(pcnProcessStepWithTagsEClass, PCN_PROCESS_STEP_WITH_TAGS__SYNC_TAGS);

		pcnReferenceEClass = createEClass(PCN_REFERENCE);
		createEAttribute(pcnReferenceEClass, PCN_REFERENCE__LETTER);
		createEAttribute(pcnReferenceEClass, PCN_REFERENCE__NUMBER);

		pcnStandardStepEClass = createEClass(PCN_STANDARD_STEP);

		pcnDoAndWaitStepEClass = createEClass(PCN_DO_AND_WAIT_STEP);

		pcnWaitStepEClass = createEClass(PCN_WAIT_STEP);

		pcnDecisionStepEClass = createEClass(PCN_DECISION_STEP);
		createEReference(pcnDecisionStepEClass, PCN_DECISION_STEP__PCN_POSITIVE_DECISION);
		createEReference(pcnDecisionStepEClass, PCN_DECISION_STEP__PCN_NEGATIVE_DECISION);

		pcnTagEClass = createEClass(PCN_TAG);

		pcnMonetaryTagEClass = createEClass(PCN_MONETARY_TAG);

		pcnMonetaryBenefitEClass = createEClass(PCN_MONETARY_BENEFIT);

		pcnMonetaryCostEClass = createEClass(PCN_MONETARY_COST);

		pcnNonMonetaryTagEClass = createEClass(PCN_NON_MONETARY_TAG);

		pcnNonMonetaryBenefitEClass = createEClass(PCN_NON_MONETARY_BENEFIT);

		pcnNonMonetaryCostEClass = createEClass(PCN_NON_MONETARY_COST);

		pcnInnovationStepEClass = createEClass(PCN_INNOVATION_STEP);

		pcnOutsourcedStepEClass = createEClass(PCN_OUTSOURCED_STEP);

		pcnRegularProcessStepEClass = createEClass(PCN_REGULAR_PROCESS_STEP);
		createEReference(pcnRegularProcessStepEClass, PCN_REGULAR_PROCESS_STEP__PCN_STANDARD_DEPENDENCY);
		createEReference(pcnRegularProcessStepEClass, PCN_REGULAR_PROCESS_STEP__PCN_DELAYED_DEPENDENCY);

		pcnTextualTagEClass = createEClass(PCN_TEXTUAL_TAG);
		createEAttribute(pcnTextualTagEClass, PCN_TEXTUAL_TAG__TAG);

		pcnDelayTimeTagEClass = createEClass(PCN_DELAY_TIME_TAG);
		createEAttribute(pcnDelayTimeTagEClass, PCN_DELAY_TIME_TAG__DELAY_TIME);

		pcnProbabilitiesTagEClass = createEClass(PCN_PROBABILITIES_TAG);
		createEAttribute(pcnProbabilitiesTagEClass, PCN_PROBABILITIES_TAG__YES_PROBABILITY);
		createEAttribute(pcnProbabilitiesTagEClass, PCN_PROBABILITIES_TAG__NO_PROBABILITY);

		pcnSyncTagEClass = createEClass(PCN_SYNC_TAG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pcnProcessStepWithTagsEClass.getESuperTypes().add(this.getPCNProcessStep());
		pcnReferenceEClass.getESuperTypes().add(this.getPCNProcessStep());
		pcnStandardStepEClass.getESuperTypes().add(this.getPCNRegularProcessStep());
		pcnDoAndWaitStepEClass.getESuperTypes().add(this.getPCNRegularProcessStep());
		pcnWaitStepEClass.getESuperTypes().add(this.getPCNRegularProcessStep());
		pcnDecisionStepEClass.getESuperTypes().add(this.getPCNProcessStepWithTags());
		pcnMonetaryTagEClass.getESuperTypes().add(this.getPCNTag());
		pcnMonetaryBenefitEClass.getESuperTypes().add(this.getPCNMonetaryTag());
		pcnMonetaryCostEClass.getESuperTypes().add(this.getPCNMonetaryTag());
		pcnNonMonetaryTagEClass.getESuperTypes().add(this.getPCNTag());
		pcnNonMonetaryBenefitEClass.getESuperTypes().add(this.getPCNNonMonetaryTag());
		pcnNonMonetaryCostEClass.getESuperTypes().add(this.getPCNNonMonetaryTag());
		pcnInnovationStepEClass.getESuperTypes().add(this.getPCNRegularProcessStep());
		pcnOutsourcedStepEClass.getESuperTypes().add(this.getPCNRegularProcessStep());
		pcnRegularProcessStepEClass.getESuperTypes().add(this.getPCNProcessStepWithTags());
		pcnTextualTagEClass.getESuperTypes().add(this.getPCNTag());
		pcnDelayTimeTagEClass.getESuperTypes().add(this.getPCNTag());
		pcnProbabilitiesTagEClass.getESuperTypes().add(this.getPCNTag());

		// Initialize classes, features, and operations; add parameters
		initEClass(pcnDiagramEClass, PCNDiagram.class, "PCNDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCNDiagram_DiagramEntities(), this.getPCNProcessEntity(), null, "diagramEntities", null, 0, -1, PCNDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcnProcessEntityEClass, PCNProcessEntity.class, "PCNProcessEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPCNProcessEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, PCNProcessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPCNProcessEntity_Order(), ecorePackage.getEInt(), "order", null, 0, 1, PCNProcessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessEntity_BackEntity(), this.getPCNProcessEntity(), this.getPCNProcessEntity_NextEntity(), "backEntity", null, 0, 1, PCNProcessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessEntity_NextEntity(), this.getPCNProcessEntity(), this.getPCNProcessEntity_BackEntity(), "nextEntity", null, 0, 1, PCNProcessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessEntity_LeftDirectInteractions(), this.getPCNProcessStep(), null, "leftDirectInteractions", null, 0, -1, PCNProcessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessEntity_LeftSurrogateInteractions(), this.getPCNProcessStep(), null, "leftSurrogateInteractions", null, 0, -1, PCNProcessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessEntity_CenterIndependentInteractionsActivities(), this.getPCNProcessStep(), null, "centerIndependentInteractionsActivities", null, 0, -1, PCNProcessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessEntity_RightSurrogateInteractions(), this.getPCNProcessStep(), null, "rightSurrogateInteractions", null, 0, -1, PCNProcessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessEntity_RightDirectInteractions(), this.getPCNProcessStep(), null, "rightDirectInteractions", null, 0, -1, PCNProcessEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPCNProcessEntity__GetDirectInteractions(), null, "getDirectInteractions", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getPCNProcessEntity__GetSurrogateInteractions(), null, "getSurrogateInteractions", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getPCNProcessEntity__GetIndependentInteractios(), null, "getIndependentInteractios", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEEList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(pcnProcessStepEClass, PCNProcessStep.class, "PCNProcessStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCNProcessStep_Tags(), this.getPCNTag(), null, "tags", null, 0, -1, PCNProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessStep_PCNStandardDependencySource(), this.getPCNRegularProcessStep(), this.getPCNRegularProcessStep_PCNStandardDependency(), "PCNStandardDependencySource", null, 0, -1, PCNProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessStep_PCNDelayedDependencySource(), this.getPCNRegularProcessStep(), this.getPCNRegularProcessStep_PCNDelayedDependency(), "PCNDelayedDependencySource", null, 0, -1, PCNProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessStep_PCNPositiveDecisionSource(), this.getPCNDecisionStep(), this.getPCNDecisionStep_PCNPositiveDecision(), "PCNPositiveDecisionSource", null, 0, -1, PCNProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessStep_PCNNegativeDecisionSource(), this.getPCNDecisionStep(), this.getPCNDecisionStep_PCNNegativeDecision(), "PCNNegativeDecisionSource", null, 0, -1, PCNProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcnProcessStepWithTagsEClass, PCNProcessStepWithTags.class, "PCNProcessStepWithTags", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCNProcessStepWithTags_NonMonetaryBenefits(), this.getPCNNonMonetaryBenefit(), null, "nonMonetaryBenefits", null, 0, -1, PCNProcessStepWithTags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessStepWithTags_NonMonetaryCosts(), this.getPCNNonMonetaryCost(), null, "nonMonetaryCosts", null, 0, -1, PCNProcessStepWithTags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessStepWithTags_MonetaryBenefits(), this.getPCNMonetaryBenefit(), null, "monetaryBenefits", null, 0, -1, PCNProcessStepWithTags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessStepWithTags_MonetaryCosts(), this.getPCNMonetaryCost(), null, "monetaryCosts", null, 0, -1, PCNProcessStepWithTags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPCNProcessStepWithTags_Action(), ecorePackage.getEString(), "action", null, 0, 1, PCNProcessStepWithTags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessStepWithTags_TextualTags(), this.getPCNTextualTag(), null, "textualTags", null, 0, -1, PCNProcessStepWithTags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessStepWithTags_DelayTimeTags(), this.getPCNDelayTimeTag(), null, "delayTimeTags", null, 0, 1, PCNProcessStepWithTags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessStepWithTags_ProbabilitiesTags(), this.getPCNProbabilitiesTag(), null, "probabilitiesTags", null, 0, 1, PCNProcessStepWithTags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNProcessStepWithTags_SyncTags(), this.getPCNSyncTag(), null, "syncTags", null, 0, 1, PCNProcessStepWithTags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcnReferenceEClass, PCNReference.class, "PCNReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPCNReference_Letter(), ecorePackage.getEString(), "letter", null, 0, 1, PCNReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPCNReference_Number(), ecorePackage.getEString(), "number", null, 0, 1, PCNReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcnStandardStepEClass, PCNStandardStep.class, "PCNStandardStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnDoAndWaitStepEClass, PCNDoAndWaitStep.class, "PCNDoAndWaitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnWaitStepEClass, PCNWaitStep.class, "PCNWaitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnDecisionStepEClass, PCNDecisionStep.class, "PCNDecisionStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCNDecisionStep_PCNPositiveDecision(), this.getPCNProcessStep(), this.getPCNProcessStep_PCNPositiveDecisionSource(), "PCNPositiveDecision", null, 0, 1, PCNDecisionStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNDecisionStep_PCNNegativeDecision(), this.getPCNProcessStep(), this.getPCNProcessStep_PCNNegativeDecisionSource(), "PCNNegativeDecision", null, 0, 1, PCNDecisionStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcnTagEClass, PCNTag.class, "PCNTag", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnMonetaryTagEClass, PCNMonetaryTag.class, "PCNMonetaryTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnMonetaryBenefitEClass, PCNMonetaryBenefit.class, "PCNMonetaryBenefit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnMonetaryCostEClass, PCNMonetaryCost.class, "PCNMonetaryCost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnNonMonetaryTagEClass, PCNNonMonetaryTag.class, "PCNNonMonetaryTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnNonMonetaryBenefitEClass, PCNNonMonetaryBenefit.class, "PCNNonMonetaryBenefit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnNonMonetaryCostEClass, PCNNonMonetaryCost.class, "PCNNonMonetaryCost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnInnovationStepEClass, PCNInnovationStep.class, "PCNInnovationStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnOutsourcedStepEClass, PCNOutsourcedStep.class, "PCNOutsourcedStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pcnRegularProcessStepEClass, PCNRegularProcessStep.class, "PCNRegularProcessStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPCNRegularProcessStep_PCNStandardDependency(), this.getPCNProcessStep(), this.getPCNProcessStep_PCNStandardDependencySource(), "PCNStandardDependency", null, 0, -1, PCNRegularProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPCNRegularProcessStep_PCNDelayedDependency(), this.getPCNProcessStep(), this.getPCNProcessStep_PCNDelayedDependencySource(), "PCNDelayedDependency", null, 0, -1, PCNRegularProcessStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcnTextualTagEClass, PCNTextualTag.class, "PCNTextualTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPCNTextualTag_Tag(), ecorePackage.getEString(), "tag", null, 0, 1, PCNTextualTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcnDelayTimeTagEClass, PCNDelayTimeTag.class, "PCNDelayTimeTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPCNDelayTimeTag_DelayTime(), ecorePackage.getEString(), "delayTime", null, 0, 1, PCNDelayTimeTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcnProbabilitiesTagEClass, PCNProbabilitiesTag.class, "PCNProbabilitiesTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPCNProbabilitiesTag_YesProbability(), ecorePackage.getEString(), "yesProbability", null, 0, 1, PCNProbabilitiesTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPCNProbabilitiesTag_NoProbability(), ecorePackage.getEString(), "noProbability", null, 0, 1, PCNProbabilitiesTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcnSyncTagEClass, PCNSyncTag.class, "PCNSyncTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (getPCNProcessEntity__GetDirectInteractions(), 
		   source, 
		   new String[] {
			 "body", "leftDirectInteractionsActivities->includesAll(rightDirectInteractionsActivities)"
		   });	
		addAnnotation
		  (getPCNProcessEntity__GetSurrogateInteractions(), 
		   source, 
		   new String[] {
			 "body", "leftSurrogateInteractionsActivities->includesAll(rightSurrogateInteractionsActivities)"
		   });	
		addAnnotation
		  (getPCNProcessEntity__GetIndependentInteractios(), 
		   source, 
		   new String[] {
			 "body", "independentInteractionsActivities"
		   });
	}

} //PcnPackageImpl
