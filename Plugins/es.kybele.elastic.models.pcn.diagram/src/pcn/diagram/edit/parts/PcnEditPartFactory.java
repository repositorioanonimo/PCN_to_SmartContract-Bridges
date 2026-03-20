package pcn.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import pcn.diagram.part.PcnVisualIDRegistry;

/**
 * @generated
 */
public class PcnEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (PcnVisualIDRegistry.getVisualID(view)) {

			case PCNDiagramEditPart.VISUAL_ID:
				return new PCNDiagramEditPart(view);

			case PCNProcessEntityEditPart.VISUAL_ID:
				return new PCNProcessEntityEditPart(view);

			case PCNProcessEntityNameEditPart.VISUAL_ID:
				return new PCNProcessEntityNameEditPart(view);

			case PCNProcessEntityNameOrderEditPart.VISUAL_ID:
				return new PCNProcessEntityNameOrderEditPart(view);

			case PCNStandardStepEditPart.VISUAL_ID:
				return new PCNStandardStepEditPart(view);

			case PCNStandardStepActionEditPart.VISUAL_ID:
				return new PCNStandardStepActionEditPart(view);

			case PCNMonetaryBenefitEditPart.VISUAL_ID:
				return new PCNMonetaryBenefitEditPart(view);

			case PCNMonetaryCostEditPart.VISUAL_ID:
				return new PCNMonetaryCostEditPart(view);

			case PCNNonMonetaryBenefitEditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefitEditPart(view);

			case PCNNonMonetaryCostEditPart.VISUAL_ID:
				return new PCNNonMonetaryCostEditPart(view);

			case PCNTextualTagEditPart.VISUAL_ID:
				return new PCNTextualTagEditPart(view);

			case PCNTextualTagTagEditPart.VISUAL_ID:
				return new PCNTextualTagTagEditPart(view);

			case PCNSyncTagEditPart.VISUAL_ID:
				return new PCNSyncTagEditPart(view);

			case PCNStandardStep2EditPart.VISUAL_ID:
				return new PCNStandardStep2EditPart(view);

			case PCNStandardStepAction2EditPart.VISUAL_ID:
				return new PCNStandardStepAction2EditPart(view);

			case PCNMonetaryBenefit2EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit2EditPart(view);

			case PCNMonetaryCost2EditPart.VISUAL_ID:
				return new PCNMonetaryCost2EditPart(view);

			case PCNNonMonetaryBenefit2EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit2EditPart(view);

			case PCNNonMonetaryCost2EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost2EditPart(view);

			case PCNTextualTag2EditPart.VISUAL_ID:
				return new PCNTextualTag2EditPart(view);

			case PCNTextualTagTag2EditPart.VISUAL_ID:
				return new PCNTextualTagTag2EditPart(view);

			case PCNSyncTag2EditPart.VISUAL_ID:
				return new PCNSyncTag2EditPart(view);

			case PCNStandardStep3EditPart.VISUAL_ID:
				return new PCNStandardStep3EditPart(view);

			case PCNStandardStepAction3EditPart.VISUAL_ID:
				return new PCNStandardStepAction3EditPart(view);

			case PCNMonetaryBenefit3EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit3EditPart(view);

			case PCNMonetaryCost3EditPart.VISUAL_ID:
				return new PCNMonetaryCost3EditPart(view);

			case PCNNonMonetaryBenefit3EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit3EditPart(view);

			case PCNNonMonetaryCost3EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost3EditPart(view);

			case PCNTextualTag3EditPart.VISUAL_ID:
				return new PCNTextualTag3EditPart(view);

			case PCNTextualTagTag3EditPart.VISUAL_ID:
				return new PCNTextualTagTag3EditPart(view);

			case PCNSyncTag3EditPart.VISUAL_ID:
				return new PCNSyncTag3EditPart(view);

			case PCNStandardStep4EditPart.VISUAL_ID:
				return new PCNStandardStep4EditPart(view);

			case PCNStandardStepAction4EditPart.VISUAL_ID:
				return new PCNStandardStepAction4EditPart(view);

			case PCNMonetaryBenefit4EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit4EditPart(view);

			case PCNMonetaryCost4EditPart.VISUAL_ID:
				return new PCNMonetaryCost4EditPart(view);

			case PCNNonMonetaryBenefit4EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit4EditPart(view);

			case PCNNonMonetaryCost4EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost4EditPart(view);

			case PCNTextualTag4EditPart.VISUAL_ID:
				return new PCNTextualTag4EditPart(view);

			case PCNTextualTagTag4EditPart.VISUAL_ID:
				return new PCNTextualTagTag4EditPart(view);

			case PCNSyncTag4EditPart.VISUAL_ID:
				return new PCNSyncTag4EditPart(view);

			case PCNStandardStep5EditPart.VISUAL_ID:
				return new PCNStandardStep5EditPart(view);

			case PCNStandardStepAction5EditPart.VISUAL_ID:
				return new PCNStandardStepAction5EditPart(view);

			case PCNMonetaryBenefit5EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit5EditPart(view);

			case PCNMonetaryCost5EditPart.VISUAL_ID:
				return new PCNMonetaryCost5EditPart(view);

			case PCNNonMonetaryBenefit5EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit5EditPart(view);

			case PCNNonMonetaryCost5EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost5EditPart(view);

			case PCNTextualTag5EditPart.VISUAL_ID:
				return new PCNTextualTag5EditPart(view);

