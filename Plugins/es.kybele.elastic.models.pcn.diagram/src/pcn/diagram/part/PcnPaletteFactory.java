
package pcn.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PcnPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createPCNEntities1Group());
		paletteRoot.add(createPCNSteps2Group());
		paletteRoot.add(createPCNDependencies3Group());
		paletteRoot.add(createPCNTags4Group());
	}

	/**
	* Creates "PCN Entities" palette tool group
	* @generated
	*/
	private PaletteContainer createPCNEntities1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.PCNEntities1Group_title);
		paletteContainer.setId("createPCNEntities1Group"); //$NON-NLS-1$
		paletteContainer.add(createPCNEntity1CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "PCN Steps" palette tool group
	* @generated
	*/
	private PaletteContainer createPCNSteps2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.PCNSteps2Group_title);
		paletteContainer.setId("createPCNSteps2Group"); //$NON-NLS-1$
		paletteContainer.add(createDecisionStep1CreationTool());
		paletteContainer.add(createDoandWaitStep2CreationTool());
		paletteContainer.add(createInnovationStep3CreationTool());
		paletteContainer.add(createOutsourcedStep4CreationTool());
		paletteContainer.add(createReference5CreationTool());
		paletteContainer.add(createRegularStep6CreationTool());
		paletteContainer.add(createWaitStep7CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "PCN Dependencies" palette tool group
	* @generated
	*/
	private PaletteContainer createPCNDependencies3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.PCNDependencies3Group_title);
		paletteContainer.setId("createPCNDependencies3Group"); //$NON-NLS-1$
		paletteContainer.add(createDelayDependency1CreationTool());
		paletteContainer.add(createNegativeDecision2CreationTool());
		paletteContainer.add(createPositiveDecision3CreationTool());
		paletteContainer.add(createRegularDependency4CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "PCN Tags" palette tool group
	* @generated
	*/
	private PaletteContainer createPCNTags4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.PCNTags4Group_title);
		paletteContainer.setId("createPCNTags4Group"); //$NON-NLS-1$
		paletteContainer.add(createMonetaryBenefit1CreationTool());
		paletteContainer.add(createMonetaryCost2CreationTool());
		paletteContainer.add(createNonMonetaryBenefit3CreationTool());
		paletteContainer.add(createNonMonetaryCost4CreationTool());
		paletteContainer.add(createTextualTag5CreationTool());
		paletteContainer.add(createDelayTimeTag6CreationTool());
		paletteContainer.add(createProbabilitiesTag7CreationTool());
		paletteContainer.add(createSynchronizationTag8CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createPCNEntity1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.PCNEntity1CreationTool_title,
				Messages.PCNEntity1CreationTool_desc, Collections.singletonList(PcnElementTypes.PCNProcessEntity_2001));
		entry.setId("createPCNEntity1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/01_PCN_Entity.png")); //$NON-NLS-1$
		entry.setLargeIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/01_PCN_Entity.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDecisionStep1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(PcnElementTypes.PCNDecisionStep_3036);
		types.add(PcnElementTypes.PCNDecisionStep_3037);
		types.add(PcnElementTypes.PCNDecisionStep_3038);
		types.add(PcnElementTypes.PCNDecisionStep_3039);
		types.add(PcnElementTypes.PCNDecisionStep_3040);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DecisionStep1CreationTool_title,
				Messages.DecisionStep1CreationTool_desc, types);
		entry.setId("createDecisionStep1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/07_PCN_DecisionStep.png")); //$NON-NLS-1$
		entry.setLargeIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/07_PCN_DecisionStep.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDoandWaitStep2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(PcnElementTypes.PCNDoAndWaitStep_3016);
		types.add(PcnElementTypes.PCNDoAndWaitStep_3017);
		types.add(PcnElementTypes.PCNDoAndWaitStep_3018);
		types.add(PcnElementTypes.PCNDoAndWaitStep_3019);
		types.add(PcnElementTypes.PCNDoAndWaitStep_3020);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DoandWaitStep2CreationTool_title,
				Messages.DoandWaitStep2CreationTool_desc, types);
		entry.setId("createDoandWaitStep2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/03_PCN_DoAndWaitStep.png")); //$NON-NLS-1$
		entry.setLargeIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/03_PCN_DoAndWaitStep.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInnovationStep3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(PcnElementTypes.PCNInnovationStep_3026);
		types.add(PcnElementTypes.PCNInnovationStep_3027);
		types.add(PcnElementTypes.PCNInnovationStep_3028);
		types.add(PcnElementTypes.PCNInnovationStep_3029);
		types.add(PcnElementTypes.PCNInnovationStep_3030);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InnovationStep3CreationTool_title,
				Messages.InnovationStep3CreationTool_desc, types);
		entry.setId("createInnovationStep3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/05_PCN_InnovationStep.png")); //$NON-NLS-1$
		entry.setLargeIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/05_PCN_InnovationStep.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOutsourcedStep4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(PcnElementTypes.PCNOutsourcedStep_3031);
		types.add(PcnElementTypes.PCNOutsourcedStep_3032);
		types.add(PcnElementTypes.PCNOutsourcedStep_3033);
		types.add(PcnElementTypes.PCNOutsourcedStep_3034);
		types.add(PcnElementTypes.PCNOutsourcedStep_3035);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.OutsourcedStep4CreationTool_title,
				Messages.OutsourcedStep4CreationTool_desc, types);
		entry.setId("createOutsourcedStep4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/06_PCN_OutsourcedStep.png")); //$NON-NLS-1$
		entry.setLargeIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/06_PCN_OutsourcedStep.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createReference5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(PcnElementTypes.PCNReference_3041);
		types.add(PcnElementTypes.PCNReference_3042);
		types.add(PcnElementTypes.PCNReference_3043);
		types.add(PcnElementTypes.PCNReference_3044);
		types.add(PcnElementTypes.PCNReference_3045);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Reference5CreationTool_title,
				Messages.Reference5CreationTool_desc, types);
		entry.setId("createReference5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/08_PCN_Reference.png")); //$NON-NLS-1$
		entry.setLargeIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/08_PCN_Reference.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRegularStep6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(PcnElementTypes.PCNStandardStep_3011);
		types.add(PcnElementTypes.PCNStandardStep_3012);
		types.add(PcnElementTypes.PCNStandardStep_3013);
		types.add(PcnElementTypes.PCNStandardStep_3014);
		types.add(PcnElementTypes.PCNStandardStep_3015);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.RegularStep6CreationTool_title,
				Messages.RegularStep6CreationTool_desc, types);
		entry.setId("createRegularStep6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/02_PCN_RegularStep.png")); //$NON-NLS-1$
		entry.setLargeIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/02_PCN_RegularStep.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWaitStep7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(PcnElementTypes.PCNWaitStep_3021);
		types.add(PcnElementTypes.PCNWaitStep_3022);
		types.add(PcnElementTypes.PCNWaitStep_3023);
		types.add(PcnElementTypes.PCNWaitStep_3024);
		types.add(PcnElementTypes.PCNWaitStep_3025);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.WaitStep7CreationTool_title,
				Messages.WaitStep7CreationTool_desc, types);
		entry.setId("createWaitStep7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/04_PCN_WaitStep.png")); //$NON-NLS-1$
		entry.setLargeIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/04_PCN_WaitStep.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDelayDependency1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.DelayDependency1CreationTool_title,
				Messages.DelayDependency1CreationTool_desc,
				Collections.singletonList(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009));
		entry.setId("createDelayDependency1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PcnDiagramEditorPlugin.findImageDescriptor(
				"/es.kybele.elastic.models.pcn.edit/icons/full/obj16/10_PCN_DelayedDependency.png")); //$NON-NLS-1$
		entry.setLargeIcon(PcnDiagramEditorPlugin.findImageDescriptor(
				"/es.kybele.elastic.models.pcn.edit/icons/full/obj16/10_PCN_DelayedDependency.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNegativeDecision2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.NegativeDecision2CreationTool_title,
				Messages.NegativeDecision2CreationTool_desc,
				Collections.singletonList(PcnElementTypes.PCNDecisionStepPCNNegativeDecision_4007));
		entry.setId("createNegativeDecision2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PcnDiagramEditorPlugin.findImageDescriptor(
				"/es.kybele.elastic.models.pcn.edit/icons/full/obj16/16_PCN_NegativeDecision.png")); //$NON-NLS-1$
		entry.setLargeIcon(PcnDiagramEditorPlugin.findImageDescriptor(
				"/es.kybele.elastic.models.pcn.edit/icons/full/obj16/16_PCN_NegativeDecision.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPositiveDecision3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.PositiveDecision3CreationTool_title,
				Messages.PositiveDecision3CreationTool_desc,
				Collections.singletonList(PcnElementTypes.PCNDecisionStepPCNPositiveDecision_4006));
		entry.setId("createPositiveDecision3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PcnDiagramEditorPlugin.findImageDescriptor(
				"/es.kybele.elastic.models.pcn.edit/icons/full/obj16/15_PCN_PositiveDecision.png")); //$NON-NLS-1$
		entry.setLargeIcon(PcnDiagramEditorPlugin.findImageDescriptor(
				"/es.kybele.elastic.models.pcn.edit/icons/full/obj16/15_PCN_PositiveDecision.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRegularDependency4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.RegularDependency4CreationTool_title,
				Messages.RegularDependency4CreationTool_desc,
				Collections.singletonList(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008));
		entry.setId("createRegularDependency4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PcnDiagramEditorPlugin.findImageDescriptor(
				"/es.kybele.elastic.models.pcn.edit/icons/full/obj16/09_PCN_StandardDependency.png")); //$NON-NLS-1$
		entry.setLargeIcon(PcnDiagramEditorPlugin.findImageDescriptor(
				"/es.kybele.elastic.models.pcn.edit/icons/full/obj16/09_PCN_StandardDependency.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMonetaryBenefit1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(30);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3048);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3052);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3056);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3060);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3064);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3068);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3072);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3076);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3080);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3084);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3088);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3092);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3096);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3100);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3104);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3108);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3112);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3116);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3120);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3124);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3128);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3132);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3136);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3140);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3144);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3148);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3152);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3156);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3160);
		types.add(PcnElementTypes.PCNMonetaryBenefit_3164);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MonetaryBenefit1CreationTool_title,
				Messages.MonetaryBenefit1CreationTool_desc, types);
		entry.setId("createMonetaryBenefit1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/13_PCN_MonetaryBenefit.png")); //$NON-NLS-1$
		entry.setLargeIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/13_PCN_MonetaryBenefit.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMonetaryCost2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(30);
		types.add(PcnElementTypes.PCNMonetaryCost_3049);
		types.add(PcnElementTypes.PCNMonetaryCost_3053);
		types.add(PcnElementTypes.PCNMonetaryCost_3057);
		types.add(PcnElementTypes.PCNMonetaryCost_3061);
		types.add(PcnElementTypes.PCNMonetaryCost_3065);
		types.add(PcnElementTypes.PCNMonetaryCost_3069);
		types.add(PcnElementTypes.PCNMonetaryCost_3073);
		types.add(PcnElementTypes.PCNMonetaryCost_3077);
		types.add(PcnElementTypes.PCNMonetaryCost_3081);
		types.add(PcnElementTypes.PCNMonetaryCost_3085);
		types.add(PcnElementTypes.PCNMonetaryCost_3089);
		types.add(PcnElementTypes.PCNMonetaryCost_3093);
		types.add(PcnElementTypes.PCNMonetaryCost_3097);
		types.add(PcnElementTypes.PCNMonetaryCost_3101);
		types.add(PcnElementTypes.PCNMonetaryCost_3105);
		types.add(PcnElementTypes.PCNMonetaryCost_3109);
		types.add(PcnElementTypes.PCNMonetaryCost_3113);
		types.add(PcnElementTypes.PCNMonetaryCost_3117);
		types.add(PcnElementTypes.PCNMonetaryCost_3121);
		types.add(PcnElementTypes.PCNMonetaryCost_3125);
		types.add(PcnElementTypes.PCNMonetaryCost_3129);
		types.add(PcnElementTypes.PCNMonetaryCost_3133);
		types.add(PcnElementTypes.PCNMonetaryCost_3137);
		types.add(PcnElementTypes.PCNMonetaryCost_3141);
		types.add(PcnElementTypes.PCNMonetaryCost_3145);
		types.add(PcnElementTypes.PCNMonetaryCost_3149);
		types.add(PcnElementTypes.PCNMonetaryCost_3153);
		types.add(PcnElementTypes.PCNMonetaryCost_3157);
		types.add(PcnElementTypes.PCNMonetaryCost_3161);
		types.add(PcnElementTypes.PCNMonetaryCost_3165);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.MonetaryCost2CreationTool_title,
				Messages.MonetaryCost2CreationTool_desc, types);
		entry.setId("createMonetaryCost2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/14_PCN_MonetaryCost.png")); //$NON-NLS-1$
		entry.setLargeIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/14_PCN_MonetaryCost.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNonMonetaryBenefit3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(30);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3050);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3054);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3058);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3062);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3066);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3070);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3074);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3078);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3082);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3086);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3090);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3094);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3098);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3102);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3106);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3110);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3114);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3118);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3122);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3126);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3130);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3134);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3138);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3142);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3146);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3150);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3154);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3158);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3162);
		types.add(PcnElementTypes.PCNNonMonetaryBenefit_3166);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.NonMonetaryBenefit3CreationTool_title,
				Messages.NonMonetaryBenefit3CreationTool_desc, types);
		entry.setId("createNonMonetaryBenefit3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PcnDiagramEditorPlugin.findImageDescriptor(
				"/es.kybele.elastic.models.pcn.edit/icons/full/obj16/11_PCN_NonMonetaryBenefit.png")); //$NON-NLS-1$
		entry.setLargeIcon(PcnDiagramEditorPlugin.findImageDescriptor(
				"/es.kybele.elastic.models.pcn.edit/icons/full/obj16/11_PCN_NonMonetaryBenefit.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNonMonetaryCost4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(30);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3051);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3055);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3059);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3063);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3067);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3071);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3075);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3079);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3083);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3087);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3091);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3095);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3099);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3103);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3107);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3111);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3115);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3119);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3123);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3127);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3131);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3135);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3139);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3143);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3147);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3151);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3155);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3159);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3163);
		types.add(PcnElementTypes.PCNNonMonetaryCost_3167);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.NonMonetaryCost4CreationTool_title,
				Messages.NonMonetaryCost4CreationTool_desc, types);
		entry.setId("createNonMonetaryCost4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/12_PCN_NonMonetaryCost.png")); //$NON-NLS-1$
		entry.setLargeIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/12_PCN_NonMonetaryCost.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTextualTag5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(30);
		types.add(PcnElementTypes.PCNTextualTag_3168);
		types.add(PcnElementTypes.PCNTextualTag_3169);
		types.add(PcnElementTypes.PCNTextualTag_3170);
		types.add(PcnElementTypes.PCNTextualTag_3171);
		types.add(PcnElementTypes.PCNTextualTag_3172);
		types.add(PcnElementTypes.PCNTextualTag_3173);
		types.add(PcnElementTypes.PCNTextualTag_3174);
		types.add(PcnElementTypes.PCNTextualTag_3175);
		types.add(PcnElementTypes.PCNTextualTag_3176);
		types.add(PcnElementTypes.PCNTextualTag_3177);
		types.add(PcnElementTypes.PCNTextualTag_3178);
		types.add(PcnElementTypes.PCNTextualTag_3179);
		types.add(PcnElementTypes.PCNTextualTag_3180);
		types.add(PcnElementTypes.PCNTextualTag_3181);
		types.add(PcnElementTypes.PCNTextualTag_3182);
		types.add(PcnElementTypes.PCNTextualTag_3183);
		types.add(PcnElementTypes.PCNTextualTag_3184);
		types.add(PcnElementTypes.PCNTextualTag_3185);
		types.add(PcnElementTypes.PCNTextualTag_3186);
		types.add(PcnElementTypes.PCNTextualTag_3187);
		types.add(PcnElementTypes.PCNTextualTag_3188);
		types.add(PcnElementTypes.PCNTextualTag_3189);
		types.add(PcnElementTypes.PCNTextualTag_3190);
		types.add(PcnElementTypes.PCNTextualTag_3191);
		types.add(PcnElementTypes.PCNTextualTag_3192);
		types.add(PcnElementTypes.PCNTextualTag_3193);
		types.add(PcnElementTypes.PCNTextualTag_3194);
		types.add(PcnElementTypes.PCNTextualTag_3195);
		types.add(PcnElementTypes.PCNTextualTag_3196);
		types.add(PcnElementTypes.PCNTextualTag_3197);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TextualTag5CreationTool_title,
				Messages.TextualTag5CreationTool_desc, types);
		entry.setId("createTextualTag5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/17_PCN_TextualTag.png")); //$NON-NLS-1$
		entry.setLargeIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/17_PCN_TextualTag.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDelayTimeTag6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(10);
		types.add(PcnElementTypes.PCNDelayTimeTag_3198);
		types.add(PcnElementTypes.PCNDelayTimeTag_3199);
		types.add(PcnElementTypes.PCNDelayTimeTag_3200);
		types.add(PcnElementTypes.PCNDelayTimeTag_3201);
		types.add(PcnElementTypes.PCNDelayTimeTag_3202);
		types.add(PcnElementTypes.PCNDelayTimeTag_3203);
		types.add(PcnElementTypes.PCNDelayTimeTag_3204);
		types.add(PcnElementTypes.PCNDelayTimeTag_3205);
		types.add(PcnElementTypes.PCNDelayTimeTag_3206);
		types.add(PcnElementTypes.PCNDelayTimeTag_3207);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.DelayTimeTag6CreationTool_title,
				Messages.DelayTimeTag6CreationTool_desc, types);
		entry.setId("createDelayTimeTag6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/18_PCN_DelayTimeTag.png")); //$NON-NLS-1$
		entry.setLargeIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/18_PCN_DelayTimeTag.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProbabilitiesTag7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(PcnElementTypes.PCNProbabilitiesTag_3208);
		types.add(PcnElementTypes.PCNProbabilitiesTag_3209);
		types.add(PcnElementTypes.PCNProbabilitiesTag_3210);
		types.add(PcnElementTypes.PCNProbabilitiesTag_3211);
		types.add(PcnElementTypes.PCNProbabilitiesTag_3212);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ProbabilitiesTag7CreationTool_title,
				Messages.ProbabilitiesTag7CreationTool_desc, types);
		entry.setId("createProbabilitiesTag7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PcnDiagramEditorPlugin.findImageDescriptor(
				"/es.kybele.elastic.models.pcn.edit/icons/full/obj16/19_PCN_ProbabilitiesTag.png")); //$NON-NLS-1$
		entry.setLargeIcon(PcnDiagramEditorPlugin.findImageDescriptor(
				"/es.kybele.elastic.models.pcn.edit/icons/full/obj16/19_PCN_ProbabilitiesTag.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSynchronizationTag8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(30);
		types.add(PcnElementTypes.PCNSyncTag_3213);
		types.add(PcnElementTypes.PCNSyncTag_3214);
		types.add(PcnElementTypes.PCNSyncTag_3215);
		types.add(PcnElementTypes.PCNSyncTag_3216);
		types.add(PcnElementTypes.PCNSyncTag_3217);
		types.add(PcnElementTypes.PCNSyncTag_3218);
		types.add(PcnElementTypes.PCNSyncTag_3219);
		types.add(PcnElementTypes.PCNSyncTag_3220);
		types.add(PcnElementTypes.PCNSyncTag_3221);
		types.add(PcnElementTypes.PCNSyncTag_3222);
		types.add(PcnElementTypes.PCNSyncTag_3223);
		types.add(PcnElementTypes.PCNSyncTag_3224);
		types.add(PcnElementTypes.PCNSyncTag_3225);
		types.add(PcnElementTypes.PCNSyncTag_3226);
		types.add(PcnElementTypes.PCNSyncTag_3227);
		types.add(PcnElementTypes.PCNSyncTag_3228);
		types.add(PcnElementTypes.PCNSyncTag_3229);
		types.add(PcnElementTypes.PCNSyncTag_3230);
		types.add(PcnElementTypes.PCNSyncTag_3231);
		types.add(PcnElementTypes.PCNSyncTag_3232);
		types.add(PcnElementTypes.PCNSyncTag_3233);
		types.add(PcnElementTypes.PCNSyncTag_3234);
		types.add(PcnElementTypes.PCNSyncTag_3235);
		types.add(PcnElementTypes.PCNSyncTag_3236);
		types.add(PcnElementTypes.PCNSyncTag_3237);
		types.add(PcnElementTypes.PCNSyncTag_3238);
		types.add(PcnElementTypes.PCNSyncTag_3239);
		types.add(PcnElementTypes.PCNSyncTag_3240);
		types.add(PcnElementTypes.PCNSyncTag_3241);
		types.add(PcnElementTypes.PCNSyncTag_3242);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.SynchronizationTag8CreationTool_title,
				Messages.SynchronizationTag8CreationTool_desc, types);
		entry.setId("createSynchronizationTag8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/20_PCN_SyncTag.png")); //$NON-NLS-1$
		entry.setLargeIcon(PcnDiagramEditorPlugin
				.findImageDescriptor("/es.kybele.elastic.models.pcn.edit/icons/full/obj16/20_PCN_SyncTag.png")); //$NON-NLS-1$
		return entry;
	}

}
