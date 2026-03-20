package pcn.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import pcn.PcnPackage;
import pcn.diagram.edit.parts.*;
import pcn.diagram.edit.parts.PCNDecisionStep2EditPart;
import pcn.diagram.edit.parts.PCNDecisionStep3EditPart;
import pcn.diagram.edit.parts.PCNDecisionStep4EditPart;
import pcn.diagram.edit.parts.PCNDecisionStep5EditPart;
import pcn.diagram.edit.parts.PCNDecisionStepEditPart;

import pcn.diagram.edit.parts.PCNDiagramEditPart;

import pcn.diagram.edit.parts.PCNInnovationStep2EditPart;
import pcn.diagram.edit.parts.PCNInnovationStep3EditPart;
import pcn.diagram.edit.parts.PCNInnovationStep4EditPart;
import pcn.diagram.edit.parts.PCNInnovationStep5EditPart;
import pcn.diagram.edit.parts.PCNInnovationStepEditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStep2EditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStep3EditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStep4EditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStep5EditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStepEditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefit10EditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefit11EditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefit2EditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefit3EditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefit4EditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefit5EditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefit6EditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefit7EditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefit8EditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefit9EditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefitEditPart;
import pcn.diagram.edit.parts.PCNMonetaryCost10EditPart;
import pcn.diagram.edit.parts.PCNMonetaryCost11EditPart;
import pcn.diagram.edit.parts.PCNMonetaryCost2EditPart;
import pcn.diagram.edit.parts.PCNMonetaryCost3EditPart;
import pcn.diagram.edit.parts.PCNMonetaryCost4EditPart;
import pcn.diagram.edit.parts.PCNMonetaryCost5EditPart;
import pcn.diagram.edit.parts.PCNMonetaryCost6EditPart;
import pcn.diagram.edit.parts.PCNMonetaryCost7EditPart;
import pcn.diagram.edit.parts.PCNMonetaryCost8EditPart;
import pcn.diagram.edit.parts.PCNMonetaryCost9EditPart;
import pcn.diagram.edit.parts.PCNMonetaryCostEditPart;

import pcn.diagram.edit.parts.PCNNonMonetaryBenefit10EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryBenefit11EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryBenefit2EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryBenefit3EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryBenefit4EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryBenefit5EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryBenefit6EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryBenefit7EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryBenefit8EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryBenefit9EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryBenefitEditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCost10EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCost11EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCost2EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCost3EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCost4EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCost5EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCost6EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCost7EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCost8EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCost9EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCostEditPart;

import pcn.diagram.edit.parts.PCNOutsourcedStep2EditPart;
import pcn.diagram.edit.parts.PCNOutsourcedStep3EditPart;
import pcn.diagram.edit.parts.PCNOutsourcedStep4EditPart;
import pcn.diagram.edit.parts.PCNOutsourcedStep5EditPart;
import pcn.diagram.edit.parts.PCNOutsourcedStepEditPart;
import pcn.diagram.edit.parts.PCNProcessEntityEditPart;
import pcn.diagram.edit.parts.PCNReference2EditPart;
import pcn.diagram.edit.parts.PCNReference3EditPart;
import pcn.diagram.edit.parts.PCNReference4EditPart;
import pcn.diagram.edit.parts.PCNReference5EditPart;
import pcn.diagram.edit.parts.PCNReferenceEditPart;

import pcn.diagram.edit.parts.PCNStandardStep2EditPart;
import pcn.diagram.edit.parts.PCNStandardStep3EditPart;
import pcn.diagram.edit.parts.PCNStandardStep4EditPart;
import pcn.diagram.edit.parts.PCNStandardStep5EditPart;
import pcn.diagram.edit.parts.PCNStandardStepEditPart;

import pcn.diagram.edit.parts.PCNWaitStep2EditPart;
import pcn.diagram.edit.parts.PCNWaitStep3EditPart;
import pcn.diagram.edit.parts.PCNWaitStep4EditPart;
import pcn.diagram.edit.parts.PCNWaitStep5EditPart;
import pcn.diagram.edit.parts.PCNWaitStepEditPart;
import pcn.diagram.part.PcnDiagramEditorPlugin;

/**
 * @generated
 */
public class PcnElementTypes {