			case PCNTextualTagTag5EditPart.VISUAL_ID:
				return new PCNTextualTagTag5EditPart(view);

			case PCNSyncTag5EditPart.VISUAL_ID:
				return new PCNSyncTag5EditPart(view);

			case PCNDoAndWaitStepEditPart.VISUAL_ID:
				return new PCNDoAndWaitStepEditPart(view);

			case PCNDoAndWaitStepActionEditPart.VISUAL_ID:
				return new PCNDoAndWaitStepActionEditPart(view);

			case PCNMonetaryBenefit6EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit6EditPart(view);

			case PCNMonetaryCost6EditPart.VISUAL_ID:
				return new PCNMonetaryCost6EditPart(view);

			case PCNNonMonetaryBenefit6EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit6EditPart(view);

			case PCNNonMonetaryCost6EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost6EditPart(view);

			case PCNTextualTag6EditPart.VISUAL_ID:
				return new PCNTextualTag6EditPart(view);

			case PCNTextualTagTag6EditPart.VISUAL_ID:
				return new PCNTextualTagTag6EditPart(view);

			case PCNDelayTimeTagEditPart.VISUAL_ID:
				return new PCNDelayTimeTagEditPart(view);

			case PCNDelayTimeTagDelayTimeEditPart.VISUAL_ID:
				return new PCNDelayTimeTagDelayTimeEditPart(view);

			case PCNSyncTag6EditPart.VISUAL_ID:
				return new PCNSyncTag6EditPart(view);

			case PCNDoAndWaitStep2EditPart.VISUAL_ID:
				return new PCNDoAndWaitStep2EditPart(view);

			case PCNDoAndWaitStepAction2EditPart.VISUAL_ID:
				return new PCNDoAndWaitStepAction2EditPart(view);

			case PCNMonetaryBenefit7EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit7EditPart(view);

			case PCNMonetaryCost7EditPart.VISUAL_ID:
				return new PCNMonetaryCost7EditPart(view);

			case PCNNonMonetaryBenefit7EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit7EditPart(view);

			case PCNNonMonetaryCost7EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost7EditPart(view);

			case PCNTextualTag7EditPart.VISUAL_ID:
				return new PCNTextualTag7EditPart(view);

			case PCNTextualTagTag7EditPart.VISUAL_ID:
				return new PCNTextualTagTag7EditPart(view);

			case PCNDelayTimeTag2EditPart.VISUAL_ID:
				return new PCNDelayTimeTag2EditPart(view);

			case PCNDelayTimeTagDelayTime2EditPart.VISUAL_ID:
				return new PCNDelayTimeTagDelayTime2EditPart(view);

			case PCNSyncTag7EditPart.VISUAL_ID:
				return new PCNSyncTag7EditPart(view);

			case PCNDoAndWaitStep3EditPart.VISUAL_ID:
				return new PCNDoAndWaitStep3EditPart(view);

			case PCNDoAndWaitStepAction3EditPart.VISUAL_ID:
				return new PCNDoAndWaitStepAction3EditPart(view);

			case PCNMonetaryBenefit8EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit8EditPart(view);

			case PCNMonetaryCost8EditPart.VISUAL_ID:
				return new PCNMonetaryCost8EditPart(view);

			case PCNNonMonetaryBenefit8EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit8EditPart(view);

			case PCNNonMonetaryCost8EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost8EditPart(view);

			case PCNTextualTag8EditPart.VISUAL_ID:
				return new PCNTextualTag8EditPart(view);

			case PCNTextualTagTag8EditPart.VISUAL_ID:
				return new PCNTextualTagTag8EditPart(view);

			case PCNDelayTimeTag3EditPart.VISUAL_ID:
				return new PCNDelayTimeTag3EditPart(view);

			case PCNDelayTimeTagDelayTime3EditPart.VISUAL_ID:
				return new PCNDelayTimeTagDelayTime3EditPart(view);

			case PCNSyncTag8EditPart.VISUAL_ID:
				return new PCNSyncTag8EditPart(view);

			case PCNDoAndWaitStep4EditPart.VISUAL_ID:
				return new PCNDoAndWaitStep4EditPart(view);

			case PCNDoAndWaitStepAction4EditPart.VISUAL_ID:
				return new PCNDoAndWaitStepAction4EditPart(view);

			case PCNMonetaryBenefit9EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit9EditPart(view);

			case PCNMonetaryCost9EditPart.VISUAL_ID:
				return new PCNMonetaryCost9EditPart(view);

			case PCNNonMonetaryBenefit9EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit9EditPart(view);

			case PCNNonMonetaryCost9EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost9EditPart(view);

			case PCNTextualTag9EditPart.VISUAL_ID:
				return new PCNTextualTag9EditPart(view);

			case PCNTextualTagTag9EditPart.VISUAL_ID:
				return new PCNTextualTagTag9EditPart(view);

			case PCNDelayTimeTag4EditPart.VISUAL_ID:
				return new PCNDelayTimeTag4EditPart(view);

			case PCNDelayTimeTagDelayTime4EditPart.VISUAL_ID:
				return new PCNDelayTimeTagDelayTime4EditPart(view);

			case PCNSyncTag9EditPart.VISUAL_ID:
				return new PCNSyncTag9EditPart(view);

			case PCNDoAndWaitStep5EditPart.VISUAL_ID:
				return new PCNDoAndWaitStep5EditPart(view);

