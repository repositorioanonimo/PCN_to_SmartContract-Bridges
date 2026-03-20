package pcn.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import pcn.diagram.edit.parts.PCNDecisionStep2EditPart;
import pcn.diagram.edit.parts.PCNDecisionStep3EditPart;
import pcn.diagram.edit.parts.PCNDecisionStep4EditPart;
import pcn.diagram.edit.parts.PCNDecisionStep5EditPart;
import pcn.diagram.edit.parts.PCNDecisionStepEditPart;

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
import pcn.diagram.edit.parts.PCNOutsourcedStep2EditPart;
import pcn.diagram.edit.parts.PCNOutsourcedStep3EditPart;
import pcn.diagram.edit.parts.PCNOutsourcedStep4EditPart;
import pcn.diagram.edit.parts.PCNOutsourcedStep5EditPart;
import pcn.diagram.edit.parts.PCNOutsourcedStepEditPart;
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
import pcn.diagram.providers.PcnElementTypes;
import pcn.diagram.providers.PcnModelingAssistantProvider;

/**
 * @generated
 */
public class PcnModelingAssistantProviderOfPCNReference2EditPart extends PcnModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((PCNReference2EditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(PCNReference2EditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		types.add(PcnElementTypes.PCNDecisionStepPCNNegativeDecision_4007);
		types.add(PcnElementTypes.PCNDecisionStepPCNPositiveDecision_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((PCNReference2EditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(PCNReference2EditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008) {
			types.add(PcnElementTypes.PCNStandardStep_3011);
			types.add(PcnElementTypes.PCNStandardStep_3012);
			types.add(PcnElementTypes.PCNStandardStep_3013);
			types.add(PcnElementTypes.PCNStandardStep_3014);
			types.add(PcnElementTypes.PCNStandardStep_3015);
			types.add(PcnElementTypes.PCNDoAndWaitStep_3016);
			types.add(PcnElementTypes.PCNDoAndWaitStep_3017);
			types.add(PcnElementTypes.PCNDoAndWaitStep_3018);
			types.add(PcnElementTypes.PCNDoAndWaitStep_3019);
			types.add(PcnElementTypes.PCNDoAndWaitStep_3020);
			types.add(PcnElementTypes.PCNWaitStep_3021);
			types.add(PcnElementTypes.PCNWaitStep_3022);
			types.add(PcnElementTypes.PCNWaitStep_3023);
			types.add(PcnElementTypes.PCNWaitStep_3024);
			types.add(PcnElementTypes.PCNWaitStep_3025);
			types.add(PcnElementTypes.PCNInnovationStep_3026);
			types.add(PcnElementTypes.PCNInnovationStep_3027);
			types.add(PcnElementTypes.PCNInnovationStep_3028);
			types.add(PcnElementTypes.PCNInnovationStep_3029);
			types.add(PcnElementTypes.PCNInnovationStep_3030);
			types.add(PcnElementTypes.PCNOutsourcedStep_3031);
			types.add(PcnElementTypes.PCNOutsourcedStep_3032);
			types.add(PcnElementTypes.PCNOutsourcedStep_3033);
			types.add(PcnElementTypes.PCNOutsourcedStep_3034);
			types.add(PcnElementTypes.PCNOutsourcedStep_3035);
		} else if (relationshipType == PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009) {
			types.add(PcnElementTypes.PCNStandardStep_3011);
			types.add(PcnElementTypes.PCNStandardStep_3012);
			types.add(PcnElementTypes.PCNStandardStep_3013);
			types.add(PcnElementTypes.PCNStandardStep_3014);
			types.add(PcnElementTypes.PCNStandardStep_3015);
			types.add(PcnElementTypes.PCNDoAndWaitStep_3016);
			types.add(PcnElementTypes.PCNDoAndWaitStep_3017);
			types.add(PcnElementTypes.PCNDoAndWaitStep_3018);
			types.add(PcnElementTypes.PCNDoAndWaitStep_3019);
			types.add(PcnElementTypes.PCNDoAndWaitStep_3020);
			types.add(PcnElementTypes.PCNWaitStep_3021);
			types.add(PcnElementTypes.PCNWaitStep_3022);
			types.add(PcnElementTypes.PCNWaitStep_3023);
			types.add(PcnElementTypes.PCNWaitStep_3024);
			types.add(PcnElementTypes.PCNWaitStep_3025);
			types.add(PcnElementTypes.PCNInnovationStep_3026);
			types.add(PcnElementTypes.PCNInnovationStep_3027);
			types.add(PcnElementTypes.PCNInnovationStep_3028);
			types.add(PcnElementTypes.PCNInnovationStep_3029);
			types.add(PcnElementTypes.PCNInnovationStep_3030);
			types.add(PcnElementTypes.PCNOutsourcedStep_3031);
			types.add(PcnElementTypes.PCNOutsourcedStep_3032);
			types.add(PcnElementTypes.PCNOutsourcedStep_3033);
			types.add(PcnElementTypes.PCNOutsourcedStep_3034);
			types.add(PcnElementTypes.PCNOutsourcedStep_3035);
		} else if (relationshipType == PcnElementTypes.PCNDecisionStepPCNNegativeDecision_4007) {
			types.add(PcnElementTypes.PCNDecisionStep_3036);
			types.add(PcnElementTypes.PCNDecisionStep_3037);
			types.add(PcnElementTypes.PCNDecisionStep_3038);
			types.add(PcnElementTypes.PCNDecisionStep_3039);
			types.add(PcnElementTypes.PCNDecisionStep_3040);
		} else if (relationshipType == PcnElementTypes.PCNDecisionStepPCNPositiveDecision_4006) {
			types.add(PcnElementTypes.PCNDecisionStep_3036);
			types.add(PcnElementTypes.PCNDecisionStep_3037);
			types.add(PcnElementTypes.PCNDecisionStep_3038);
			types.add(PcnElementTypes.PCNDecisionStep_3039);
			types.add(PcnElementTypes.PCNDecisionStep_3040);
		}
		return types;
	}

}