	/**
	* @generated
	*/
	private PcnElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			PcnDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType PCNDiagram_1000 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDiagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNProcessEntity_2001 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNProcessEntity_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNStandardStep_3011 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNStandardStep_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3048 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3048"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3049 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3049"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3050 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3050"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3051 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3051"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3168 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3168"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3213 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3213"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNStandardStep_3012 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNStandardStep_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3052 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3052"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3053 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3053"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3054 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3054"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3055 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3055"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3169 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3169"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3214 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3214"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNStandardStep_3013 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNStandardStep_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3056 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3056"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3057 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3057"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3058 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3058"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3059 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3059"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3170 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3170"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3215 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3215"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNStandardStep_3014 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNStandardStep_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3060 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3060"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3061 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3061"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3062 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3062"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3063 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3063"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3171 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3171"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3216 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3216"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNStandardStep_3015 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNStandardStep_3015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3064 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3064"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3065 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3065"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3066 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3066"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3067 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3067"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3172 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3172"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3217 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3217"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNDoAndWaitStep_3016 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDoAndWaitStep_3016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNDoAndWaitStep_3017 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDoAndWaitStep_3017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNDoAndWaitStep_3018 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDoAndWaitStep_3018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNDoAndWaitStep_3019 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDoAndWaitStep_3019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNDoAndWaitStep_3020 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDoAndWaitStep_3020"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNWaitStep_3021 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNWaitStep_3021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNWaitStep_3022 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNWaitStep_3022"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNWaitStep_3023 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNWaitStep_3023"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNWaitStep_3024 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNWaitStep_3024"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNWaitStep_3025 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNWaitStep_3025"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNInnovationStep_3026 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNInnovationStep_3026"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3068 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3068"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3069 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3069"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3070 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3070"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3071 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3071"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3173 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3173"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNInnovationStep_3027 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNInnovationStep_3027"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3072 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3072"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3073 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3073"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3074 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3074"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3075 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3075"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3174 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3174"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNInnovationStep_3028 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNInnovationStep_3028"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3076 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3076"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3077 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3077"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3078 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3078"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3079 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3079"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3175 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3175"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNInnovationStep_3029 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNInnovationStep_3029"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3080 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3080"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3081 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3081"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3082 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3082"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3083 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3083"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3176 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3176"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNInnovationStep_3030 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNInnovationStep_3030"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3084 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3084"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3085 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3085"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3086 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3086"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3087 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3087"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3177 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3177"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNOutsourcedStep_3031 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNOutsourcedStep_3031"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3088 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3088"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3089 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3089"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3090 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3090"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3091 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3091"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3178 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3178"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNDelayTimeTag_3203 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDelayTimeTag_3203"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3223 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3223"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNDelayTimeTag_3198 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDelayTimeTag_3198"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3218 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3218"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNOutsourcedStep_3032 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNOutsourcedStep_3032"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3132 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3132"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3133 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3133"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3134 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3134"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3135 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3135"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3189 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3189"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3234 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3234"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3112 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3112"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3113 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3113"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3114 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3114"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3115 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3115"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3184 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3184"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3229 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3229"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3092 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3092"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3093 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3093"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3094 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3094"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3095 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3095"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3179 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3179"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNDelayTimeTag_3204 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDelayTimeTag_3204"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3224 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3224"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNDelayTimeTag_3199 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDelayTimeTag_3199"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3219 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3219"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNOutsourcedStep_3033 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNOutsourcedStep_3033"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3136 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3136"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3137 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3137"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3138 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3138"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3139 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3139"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3190 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3190"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3235 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3235"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3116 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3116"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3117 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3117"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3118 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3118"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3119 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3119"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3185 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3185"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3230 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3230"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3096 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3096"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3097 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3097"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3098 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3098"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3099 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3099"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3180 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3180"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNDelayTimeTag_3205 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDelayTimeTag_3205"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3225 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3225"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNDelayTimeTag_3200 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDelayTimeTag_3200"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3220 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3220"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNOutsourcedStep_3034 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNOutsourcedStep_3034"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3140 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3140"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3141 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3141"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3142 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3142"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3143 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3143"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3191 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3191"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3236 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3236"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3120 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3120"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3121 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3121"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3122 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3122"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3123 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3123"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3186 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3186"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3231 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3231"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3100 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3100"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3101 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3101"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3102 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3102"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3103 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3103"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3181 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3181"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNDelayTimeTag_3206 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDelayTimeTag_3206"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3226 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3226"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNDelayTimeTag_3201 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDelayTimeTag_3201"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3221 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3221"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNOutsourcedStep_3035 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNOutsourcedStep_3035"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3144 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3144"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3145 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3145"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3146 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3146"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3147 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3147"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3192 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3192"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3237 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3237"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3128 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3128"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3129 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3129"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3130 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3130"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3131 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3131"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3188 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3188"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3233 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3233"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3124 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3124"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3125 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3125"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3126 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3126"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3127 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3127"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3187 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3187"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3232 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3232"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3108 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3108"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3109 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3109"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3110 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3110"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3111 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3111"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3183 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3183"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3228 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3228"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3104 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3104"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3105 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3105"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3106 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3106"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3107 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3107"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3182 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3182"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNDelayTimeTag_3207 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDelayTimeTag_3207"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3227 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3227"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNDelayTimeTag_3202 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDelayTimeTag_3202"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3222 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3222"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNDecisionStep_3036 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDecisionStep_3036"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3148 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3148"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3149 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3149"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3150 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3150"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3151 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3151"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3193 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3193"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNProbabilitiesTag_3208 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNProbabilitiesTag_3208"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3238 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3238"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNDecisionStep_3037 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDecisionStep_3037"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3152 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3152"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3153 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3153"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3154 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3154"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3155 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3155"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3194 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3194"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNProbabilitiesTag_3209 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNProbabilitiesTag_3209"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3239 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3239"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNDecisionStep_3038 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDecisionStep_3038"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3156 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3156"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3157 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3157"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3158 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3158"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3159 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3159"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3195 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3195"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNProbabilitiesTag_3210 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNProbabilitiesTag_3210"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3240 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3240"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNDecisionStep_3039 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDecisionStep_3039"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3160 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3160"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3161 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3161"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3162 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3162"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3163 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3163"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3196 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3196"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNProbabilitiesTag_3211 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNProbabilitiesTag_3211"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3241 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3241"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNDecisionStep_3040 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDecisionStep_3040"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryBenefit_3164 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryBenefit_3164"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNMonetaryCost_3165 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNMonetaryCost_3165"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryBenefit_3166 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryBenefit_3166"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNNonMonetaryCost_3167 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNNonMonetaryCost_3167"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNTextualTag_3197 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNTextualTag_3197"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNProbabilitiesTag_3212 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNProbabilitiesTag_3212"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNSyncTag_3242 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNSyncTag_3242"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNReference_3041 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNReference_3041"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNReference_3042 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNReference_3042"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNReference_3043 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNReference_3043"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNReference_3044 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNReference_3044"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNReference_3045 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNReference_3045"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PCNRegularProcessStepPCNStandardDependency_4008 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNRegularProcessStepPCNStandardDependency_4008"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNRegularProcessStepPCNDelayedDependency_4009 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNRegularProcessStepPCNDelayedDependency_4009"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNDecisionStepPCNNegativeDecision_4007 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDecisionStepPCNNegativeDecision_4007"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PCNDecisionStepPCNPositiveDecision_4006 = getElementType(
			"es.kybele.elastic.models.pcn.diagram.PCNDecisionStepPCNPositiveDecision_4006"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(PCNDiagram_1000, PcnPackage.eINSTANCE.getPCNDiagram());

			elements.put(PCNProcessEntity_2001, PcnPackage.eINSTANCE.getPCNProcessEntity());

			elements.put(PCNStandardStep_3011, PcnPackage.eINSTANCE.getPCNStandardStep());

			elements.put(PCNMonetaryBenefit_3048, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3049, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3050, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3051, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3168, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNSyncTag_3213, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNStandardStep_3012, PcnPackage.eINSTANCE.getPCNStandardStep());

			elements.put(PCNMonetaryBenefit_3052, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3053, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3054, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3055, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3169, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNSyncTag_3214, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNStandardStep_3013, PcnPackage.eINSTANCE.getPCNStandardStep());