			case PCNDoAndWaitStepAction5EditPart.VISUAL_ID:
				return new PCNDoAndWaitStepAction5EditPart(view);

			case PCNMonetaryBenefit10EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit10EditPart(view);

			case PCNMonetaryCost10EditPart.VISUAL_ID:
				return new PCNMonetaryCost10EditPart(view);

			case PCNNonMonetaryBenefit10EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit10EditPart(view);

			case PCNNonMonetaryCost10EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost10EditPart(view);

			case PCNTextualTag10EditPart.VISUAL_ID:
				return new PCNTextualTag10EditPart(view);

			case PCNTextualTagTag10EditPart.VISUAL_ID:
				return new PCNTextualTagTag10EditPart(view);

			case PCNDelayTimeTag5EditPart.VISUAL_ID:
				return new PCNDelayTimeTag5EditPart(view);

			case PCNDelayTimeTagDelayTime5EditPart.VISUAL_ID:
				return new PCNDelayTimeTagDelayTime5EditPart(view);

			case PCNSyncTag10EditPart.VISUAL_ID:
				return new PCNSyncTag10EditPart(view);

			case PCNWaitStepEditPart.VISUAL_ID:
				return new PCNWaitStepEditPart(view);

			case PCNWaitStepActionEditPart.VISUAL_ID:
				return new PCNWaitStepActionEditPart(view);

			case PCNMonetaryBenefit11EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit11EditPart(view);

			case PCNMonetaryCost11EditPart.VISUAL_ID:
				return new PCNMonetaryCost11EditPart(view);

			case PCNNonMonetaryBenefit11EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit11EditPart(view);

			case PCNNonMonetaryCost11EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost11EditPart(view);

			case PCNTextualTag11EditPart.VISUAL_ID:
				return new PCNTextualTag11EditPart(view);

			case PCNTextualTagTag11EditPart.VISUAL_ID:
				return new PCNTextualTagTag11EditPart(view);

			case PCNDelayTimeTag6EditPart.VISUAL_ID:
				return new PCNDelayTimeTag6EditPart(view);

			case PCNDelayTimeTagDelayTime6EditPart.VISUAL_ID:
				return new PCNDelayTimeTagDelayTime6EditPart(view);

			case PCNSyncTag11EditPart.VISUAL_ID:
				return new PCNSyncTag11EditPart(view);

			case PCNWaitStep2EditPart.VISUAL_ID:
				return new PCNWaitStep2EditPart(view);

			case PCNWaitStepAction2EditPart.VISUAL_ID:
				return new PCNWaitStepAction2EditPart(view);

			case PCNMonetaryBenefit12EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit12EditPart(view);

			case PCNMonetaryCost12EditPart.VISUAL_ID:
				return new PCNMonetaryCost12EditPart(view);

			case PCNNonMonetaryBenefit12EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit12EditPart(view);

			case PCNNonMonetaryCost12EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost12EditPart(view);

			case PCNTextualTag12EditPart.VISUAL_ID:
				return new PCNTextualTag12EditPart(view);

			case PCNTextualTagTag12EditPart.VISUAL_ID:
				return new PCNTextualTagTag12EditPart(view);

			case PCNDelayTimeTag7EditPart.VISUAL_ID:
				return new PCNDelayTimeTag7EditPart(view);

			case PCNDelayTimeTagDelayTime7EditPart.VISUAL_ID:
				return new PCNDelayTimeTagDelayTime7EditPart(view);

			case PCNSyncTag12EditPart.VISUAL_ID:
				return new PCNSyncTag12EditPart(view);

			case PCNWaitStep3EditPart.VISUAL_ID:
				return new PCNWaitStep3EditPart(view);

			case PCNWaitStepAction3EditPart.VISUAL_ID:
				return new PCNWaitStepAction3EditPart(view);

			case PCNMonetaryBenefit13EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit13EditPart(view);

			case PCNMonetaryCost13EditPart.VISUAL_ID:
				return new PCNMonetaryCost13EditPart(view);

			case PCNNonMonetaryBenefit13EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit13EditPart(view);

			case PCNNonMonetaryCost13EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost13EditPart(view);

			case PCNTextualTag13EditPart.VISUAL_ID:
				return new PCNTextualTag13EditPart(view);

			case PCNTextualTagTag13EditPart.VISUAL_ID:
				return new PCNTextualTagTag13EditPart(view);

			case PCNDelayTimeTag8EditPart.VISUAL_ID:
				return new PCNDelayTimeTag8EditPart(view);

			case PCNDelayTimeTagDelayTime8EditPart.VISUAL_ID:
				return new PCNDelayTimeTagDelayTime8EditPart(view);

			case PCNSyncTag13EditPart.VISUAL_ID:
				return new PCNSyncTag13EditPart(view);

			case PCNWaitStep4EditPart.VISUAL_ID:
				return new PCNWaitStep4EditPart(view);

			case PCNWaitStepAction4EditPart.VISUAL_ID:
				return new PCNWaitStepAction4EditPart(view);

			case PCNMonetaryBenefit14EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit14EditPart(view);

			case PCNMonetaryCost14EditPart.VISUAL_ID:
				return new PCNMonetaryCost14EditPart(view);

			case PCNNonMonetaryBenefit14EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit14EditPart(view);

			case PCNNonMonetaryCost14EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost14EditPart(view);

