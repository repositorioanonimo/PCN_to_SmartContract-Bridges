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
import pcn.diagram.edit.parts.PCNDoAndWaitStep2EditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStep3EditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStep4EditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStep5EditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStepEditPart;
import pcn.diagram.edit.parts.PCNInnovationStep2EditPart;
import pcn.diagram.edit.parts.PCNInnovationStep3EditPart;
import pcn.diagram.edit.parts.PCNInnovationStep4EditPart;
import pcn.diagram.edit.parts.PCNInnovationStep5EditPart;
import pcn.diagram.edit.parts.PCNInnovationStepEditPart;
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
public class PcnModelingAssistantProviderOfPCNWaitStep4EditPart extends PcnModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((PCNWaitStep4EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(PCNWaitStep4EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((PCNWaitStep4EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(PCNWaitStep4EditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof PCNStandardStepEditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNStandardStep2EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNStandardStep3EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNStandardStep4EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNStandardStep5EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNDoAndWaitStepEditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNDoAndWaitStep2EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNDoAndWaitStep3EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNDoAndWaitStep4EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNDoAndWaitStep5EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNWaitStepEditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNWaitStep2EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNWaitStep3EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNWaitStep4EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNWaitStep5EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNInnovationStepEditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNInnovationStep2EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNInnovationStep3EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNInnovationStep4EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNInnovationStep5EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNOutsourcedStepEditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNOutsourcedStep2EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNOutsourcedStep3EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNOutsourcedStep4EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNOutsourcedStep5EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNDecisionStepEditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNDecisionStep2EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNDecisionStep3EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNDecisionStep4EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNDecisionStep5EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNReferenceEditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNReference2EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNReference3EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNReference4EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNReference5EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		}
		if (targetEditPart instanceof PCNStandardStepEditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNStandardStep2EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNStandardStep3EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNStandardStep4EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNStandardStep5EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNDoAndWaitStepEditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNDoAndWaitStep2EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNDoAndWaitStep3EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNDoAndWaitStep4EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNDoAndWaitStep5EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNWaitStepEditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNWaitStep2EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNWaitStep3EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNWaitStep4EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNWaitStep5EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNInnovationStepEditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNInnovationStep2EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNInnovationStep3EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNInnovationStep4EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNInnovationStep5EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNOutsourcedStepEditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNOutsourcedStep2EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNOutsourcedStep3EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNOutsourcedStep4EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNOutsourcedStep5EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNDecisionStepEditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNDecisionStep2EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNDecisionStep3EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNDecisionStep4EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNDecisionStep5EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNReferenceEditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNReference2EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNReference3EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNReference4EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		if (targetEditPart instanceof PCNReference5EditPart) {
			types.add(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((PCNWaitStep4EditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(PCNWaitStep4EditPart source, IElementType relationshipType) {
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
			types.add(PcnElementTypes.PCNDecisionStep_3036);
			types.add(PcnElementTypes.PCNDecisionStep_3037);
			types.add(PcnElementTypes.PCNDecisionStep_3038);
			types.add(PcnElementTypes.PCNDecisionStep_3039);
			types.add(PcnElementTypes.PCNDecisionStep_3040);
			types.add(PcnElementTypes.PCNReference_3041);
			types.add(PcnElementTypes.PCNReference_3042);
			types.add(PcnElementTypes.PCNReference_3043);
			types.add(PcnElementTypes.PCNReference_3044);
			types.add(PcnElementTypes.PCNReference_3045);
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
			types.add(PcnElementTypes.PCNDecisionStep_3036);
			types.add(PcnElementTypes.PCNDecisionStep_3037);
			types.add(PcnElementTypes.PCNDecisionStep_3038);
			types.add(PcnElementTypes.PCNDecisionStep_3039);
			types.add(PcnElementTypes.PCNDecisionStep_3040);
			types.add(PcnElementTypes.PCNReference_3041);
			types.add(PcnElementTypes.PCNReference_3042);
			types.add(PcnElementTypes.PCNReference_3043);
			types.add(PcnElementTypes.PCNReference_3044);
			types.add(PcnElementTypes.PCNReference_3045);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((PCNWaitStep4EditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(PCNWaitStep4EditPart target) {
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
		return doGetTypesForSource((PCNWaitStep4EditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(PCNWaitStep4EditPart target, IElementType relationshipType) {
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