			elements.put(PCNMonetaryBenefit_3056, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3057, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3058, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3059, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3170, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNSyncTag_3215, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNStandardStep_3014, PcnPackage.eINSTANCE.getPCNStandardStep());

			elements.put(PCNMonetaryBenefit_3060, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3061, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3062, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3063, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3171, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNSyncTag_3216, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNStandardStep_3015, PcnPackage.eINSTANCE.getPCNStandardStep());

			elements.put(PCNMonetaryBenefit_3064, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3065, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3066, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3067, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3172, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNSyncTag_3217, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNDoAndWaitStep_3016, PcnPackage.eINSTANCE.getPCNDoAndWaitStep());

			elements.put(PCNMonetaryBenefit_3068, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3069, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3070, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3071, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3173, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNDelayTimeTag_3198, PcnPackage.eINSTANCE.getPCNDelayTimeTag());

			elements.put(PCNSyncTag_3218, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNDoAndWaitStep_3017, PcnPackage.eINSTANCE.getPCNDoAndWaitStep());

			elements.put(PCNMonetaryBenefit_3072, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3073, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3074, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3075, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3174, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNDelayTimeTag_3199, PcnPackage.eINSTANCE.getPCNDelayTimeTag());

			elements.put(PCNSyncTag_3219, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNDoAndWaitStep_3018, PcnPackage.eINSTANCE.getPCNDoAndWaitStep());

			elements.put(PCNMonetaryBenefit_3076, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3077, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3078, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3079, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3175, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNDelayTimeTag_3200, PcnPackage.eINSTANCE.getPCNDelayTimeTag());

			elements.put(PCNSyncTag_3220, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNDoAndWaitStep_3019, PcnPackage.eINSTANCE.getPCNDoAndWaitStep());

			elements.put(PCNMonetaryBenefit_3080, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3081, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3082, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3083, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3176, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNDelayTimeTag_3201, PcnPackage.eINSTANCE.getPCNDelayTimeTag());

			elements.put(PCNSyncTag_3221, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNDoAndWaitStep_3020, PcnPackage.eINSTANCE.getPCNDoAndWaitStep());

			elements.put(PCNMonetaryBenefit_3084, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3085, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3086, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3087, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3177, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNDelayTimeTag_3202, PcnPackage.eINSTANCE.getPCNDelayTimeTag());

			elements.put(PCNSyncTag_3222, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNWaitStep_3021, PcnPackage.eINSTANCE.getPCNWaitStep());

			elements.put(PCNMonetaryBenefit_3088, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3089, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3090, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3091, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3178, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNDelayTimeTag_3203, PcnPackage.eINSTANCE.getPCNDelayTimeTag());

			elements.put(PCNSyncTag_3223, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNWaitStep_3022, PcnPackage.eINSTANCE.getPCNWaitStep());

			elements.put(PCNMonetaryBenefit_3092, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3093, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3094, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3095, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3179, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNDelayTimeTag_3204, PcnPackage.eINSTANCE.getPCNDelayTimeTag());

			elements.put(PCNSyncTag_3224, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNWaitStep_3023, PcnPackage.eINSTANCE.getPCNWaitStep());

			elements.put(PCNMonetaryBenefit_3096, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3097, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3098, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3099, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3180, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNDelayTimeTag_3205, PcnPackage.eINSTANCE.getPCNDelayTimeTag());

			elements.put(PCNSyncTag_3225, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNWaitStep_3024, PcnPackage.eINSTANCE.getPCNWaitStep());

			elements.put(PCNMonetaryBenefit_3100, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3101, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3102, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3103, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3181, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNDelayTimeTag_3206, PcnPackage.eINSTANCE.getPCNDelayTimeTag());

			elements.put(PCNSyncTag_3226, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNWaitStep_3025, PcnPackage.eINSTANCE.getPCNWaitStep());

			elements.put(PCNMonetaryBenefit_3104, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3105, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3106, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3107, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3182, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNDelayTimeTag_3207, PcnPackage.eINSTANCE.getPCNDelayTimeTag());

			elements.put(PCNSyncTag_3227, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNInnovationStep_3026, PcnPackage.eINSTANCE.getPCNInnovationStep());

			elements.put(PCNMonetaryBenefit_3108, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3109, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3110, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3111, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3183, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNSyncTag_3228, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNInnovationStep_3027, PcnPackage.eINSTANCE.getPCNInnovationStep());

			elements.put(PCNMonetaryBenefit_3112, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3113, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3114, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3115, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3184, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNSyncTag_3229, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNInnovationStep_3028, PcnPackage.eINSTANCE.getPCNInnovationStep());

			elements.put(PCNMonetaryBenefit_3116, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3117, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3118, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3119, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3185, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNSyncTag_3230, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNInnovationStep_3029, PcnPackage.eINSTANCE.getPCNInnovationStep());

			elements.put(PCNMonetaryBenefit_3120, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3121, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3122, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3123, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3186, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNSyncTag_3231, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNInnovationStep_3030, PcnPackage.eINSTANCE.getPCNInnovationStep());

			elements.put(PCNMonetaryBenefit_3124, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3125, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3126, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3127, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3187, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNSyncTag_3232, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNOutsourcedStep_3031, PcnPackage.eINSTANCE.getPCNOutsourcedStep());

			elements.put(PCNMonetaryBenefit_3128, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3129, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3130, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3131, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3188, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNSyncTag_3233, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNOutsourcedStep_3032, PcnPackage.eINSTANCE.getPCNOutsourcedStep());

			elements.put(PCNMonetaryBenefit_3132, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3133, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3134, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3135, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3189, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNSyncTag_3234, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNOutsourcedStep_3033, PcnPackage.eINSTANCE.getPCNOutsourcedStep());

			elements.put(PCNMonetaryBenefit_3136, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3137, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3138, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3139, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3190, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNSyncTag_3235, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNOutsourcedStep_3034, PcnPackage.eINSTANCE.getPCNOutsourcedStep());

			elements.put(PCNMonetaryBenefit_3140, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3141, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3142, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3143, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3191, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNSyncTag_3236, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNOutsourcedStep_3035, PcnPackage.eINSTANCE.getPCNOutsourcedStep());