			case PCNTextualTag14EditPart.VISUAL_ID:
				return new PCNTextualTag14EditPart(view);

			case PCNTextualTagTag14EditPart.VISUAL_ID:
				return new PCNTextualTagTag14EditPart(view);

			case PCNDelayTimeTag9EditPart.VISUAL_ID:
				return new PCNDelayTimeTag9EditPart(view);

			case PCNDelayTimeTagDelayTime9EditPart.VISUAL_ID:
				return new PCNDelayTimeTagDelayTime9EditPart(view);

			case PCNSyncTag14EditPart.VISUAL_ID:
				return new PCNSyncTag14EditPart(view);

			case PCNWaitStep5EditPart.VISUAL_ID:
				return new PCNWaitStep5EditPart(view);

			case PCNWaitStepAction5EditPart.VISUAL_ID:
				return new PCNWaitStepAction5EditPart(view);

			case PCNMonetaryBenefit15EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit15EditPart(view);

			case PCNMonetaryCost15EditPart.VISUAL_ID:
				return new PCNMonetaryCost15EditPart(view);

			case PCNNonMonetaryBenefit15EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit15EditPart(view);

			case PCNNonMonetaryCost15EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost15EditPart(view);

			case PCNTextualTag15EditPart.VISUAL_ID:
				return new PCNTextualTag15EditPart(view);

			case PCNTextualTagTag15EditPart.VISUAL_ID:
				return new PCNTextualTagTag15EditPart(view);

			case PCNDelayTimeTag10EditPart.VISUAL_ID:
				return new PCNDelayTimeTag10EditPart(view);

			case PCNDelayTimeTagDelayTime10EditPart.VISUAL_ID:
				return new PCNDelayTimeTagDelayTime10EditPart(view);

			case PCNSyncTag15EditPart.VISUAL_ID:
				return new PCNSyncTag15EditPart(view);

			case PCNInnovationStepEditPart.VISUAL_ID:
				return new PCNInnovationStepEditPart(view);

			case PCNInnovationStepActionEditPart.VISUAL_ID:
				return new PCNInnovationStepActionEditPart(view);

			case PCNMonetaryBenefit16EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit16EditPart(view);

			case PCNMonetaryCost16EditPart.VISUAL_ID:
				return new PCNMonetaryCost16EditPart(view);

			case PCNNonMonetaryBenefit16EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit16EditPart(view);

			case PCNNonMonetaryCost16EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost16EditPart(view);

			case PCNTextualTag16EditPart.VISUAL_ID:
				return new PCNTextualTag16EditPart(view);

			case PCNTextualTagTag16EditPart.VISUAL_ID:
				return new PCNTextualTagTag16EditPart(view);

			case PCNSyncTag16EditPart.VISUAL_ID:
				return new PCNSyncTag16EditPart(view);

			case PCNInnovationStep2EditPart.VISUAL_ID:
				return new PCNInnovationStep2EditPart(view);

			case PCNInnovationStepAction2EditPart.VISUAL_ID:
				return new PCNInnovationStepAction2EditPart(view);

			case PCNMonetaryBenefit17EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit17EditPart(view);

			case PCNMonetaryCost17EditPart.VISUAL_ID:
				return new PCNMonetaryCost17EditPart(view);

			case PCNNonMonetaryBenefit17EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit17EditPart(view);

			case PCNNonMonetaryCost17EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost17EditPart(view);

			case PCNTextualTag17EditPart.VISUAL_ID:
				return new PCNTextualTag17EditPart(view);

			case PCNTextualTagTag17EditPart.VISUAL_ID:
				return new PCNTextualTagTag17EditPart(view);

			case PCNSyncTag17EditPart.VISUAL_ID:
				return new PCNSyncTag17EditPart(view);

			case PCNInnovationStep3EditPart.VISUAL_ID:
				return new PCNInnovationStep3EditPart(view);

			case PCNInnovationStepAction3EditPart.VISUAL_ID:
				return new PCNInnovationStepAction3EditPart(view);

			case PCNMonetaryBenefit18EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit18EditPart(view);

			case PCNMonetaryCost18EditPart.VISUAL_ID:
				return new PCNMonetaryCost18EditPart(view);

			case PCNNonMonetaryBenefit18EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit18EditPart(view);

			case PCNNonMonetaryCost18EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost18EditPart(view);

			case PCNTextualTag18EditPart.VISUAL_ID:
				return new PCNTextualTag18EditPart(view);

			case PCNTextualTagTag18EditPart.VISUAL_ID:
				return new PCNTextualTagTag18EditPart(view);

			case PCNSyncTag18EditPart.VISUAL_ID:
				return new PCNSyncTag18EditPart(view);

			case PCNInnovationStep4EditPart.VISUAL_ID:
				return new PCNInnovationStep4EditPart(view);

			case PCNInnovationStepAction4EditPart.VISUAL_ID:
				return new PCNInnovationStepAction4EditPart(view);

			case PCNMonetaryBenefit19EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit19EditPart(view);

			case PCNMonetaryCost19EditPart.VISUAL_ID:
				return new PCNMonetaryCost19EditPart(view);

			case PCNNonMonetaryBenefit19EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit19EditPart(view);

			case PCNNonMonetaryCost19EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost19EditPart(view);

			case PCNTextualTag19EditPart.VISUAL_ID:
				return new PCNTextualTag19EditPart(view);

			case PCNTextualTagTag19EditPart.VISUAL_ID:
				return new PCNTextualTagTag19EditPart(view);

			case PCNSyncTag19EditPart.VISUAL_ID:
				return new PCNSyncTag19EditPart(view);

			case PCNInnovationStep5EditPart.VISUAL_ID:
				return new PCNInnovationStep5EditPart(view);

			case PCNInnovationStepAction5EditPart.VISUAL_ID:
				return new PCNInnovationStepAction5EditPart(view);

			case PCNMonetaryBenefit20EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit20EditPart(view);

			case PCNMonetaryCost20EditPart.VISUAL_ID:
				return new PCNMonetaryCost20EditPart(view);

			case PCNNonMonetaryBenefit20EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit20EditPart(view);

			case PCNNonMonetaryCost20EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost20EditPart(view);

			case PCNTextualTag20EditPart.VISUAL_ID:
				return new PCNTextualTag20EditPart(view);

			case PCNTextualTagTag20EditPart.VISUAL_ID:
				return new PCNTextualTagTag20EditPart(view);

			case PCNSyncTag20EditPart.VISUAL_ID:
				return new PCNSyncTag20EditPart(view);

			case PCNOutsourcedStepEditPart.VISUAL_ID:
				return new PCNOutsourcedStepEditPart(view);

			case PCNOutsourcedStepActionEditPart.VISUAL_ID:
				return new PCNOutsourcedStepActionEditPart(view);

			case PCNMonetaryBenefit21EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit21EditPart(view);

			case PCNMonetaryCost21EditPart.VISUAL_ID:
				return new PCNMonetaryCost21EditPart(view);

			case PCNNonMonetaryBenefit21EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit21EditPart(view);

			case PCNNonMonetaryCost21EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost21EditPart(view);

			case PCNTextualTag21EditPart.VISUAL_ID:
				return new PCNTextualTag21EditPart(view);

			case PCNTextualTagTag21EditPart.VISUAL_ID:
				return new PCNTextualTagTag21EditPart(view);

			case PCNSyncTag21EditPart.VISUAL_ID:
				return new PCNSyncTag21EditPart(view);

			case PCNOutsourcedStep2EditPart.VISUAL_ID:
				return new PCNOutsourcedStep2EditPart(view);

			case PCNOutsourcedStepAction2EditPart.VISUAL_ID:
				return new PCNOutsourcedStepAction2EditPart(view);

			case PCNMonetaryBenefit22EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit22EditPart(view);

			case PCNMonetaryCost22EditPart.VISUAL_ID:
				return new PCNMonetaryCost22EditPart(view);

			case PCNNonMonetaryBenefit22EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit22EditPart(view);

			case PCNNonMonetaryCost22EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost22EditPart(view);

			case PCNTextualTag22EditPart.VISUAL_ID:
				return new PCNTextualTag22EditPart(view);

			case PCNTextualTagTag22EditPart.VISUAL_ID:
				return new PCNTextualTagTag22EditPart(view);

			case PCNSyncTag22EditPart.VISUAL_ID:
				return new PCNSyncTag22EditPart(view);

			case PCNOutsourcedStep3EditPart.VISUAL_ID:
				return new PCNOutsourcedStep3EditPart(view);

			case PCNOutsourcedStepAction3EditPart.VISUAL_ID:
				return new PCNOutsourcedStepAction3EditPart(view);

			case PCNMonetaryBenefit23EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit23EditPart(view);

			case PCNMonetaryCost23EditPart.VISUAL_ID:
				return new PCNMonetaryCost23EditPart(view);

			case PCNNonMonetaryBenefit23EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit23EditPart(view);

			case PCNNonMonetaryCost23EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost23EditPart(view);

			case PCNTextualTag23EditPart.VISUAL_ID:
				return new PCNTextualTag23EditPart(view);

			case PCNTextualTagTag23EditPart.VISUAL_ID:
				return new PCNTextualTagTag23EditPart(view);

			case PCNSyncTag23EditPart.VISUAL_ID:
				return new PCNSyncTag23EditPart(view);

			case PCNOutsourcedStep4EditPart.VISUAL_ID:
				return new PCNOutsourcedStep4EditPart(view);

			case PCNOutsourcedStepAction4EditPart.VISUAL_ID:
				return new PCNOutsourcedStepAction4EditPart(view);

			case PCNMonetaryBenefit24EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit24EditPart(view);

			case PCNMonetaryCost24EditPart.VISUAL_ID:
				return new PCNMonetaryCost24EditPart(view);

			case PCNNonMonetaryBenefit24EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit24EditPart(view);

			case PCNNonMonetaryCost24EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost24EditPart(view);

			case PCNTextualTag24EditPart.VISUAL_ID:
				return new PCNTextualTag24EditPart(view);

			case PCNTextualTagTag24EditPart.VISUAL_ID:
				return new PCNTextualTagTag24EditPart(view);

			case PCNSyncTag24EditPart.VISUAL_ID:
				return new PCNSyncTag24EditPart(view);

			case PCNOutsourcedStep5EditPart.VISUAL_ID:
				return new PCNOutsourcedStep5EditPart(view);

			case PCNOutsourcedStepAction5EditPart.VISUAL_ID:
				return new PCNOutsourcedStepAction5EditPart(view);

			case PCNMonetaryBenefit25EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit25EditPart(view);

			case PCNMonetaryCost25EditPart.VISUAL_ID:
				return new PCNMonetaryCost25EditPart(view);