			elements.put(PCNMonetaryBenefit_3144, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3145, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3146, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3147, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3192, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNSyncTag_3237, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNDecisionStep_3036, PcnPackage.eINSTANCE.getPCNDecisionStep());

			elements.put(PCNMonetaryBenefit_3148, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3149, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3150, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3151, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3193, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNProbabilitiesTag_3208, PcnPackage.eINSTANCE.getPCNProbabilitiesTag());

			elements.put(PCNSyncTag_3238, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNDecisionStep_3037, PcnPackage.eINSTANCE.getPCNDecisionStep());

			elements.put(PCNMonetaryBenefit_3152, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3153, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3154, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3155, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3194, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNProbabilitiesTag_3209, PcnPackage.eINSTANCE.getPCNProbabilitiesTag());

			elements.put(PCNSyncTag_3239, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNDecisionStep_3038, PcnPackage.eINSTANCE.getPCNDecisionStep());

			elements.put(PCNMonetaryBenefit_3156, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3157, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3158, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3159, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3195, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNProbabilitiesTag_3210, PcnPackage.eINSTANCE.getPCNProbabilitiesTag());

			elements.put(PCNSyncTag_3240, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNDecisionStep_3039, PcnPackage.eINSTANCE.getPCNDecisionStep());

			elements.put(PCNMonetaryBenefit_3160, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3161, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3162, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3163, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3196, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNProbabilitiesTag_3211, PcnPackage.eINSTANCE.getPCNProbabilitiesTag());

			elements.put(PCNSyncTag_3241, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNDecisionStep_3040, PcnPackage.eINSTANCE.getPCNDecisionStep());

			elements.put(PCNMonetaryBenefit_3164, PcnPackage.eINSTANCE.getPCNMonetaryBenefit());

			elements.put(PCNMonetaryCost_3165, PcnPackage.eINSTANCE.getPCNMonetaryCost());

			elements.put(PCNNonMonetaryBenefit_3166, PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit());

			elements.put(PCNNonMonetaryCost_3167, PcnPackage.eINSTANCE.getPCNNonMonetaryCost());

			elements.put(PCNTextualTag_3197, PcnPackage.eINSTANCE.getPCNTextualTag());

			elements.put(PCNProbabilitiesTag_3212, PcnPackage.eINSTANCE.getPCNProbabilitiesTag());

			elements.put(PCNSyncTag_3242, PcnPackage.eINSTANCE.getPCNSyncTag());

			elements.put(PCNReference_3041, PcnPackage.eINSTANCE.getPCNReference());

			elements.put(PCNReference_3042, PcnPackage.eINSTANCE.getPCNReference());

			elements.put(PCNReference_3043, PcnPackage.eINSTANCE.getPCNReference());

			elements.put(PCNReference_3044, PcnPackage.eINSTANCE.getPCNReference());

			elements.put(PCNReference_3045, PcnPackage.eINSTANCE.getPCNReference());

			elements.put(PCNRegularProcessStepPCNStandardDependency_4008,
					PcnPackage.eINSTANCE.getPCNRegularProcessStep_PCNStandardDependency());

			elements.put(PCNRegularProcessStepPCNDelayedDependency_4009,
					PcnPackage.eINSTANCE.getPCNRegularProcessStep_PCNDelayedDependency());

			elements.put(PCNDecisionStepPCNNegativeDecision_4007,
					PcnPackage.eINSTANCE.getPCNDecisionStep_PCNNegativeDecision());