			case PCNNonMonetaryBenefit25EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit25EditPart(view);

			case PCNNonMonetaryCost25EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost25EditPart(view);

			case PCNTextualTag25EditPart.VISUAL_ID:
				return new PCNTextualTag25EditPart(view);

			case PCNTextualTagTag25EditPart.VISUAL_ID:
				return new PCNTextualTagTag25EditPart(view);

			case PCNSyncTag25EditPart.VISUAL_ID:
				return new PCNSyncTag25EditPart(view);

			case PCNDecisionStepEditPart.VISUAL_ID:
				return new PCNDecisionStepEditPart(view);

			case PCNDecisionStepActionEditPart.VISUAL_ID:
				return new PCNDecisionStepActionEditPart(view);

			case PCNMonetaryBenefit26EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit26EditPart(view);

			case PCNMonetaryCost26EditPart.VISUAL_ID:
				return new PCNMonetaryCost26EditPart(view);

			case PCNNonMonetaryBenefit26EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit26EditPart(view);

			case PCNNonMonetaryCost26EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost26EditPart(view);

			case PCNTextualTag26EditPart.VISUAL_ID:
				return new PCNTextualTag26EditPart(view);

			case PCNTextualTagTag26EditPart.VISUAL_ID:
				return new PCNTextualTagTag26EditPart(view);

			case PCNProbabilitiesTagEditPart.VISUAL_ID:
				return new PCNProbabilitiesTagEditPart(view);

			case PCNProbabilitiesTagYesProbabilityEditPart.VISUAL_ID:
				return new PCNProbabilitiesTagYesProbabilityEditPart(view);

			case PCNProbabilitiesTagNoProbabilityEditPart.VISUAL_ID:
				return new PCNProbabilitiesTagNoProbabilityEditPart(view);

			case PCNSyncTag26EditPart.VISUAL_ID:
				return new PCNSyncTag26EditPart(view);

			case PCNDecisionStep2EditPart.VISUAL_ID:
				return new PCNDecisionStep2EditPart(view);

			case PCNDecisionStepAction2EditPart.VISUAL_ID:
				return new PCNDecisionStepAction2EditPart(view);

			case PCNMonetaryBenefit27EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit27EditPart(view);

			case PCNMonetaryCost27EditPart.VISUAL_ID:
				return new PCNMonetaryCost27EditPart(view);

			case PCNNonMonetaryBenefit27EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit27EditPart(view);

			case PCNNonMonetaryCost27EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost27EditPart(view);

			case PCNTextualTag27EditPart.VISUAL_ID:
				return new PCNTextualTag27EditPart(view);

			case PCNTextualTagTag27EditPart.VISUAL_ID:
				return new PCNTextualTagTag27EditPart(view);

			case PCNProbabilitiesTag2EditPart.VISUAL_ID:
				return new PCNProbabilitiesTag2EditPart(view);

			case PCNProbabilitiesTagYesProbability2EditPart.VISUAL_ID:
				return new PCNProbabilitiesTagYesProbability2EditPart(view);

			case PCNProbabilitiesTagNoProbability2EditPart.VISUAL_ID:
				return new PCNProbabilitiesTagNoProbability2EditPart(view);

			case PCNSyncTag27EditPart.VISUAL_ID:
				return new PCNSyncTag27EditPart(view);

			case PCNDecisionStep3EditPart.VISUAL_ID:
				return new PCNDecisionStep3EditPart(view);

			case PCNDecisionStepAction3EditPart.VISUAL_ID:
				return new PCNDecisionStepAction3EditPart(view);

			case PCNMonetaryBenefit28EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit28EditPart(view);

			case PCNMonetaryCost28EditPart.VISUAL_ID:
				return new PCNMonetaryCost28EditPart(view);

			case PCNNonMonetaryBenefit28EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit28EditPart(view);

			case PCNNonMonetaryCost28EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost28EditPart(view);

			case PCNTextualTag28EditPart.VISUAL_ID:
				return new PCNTextualTag28EditPart(view);

			case PCNTextualTagTag28EditPart.VISUAL_ID:
				return new PCNTextualTagTag28EditPart(view);

			case PCNProbabilitiesTag3EditPart.VISUAL_ID:
				return new PCNProbabilitiesTag3EditPart(view);

			case PCNProbabilitiesTagYesProbability3EditPart.VISUAL_ID:
				return new PCNProbabilitiesTagYesProbability3EditPart(view);

			case PCNProbabilitiesTagNoProbability3EditPart.VISUAL_ID:
				return new PCNProbabilitiesTagNoProbability3EditPart(view);

			case PCNSyncTag28EditPart.VISUAL_ID:
				return new PCNSyncTag28EditPart(view);

			case PCNDecisionStep4EditPart.VISUAL_ID:
				return new PCNDecisionStep4EditPart(view);

			case PCNDecisionStepAction4EditPart.VISUAL_ID:
				return new PCNDecisionStepAction4EditPart(view);

			case PCNMonetaryBenefit29EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit29EditPart(view);

			case PCNMonetaryCost29EditPart.VISUAL_ID:
				return new PCNMonetaryCost29EditPart(view);

			case PCNNonMonetaryBenefit29EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit29EditPart(view);

			case PCNNonMonetaryCost29EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost29EditPart(view);

			case PCNTextualTag29EditPart.VISUAL_ID:
				return new PCNTextualTag29EditPart(view);

			case PCNTextualTagTag29EditPart.VISUAL_ID:
				return new PCNTextualTagTag29EditPart(view);

			case PCNProbabilitiesTag4EditPart.VISUAL_ID:
				return new PCNProbabilitiesTag4EditPart(view);

			case PCNProbabilitiesTagYesProbability4EditPart.VISUAL_ID:
				return new PCNProbabilitiesTagYesProbability4EditPart(view);

			case PCNProbabilitiesTagNoProbability4EditPart.VISUAL_ID:
				return new PCNProbabilitiesTagNoProbability4EditPart(view);

			case PCNSyncTag29EditPart.VISUAL_ID:
				return new PCNSyncTag29EditPart(view);

			case PCNDecisionStep5EditPart.VISUAL_ID:
				return new PCNDecisionStep5EditPart(view);

			case PCNDecisionStepAction5EditPart.VISUAL_ID:
				return new PCNDecisionStepAction5EditPart(view);

			case PCNMonetaryBenefit30EditPart.VISUAL_ID:
				return new PCNMonetaryBenefit30EditPart(view);

			case PCNMonetaryCost30EditPart.VISUAL_ID:
				return new PCNMonetaryCost30EditPart(view);

			case PCNNonMonetaryBenefit30EditPart.VISUAL_ID:
				return new PCNNonMonetaryBenefit30EditPart(view);

			case PCNNonMonetaryCost30EditPart.VISUAL_ID:
				return new PCNNonMonetaryCost30EditPart(view);

			case PCNTextualTag30EditPart.VISUAL_ID:
				return new PCNTextualTag30EditPart(view);

			case PCNTextualTagTag30EditPart.VISUAL_ID:
				return new PCNTextualTagTag30EditPart(view);

			case PCNProbabilitiesTag5EditPart.VISUAL_ID:
				return new PCNProbabilitiesTag5EditPart(view);

			case PCNProbabilitiesTagYesProbability5EditPart.VISUAL_ID:
				return new PCNProbabilitiesTagYesProbability5EditPart(view);

			case PCNProbabilitiesTagNoProbability5EditPart.VISUAL_ID:
				return new PCNProbabilitiesTagNoProbability5EditPart(view);

			case PCNSyncTag30EditPart.VISUAL_ID:
				return new PCNSyncTag30EditPart(view);

			case PCNReferenceEditPart.VISUAL_ID:
				return new PCNReferenceEditPart(view);

			case PCNReferenceLetterEditPart.VISUAL_ID:
				return new PCNReferenceLetterEditPart(view);

			case PCNReferenceNumberEditPart.VISUAL_ID:
				return new PCNReferenceNumberEditPart(view);

			case PCNReference2EditPart.VISUAL_ID:
				return new PCNReference2EditPart(view);

			case PCNReferenceLetter2EditPart.VISUAL_ID:
				return new PCNReferenceLetter2EditPart(view);

			case PCNReferenceNumber2EditPart.VISUAL_ID:
				return new PCNReferenceNumber2EditPart(view);

			case PCNReference3EditPart.VISUAL_ID:
				return new PCNReference3EditPart(view);

			case PCNReferenceLetter3EditPart.VISUAL_ID:
				return new PCNReferenceLetter3EditPart(view);

			case PCNReferenceNumber3EditPart.VISUAL_ID:
				return new PCNReferenceNumber3EditPart(view);

			case PCNReference4EditPart.VISUAL_ID:
				return new PCNReference4EditPart(view);

			case PCNReferenceLetter4EditPart.VISUAL_ID:
				return new PCNReferenceLetter4EditPart(view);

			case PCNReferenceNumber4EditPart.VISUAL_ID:
				return new PCNReferenceNumber4EditPart(view);

			case PCNReference5EditPart.VISUAL_ID:
				return new PCNReference5EditPart(view);

			case PCNReferenceLetter5EditPart.VISUAL_ID:
				return new PCNReferenceLetter5EditPart(view);

			case PCNReferenceNumber5EditPart.VISUAL_ID:
				return new PCNReferenceNumber5EditPart(view);

			case PCNProcessEntityCompartmentLeftDirEditPart.VISUAL_ID:
				return new PCNProcessEntityCompartmentLeftDirEditPart(view);

			case PCNProcessEntityCompartmentLeftSurEditPart.VISUAL_ID:
				return new PCNProcessEntityCompartmentLeftSurEditPart(view);

			case PCNProcessEntityCompartmentIndEditPart.VISUAL_ID:
				return new PCNProcessEntityCompartmentIndEditPart(view);

			case PCNProcessEntityCompartmentRightSurEditPart.VISUAL_ID:
				return new PCNProcessEntityCompartmentRightSurEditPart(view);

			case PCNProcessEntityCompartmentRightDirEditPart.VISUAL_ID:
				return new PCNProcessEntityCompartmentRightDirEditPart(view);

			case PCNStandardStepCompartmentStandardProcessTagsEditPart.VISUAL_ID:
				return new PCNStandardStepCompartmentStandardProcessTagsEditPart(view);

			case PCNStandardStepCompartmentStandardProcessTags2EditPart.VISUAL_ID:
				return new PCNStandardStepCompartmentStandardProcessTags2EditPart(view);

			case PCNStandardStepCompartmentStandardProcessTags3EditPart.VISUAL_ID:
				return new PCNStandardStepCompartmentStandardProcessTags3EditPart(view);