			elements.put(PCNDecisionStepPCNPositiveDecision_4006,
					PcnPackage.eINSTANCE.getPCNDecisionStep_PCNPositiveDecision());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(PCNDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(PCNProcessEntity_2001);
			KNOWN_ELEMENT_TYPES.add(PCNStandardStep_3011);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3048);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3049);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3050);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3051);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3168);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3213);
			KNOWN_ELEMENT_TYPES.add(PCNStandardStep_3012);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3052);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3053);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3054);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3055);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3169);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3214);
			KNOWN_ELEMENT_TYPES.add(PCNStandardStep_3013);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3056);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3057);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3058);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3059);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3170);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3215);
			KNOWN_ELEMENT_TYPES.add(PCNStandardStep_3014);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3060);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3061);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3062);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3063);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3171);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3216);
			KNOWN_ELEMENT_TYPES.add(PCNStandardStep_3015);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3064);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3065);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3066);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3067);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3172);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3217);
			KNOWN_ELEMENT_TYPES.add(PCNDoAndWaitStep_3016);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3068);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3069);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3070);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3071);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3173);
			KNOWN_ELEMENT_TYPES.add(PCNDelayTimeTag_3198);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3218);
			KNOWN_ELEMENT_TYPES.add(PCNDoAndWaitStep_3017);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3072);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3073);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3074);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3075);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3174);
			KNOWN_ELEMENT_TYPES.add(PCNDelayTimeTag_3199);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3219);
			KNOWN_ELEMENT_TYPES.add(PCNDoAndWaitStep_3018);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3076);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3077);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3078);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3079);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3175);
			KNOWN_ELEMENT_TYPES.add(PCNDelayTimeTag_3200);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3220);
			KNOWN_ELEMENT_TYPES.add(PCNDoAndWaitStep_3019);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3080);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3081);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3082);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3083);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3176);
			KNOWN_ELEMENT_TYPES.add(PCNDelayTimeTag_3201);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3221);
			KNOWN_ELEMENT_TYPES.add(PCNDoAndWaitStep_3020);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3084);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3085);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3086);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3087);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3177);
			KNOWN_ELEMENT_TYPES.add(PCNDelayTimeTag_3202);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3222);
			KNOWN_ELEMENT_TYPES.add(PCNWaitStep_3021);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3088);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3089);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3090);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3091);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3178);
			KNOWN_ELEMENT_TYPES.add(PCNDelayTimeTag_3203);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3223);
			KNOWN_ELEMENT_TYPES.add(PCNWaitStep_3022);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3092);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3093);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3094);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3095);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3179);
			KNOWN_ELEMENT_TYPES.add(PCNDelayTimeTag_3204);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3224);
			KNOWN_ELEMENT_TYPES.add(PCNWaitStep_3023);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3096);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3097);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3098);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3099);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3180);
			KNOWN_ELEMENT_TYPES.add(PCNDelayTimeTag_3205);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3225);
			KNOWN_ELEMENT_TYPES.add(PCNWaitStep_3024);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3100);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3101);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3102);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3103);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3181);
			KNOWN_ELEMENT_TYPES.add(PCNDelayTimeTag_3206);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3226);
			KNOWN_ELEMENT_TYPES.add(PCNWaitStep_3025);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3104);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3105);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3106);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3107);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3182);
			KNOWN_ELEMENT_TYPES.add(PCNDelayTimeTag_3207);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3227);
			KNOWN_ELEMENT_TYPES.add(PCNInnovationStep_3026);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3108);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3109);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3110);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3111);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3183);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3228);
			KNOWN_ELEMENT_TYPES.add(PCNInnovationStep_3027);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3112);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3113);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3114);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3115);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3184);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3229);
			KNOWN_ELEMENT_TYPES.add(PCNInnovationStep_3028);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3116);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3117);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3118);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3119);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3185);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3230);
			KNOWN_ELEMENT_TYPES.add(PCNInnovationStep_3029);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3120);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3121);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3122);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3123);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3186);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3231);
			KNOWN_ELEMENT_TYPES.add(PCNInnovationStep_3030);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3124);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3125);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3126);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3127);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3187);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3232);
			KNOWN_ELEMENT_TYPES.add(PCNOutsourcedStep_3031);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3128);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3129);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3130);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3131);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3188);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3233);
			KNOWN_ELEMENT_TYPES.add(PCNOutsourcedStep_3032);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3132);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3133);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3134);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3135);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3189);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3234);
			KNOWN_ELEMENT_TYPES.add(PCNOutsourcedStep_3033);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3136);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3137);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3138);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3139);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3190);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3235);
			KNOWN_ELEMENT_TYPES.add(PCNOutsourcedStep_3034);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3140);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3141);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3142);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3143);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3191);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3236);
			KNOWN_ELEMENT_TYPES.add(PCNOutsourcedStep_3035);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3144);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3145);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3146);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3147);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3192);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3237);
			KNOWN_ELEMENT_TYPES.add(PCNDecisionStep_3036);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3148);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3149);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3150);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3151);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3193);
			KNOWN_ELEMENT_TYPES.add(PCNProbabilitiesTag_3208);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3238);
			KNOWN_ELEMENT_TYPES.add(PCNDecisionStep_3037);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3152);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3153);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3154);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3155);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3194);
			KNOWN_ELEMENT_TYPES.add(PCNProbabilitiesTag_3209);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3239);
			KNOWN_ELEMENT_TYPES.add(PCNDecisionStep_3038);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3156);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3157);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3158);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3159);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3195);
			KNOWN_ELEMENT_TYPES.add(PCNProbabilitiesTag_3210);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3240);
			KNOWN_ELEMENT_TYPES.add(PCNDecisionStep_3039);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3160);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3161);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3162);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3163);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3196);
			KNOWN_ELEMENT_TYPES.add(PCNProbabilitiesTag_3211);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3241);
			KNOWN_ELEMENT_TYPES.add(PCNDecisionStep_3040);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryBenefit_3164);
			KNOWN_ELEMENT_TYPES.add(PCNMonetaryCost_3165);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryBenefit_3166);
			KNOWN_ELEMENT_TYPES.add(PCNNonMonetaryCost_3167);
			KNOWN_ELEMENT_TYPES.add(PCNTextualTag_3197);
			KNOWN_ELEMENT_TYPES.add(PCNProbabilitiesTag_3212);
			KNOWN_ELEMENT_TYPES.add(PCNSyncTag_3242);
			KNOWN_ELEMENT_TYPES.add(PCNReference_3041);
			KNOWN_ELEMENT_TYPES.add(PCNReference_3042);
			KNOWN_ELEMENT_TYPES.add(PCNReference_3043);
			KNOWN_ELEMENT_TYPES.add(PCNReference_3044);
			KNOWN_ELEMENT_TYPES.add(PCNReference_3045);
			KNOWN_ELEMENT_TYPES.add(PCNRegularProcessStepPCNStandardDependency_4008);
			KNOWN_ELEMENT_TYPES.add(PCNRegularProcessStepPCNDelayedDependency_4009);
			KNOWN_ELEMENT_TYPES.add(PCNDecisionStepPCNNegativeDecision_4007);
			KNOWN_ELEMENT_TYPES.add(PCNDecisionStepPCNPositiveDecision_4006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case PCNDiagramEditPart.VISUAL_ID:
			return PCNDiagram_1000;
		case PCNProcessEntityEditPart.VISUAL_ID:
			return PCNProcessEntity_2001;
		case PCNStandardStepEditPart.VISUAL_ID:
			return PCNStandardStep_3011;
		case PCNMonetaryBenefitEditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3048;
		case PCNMonetaryCostEditPart.VISUAL_ID:
			return PCNMonetaryCost_3049;
		case PCNNonMonetaryBenefitEditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3050;
		case PCNNonMonetaryCostEditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3051;
		case PCNTextualTagEditPart.VISUAL_ID:
			return PCNTextualTag_3168;
		case PCNSyncTagEditPart.VISUAL_ID:
			return PCNSyncTag_3213;
		case PCNStandardStep2EditPart.VISUAL_ID:
			return PCNStandardStep_3012;
		case PCNMonetaryBenefit2EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3052;
		case PCNMonetaryCost2EditPart.VISUAL_ID:
			return PCNMonetaryCost_3053;
		case PCNNonMonetaryBenefit2EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3054;
		case PCNNonMonetaryCost2EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3055;
		case PCNTextualTag2EditPart.VISUAL_ID:
			return PCNTextualTag_3169;
		case PCNSyncTag2EditPart.VISUAL_ID:
			return PCNSyncTag_3214;
		case PCNStandardStep3EditPart.VISUAL_ID:
			return PCNStandardStep_3013;
		case PCNMonetaryBenefit3EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3056;
		case PCNMonetaryCost3EditPart.VISUAL_ID:
			return PCNMonetaryCost_3057;
		case PCNNonMonetaryBenefit3EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3058;
		case PCNNonMonetaryCost3EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3059;
		case PCNTextualTag3EditPart.VISUAL_ID:
			return PCNTextualTag_3170;
		case PCNSyncTag3EditPart.VISUAL_ID:
			return PCNSyncTag_3215;
		case PCNStandardStep4EditPart.VISUAL_ID:
			return PCNStandardStep_3014;
		case PCNMonetaryBenefit4EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3060;
		case PCNMonetaryCost4EditPart.VISUAL_ID:
			return PCNMonetaryCost_3061;
		case PCNNonMonetaryBenefit4EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3062;
		case PCNNonMonetaryCost4EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3063;
		case PCNTextualTag4EditPart.VISUAL_ID:
			return PCNTextualTag_3171;
		case PCNSyncTag4EditPart.VISUAL_ID:
			return PCNSyncTag_3216;
		case PCNStandardStep5EditPart.VISUAL_ID:
			return PCNStandardStep_3015;
		case PCNMonetaryBenefit5EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3064;
		case PCNMonetaryCost5EditPart.VISUAL_ID:
			return PCNMonetaryCost_3065;
		case PCNNonMonetaryBenefit5EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3066;
		case PCNNonMonetaryCost5EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3067;
		case PCNTextualTag5EditPart.VISUAL_ID:
			return PCNTextualTag_3172;
		case PCNSyncTag5EditPart.VISUAL_ID:
			return PCNSyncTag_3217;
		case PCNDoAndWaitStepEditPart.VISUAL_ID:
			return PCNDoAndWaitStep_3016;
		case PCNMonetaryBenefit6EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3068;
		case PCNMonetaryCost6EditPart.VISUAL_ID:
			return PCNMonetaryCost_3069;
		case PCNNonMonetaryBenefit6EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3070;
		case PCNNonMonetaryCost6EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3071;
		case PCNTextualTag6EditPart.VISUAL_ID:
			return PCNTextualTag_3173;
		case PCNDelayTimeTagEditPart.VISUAL_ID:
			return PCNDelayTimeTag_3198;
		case PCNSyncTag6EditPart.VISUAL_ID:
			return PCNSyncTag_3218;
		case PCNDoAndWaitStep2EditPart.VISUAL_ID:
			return PCNDoAndWaitStep_3017;
		case PCNMonetaryBenefit7EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3072;
		case PCNMonetaryCost7EditPart.VISUAL_ID:
			return PCNMonetaryCost_3073;
		case PCNNonMonetaryBenefit7EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3074;
		case PCNNonMonetaryCost7EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3075;
		case PCNTextualTag7EditPart.VISUAL_ID:
			return PCNTextualTag_3174;
		case PCNDelayTimeTag2EditPart.VISUAL_ID:
			return PCNDelayTimeTag_3199;
		case PCNSyncTag7EditPart.VISUAL_ID:
			return PCNSyncTag_3219;
		case PCNDoAndWaitStep3EditPart.VISUAL_ID:
			return PCNDoAndWaitStep_3018;
		case PCNMonetaryBenefit8EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3076;
		case PCNMonetaryCost8EditPart.VISUAL_ID:
			return PCNMonetaryCost_3077;
		case PCNNonMonetaryBenefit8EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3078;
		case PCNNonMonetaryCost8EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3079;
		case PCNTextualTag8EditPart.VISUAL_ID:
			return PCNTextualTag_3175;
		case PCNDelayTimeTag3EditPart.VISUAL_ID:
			return PCNDelayTimeTag_3200;
		case PCNSyncTag8EditPart.VISUAL_ID:
			return PCNSyncTag_3220;
		case PCNDoAndWaitStep4EditPart.VISUAL_ID:
			return PCNDoAndWaitStep_3019;
		case PCNMonetaryBenefit9EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3080;
		case PCNMonetaryCost9EditPart.VISUAL_ID:
			return PCNMonetaryCost_3081;
		case PCNNonMonetaryBenefit9EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3082;
		case PCNNonMonetaryCost9EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3083;
		case PCNTextualTag9EditPart.VISUAL_ID:
			return PCNTextualTag_3176;
		case PCNDelayTimeTag4EditPart.VISUAL_ID:
			return PCNDelayTimeTag_3201;
		case PCNSyncTag9EditPart.VISUAL_ID:
			return PCNSyncTag_3221;
		case PCNDoAndWaitStep5EditPart.VISUAL_ID:
			return PCNDoAndWaitStep_3020;
		case PCNMonetaryBenefit10EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3084;
		case PCNMonetaryCost10EditPart.VISUAL_ID:
			return PCNMonetaryCost_3085;
		case PCNNonMonetaryBenefit10EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3086;
		case PCNNonMonetaryCost10EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3087;
		case PCNTextualTag10EditPart.VISUAL_ID:
			return PCNTextualTag_3177;
		case PCNDelayTimeTag5EditPart.VISUAL_ID:
			return PCNDelayTimeTag_3202;
		case PCNSyncTag10EditPart.VISUAL_ID:
			return PCNSyncTag_3222;
		case PCNWaitStepEditPart.VISUAL_ID:
			return PCNWaitStep_3021;
		case PCNMonetaryBenefit11EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3088;
		case PCNMonetaryCost11EditPart.VISUAL_ID:
			return PCNMonetaryCost_3089;
		case PCNNonMonetaryBenefit11EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3090;
		case PCNNonMonetaryCost11EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3091;
		case PCNTextualTag11EditPart.VISUAL_ID:
			return PCNTextualTag_3178;
		case PCNDelayTimeTag6EditPart.VISUAL_ID:
			return PCNDelayTimeTag_3203;
		case PCNSyncTag11EditPart.VISUAL_ID:
			return PCNSyncTag_3223;
		case PCNWaitStep2EditPart.VISUAL_ID:
			return PCNWaitStep_3022;
		case PCNMonetaryBenefit12EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3092;
		case PCNMonetaryCost12EditPart.VISUAL_ID:
			return PCNMonetaryCost_3093;
		case PCNNonMonetaryBenefit12EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3094;
		case PCNNonMonetaryCost12EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3095;
		case PCNTextualTag12EditPart.VISUAL_ID:
			return PCNTextualTag_3179;
		case PCNDelayTimeTag7EditPart.VISUAL_ID:
			return PCNDelayTimeTag_3204;
		case PCNSyncTag12EditPart.VISUAL_ID:
			return PCNSyncTag_3224;
		case PCNWaitStep3EditPart.VISUAL_ID:
			return PCNWaitStep_3023;
		case PCNMonetaryBenefit13EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3096;
		case PCNMonetaryCost13EditPart.VISUAL_ID:
			return PCNMonetaryCost_3097;
		case PCNNonMonetaryBenefit13EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3098;
		case PCNNonMonetaryCost13EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3099;
		case PCNTextualTag13EditPart.VISUAL_ID:
			return PCNTextualTag_3180;
		case PCNDelayTimeTag8EditPart.VISUAL_ID:
			return PCNDelayTimeTag_3205;
		case PCNSyncTag13EditPart.VISUAL_ID:
			return PCNSyncTag_3225;
		case PCNWaitStep4EditPart.VISUAL_ID:
			return PCNWaitStep_3024;
		case PCNMonetaryBenefit14EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3100;
		case PCNMonetaryCost14EditPart.VISUAL_ID:
			return PCNMonetaryCost_3101;
		case PCNNonMonetaryBenefit14EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3102;
		case PCNNonMonetaryCost14EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3103;
		case PCNTextualTag14EditPart.VISUAL_ID:
			return PCNTextualTag_3181;
		case PCNDelayTimeTag9EditPart.VISUAL_ID:
			return PCNDelayTimeTag_3206;
		case PCNSyncTag14EditPart.VISUAL_ID:
			return PCNSyncTag_3226;
		case PCNWaitStep5EditPart.VISUAL_ID:
			return PCNWaitStep_3025;
		case PCNMonetaryBenefit15EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3104;
		case PCNMonetaryCost15EditPart.VISUAL_ID:
			return PCNMonetaryCost_3105;
		case PCNNonMonetaryBenefit15EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3106;
		case PCNNonMonetaryCost15EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3107;
		case PCNTextualTag15EditPart.VISUAL_ID:
			return PCNTextualTag_3182;
		case PCNDelayTimeTag10EditPart.VISUAL_ID:
			return PCNDelayTimeTag_3207;
		case PCNSyncTag15EditPart.VISUAL_ID:
			return PCNSyncTag_3227;
		case PCNInnovationStepEditPart.VISUAL_ID:
			return PCNInnovationStep_3026;
		case PCNMonetaryBenefit16EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3108;
		case PCNMonetaryCost16EditPart.VISUAL_ID:
			return PCNMonetaryCost_3109;
		case PCNNonMonetaryBenefit16EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3110;
		case PCNNonMonetaryCost16EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3111;
		case PCNTextualTag16EditPart.VISUAL_ID:
			return PCNTextualTag_3183;
		case PCNSyncTag16EditPart.VISUAL_ID:
			return PCNSyncTag_3228;
		case PCNInnovationStep2EditPart.VISUAL_ID:
			return PCNInnovationStep_3027;
		case PCNMonetaryBenefit17EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3112;
		case PCNMonetaryCost17EditPart.VISUAL_ID:
			return PCNMonetaryCost_3113;
		case PCNNonMonetaryBenefit17EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3114;
		case PCNNonMonetaryCost17EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3115;
		case PCNTextualTag17EditPart.VISUAL_ID:
			return PCNTextualTag_3184;
		case PCNSyncTag17EditPart.VISUAL_ID:
			return PCNSyncTag_3229;
		case PCNInnovationStep3EditPart.VISUAL_ID:
			return PCNInnovationStep_3028;
		case PCNMonetaryBenefit18EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3116;
		case PCNMonetaryCost18EditPart.VISUAL_ID:
			return PCNMonetaryCost_3117;
		case PCNNonMonetaryBenefit18EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3118;
		case PCNNonMonetaryCost18EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3119;
		case PCNTextualTag18EditPart.VISUAL_ID:
			return PCNTextualTag_3185;
		case PCNSyncTag18EditPart.VISUAL_ID:
			return PCNSyncTag_3230;
		case PCNInnovationStep4EditPart.VISUAL_ID:
			return PCNInnovationStep_3029;
		case PCNMonetaryBenefit19EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3120;
		case PCNMonetaryCost19EditPart.VISUAL_ID:
			return PCNMonetaryCost_3121;
		case PCNNonMonetaryBenefit19EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3122;
		case PCNNonMonetaryCost19EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3123;
		case PCNTextualTag19EditPart.VISUAL_ID:
			return PCNTextualTag_3186;
		case PCNSyncTag19EditPart.VISUAL_ID:
			return PCNSyncTag_3231;
		case PCNInnovationStep5EditPart.VISUAL_ID:
			return PCNInnovationStep_3030;
		case PCNMonetaryBenefit20EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3124;
		case PCNMonetaryCost20EditPart.VISUAL_ID:
			return PCNMonetaryCost_3125;
		case PCNNonMonetaryBenefit20EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3126;
		case PCNNonMonetaryCost20EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3127;
		case PCNTextualTag20EditPart.VISUAL_ID:
			return PCNTextualTag_3187;
		case PCNSyncTag20EditPart.VISUAL_ID:
			return PCNSyncTag_3232;
		case PCNOutsourcedStepEditPart.VISUAL_ID:
			return PCNOutsourcedStep_3031;
		case PCNMonetaryBenefit21EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3128;
		case PCNMonetaryCost21EditPart.VISUAL_ID:
			return PCNMonetaryCost_3129;
		case PCNNonMonetaryBenefit21EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3130;
		case PCNNonMonetaryCost21EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3131;
		case PCNTextualTag21EditPart.VISUAL_ID:
			return PCNTextualTag_3188;
		case PCNSyncTag21EditPart.VISUAL_ID:
			return PCNSyncTag_3233;
		case PCNOutsourcedStep2EditPart.VISUAL_ID:
			return PCNOutsourcedStep_3032;
		case PCNMonetaryBenefit22EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3132;
		case PCNMonetaryCost22EditPart.VISUAL_ID:
			return PCNMonetaryCost_3133;
		case PCNNonMonetaryBenefit22EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3134;
		case PCNNonMonetaryCost22EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3135;
		case PCNTextualTag22EditPart.VISUAL_ID:
			return PCNTextualTag_3189;
		case PCNSyncTag22EditPart.VISUAL_ID:
			return PCNSyncTag_3234;
		case PCNOutsourcedStep3EditPart.VISUAL_ID:
			return PCNOutsourcedStep_3033;
		case PCNMonetaryBenefit23EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3136;
		case PCNMonetaryCost23EditPart.VISUAL_ID:
			return PCNMonetaryCost_3137;
		case PCNNonMonetaryBenefit23EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3138;
		case PCNNonMonetaryCost23EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3139;
		case PCNTextualTag23EditPart.VISUAL_ID:
			return PCNTextualTag_3190;
		case PCNSyncTag23EditPart.VISUAL_ID:
			return PCNSyncTag_3235;
		case PCNOutsourcedStep4EditPart.VISUAL_ID:
			return PCNOutsourcedStep_3034;
		case PCNMonetaryBenefit24EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3140;
		case PCNMonetaryCost24EditPart.VISUAL_ID:
			return PCNMonetaryCost_3141;
		case PCNNonMonetaryBenefit24EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3142;
		case PCNNonMonetaryCost24EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3143;
		case PCNTextualTag24EditPart.VISUAL_ID:
			return PCNTextualTag_3191;
		case PCNSyncTag24EditPart.VISUAL_ID:
			return PCNSyncTag_3236;
		case PCNOutsourcedStep5EditPart.VISUAL_ID:
			return PCNOutsourcedStep_3035;
		case PCNMonetaryBenefit25EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3144;
		case PCNMonetaryCost25EditPart.VISUAL_ID:
			return PCNMonetaryCost_3145;
		case PCNNonMonetaryBenefit25EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3146;
		case PCNNonMonetaryCost25EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3147;
		case PCNTextualTag25EditPart.VISUAL_ID:
			return PCNTextualTag_3192;
		case PCNSyncTag25EditPart.VISUAL_ID:
			return PCNSyncTag_3237;
		case PCNDecisionStepEditPart.VISUAL_ID:
			return PCNDecisionStep_3036;
		case PCNMonetaryBenefit26EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3148;
		case PCNMonetaryCost26EditPart.VISUAL_ID:
			return PCNMonetaryCost_3149;
		case PCNNonMonetaryBenefit26EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3150;
		case PCNNonMonetaryCost26EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3151;
		case PCNTextualTag26EditPart.VISUAL_ID:
			return PCNTextualTag_3193;
		case PCNProbabilitiesTagEditPart.VISUAL_ID:
			return PCNProbabilitiesTag_3208;
		case PCNSyncTag26EditPart.VISUAL_ID:
			return PCNSyncTag_3238;
		case PCNDecisionStep2EditPart.VISUAL_ID:
			return PCNDecisionStep_3037;
		case PCNMonetaryBenefit27EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3152;
		case PCNMonetaryCost27EditPart.VISUAL_ID:
			return PCNMonetaryCost_3153;
		case PCNNonMonetaryBenefit27EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3154;
		case PCNNonMonetaryCost27EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3155;
		case PCNTextualTag27EditPart.VISUAL_ID:
			return PCNTextualTag_3194;
		case PCNProbabilitiesTag2EditPart.VISUAL_ID:
			return PCNProbabilitiesTag_3209;
		case PCNSyncTag27EditPart.VISUAL_ID:
			return PCNSyncTag_3239;
		case PCNDecisionStep3EditPart.VISUAL_ID:
			return PCNDecisionStep_3038;
		case PCNMonetaryBenefit28EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3156;
		case PCNMonetaryCost28EditPart.VISUAL_ID:
			return PCNMonetaryCost_3157;
		case PCNNonMonetaryBenefit28EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3158;
		case PCNNonMonetaryCost28EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3159;
		case PCNTextualTag28EditPart.VISUAL_ID:
			return PCNTextualTag_3195;
		case PCNProbabilitiesTag3EditPart.VISUAL_ID:
			return PCNProbabilitiesTag_3210;
		case PCNSyncTag28EditPart.VISUAL_ID:
			return PCNSyncTag_3240;
		case PCNDecisionStep4EditPart.VISUAL_ID:
			return PCNDecisionStep_3039;
		case PCNMonetaryBenefit29EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3160;
		case PCNMonetaryCost29EditPart.VISUAL_ID:
			return PCNMonetaryCost_3161;
		case PCNNonMonetaryBenefit29EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3162;
		case PCNNonMonetaryCost29EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3163;
		case PCNTextualTag29EditPart.VISUAL_ID:
			return PCNTextualTag_3196;
		case PCNProbabilitiesTag4EditPart.VISUAL_ID:
			return PCNProbabilitiesTag_3211;
		case PCNSyncTag29EditPart.VISUAL_ID:
			return PCNSyncTag_3241;
		case PCNDecisionStep5EditPart.VISUAL_ID:
			return PCNDecisionStep_3040;
		case PCNMonetaryBenefit30EditPart.VISUAL_ID:
			return PCNMonetaryBenefit_3164;
		case PCNMonetaryCost30EditPart.VISUAL_ID:
			return PCNMonetaryCost_3165;
		case PCNNonMonetaryBenefit30EditPart.VISUAL_ID:
			return PCNNonMonetaryBenefit_3166;
		case PCNNonMonetaryCost30EditPart.VISUAL_ID:
			return PCNNonMonetaryCost_3167;
		case PCNTextualTag30EditPart.VISUAL_ID:
			return PCNTextualTag_3197;
		case PCNProbabilitiesTag5EditPart.VISUAL_ID:
			return PCNProbabilitiesTag_3212;
		case PCNSyncTag30EditPart.VISUAL_ID:
			return PCNSyncTag_3242;
		case PCNReferenceEditPart.VISUAL_ID:
			return PCNReference_3041;
		case PCNReference2EditPart.VISUAL_ID:
			return PCNReference_3042;
		case PCNReference3EditPart.VISUAL_ID:
			return PCNReference_3043;
		case PCNReference4EditPart.VISUAL_ID:
			return PCNReference_3044;
		case PCNReference5EditPart.VISUAL_ID:
			return PCNReference_3045;
		case PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID:
			return PCNRegularProcessStepPCNStandardDependency_4008;
		case PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID:
			return PCNRegularProcessStepPCNDelayedDependency_4009;
		case PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID:
			return PCNDecisionStepPCNNegativeDecision_4007;
		case PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID:
			return PCNDecisionStepPCNPositiveDecision_4006;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return pcn.diagram.providers.PcnElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return pcn.diagram.providers.PcnElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return pcn.diagram.providers.PcnElementTypes.getElement(elementTypeAdapter);
		}
	};

}