			case PCNStandardStepCompartmentStandardProcessTags4EditPart.VISUAL_ID:
				return new PCNStandardStepCompartmentStandardProcessTags4EditPart(view);

			case PCNStandardStepCompartmentStandardProcessTags5EditPart.VISUAL_ID:
				return new PCNStandardStepCompartmentStandardProcessTags5EditPart(view);

			case PCNDoAndWaitStepCompartmentLongProcessTagsEditPart.VISUAL_ID:
				return new PCNDoAndWaitStepCompartmentLongProcessTagsEditPart(view);

			case PCNDoAndWaitStepCompartmentLongProcessTags2EditPart.VISUAL_ID:
				return new PCNDoAndWaitStepCompartmentLongProcessTags2EditPart(view);

			case PCNDoAndWaitStepCompartmentLongProcessTags3EditPart.VISUAL_ID:
				return new PCNDoAndWaitStepCompartmentLongProcessTags3EditPart(view);

			case PCNDoAndWaitStepCompartmentLongProcessTags4EditPart.VISUAL_ID:
				return new PCNDoAndWaitStepCompartmentLongProcessTags4EditPart(view);

			case PCNDoAndWaitStepCompartmentLongProcessTags5EditPart.VISUAL_ID:
				return new PCNDoAndWaitStepCompartmentLongProcessTags5EditPart(view);

			case PCNWaitStepCompartmentWaitProcessTagsEditPart.VISUAL_ID:
				return new PCNWaitStepCompartmentWaitProcessTagsEditPart(view);

			case PCNWaitStepCompartmentWaitProcessTags2EditPart.VISUAL_ID:
				return new PCNWaitStepCompartmentWaitProcessTags2EditPart(view);

			case PCNWaitStepCompartmentWaitProcessTags3EditPart.VISUAL_ID:
				return new PCNWaitStepCompartmentWaitProcessTags3EditPart(view);

			case PCNWaitStepCompartmentWaitProcessTags4EditPart.VISUAL_ID:
				return new PCNWaitStepCompartmentWaitProcessTags4EditPart(view);

			case PCNWaitStepCompartmentWaitProcessTags5EditPart.VISUAL_ID:
				return new PCNWaitStepCompartmentWaitProcessTags5EditPart(view);

			case PCNInnovationStepCompartmentHighlightTagsEditPart.VISUAL_ID:
				return new PCNInnovationStepCompartmentHighlightTagsEditPart(view);

			case PCNInnovationStepCompartmentHighlightTags2EditPart.VISUAL_ID:
				return new PCNInnovationStepCompartmentHighlightTags2EditPart(view);

			case PCNInnovationStepCompartmentHighlightTags3EditPart.VISUAL_ID:
				return new PCNInnovationStepCompartmentHighlightTags3EditPart(view);

			case PCNInnovationStepCompartmentHighlightTags4EditPart.VISUAL_ID:
				return new PCNInnovationStepCompartmentHighlightTags4EditPart(view);

			case PCNInnovationStepCompartmentHighlightTags5EditPart.VISUAL_ID:
				return new PCNInnovationStepCompartmentHighlightTags5EditPart(view);

			case PCNOutsourcedStepCompartmentPreparationTagsEditPart.VISUAL_ID:
				return new PCNOutsourcedStepCompartmentPreparationTagsEditPart(view);

			case PCNOutsourcedStepCompartmentPreparationTags2EditPart.VISUAL_ID:
				return new PCNOutsourcedStepCompartmentPreparationTags2EditPart(view);

			case PCNOutsourcedStepCompartmentPreparationTags3EditPart.VISUAL_ID:
				return new PCNOutsourcedStepCompartmentPreparationTags3EditPart(view);

			case PCNOutsourcedStepCompartmentPreparationTags4EditPart.VISUAL_ID:
				return new PCNOutsourcedStepCompartmentPreparationTags4EditPart(view);

			case PCNOutsourcedStepCompartmentPreparationTags5EditPart.VISUAL_ID:
				return new PCNOutsourcedStepCompartmentPreparationTags5EditPart(view);

			case PCNDecisionStepCompartmentDecisionProcessTagsEditPart.VISUAL_ID:
				return new PCNDecisionStepCompartmentDecisionProcessTagsEditPart(view);

			case PCNDecisionStepCompartmentDecisionProcessTags2EditPart.VISUAL_ID:
				return new PCNDecisionStepCompartmentDecisionProcessTags2EditPart(view);

			case PCNDecisionStepCompartmentDecisionProcessTags3EditPart.VISUAL_ID:
				return new PCNDecisionStepCompartmentDecisionProcessTags3EditPart(view);

			case PCNDecisionStepCompartmentDecisionProcessTags4EditPart.VISUAL_ID:
				return new PCNDecisionStepCompartmentDecisionProcessTags4EditPart(view);

			case PCNDecisionStepCompartmentDecisionProcessTags5EditPart.VISUAL_ID:
				return new PCNDecisionStepCompartmentDecisionProcessTags5EditPart(view);

			case PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID:
				return new PCNRegularProcessStepPCNStandardDependencyEditPart(view);

			case PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID:
				return new PCNRegularProcessStepPCNDelayedDependencyEditPart(view);

			case PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID:
				return new PCNDecisionStepPCNNegativeDecisionEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID:
				return new PCNDecisionStepPCNPositiveDecisionEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
