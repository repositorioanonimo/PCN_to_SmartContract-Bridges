package pcn.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import pcn.PCNDecisionStep;
import pcn.PCNDelayTimeTag;
import pcn.PCNDelayedDependency;
import pcn.PCNDiagram;
import pcn.PCNEndProcessStep;
import pcn.PCNInnovationStep;
import pcn.PCNDoAndWaitStep;
import pcn.PCNMonetaryBenefit;
import pcn.PCNMonetaryCost;
import pcn.PCNNegativeDecision;
import pcn.PCNNonMonetaryBenefit;
import pcn.PCNNonMonetaryCost;
import pcn.PCNOptionalDependency;
import pcn.PCNPositiveDecision;
import pcn.PCNProbabilitiesTag;
import pcn.PCNOutsourcedStep;
import pcn.PCNProcessEntity;
import pcn.PCNProcessStep;
import pcn.PCNReference;
import pcn.PCNRegularProcessStep;
import pcn.PCNStandardDependency;
import pcn.PCNStandardStep;
import pcn.PCNStartProcessStep;
import pcn.PCNSyncTag;
import pcn.PCNTag;
import pcn.PCNTextualTag;
import pcn.PCNWaitStep;
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
import pcn.diagram.edit.parts.PCNInnovationStepCompartmentHighlightTagsEditPart;
import pcn.diagram.edit.parts.PCNInnovationStepEditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStep2EditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStep3EditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStep4EditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStep5EditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStepEditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefit2EditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefit3EditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefit4EditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefit5EditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefit6EditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefitEditPart;
import pcn.diagram.edit.parts.PCNMonetaryCost2EditPart;
import pcn.diagram.edit.parts.PCNMonetaryCost3EditPart;
import pcn.diagram.edit.parts.PCNMonetaryCost4EditPart;
import pcn.diagram.edit.parts.PCNMonetaryCost5EditPart;
import pcn.diagram.edit.parts.PCNMonetaryCost6EditPart;
import pcn.diagram.edit.parts.PCNMonetaryCostEditPart;

import pcn.diagram.edit.parts.PCNNonMonetaryBenefit2EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryBenefit3EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryBenefit4EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryBenefit5EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryBenefit6EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryBenefitEditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCost2EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCost3EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCost4EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCost5EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCost6EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCostEditPart;

import pcn.diagram.edit.parts.PCNOutsourcedStep2EditPart;
import pcn.diagram.edit.parts.PCNOutsourcedStep3EditPart;
import pcn.diagram.edit.parts.PCNOutsourcedStep4EditPart;
import pcn.diagram.edit.parts.PCNOutsourcedStep5EditPart;
import pcn.diagram.edit.parts.PCNOutsourcedStepEditPart;
import pcn.diagram.edit.parts.PCNProcessEntityCompartmentIndEditPart;
import pcn.diagram.edit.parts.PCNProcessEntityCompartmentLeftDirEditPart;
import pcn.diagram.edit.parts.PCNProcessEntityCompartmentLeftSurEditPart;
import pcn.diagram.edit.parts.PCNProcessEntityCompartmentRightDirEditPart;
import pcn.diagram.edit.parts.PCNProcessEntityCompartmentRightSurEditPart;
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
import pcn.diagram.edit.parts.PCNStandardStepCompartmentStandardProcessTags2EditPart;
import pcn.diagram.edit.parts.PCNStandardStepCompartmentStandardProcessTags3EditPart;
import pcn.diagram.edit.parts.PCNStandardStepCompartmentStandardProcessTags4EditPart;
import pcn.diagram.edit.parts.PCNStandardStepCompartmentStandardProcessTags5EditPart;
import pcn.diagram.edit.parts.PCNStandardStepCompartmentStandardProcessTagsEditPart;
import pcn.diagram.edit.parts.PCNStandardStepEditPart;

import pcn.diagram.edit.parts.PCNWaitStep2EditPart;
import pcn.diagram.edit.parts.PCNWaitStep3EditPart;
import pcn.diagram.edit.parts.PCNWaitStep4EditPart;
import pcn.diagram.edit.parts.PCNWaitStep5EditPart;
import pcn.diagram.edit.parts.PCNWaitStepEditPart;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PcnDiagramUpdater {

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getSemanticChildren(View view) {
		switch (PcnVisualIDRegistry.getVisualID(view)) {
		case PCNDiagramEditPart.VISUAL_ID:
			return getPCNDiagram_1000SemanticChildren(view);
		case PCNProcessEntityCompartmentLeftDirEditPart.VISUAL_ID:
			return getPCNProcessEntityCompartmentLeftDir_7001SemanticChildren(view);
		case PCNProcessEntityCompartmentLeftSurEditPart.VISUAL_ID:
			return getPCNProcessEntityCompartmentLeftSur_7002SemanticChildren(view);
		case PCNProcessEntityCompartmentIndEditPart.VISUAL_ID:
			return getPCNProcessEntityCompartmentInd_7003SemanticChildren(view);
		case PCNProcessEntityCompartmentRightSurEditPart.VISUAL_ID:
			return getPCNProcessEntityCompartmentRightSur_7004SemanticChildren(view);
		case PCNProcessEntityCompartmentRightDirEditPart.VISUAL_ID:
			return getPCNProcessEntityCompartmentRightDir_7005SemanticChildren(view);
		case PCNStandardStepCompartmentStandardProcessTagsEditPart.VISUAL_ID:
			return getPCNStandardStepCompartmentStandardProcessTags_7006SemanticChildren(view);
		case PCNStandardStepCompartmentStandardProcessTags2EditPart.VISUAL_ID:
			return getPCNStandardStepCompartmentStandardProcessTags_7007SemanticChildren(view);
		case PCNStandardStepCompartmentStandardProcessTags3EditPart.VISUAL_ID:
			return getPCNStandardStepCompartmentStandardProcessTags_7008SemanticChildren(view);
		case PCNStandardStepCompartmentStandardProcessTags4EditPart.VISUAL_ID:
			return getPCNStandardStepCompartmentStandardProcessTags_7009SemanticChildren(view);
		case PCNStandardStepCompartmentStandardProcessTags5EditPart.VISUAL_ID:
			return getPCNStandardStepCompartmentStandardProcessTags_7010SemanticChildren(view);
		case PCNDoAndWaitStepCompartmentLongProcessTagsEditPart.VISUAL_ID:
			return getPCNDoAndWaitStepCompartmentLongProcessTags_7026SemanticChildren(view);
		case PCNDoAndWaitStepCompartmentLongProcessTags2EditPart.VISUAL_ID:
			return getPCNDoAndWaitStepCompartmentLongProcessTags_7027SemanticChildren(view);
		case PCNDoAndWaitStepCompartmentLongProcessTags3EditPart.VISUAL_ID:
			return getPCNDoAndWaitStepCompartmentLongProcessTags_7028SemanticChildren(view);
		case PCNDoAndWaitStepCompartmentLongProcessTags4EditPart.VISUAL_ID:
			return getPCNDoAndWaitStepCompartmentLongProcessTags_7029SemanticChildren(view);
		case PCNDoAndWaitStepCompartmentLongProcessTags5EditPart.VISUAL_ID:
			return getPCNDoAndWaitStepCompartmentLongProcessTags_7030SemanticChildren(view);
		case PCNWaitStepCompartmentWaitProcessTagsEditPart.VISUAL_ID:
			return getPCNWaitStepCompartmentWaitProcessTags_7021SemanticChildren(view);
		case PCNWaitStepCompartmentWaitProcessTags2EditPart.VISUAL_ID:
			return getPCNWaitStepCompartmentWaitProcessTags_7022SemanticChildren(view);
		case PCNWaitStepCompartmentWaitProcessTags3EditPart.VISUAL_ID:
			return getPCNWaitStepCompartmentWaitProcessTags_7023SemanticChildren(view);
		case PCNWaitStepCompartmentWaitProcessTags4EditPart.VISUAL_ID:
			return getPCNWaitStepCompartmentWaitProcessTags_7024SemanticChildren(view);
		case PCNWaitStepCompartmentWaitProcessTags5EditPart.VISUAL_ID:
			return getPCNWaitStepCompartmentWaitProcessTags_7025SemanticChildren(view);
		case PCNInnovationStepCompartmentHighlightTagsEditPart.VISUAL_ID:
			return getPCNInnovationStepCompartmentHighlightTags_7011SemanticChildren(view);
		case PCNInnovationStepCompartmentHighlightTags2EditPart.VISUAL_ID:
			return getPCNInnovationStepCompartmentHighlightTags_7012SemanticChildren(view);
		case PCNInnovationStepCompartmentHighlightTags3EditPart.VISUAL_ID:
			return getPCNInnovationStepCompartmentHighlightTags_7013SemanticChildren(view);
		case PCNInnovationStepCompartmentHighlightTags4EditPart.VISUAL_ID:
			return getPCNInnovationStepCompartmentHighlightTags_7014SemanticChildren(view);
		case PCNInnovationStepCompartmentHighlightTags5EditPart.VISUAL_ID:
			return getPCNInnovationStepCompartmentHighlightTags_7015SemanticChildren(view);
		case PCNOutsourcedStepCompartmentPreparationTagsEditPart.VISUAL_ID:
			return getPCNOutsourcedStepCompartmentPreparationTags_7016SemanticChildren(view);
		case PCNOutsourcedStepCompartmentPreparationTags2EditPart.VISUAL_ID:
			return getPCNOutsourcedStepCompartmentPreparationTags_7017SemanticChildren(view);
		case PCNOutsourcedStepCompartmentPreparationTags3EditPart.VISUAL_ID:
			return getPCNOutsourcedStepCompartmentPreparationTags_7018SemanticChildren(view);
		case PCNOutsourcedStepCompartmentPreparationTags4EditPart.VISUAL_ID:
			return getPCNOutsourcedStepCompartmentPreparationTags_7019SemanticChildren(view);
		case PCNOutsourcedStepCompartmentPreparationTags5EditPart.VISUAL_ID:
			return getPCNOutsourcedStepCompartmentPreparationTags_7020SemanticChildren(view);
		case PCNDecisionStepCompartmentDecisionProcessTagsEditPart.VISUAL_ID:
			return getPCNDecisionStepCompartmentDecisionProcessTags_7031SemanticChildren(view);
		case PCNDecisionStepCompartmentDecisionProcessTags2EditPart.VISUAL_ID:
			return getPCNDecisionStepCompartmentDecisionProcessTags_7032SemanticChildren(view);
		case PCNDecisionStepCompartmentDecisionProcessTags3EditPart.VISUAL_ID:
			return getPCNDecisionStepCompartmentDecisionProcessTags_7033SemanticChildren(view);
		case PCNDecisionStepCompartmentDecisionProcessTags4EditPart.VISUAL_ID:
			return getPCNDecisionStepCompartmentDecisionProcessTags_7034SemanticChildren(view);
		case PCNDecisionStepCompartmentDecisionProcessTags5EditPart.VISUAL_ID:
			return getPCNDecisionStepCompartmentDecisionProcessTags_7035SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		PCNDiagram modelElement = (PCNDiagram) view.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDiagramEntities().iterator(); it.hasNext();) {
			PCNProcessEntity childElement = (PCNProcessEntity) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNProcessEntityEditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNProcessEntityCompartmentLeftDir_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNProcessEntity modelElement = (PCNProcessEntity) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLeftDirectInteractions().iterator(); it.hasNext();) {
			PCNProcessStep childElement = (PCNProcessStep) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNStandardStepEditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNDoAndWaitStepEditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNWaitStepEditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNInnovationStepEditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNOutsourcedStepEditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNDecisionStepEditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNReferenceEditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNProcessEntityCompartmentLeftSur_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNProcessEntity modelElement = (PCNProcessEntity) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLeftSurrogateInteractions().iterator(); it.hasNext();) {
			PCNProcessStep childElement = (PCNProcessStep) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNStandardStep2EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNDoAndWaitStep2EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNWaitStep2EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNInnovationStep2EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNOutsourcedStep2EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNDecisionStep2EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNReference2EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNProcessEntityCompartmentInd_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNProcessEntity modelElement = (PCNProcessEntity) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCenterIndependentInteractionsActivities().iterator(); it.hasNext();) {
			PCNProcessStep childElement = (PCNProcessStep) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNStandardStep3EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNDoAndWaitStep3EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNWaitStep3EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNInnovationStep3EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNOutsourcedStep3EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNDecisionStep3EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNReference3EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNProcessEntityCompartmentRightSur_7004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNProcessEntity modelElement = (PCNProcessEntity) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRightSurrogateInteractions().iterator(); it.hasNext();) {
			PCNProcessStep childElement = (PCNProcessStep) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNStandardStep4EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNDoAndWaitStep4EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNWaitStep4EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNInnovationStep4EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNOutsourcedStep4EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNDecisionStep4EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNReference4EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNProcessEntityCompartmentRightDir_7005SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNProcessEntity modelElement = (PCNProcessEntity) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRightDirectInteractions().iterator(); it.hasNext();) {
			PCNProcessStep childElement = (PCNProcessStep) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNStandardStep5EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNDoAndWaitStep5EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNWaitStep5EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNInnovationStep5EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNOutsourcedStep5EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNDecisionStep5EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PCNReference5EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNStandardStepCompartmentStandardProcessTags_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNStandardStep modelElement = (PCNStandardStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefitEditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCostEditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefitEditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCostEditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTagEditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTagEditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNStandardStepCompartmentStandardProcessTags_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNStandardStep modelElement = (PCNStandardStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit2EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost2EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit2EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost2EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag2EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag2EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNStandardStepCompartmentStandardProcessTags_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNStandardStep modelElement = (PCNStandardStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit3EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost3EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit3EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost3EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag3EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag3EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNStandardStepCompartmentStandardProcessTags_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNStandardStep modelElement = (PCNStandardStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit4EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost4EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit4EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost4EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag4EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag4EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNStandardStepCompartmentStandardProcessTags_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNStandardStep modelElement = (PCNStandardStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit5EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost5EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit5EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost5EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag5EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag5EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNDoAndWaitStepCompartmentLongProcessTags_7026SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNDoAndWaitStep modelElement = (PCNDoAndWaitStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit6EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost6EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit6EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost6EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag6EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNDelayTimeTag childElement = modelElement.getDelayTimeTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNDelayTimeTagEditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag6EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNDoAndWaitStepCompartmentLongProcessTags_7027SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNDoAndWaitStep modelElement = (PCNDoAndWaitStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit7EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost7EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit7EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost7EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag7EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNDelayTimeTag childElement = modelElement.getDelayTimeTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNDelayTimeTag2EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag7EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNDoAndWaitStepCompartmentLongProcessTags_7028SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNDoAndWaitStep modelElement = (PCNDoAndWaitStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit8EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost8EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit8EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost8EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag8EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNDelayTimeTag childElement = modelElement.getDelayTimeTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNDelayTimeTag3EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag8EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNDoAndWaitStepCompartmentLongProcessTags_7029SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNDoAndWaitStep modelElement = (PCNDoAndWaitStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit9EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost9EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit9EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost9EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag9EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNDelayTimeTag childElement = modelElement.getDelayTimeTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNDelayTimeTag4EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag9EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNDoAndWaitStepCompartmentLongProcessTags_7030SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNDoAndWaitStep modelElement = (PCNDoAndWaitStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit10EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost10EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit10EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost10EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag10EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNDelayTimeTag childElement = modelElement.getDelayTimeTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNDelayTimeTag5EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag10EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNWaitStepCompartmentWaitProcessTags_7021SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNWaitStep modelElement = (PCNWaitStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit11EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost11EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit11EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost11EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag11EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNDelayTimeTag childElement = modelElement.getDelayTimeTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNDelayTimeTag6EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag11EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNWaitStepCompartmentWaitProcessTags_7022SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNWaitStep modelElement = (PCNWaitStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit12EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost12EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit12EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost12EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag12EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNDelayTimeTag childElement = modelElement.getDelayTimeTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNDelayTimeTag7EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag12EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNWaitStepCompartmentWaitProcessTags_7023SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNWaitStep modelElement = (PCNWaitStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit13EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost13EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit13EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost13EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag13EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNDelayTimeTag childElement = modelElement.getDelayTimeTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNDelayTimeTag8EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag13EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNWaitStepCompartmentWaitProcessTags_7024SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNWaitStep modelElement = (PCNWaitStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit14EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost14EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit14EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost14EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag14EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNDelayTimeTag childElement = modelElement.getDelayTimeTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNDelayTimeTag9EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag14EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNWaitStepCompartmentWaitProcessTags_7025SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNWaitStep modelElement = (PCNWaitStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit15EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost15EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit15EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost15EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag15EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNDelayTimeTag childElement = modelElement.getDelayTimeTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNDelayTimeTag10EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag15EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNInnovationStepCompartmentHighlightTags_7011SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNInnovationStep modelElement = (PCNInnovationStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit16EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost16EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit16EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost16EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag16EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag16EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNInnovationStepCompartmentHighlightTags_7012SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNInnovationStep modelElement = (PCNInnovationStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit17EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost17EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit17EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost17EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag17EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag17EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNInnovationStepCompartmentHighlightTags_7013SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNInnovationStep modelElement = (PCNInnovationStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit18EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost18EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit18EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost18EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag18EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag18EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNInnovationStepCompartmentHighlightTags_7014SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNInnovationStep modelElement = (PCNInnovationStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit19EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost19EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit19EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost19EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag19EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag19EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNInnovationStepCompartmentHighlightTags_7015SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNInnovationStep modelElement = (PCNInnovationStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit20EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost20EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit20EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost20EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag20EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag20EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNOutsourcedStepCompartmentPreparationTags_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNOutsourcedStep modelElement = (PCNOutsourcedStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit21EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost21EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit21EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost21EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag21EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag21EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNOutsourcedStepCompartmentPreparationTags_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNOutsourcedStep modelElement = (PCNOutsourcedStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit22EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost22EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit22EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost22EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag22EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag22EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNOutsourcedStepCompartmentPreparationTags_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNOutsourcedStep modelElement = (PCNOutsourcedStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit23EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost23EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit23EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost23EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag23EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag23EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNOutsourcedStepCompartmentPreparationTags_7019SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNOutsourcedStep modelElement = (PCNOutsourcedStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit24EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost24EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit24EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost24EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag24EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag24EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNOutsourcedStepCompartmentPreparationTags_7020SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNOutsourcedStep modelElement = (PCNOutsourcedStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit25EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost25EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit25EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost25EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag25EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag25EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNDecisionStepCompartmentDecisionProcessTags_7031SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNDecisionStep modelElement = (PCNDecisionStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit26EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost26EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit26EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost26EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag26EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNProbabilitiesTag childElement = modelElement.getProbabilitiesTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNProbabilitiesTagEditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag26EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNDecisionStepCompartmentDecisionProcessTags_7032SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNDecisionStep modelElement = (PCNDecisionStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit27EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost27EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit27EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost27EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag27EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNProbabilitiesTag childElement = modelElement.getProbabilitiesTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNProbabilitiesTag2EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag27EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNDecisionStepCompartmentDecisionProcessTags_7033SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNDecisionStep modelElement = (PCNDecisionStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit28EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost28EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit28EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost28EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag28EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNProbabilitiesTag childElement = modelElement.getProbabilitiesTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNProbabilitiesTag3EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag28EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNDecisionStepCompartmentDecisionProcessTags_7034SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNDecisionStep modelElement = (PCNDecisionStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit29EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost29EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit29EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost29EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag29EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNProbabilitiesTag childElement = modelElement.getProbabilitiesTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNProbabilitiesTag4EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag29EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnNodeDescriptor> getPCNDecisionStepCompartmentDecisionProcessTags_7035SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		PCNDecisionStep modelElement = (PCNDecisionStep) containerView.getElement();
		LinkedList<PcnNodeDescriptor> result = new LinkedList<PcnNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMonetaryBenefits().iterator(); it.hasNext();) {
			PCNMonetaryBenefit childElement = (PCNMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryBenefit30EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMonetaryCosts().iterator(); it.hasNext();) {
			PCNMonetaryCost childElement = (PCNMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNMonetaryCost30EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryBenefits().iterator(); it.hasNext();) {
			PCNNonMonetaryBenefit childElement = (PCNNonMonetaryBenefit) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryBenefit30EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNonMonetaryCosts().iterator(); it.hasNext();) {
			PCNNonMonetaryCost childElement = (PCNNonMonetaryCost) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNNonMonetaryCost30EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTextualTags().iterator(); it.hasNext();) {
			PCNTextualTag childElement = (PCNTextualTag) it.next();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNTextualTag30EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			PCNProbabilitiesTag childElement = modelElement.getProbabilitiesTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNProbabilitiesTag5EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		{
			PCNSyncTag childElement = modelElement.getSyncTags();
			int visualID = PcnVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PCNSyncTag30EditPart.VISUAL_ID) {
				result.add(new PcnNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getContainedLinks(View view) {
		switch (PcnVisualIDRegistry.getVisualID(view)) {
		case PCNDiagramEditPart.VISUAL_ID:
			return getPCNDiagram_1000ContainedLinks(view);
		case PCNProcessEntityEditPart.VISUAL_ID:
			return getPCNProcessEntity_2001ContainedLinks(view);
		case PCNStandardStepEditPart.VISUAL_ID:
			return getPCNStandardStep_3011ContainedLinks(view);
		case PCNMonetaryBenefitEditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3048ContainedLinks(view);
		case PCNMonetaryCostEditPart.VISUAL_ID:
			return getPCNMonetaryCost_3049ContainedLinks(view);
		case PCNNonMonetaryBenefitEditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3050ContainedLinks(view);
		case PCNNonMonetaryCostEditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3051ContainedLinks(view);
		case PCNTextualTagEditPart.VISUAL_ID:
			return getPCNTextualTag_3168ContainedLinks(view);
		case PCNSyncTagEditPart.VISUAL_ID:
			return getPCNSyncTag_3213ContainedLinks(view);
		case PCNStandardStep2EditPart.VISUAL_ID:
			return getPCNStandardStep_3012ContainedLinks(view);
		case PCNMonetaryBenefit2EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3052ContainedLinks(view);
		case PCNMonetaryCost2EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3053ContainedLinks(view);
		case PCNNonMonetaryBenefit2EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3054ContainedLinks(view);
		case PCNNonMonetaryCost2EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3055ContainedLinks(view);
		case PCNTextualTag2EditPart.VISUAL_ID:
			return getPCNTextualTag_3169ContainedLinks(view);
		case PCNSyncTag2EditPart.VISUAL_ID:
			return getPCNSyncTag_3214ContainedLinks(view);
		case PCNStandardStep3EditPart.VISUAL_ID:
			return getPCNStandardStep_3013ContainedLinks(view);
		case PCNMonetaryBenefit3EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3056ContainedLinks(view);
		case PCNMonetaryCost3EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3057ContainedLinks(view);
		case PCNNonMonetaryBenefit3EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3058ContainedLinks(view);
		case PCNNonMonetaryCost3EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3059ContainedLinks(view);
		case PCNTextualTag3EditPart.VISUAL_ID:
			return getPCNTextualTag_3170ContainedLinks(view);
		case PCNSyncTag3EditPart.VISUAL_ID:
			return getPCNSyncTag_3215ContainedLinks(view);
		case PCNStandardStep4EditPart.VISUAL_ID:
			return getPCNStandardStep_3014ContainedLinks(view);
		case PCNMonetaryBenefit4EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3060ContainedLinks(view);
		case PCNMonetaryCost4EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3061ContainedLinks(view);
		case PCNNonMonetaryBenefit4EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3062ContainedLinks(view);
		case PCNNonMonetaryCost4EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3063ContainedLinks(view);
		case PCNTextualTag4EditPart.VISUAL_ID:
			return getPCNTextualTag_3171ContainedLinks(view);
		case PCNSyncTag4EditPart.VISUAL_ID:
			return getPCNSyncTag_3216ContainedLinks(view);
		case PCNStandardStep5EditPart.VISUAL_ID:
			return getPCNStandardStep_3015ContainedLinks(view);
		case PCNMonetaryBenefit5EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3064ContainedLinks(view);
		case PCNMonetaryCost5EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3065ContainedLinks(view);
		case PCNNonMonetaryBenefit5EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3066ContainedLinks(view);
		case PCNNonMonetaryCost5EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3067ContainedLinks(view);
		case PCNTextualTag5EditPart.VISUAL_ID:
			return getPCNTextualTag_3172ContainedLinks(view);
		case PCNSyncTag5EditPart.VISUAL_ID:
			return getPCNSyncTag_3217ContainedLinks(view);
		case PCNDoAndWaitStepEditPart.VISUAL_ID:
			return getPCNDoAndWaitStep_3016ContainedLinks(view);
		case PCNMonetaryBenefit6EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3068ContainedLinks(view);
		case PCNMonetaryCost6EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3069ContainedLinks(view);
		case PCNNonMonetaryBenefit6EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3070ContainedLinks(view);
		case PCNNonMonetaryCost6EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3071ContainedLinks(view);
		case PCNTextualTag6EditPart.VISUAL_ID:
			return getPCNTextualTag_3173ContainedLinks(view);
		case PCNDelayTimeTagEditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3198ContainedLinks(view);
		case PCNSyncTag6EditPart.VISUAL_ID:
			return getPCNSyncTag_3218ContainedLinks(view);
		case PCNDoAndWaitStep2EditPart.VISUAL_ID:
			return getPCNDoAndWaitStep_3017ContainedLinks(view);
		case PCNMonetaryBenefit7EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3072ContainedLinks(view);
		case PCNMonetaryCost7EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3073ContainedLinks(view);
		case PCNNonMonetaryBenefit7EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3074ContainedLinks(view);
		case PCNNonMonetaryCost7EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3075ContainedLinks(view);
		case PCNTextualTag7EditPart.VISUAL_ID:
			return getPCNTextualTag_3174ContainedLinks(view);
		case PCNDelayTimeTag2EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3199ContainedLinks(view);
		case PCNSyncTag7EditPart.VISUAL_ID:
			return getPCNSyncTag_3219ContainedLinks(view);
		case PCNDoAndWaitStep3EditPart.VISUAL_ID:
			return getPCNDoAndWaitStep_3018ContainedLinks(view);
		case PCNMonetaryBenefit8EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3076ContainedLinks(view);
		case PCNMonetaryCost8EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3077ContainedLinks(view);
		case PCNNonMonetaryBenefit8EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3078ContainedLinks(view);
		case PCNNonMonetaryCost8EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3079ContainedLinks(view);
		case PCNTextualTag8EditPart.VISUAL_ID:
			return getPCNTextualTag_3175ContainedLinks(view);
		case PCNDelayTimeTag3EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3200ContainedLinks(view);
		case PCNSyncTag8EditPart.VISUAL_ID:
			return getPCNSyncTag_3220ContainedLinks(view);
		case PCNDoAndWaitStep4EditPart.VISUAL_ID:
			return getPCNDoAndWaitStep_3019ContainedLinks(view);
		case PCNMonetaryBenefit9EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3080ContainedLinks(view);
		case PCNMonetaryCost9EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3081ContainedLinks(view);
		case PCNNonMonetaryBenefit9EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3082ContainedLinks(view);
		case PCNNonMonetaryCost9EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3083ContainedLinks(view);
		case PCNTextualTag9EditPart.VISUAL_ID:
			return getPCNTextualTag_3176ContainedLinks(view);
		case PCNDelayTimeTag4EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3201ContainedLinks(view);
		case PCNSyncTag9EditPart.VISUAL_ID:
			return getPCNSyncTag_3221ContainedLinks(view);
		case PCNDoAndWaitStep5EditPart.VISUAL_ID:
			return getPCNDoAndWaitStep_3020ContainedLinks(view);
		case PCNMonetaryBenefit10EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3084ContainedLinks(view);
		case PCNMonetaryCost10EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3085ContainedLinks(view);
		case PCNNonMonetaryBenefit10EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3086ContainedLinks(view);
		case PCNNonMonetaryCost10EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3087ContainedLinks(view);
		case PCNTextualTag10EditPart.VISUAL_ID:
			return getPCNTextualTag_3177ContainedLinks(view);
		case PCNDelayTimeTag5EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3202ContainedLinks(view);
		case PCNSyncTag10EditPart.VISUAL_ID:
			return getPCNSyncTag_3222ContainedLinks(view);
		case PCNWaitStepEditPart.VISUAL_ID:
			return getPCNWaitStep_3021ContainedLinks(view);
		case PCNMonetaryBenefit11EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3088ContainedLinks(view);
		case PCNMonetaryCost11EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3089ContainedLinks(view);
		case PCNNonMonetaryBenefit11EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3090ContainedLinks(view);
		case PCNNonMonetaryCost11EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3091ContainedLinks(view);
		case PCNTextualTag11EditPart.VISUAL_ID:
			return getPCNTextualTag_3178ContainedLinks(view);
		case PCNDelayTimeTag6EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3203ContainedLinks(view);
		case PCNSyncTag11EditPart.VISUAL_ID:
			return getPCNSyncTag_3223ContainedLinks(view);
		case PCNWaitStep2EditPart.VISUAL_ID:
			return getPCNWaitStep_3022ContainedLinks(view);
		case PCNMonetaryBenefit12EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3092ContainedLinks(view);
		case PCNMonetaryCost12EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3093ContainedLinks(view);
		case PCNNonMonetaryBenefit12EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3094ContainedLinks(view);
		case PCNNonMonetaryCost12EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3095ContainedLinks(view);
		case PCNTextualTag12EditPart.VISUAL_ID:
			return getPCNTextualTag_3179ContainedLinks(view);
		case PCNDelayTimeTag7EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3204ContainedLinks(view);
		case PCNSyncTag12EditPart.VISUAL_ID:
			return getPCNSyncTag_3224ContainedLinks(view);
		case PCNWaitStep3EditPart.VISUAL_ID:
			return getPCNWaitStep_3023ContainedLinks(view);
		case PCNMonetaryBenefit13EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3096ContainedLinks(view);
		case PCNMonetaryCost13EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3097ContainedLinks(view);
		case PCNNonMonetaryBenefit13EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3098ContainedLinks(view);
		case PCNNonMonetaryCost13EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3099ContainedLinks(view);
		case PCNTextualTag13EditPart.VISUAL_ID:
			return getPCNTextualTag_3180ContainedLinks(view);
		case PCNDelayTimeTag8EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3205ContainedLinks(view);
		case PCNSyncTag13EditPart.VISUAL_ID:
			return getPCNSyncTag_3225ContainedLinks(view);
		case PCNWaitStep4EditPart.VISUAL_ID:
			return getPCNWaitStep_3024ContainedLinks(view);
		case PCNMonetaryBenefit14EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3100ContainedLinks(view);
		case PCNMonetaryCost14EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3101ContainedLinks(view);
		case PCNNonMonetaryBenefit14EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3102ContainedLinks(view);
		case PCNNonMonetaryCost14EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3103ContainedLinks(view);
		case PCNTextualTag14EditPart.VISUAL_ID:
			return getPCNTextualTag_3181ContainedLinks(view);
		case PCNDelayTimeTag9EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3206ContainedLinks(view);
		case PCNSyncTag14EditPart.VISUAL_ID:
			return getPCNSyncTag_3226ContainedLinks(view);
		case PCNWaitStep5EditPart.VISUAL_ID:
			return getPCNWaitStep_3025ContainedLinks(view);
		case PCNMonetaryBenefit15EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3104ContainedLinks(view);
		case PCNMonetaryCost15EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3105ContainedLinks(view);
		case PCNNonMonetaryBenefit15EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3106ContainedLinks(view);
		case PCNNonMonetaryCost15EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3107ContainedLinks(view);
		case PCNTextualTag15EditPart.VISUAL_ID:
			return getPCNTextualTag_3182ContainedLinks(view);
		case PCNDelayTimeTag10EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3207ContainedLinks(view);
		case PCNSyncTag15EditPart.VISUAL_ID:
			return getPCNSyncTag_3227ContainedLinks(view);
		case PCNInnovationStepEditPart.VISUAL_ID:
			return getPCNInnovationStep_3026ContainedLinks(view);
		case PCNMonetaryBenefit16EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3108ContainedLinks(view);
		case PCNMonetaryCost16EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3109ContainedLinks(view);
		case PCNNonMonetaryBenefit16EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3110ContainedLinks(view);
		case PCNNonMonetaryCost16EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3111ContainedLinks(view);
		case PCNTextualTag16EditPart.VISUAL_ID:
			return getPCNTextualTag_3183ContainedLinks(view);
		case PCNSyncTag16EditPart.VISUAL_ID:
			return getPCNSyncTag_3228ContainedLinks(view);
		case PCNInnovationStep2EditPart.VISUAL_ID:
			return getPCNInnovationStep_3027ContainedLinks(view);
		case PCNMonetaryBenefit17EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3112ContainedLinks(view);
		case PCNMonetaryCost17EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3113ContainedLinks(view);
		case PCNNonMonetaryBenefit17EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3114ContainedLinks(view);
		case PCNNonMonetaryCost17EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3115ContainedLinks(view);
		case PCNTextualTag17EditPart.VISUAL_ID:
			return getPCNTextualTag_3184ContainedLinks(view);
		case PCNSyncTag17EditPart.VISUAL_ID:
			return getPCNSyncTag_3229ContainedLinks(view);
		case PCNInnovationStep3EditPart.VISUAL_ID:
			return getPCNInnovationStep_3028ContainedLinks(view);
		case PCNMonetaryBenefit18EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3116ContainedLinks(view);
		case PCNMonetaryCost18EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3117ContainedLinks(view);
		case PCNNonMonetaryBenefit18EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3118ContainedLinks(view);
		case PCNNonMonetaryCost18EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3119ContainedLinks(view);
		case PCNTextualTag18EditPart.VISUAL_ID:
			return getPCNTextualTag_3185ContainedLinks(view);
		case PCNSyncTag18EditPart.VISUAL_ID:
			return getPCNSyncTag_3230ContainedLinks(view);
		case PCNInnovationStep4EditPart.VISUAL_ID:
			return getPCNInnovationStep_3029ContainedLinks(view);
		case PCNMonetaryBenefit19EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3120ContainedLinks(view);
		case PCNMonetaryCost19EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3121ContainedLinks(view);
		case PCNNonMonetaryBenefit19EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3122ContainedLinks(view);
		case PCNNonMonetaryCost19EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3123ContainedLinks(view);
		case PCNTextualTag19EditPart.VISUAL_ID:
			return getPCNTextualTag_3186ContainedLinks(view);
		case PCNSyncTag19EditPart.VISUAL_ID:
			return getPCNSyncTag_3231ContainedLinks(view);
		case PCNInnovationStep5EditPart.VISUAL_ID:
			return getPCNInnovationStep_3030ContainedLinks(view);
		case PCNMonetaryBenefit20EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3124ContainedLinks(view);
		case PCNMonetaryCost20EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3125ContainedLinks(view);
		case PCNNonMonetaryBenefit20EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3126ContainedLinks(view);
		case PCNNonMonetaryCost20EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3127ContainedLinks(view);
		case PCNTextualTag20EditPart.VISUAL_ID:
			return getPCNTextualTag_3187ContainedLinks(view);
		case PCNSyncTag20EditPart.VISUAL_ID:
			return getPCNSyncTag_3232ContainedLinks(view);
		case PCNOutsourcedStepEditPart.VISUAL_ID:
			return getPCNOutsourcedStep_3031ContainedLinks(view);
		case PCNMonetaryBenefit21EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3128ContainedLinks(view);
		case PCNMonetaryCost21EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3129ContainedLinks(view);
		case PCNNonMonetaryBenefit21EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3130ContainedLinks(view);
		case PCNNonMonetaryCost21EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3131ContainedLinks(view);
		case PCNTextualTag21EditPart.VISUAL_ID:
			return getPCNTextualTag_3188ContainedLinks(view);
		case PCNSyncTag21EditPart.VISUAL_ID:
			return getPCNSyncTag_3233ContainedLinks(view);
		case PCNOutsourcedStep2EditPart.VISUAL_ID:
			return getPCNOutsourcedStep_3032ContainedLinks(view);
		case PCNMonetaryBenefit22EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3132ContainedLinks(view);
		case PCNMonetaryCost22EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3133ContainedLinks(view);
		case PCNNonMonetaryBenefit22EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3134ContainedLinks(view);
		case PCNNonMonetaryCost22EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3135ContainedLinks(view);
		case PCNTextualTag22EditPart.VISUAL_ID:
			return getPCNTextualTag_3189ContainedLinks(view);
		case PCNSyncTag22EditPart.VISUAL_ID:
			return getPCNSyncTag_3234ContainedLinks(view);
		case PCNOutsourcedStep3EditPart.VISUAL_ID:
			return getPCNOutsourcedStep_3033ContainedLinks(view);
		case PCNMonetaryBenefit23EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3136ContainedLinks(view);
		case PCNMonetaryCost23EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3137ContainedLinks(view);
		case PCNNonMonetaryBenefit23EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3138ContainedLinks(view);
		case PCNNonMonetaryCost23EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3139ContainedLinks(view);
		case PCNTextualTag23EditPart.VISUAL_ID:
			return getPCNTextualTag_3190ContainedLinks(view);
		case PCNSyncTag23EditPart.VISUAL_ID:
			return getPCNSyncTag_3235ContainedLinks(view);
		case PCNOutsourcedStep4EditPart.VISUAL_ID:
			return getPCNOutsourcedStep_3034ContainedLinks(view);
		case PCNMonetaryBenefit24EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3140ContainedLinks(view);
		case PCNMonetaryCost24EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3141ContainedLinks(view);
		case PCNNonMonetaryBenefit24EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3142ContainedLinks(view);
		case PCNNonMonetaryCost24EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3143ContainedLinks(view);
		case PCNTextualTag24EditPart.VISUAL_ID:
			return getPCNTextualTag_3191ContainedLinks(view);
		case PCNSyncTag24EditPart.VISUAL_ID:
			return getPCNSyncTag_3236ContainedLinks(view);
		case PCNOutsourcedStep5EditPart.VISUAL_ID:
			return getPCNOutsourcedStep_3035ContainedLinks(view);
		case PCNMonetaryBenefit25EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3144ContainedLinks(view);
		case PCNMonetaryCost25EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3145ContainedLinks(view);
		case PCNNonMonetaryBenefit25EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3146ContainedLinks(view);
		case PCNNonMonetaryCost25EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3147ContainedLinks(view);
		case PCNTextualTag25EditPart.VISUAL_ID:
			return getPCNTextualTag_3192ContainedLinks(view);
		case PCNSyncTag25EditPart.VISUAL_ID:
			return getPCNSyncTag_3237ContainedLinks(view);
		case PCNDecisionStepEditPart.VISUAL_ID:
			return getPCNDecisionStep_3036ContainedLinks(view);
		case PCNMonetaryBenefit26EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3148ContainedLinks(view);
		case PCNMonetaryCost26EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3149ContainedLinks(view);
		case PCNNonMonetaryBenefit26EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3150ContainedLinks(view);
		case PCNNonMonetaryCost26EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3151ContainedLinks(view);
		case PCNTextualTag26EditPart.VISUAL_ID:
			return getPCNTextualTag_3193ContainedLinks(view);
		case PCNProbabilitiesTagEditPart.VISUAL_ID:
			return getPCNProbabilitiesTag_3208ContainedLinks(view);
		case PCNSyncTag26EditPart.VISUAL_ID:
			return getPCNSyncTag_3238ContainedLinks(view);
		case PCNDecisionStep2EditPart.VISUAL_ID:
			return getPCNDecisionStep_3037ContainedLinks(view);
		case PCNMonetaryBenefit27EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3152ContainedLinks(view);
		case PCNMonetaryCost27EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3153ContainedLinks(view);
		case PCNNonMonetaryBenefit27EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3154ContainedLinks(view);
		case PCNNonMonetaryCost27EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3155ContainedLinks(view);
		case PCNTextualTag27EditPart.VISUAL_ID:
			return getPCNTextualTag_3194ContainedLinks(view);
		case PCNProbabilitiesTag2EditPart.VISUAL_ID:
			return getPCNProbabilitiesTag_3209ContainedLinks(view);
		case PCNSyncTag27EditPart.VISUAL_ID:
			return getPCNSyncTag_3239ContainedLinks(view);
		case PCNDecisionStep3EditPart.VISUAL_ID:
			return getPCNDecisionStep_3038ContainedLinks(view);
		case PCNMonetaryBenefit28EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3156ContainedLinks(view);
		case PCNMonetaryCost28EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3157ContainedLinks(view);
		case PCNNonMonetaryBenefit28EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3158ContainedLinks(view);
		case PCNNonMonetaryCost28EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3159ContainedLinks(view);
		case PCNTextualTag28EditPart.VISUAL_ID:
			return getPCNTextualTag_3195ContainedLinks(view);
		case PCNProbabilitiesTag3EditPart.VISUAL_ID:
			return getPCNProbabilitiesTag_3210ContainedLinks(view);
		case PCNSyncTag28EditPart.VISUAL_ID:
			return getPCNSyncTag_3240ContainedLinks(view);
		case PCNDecisionStep4EditPart.VISUAL_ID:
			return getPCNDecisionStep_3039ContainedLinks(view);
		case PCNMonetaryBenefit29EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3160ContainedLinks(view);
		case PCNMonetaryCost29EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3161ContainedLinks(view);
		case PCNNonMonetaryBenefit29EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3162ContainedLinks(view);
		case PCNNonMonetaryCost29EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3163ContainedLinks(view);
		case PCNTextualTag29EditPart.VISUAL_ID:
			return getPCNTextualTag_3196ContainedLinks(view);
		case PCNProbabilitiesTag4EditPart.VISUAL_ID:
			return getPCNProbabilitiesTag_3211ContainedLinks(view);
		case PCNSyncTag29EditPart.VISUAL_ID:
			return getPCNSyncTag_3241ContainedLinks(view);
		case PCNDecisionStep5EditPart.VISUAL_ID:
			return getPCNDecisionStep_3040ContainedLinks(view);
		case PCNMonetaryBenefit30EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3164ContainedLinks(view);
		case PCNMonetaryCost30EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3165ContainedLinks(view);
		case PCNNonMonetaryBenefit30EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3166ContainedLinks(view);
		case PCNNonMonetaryCost30EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3167ContainedLinks(view);
		case PCNTextualTag30EditPart.VISUAL_ID:
			return getPCNTextualTag_3197ContainedLinks(view);
		case PCNProbabilitiesTag5EditPart.VISUAL_ID:
			return getPCNProbabilitiesTag_3212ContainedLinks(view);
		case PCNSyncTag30EditPart.VISUAL_ID:
			return getPCNSyncTag_3242ContainedLinks(view);
		case PCNReferenceEditPart.VISUAL_ID:
			return getPCNReference_3041ContainedLinks(view);
		case PCNReference2EditPart.VISUAL_ID:
			return getPCNReference_3042ContainedLinks(view);
		case PCNReference3EditPart.VISUAL_ID:
			return getPCNReference_3043ContainedLinks(view);
		case PCNReference4EditPart.VISUAL_ID:
			return getPCNReference_3044ContainedLinks(view);
		case PCNReference5EditPart.VISUAL_ID:
			return getPCNReference_3045ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getIncomingLinks(View view) {
		switch (PcnVisualIDRegistry.getVisualID(view)) {
		case PCNProcessEntityEditPart.VISUAL_ID:
			return getPCNProcessEntity_2001IncomingLinks(view);
		case PCNStandardStepEditPart.VISUAL_ID:
			return getPCNStandardStep_3011IncomingLinks(view);
		case PCNMonetaryBenefitEditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3048IncomingLinks(view);
		case PCNMonetaryCostEditPart.VISUAL_ID:
			return getPCNMonetaryCost_3049IncomingLinks(view);
		case PCNNonMonetaryBenefitEditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3050IncomingLinks(view);
		case PCNNonMonetaryCostEditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3051IncomingLinks(view);
		case PCNTextualTagEditPart.VISUAL_ID:
			return getPCNTextualTag_3168IncomingLinks(view);
		case PCNSyncTagEditPart.VISUAL_ID:
			return getPCNSyncTag_3213IncomingLinks(view);
		case PCNStandardStep2EditPart.VISUAL_ID:
			return getPCNStandardStep_3012IncomingLinks(view);
		case PCNMonetaryBenefit2EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3052IncomingLinks(view);
		case PCNMonetaryCost2EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3053IncomingLinks(view);
		case PCNNonMonetaryBenefit2EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3054IncomingLinks(view);
		case PCNNonMonetaryCost2EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3055IncomingLinks(view);
		case PCNTextualTag2EditPart.VISUAL_ID:
			return getPCNTextualTag_3169IncomingLinks(view);
		case PCNSyncTag2EditPart.VISUAL_ID:
			return getPCNSyncTag_3214IncomingLinks(view);
		case PCNStandardStep3EditPart.VISUAL_ID:
			return getPCNStandardStep_3013IncomingLinks(view);
		case PCNMonetaryBenefit3EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3056IncomingLinks(view);
		case PCNMonetaryCost3EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3057IncomingLinks(view);
		case PCNNonMonetaryBenefit3EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3058IncomingLinks(view);
		case PCNNonMonetaryCost3EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3059IncomingLinks(view);
		case PCNTextualTag3EditPart.VISUAL_ID:
			return getPCNTextualTag_3170IncomingLinks(view);
		case PCNSyncTag3EditPart.VISUAL_ID:
			return getPCNSyncTag_3215IncomingLinks(view);
		case PCNStandardStep4EditPart.VISUAL_ID:
			return getPCNStandardStep_3014IncomingLinks(view);
		case PCNMonetaryBenefit4EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3060IncomingLinks(view);
		case PCNMonetaryCost4EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3061IncomingLinks(view);
		case PCNNonMonetaryBenefit4EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3062IncomingLinks(view);
		case PCNNonMonetaryCost4EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3063IncomingLinks(view);
		case PCNTextualTag4EditPart.VISUAL_ID:
			return getPCNTextualTag_3171IncomingLinks(view);
		case PCNSyncTag4EditPart.VISUAL_ID:
			return getPCNSyncTag_3216IncomingLinks(view);
		case PCNStandardStep5EditPart.VISUAL_ID:
			return getPCNStandardStep_3015IncomingLinks(view);
		case PCNMonetaryBenefit5EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3064IncomingLinks(view);
		case PCNMonetaryCost5EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3065IncomingLinks(view);
		case PCNNonMonetaryBenefit5EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3066IncomingLinks(view);
		case PCNNonMonetaryCost5EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3067IncomingLinks(view);
		case PCNTextualTag5EditPart.VISUAL_ID:
			return getPCNTextualTag_3172IncomingLinks(view);
		case PCNSyncTag5EditPart.VISUAL_ID:
			return getPCNSyncTag_3217IncomingLinks(view);
		case PCNDoAndWaitStepEditPart.VISUAL_ID:
			return getPCNDoAndWaitStep_3016IncomingLinks(view);
		case PCNMonetaryBenefit6EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3068IncomingLinks(view);
		case PCNMonetaryCost6EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3069IncomingLinks(view);
		case PCNNonMonetaryBenefit6EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3070IncomingLinks(view);
		case PCNNonMonetaryCost6EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3071IncomingLinks(view);
		case PCNTextualTag6EditPart.VISUAL_ID:
			return getPCNTextualTag_3173IncomingLinks(view);
		case PCNDelayTimeTagEditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3198IncomingLinks(view);
		case PCNSyncTag6EditPart.VISUAL_ID:
			return getPCNSyncTag_3218IncomingLinks(view);
		case PCNDoAndWaitStep2EditPart.VISUAL_ID:
			return getPCNDoAndWaitStep_3017IncomingLinks(view);
		case PCNMonetaryBenefit7EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3072IncomingLinks(view);
		case PCNMonetaryCost7EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3073IncomingLinks(view);
		case PCNNonMonetaryBenefit7EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3074IncomingLinks(view);
		case PCNNonMonetaryCost7EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3075IncomingLinks(view);
		case PCNTextualTag7EditPart.VISUAL_ID:
			return getPCNTextualTag_3174IncomingLinks(view);
		case PCNDelayTimeTag2EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3199IncomingLinks(view);
		case PCNSyncTag7EditPart.VISUAL_ID:
			return getPCNSyncTag_3219IncomingLinks(view);
		case PCNDoAndWaitStep3EditPart.VISUAL_ID:
			return getPCNDoAndWaitStep_3018IncomingLinks(view);
		case PCNMonetaryBenefit8EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3076IncomingLinks(view);
		case PCNMonetaryCost8EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3077IncomingLinks(view);
		case PCNNonMonetaryBenefit8EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3078IncomingLinks(view);
		case PCNNonMonetaryCost8EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3079IncomingLinks(view);
		case PCNTextualTag8EditPart.VISUAL_ID:
			return getPCNTextualTag_3175IncomingLinks(view);
		case PCNDelayTimeTag3EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3200IncomingLinks(view);
		case PCNSyncTag8EditPart.VISUAL_ID:
			return getPCNSyncTag_3220IncomingLinks(view);
		case PCNDoAndWaitStep4EditPart.VISUAL_ID:
			return getPCNDoAndWaitStep_3019IncomingLinks(view);
		case PCNMonetaryBenefit9EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3080IncomingLinks(view);
		case PCNMonetaryCost9EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3081IncomingLinks(view);
		case PCNNonMonetaryBenefit9EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3082IncomingLinks(view);
		case PCNNonMonetaryCost9EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3083IncomingLinks(view);
		case PCNTextualTag9EditPart.VISUAL_ID:
			return getPCNTextualTag_3176IncomingLinks(view);
		case PCNDelayTimeTag4EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3201IncomingLinks(view);
		case PCNSyncTag9EditPart.VISUAL_ID:
			return getPCNSyncTag_3221IncomingLinks(view);
		case PCNDoAndWaitStep5EditPart.VISUAL_ID:
			return getPCNDoAndWaitStep_3020IncomingLinks(view);
		case PCNMonetaryBenefit10EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3084IncomingLinks(view);
		case PCNMonetaryCost10EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3085IncomingLinks(view);
		case PCNNonMonetaryBenefit10EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3086IncomingLinks(view);
		case PCNNonMonetaryCost10EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3087IncomingLinks(view);
		case PCNTextualTag10EditPart.VISUAL_ID:
			return getPCNTextualTag_3177IncomingLinks(view);
		case PCNDelayTimeTag5EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3202IncomingLinks(view);
		case PCNSyncTag10EditPart.VISUAL_ID:
			return getPCNSyncTag_3222IncomingLinks(view);
		case PCNWaitStepEditPart.VISUAL_ID:
			return getPCNWaitStep_3021IncomingLinks(view);
		case PCNMonetaryBenefit11EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3088IncomingLinks(view);
		case PCNMonetaryCost11EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3089IncomingLinks(view);
		case PCNNonMonetaryBenefit11EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3090IncomingLinks(view);
		case PCNNonMonetaryCost11EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3091IncomingLinks(view);
		case PCNTextualTag11EditPart.VISUAL_ID:
			return getPCNTextualTag_3178IncomingLinks(view);
		case PCNDelayTimeTag6EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3203IncomingLinks(view);
		case PCNSyncTag11EditPart.VISUAL_ID:
			return getPCNSyncTag_3223IncomingLinks(view);
		case PCNWaitStep2EditPart.VISUAL_ID:
			return getPCNWaitStep_3022IncomingLinks(view);
		case PCNMonetaryBenefit12EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3092IncomingLinks(view);
		case PCNMonetaryCost12EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3093IncomingLinks(view);
		case PCNNonMonetaryBenefit12EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3094IncomingLinks(view);
		case PCNNonMonetaryCost12EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3095IncomingLinks(view);
		case PCNTextualTag12EditPart.VISUAL_ID:
			return getPCNTextualTag_3179IncomingLinks(view);
		case PCNDelayTimeTag7EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3204IncomingLinks(view);
		case PCNSyncTag12EditPart.VISUAL_ID:
			return getPCNSyncTag_3224IncomingLinks(view);
		case PCNWaitStep3EditPart.VISUAL_ID:
			return getPCNWaitStep_3023IncomingLinks(view);
		case PCNMonetaryBenefit13EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3096IncomingLinks(view);
		case PCNMonetaryCost13EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3097IncomingLinks(view);
		case PCNNonMonetaryBenefit13EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3098IncomingLinks(view);
		case PCNNonMonetaryCost13EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3099IncomingLinks(view);
		case PCNTextualTag13EditPart.VISUAL_ID:
			return getPCNTextualTag_3180IncomingLinks(view);
		case PCNDelayTimeTag8EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3205IncomingLinks(view);
		case PCNSyncTag13EditPart.VISUAL_ID:
			return getPCNSyncTag_3225IncomingLinks(view);
		case PCNWaitStep4EditPart.VISUAL_ID:
			return getPCNWaitStep_3024IncomingLinks(view);
		case PCNMonetaryBenefit14EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3100IncomingLinks(view);
		case PCNMonetaryCost14EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3101IncomingLinks(view);
		case PCNNonMonetaryBenefit14EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3102IncomingLinks(view);
		case PCNNonMonetaryCost14EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3103IncomingLinks(view);
		case PCNTextualTag14EditPart.VISUAL_ID:
			return getPCNTextualTag_3181IncomingLinks(view);
		case PCNDelayTimeTag9EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3206IncomingLinks(view);
		case PCNSyncTag14EditPart.VISUAL_ID:
			return getPCNSyncTag_3226IncomingLinks(view);
		case PCNWaitStep5EditPart.VISUAL_ID:
			return getPCNWaitStep_3025IncomingLinks(view);
		case PCNMonetaryBenefit15EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3104IncomingLinks(view);
		case PCNMonetaryCost15EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3105IncomingLinks(view);
		case PCNNonMonetaryBenefit15EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3106IncomingLinks(view);
		case PCNNonMonetaryCost15EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3107IncomingLinks(view);
		case PCNTextualTag15EditPart.VISUAL_ID:
			return getPCNTextualTag_3182IncomingLinks(view);
		case PCNDelayTimeTag10EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3207IncomingLinks(view);
		case PCNSyncTag15EditPart.VISUAL_ID:
			return getPCNSyncTag_3227IncomingLinks(view);
		case PCNInnovationStepEditPart.VISUAL_ID:
			return getPCNInnovationStep_3026IncomingLinks(view);
		case PCNMonetaryBenefit16EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3108IncomingLinks(view);
		case PCNMonetaryCost16EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3109IncomingLinks(view);
		case PCNNonMonetaryBenefit16EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3110IncomingLinks(view);
		case PCNNonMonetaryCost16EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3111IncomingLinks(view);
		case PCNTextualTag16EditPart.VISUAL_ID:
			return getPCNTextualTag_3183IncomingLinks(view);
		case PCNSyncTag16EditPart.VISUAL_ID:
			return getPCNSyncTag_3228IncomingLinks(view);
		case PCNInnovationStep2EditPart.VISUAL_ID:
			return getPCNInnovationStep_3027IncomingLinks(view);
		case PCNMonetaryBenefit17EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3112IncomingLinks(view);
		case PCNMonetaryCost17EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3113IncomingLinks(view);
		case PCNNonMonetaryBenefit17EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3114IncomingLinks(view);
		case PCNNonMonetaryCost17EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3115IncomingLinks(view);
		case PCNTextualTag17EditPart.VISUAL_ID:
			return getPCNTextualTag_3184IncomingLinks(view);
		case PCNSyncTag17EditPart.VISUAL_ID:
			return getPCNSyncTag_3229IncomingLinks(view);
		case PCNInnovationStep3EditPart.VISUAL_ID:
			return getPCNInnovationStep_3028IncomingLinks(view);
		case PCNMonetaryBenefit18EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3116IncomingLinks(view);
		case PCNMonetaryCost18EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3117IncomingLinks(view);
		case PCNNonMonetaryBenefit18EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3118IncomingLinks(view);
		case PCNNonMonetaryCost18EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3119IncomingLinks(view);
		case PCNTextualTag18EditPart.VISUAL_ID:
			return getPCNTextualTag_3185IncomingLinks(view);
		case PCNSyncTag18EditPart.VISUAL_ID:
			return getPCNSyncTag_3230IncomingLinks(view);
		case PCNInnovationStep4EditPart.VISUAL_ID:
			return getPCNInnovationStep_3029IncomingLinks(view);
		case PCNMonetaryBenefit19EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3120IncomingLinks(view);
		case PCNMonetaryCost19EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3121IncomingLinks(view);
		case PCNNonMonetaryBenefit19EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3122IncomingLinks(view);
		case PCNNonMonetaryCost19EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3123IncomingLinks(view);
		case PCNTextualTag19EditPart.VISUAL_ID:
			return getPCNTextualTag_3186IncomingLinks(view);
		case PCNSyncTag19EditPart.VISUAL_ID:
			return getPCNSyncTag_3231IncomingLinks(view);
		case PCNInnovationStep5EditPart.VISUAL_ID:
			return getPCNInnovationStep_3030IncomingLinks(view);
		case PCNMonetaryBenefit20EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3124IncomingLinks(view);
		case PCNMonetaryCost20EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3125IncomingLinks(view);
		case PCNNonMonetaryBenefit20EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3126IncomingLinks(view);
		case PCNNonMonetaryCost20EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3127IncomingLinks(view);
		case PCNTextualTag20EditPart.VISUAL_ID:
			return getPCNTextualTag_3187IncomingLinks(view);
		case PCNSyncTag20EditPart.VISUAL_ID:
			return getPCNSyncTag_3232IncomingLinks(view);
		case PCNOutsourcedStepEditPart.VISUAL_ID:
			return getPCNOutsourcedStep_3031IncomingLinks(view);
		case PCNMonetaryBenefit21EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3128IncomingLinks(view);
		case PCNMonetaryCost21EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3129IncomingLinks(view);
		case PCNNonMonetaryBenefit21EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3130IncomingLinks(view);
		case PCNNonMonetaryCost21EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3131IncomingLinks(view);
		case PCNTextualTag21EditPart.VISUAL_ID:
			return getPCNTextualTag_3188IncomingLinks(view);
		case PCNSyncTag21EditPart.VISUAL_ID:
			return getPCNSyncTag_3233IncomingLinks(view);
		case PCNOutsourcedStep2EditPart.VISUAL_ID:
			return getPCNOutsourcedStep_3032IncomingLinks(view);
		case PCNMonetaryBenefit22EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3132IncomingLinks(view);
		case PCNMonetaryCost22EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3133IncomingLinks(view);
		case PCNNonMonetaryBenefit22EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3134IncomingLinks(view);
		case PCNNonMonetaryCost22EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3135IncomingLinks(view);
		case PCNTextualTag22EditPart.VISUAL_ID:
			return getPCNTextualTag_3189IncomingLinks(view);
		case PCNSyncTag22EditPart.VISUAL_ID:
			return getPCNSyncTag_3234IncomingLinks(view);
		case PCNOutsourcedStep3EditPart.VISUAL_ID:
			return getPCNOutsourcedStep_3033IncomingLinks(view);
		case PCNMonetaryBenefit23EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3136IncomingLinks(view);
		case PCNMonetaryCost23EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3137IncomingLinks(view);
		case PCNNonMonetaryBenefit23EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3138IncomingLinks(view);
		case PCNNonMonetaryCost23EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3139IncomingLinks(view);
		case PCNTextualTag23EditPart.VISUAL_ID:
			return getPCNTextualTag_3190IncomingLinks(view);
		case PCNSyncTag23EditPart.VISUAL_ID:
			return getPCNSyncTag_3235IncomingLinks(view);
		case PCNOutsourcedStep4EditPart.VISUAL_ID:
			return getPCNOutsourcedStep_3034IncomingLinks(view);
		case PCNMonetaryBenefit24EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3140IncomingLinks(view);
		case PCNMonetaryCost24EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3141IncomingLinks(view);
		case PCNNonMonetaryBenefit24EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3142IncomingLinks(view);
		case PCNNonMonetaryCost24EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3143IncomingLinks(view);
		case PCNTextualTag24EditPart.VISUAL_ID:
			return getPCNTextualTag_3191IncomingLinks(view);
		case PCNSyncTag24EditPart.VISUAL_ID:
			return getPCNSyncTag_3236IncomingLinks(view);
		case PCNOutsourcedStep5EditPart.VISUAL_ID:
			return getPCNOutsourcedStep_3035IncomingLinks(view);
		case PCNMonetaryBenefit25EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3144IncomingLinks(view);
		case PCNMonetaryCost25EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3145IncomingLinks(view);
		case PCNNonMonetaryBenefit25EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3146IncomingLinks(view);
		case PCNNonMonetaryCost25EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3147IncomingLinks(view);
		case PCNTextualTag25EditPart.VISUAL_ID:
			return getPCNTextualTag_3192IncomingLinks(view);
		case PCNSyncTag25EditPart.VISUAL_ID:
			return getPCNSyncTag_3237IncomingLinks(view);
		case PCNDecisionStepEditPart.VISUAL_ID:
			return getPCNDecisionStep_3036IncomingLinks(view);
		case PCNMonetaryBenefit26EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3148IncomingLinks(view);
		case PCNMonetaryCost26EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3149IncomingLinks(view);
		case PCNNonMonetaryBenefit26EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3150IncomingLinks(view);
		case PCNNonMonetaryCost26EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3151IncomingLinks(view);
		case PCNTextualTag26EditPart.VISUAL_ID:
			return getPCNTextualTag_3193IncomingLinks(view);
		case PCNProbabilitiesTagEditPart.VISUAL_ID:
			return getPCNProbabilitiesTag_3208IncomingLinks(view);
		case PCNSyncTag26EditPart.VISUAL_ID:
			return getPCNSyncTag_3238IncomingLinks(view);
		case PCNDecisionStep2EditPart.VISUAL_ID:
			return getPCNDecisionStep_3037IncomingLinks(view);
		case PCNMonetaryBenefit27EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3152IncomingLinks(view);
		case PCNMonetaryCost27EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3153IncomingLinks(view);
		case PCNNonMonetaryBenefit27EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3154IncomingLinks(view);
		case PCNNonMonetaryCost27EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3155IncomingLinks(view);
		case PCNTextualTag27EditPart.VISUAL_ID:
			return getPCNTextualTag_3194IncomingLinks(view);
		case PCNProbabilitiesTag2EditPart.VISUAL_ID:
			return getPCNProbabilitiesTag_3209IncomingLinks(view);
		case PCNSyncTag27EditPart.VISUAL_ID:
			return getPCNSyncTag_3239IncomingLinks(view);
		case PCNDecisionStep3EditPart.VISUAL_ID:
			return getPCNDecisionStep_3038IncomingLinks(view);
		case PCNMonetaryBenefit28EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3156IncomingLinks(view);
		case PCNMonetaryCost28EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3157IncomingLinks(view);
		case PCNNonMonetaryBenefit28EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3158IncomingLinks(view);
		case PCNNonMonetaryCost28EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3159IncomingLinks(view);
		case PCNTextualTag28EditPart.VISUAL_ID:
			return getPCNTextualTag_3195IncomingLinks(view);
		case PCNProbabilitiesTag3EditPart.VISUAL_ID:
			return getPCNProbabilitiesTag_3210IncomingLinks(view);
		case PCNSyncTag28EditPart.VISUAL_ID:
			return getPCNSyncTag_3240IncomingLinks(view);
		case PCNDecisionStep4EditPart.VISUAL_ID:
			return getPCNDecisionStep_3039IncomingLinks(view);
		case PCNMonetaryBenefit29EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3160IncomingLinks(view);
		case PCNMonetaryCost29EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3161IncomingLinks(view);
		case PCNNonMonetaryBenefit29EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3162IncomingLinks(view);
		case PCNNonMonetaryCost29EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3163IncomingLinks(view);
		case PCNTextualTag29EditPart.VISUAL_ID:
			return getPCNTextualTag_3196IncomingLinks(view);
		case PCNProbabilitiesTag4EditPart.VISUAL_ID:
			return getPCNProbabilitiesTag_3211IncomingLinks(view);
		case PCNSyncTag29EditPart.VISUAL_ID:
			return getPCNSyncTag_3241IncomingLinks(view);
		case PCNDecisionStep5EditPart.VISUAL_ID:
			return getPCNDecisionStep_3040IncomingLinks(view);
		case PCNMonetaryBenefit30EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3164IncomingLinks(view);
		case PCNMonetaryCost30EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3165IncomingLinks(view);
		case PCNNonMonetaryBenefit30EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3166IncomingLinks(view);
		case PCNNonMonetaryCost30EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3167IncomingLinks(view);
		case PCNTextualTag30EditPart.VISUAL_ID:
			return getPCNTextualTag_3197IncomingLinks(view);
		case PCNProbabilitiesTag5EditPart.VISUAL_ID:
			return getPCNProbabilitiesTag_3212IncomingLinks(view);
		case PCNSyncTag30EditPart.VISUAL_ID:
			return getPCNSyncTag_3242IncomingLinks(view);
		case PCNReferenceEditPart.VISUAL_ID:
			return getPCNReference_3041IncomingLinks(view);
		case PCNReference2EditPart.VISUAL_ID:
			return getPCNReference_3042IncomingLinks(view);
		case PCNReference3EditPart.VISUAL_ID:
			return getPCNReference_3043IncomingLinks(view);
		case PCNReference4EditPart.VISUAL_ID:
			return getPCNReference_3044IncomingLinks(view);
		case PCNReference5EditPart.VISUAL_ID:
			return getPCNReference_3045IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getOutgoingLinks(View view) {
		switch (PcnVisualIDRegistry.getVisualID(view)) {
		case PCNProcessEntityEditPart.VISUAL_ID:
			return getPCNProcessEntity_2001OutgoingLinks(view);
		case PCNStandardStepEditPart.VISUAL_ID:
			return getPCNStandardStep_3011OutgoingLinks(view);
		case PCNMonetaryBenefitEditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3048OutgoingLinks(view);
		case PCNMonetaryCostEditPart.VISUAL_ID:
			return getPCNMonetaryCost_3049OutgoingLinks(view);
		case PCNNonMonetaryBenefitEditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3050OutgoingLinks(view);
		case PCNNonMonetaryCostEditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3051OutgoingLinks(view);
		case PCNTextualTagEditPart.VISUAL_ID:
			return getPCNTextualTag_3168OutgoingLinks(view);
		case PCNSyncTagEditPart.VISUAL_ID:
			return getPCNSyncTag_3213OutgoingLinks(view);
		case PCNStandardStep2EditPart.VISUAL_ID:
			return getPCNStandardStep_3012OutgoingLinks(view);
		case PCNMonetaryBenefit2EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3052OutgoingLinks(view);
		case PCNMonetaryCost2EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3053OutgoingLinks(view);
		case PCNNonMonetaryBenefit2EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3054OutgoingLinks(view);
		case PCNNonMonetaryCost2EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3055OutgoingLinks(view);
		case PCNTextualTag2EditPart.VISUAL_ID:
			return getPCNTextualTag_3169OutgoingLinks(view);
		case PCNSyncTag2EditPart.VISUAL_ID:
			return getPCNSyncTag_3214OutgoingLinks(view);
		case PCNStandardStep3EditPart.VISUAL_ID:
			return getPCNStandardStep_3013OutgoingLinks(view);
		case PCNMonetaryBenefit3EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3056OutgoingLinks(view);
		case PCNMonetaryCost3EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3057OutgoingLinks(view);
		case PCNNonMonetaryBenefit3EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3058OutgoingLinks(view);
		case PCNNonMonetaryCost3EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3059OutgoingLinks(view);
		case PCNTextualTag3EditPart.VISUAL_ID:
			return getPCNTextualTag_3170OutgoingLinks(view);
		case PCNSyncTag3EditPart.VISUAL_ID:
			return getPCNSyncTag_3215OutgoingLinks(view);
		case PCNStandardStep4EditPart.VISUAL_ID:
			return getPCNStandardStep_3014OutgoingLinks(view);
		case PCNMonetaryBenefit4EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3060OutgoingLinks(view);
		case PCNMonetaryCost4EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3061OutgoingLinks(view);
		case PCNNonMonetaryBenefit4EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3062OutgoingLinks(view);
		case PCNNonMonetaryCost4EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3063OutgoingLinks(view);
		case PCNTextualTag4EditPart.VISUAL_ID:
			return getPCNTextualTag_3171OutgoingLinks(view);
		case PCNSyncTag4EditPart.VISUAL_ID:
			return getPCNSyncTag_3216OutgoingLinks(view);
		case PCNStandardStep5EditPart.VISUAL_ID:
			return getPCNStandardStep_3015OutgoingLinks(view);
		case PCNMonetaryBenefit5EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3064OutgoingLinks(view);
		case PCNMonetaryCost5EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3065OutgoingLinks(view);
		case PCNNonMonetaryBenefit5EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3066OutgoingLinks(view);
		case PCNNonMonetaryCost5EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3067OutgoingLinks(view);
		case PCNTextualTag5EditPart.VISUAL_ID:
			return getPCNTextualTag_3172OutgoingLinks(view);
		case PCNSyncTag5EditPart.VISUAL_ID:
			return getPCNSyncTag_3217OutgoingLinks(view);
		case PCNDoAndWaitStepEditPart.VISUAL_ID:
			return getPCNDoAndWaitStep_3016OutgoingLinks(view);
		case PCNMonetaryBenefit6EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3068OutgoingLinks(view);
		case PCNMonetaryCost6EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3069OutgoingLinks(view);
		case PCNNonMonetaryBenefit6EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3070OutgoingLinks(view);
		case PCNNonMonetaryCost6EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3071OutgoingLinks(view);
		case PCNTextualTag6EditPart.VISUAL_ID:
			return getPCNTextualTag_3173OutgoingLinks(view);
		case PCNDelayTimeTagEditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3198OutgoingLinks(view);
		case PCNSyncTag6EditPart.VISUAL_ID:
			return getPCNSyncTag_3218OutgoingLinks(view);
		case PCNDoAndWaitStep2EditPart.VISUAL_ID:
			return getPCNDoAndWaitStep_3017OutgoingLinks(view);
		case PCNMonetaryBenefit7EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3072OutgoingLinks(view);
		case PCNMonetaryCost7EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3073OutgoingLinks(view);
		case PCNNonMonetaryBenefit7EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3074OutgoingLinks(view);
		case PCNNonMonetaryCost7EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3075OutgoingLinks(view);
		case PCNTextualTag7EditPart.VISUAL_ID:
			return getPCNTextualTag_3174OutgoingLinks(view);
		case PCNDelayTimeTag2EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3199OutgoingLinks(view);
		case PCNSyncTag7EditPart.VISUAL_ID:
			return getPCNSyncTag_3219OutgoingLinks(view);
		case PCNDoAndWaitStep3EditPart.VISUAL_ID:
			return getPCNDoAndWaitStep_3018OutgoingLinks(view);
		case PCNMonetaryBenefit8EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3076OutgoingLinks(view);
		case PCNMonetaryCost8EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3077OutgoingLinks(view);
		case PCNNonMonetaryBenefit8EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3078OutgoingLinks(view);
		case PCNNonMonetaryCost8EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3079OutgoingLinks(view);
		case PCNTextualTag8EditPart.VISUAL_ID:
			return getPCNTextualTag_3175OutgoingLinks(view);
		case PCNDelayTimeTag3EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3200OutgoingLinks(view);
		case PCNSyncTag8EditPart.VISUAL_ID:
			return getPCNSyncTag_3220OutgoingLinks(view);
		case PCNDoAndWaitStep4EditPart.VISUAL_ID:
			return getPCNDoAndWaitStep_3019OutgoingLinks(view);
		case PCNMonetaryBenefit9EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3080OutgoingLinks(view);
		case PCNMonetaryCost9EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3081OutgoingLinks(view);
		case PCNNonMonetaryBenefit9EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3082OutgoingLinks(view);
		case PCNNonMonetaryCost9EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3083OutgoingLinks(view);
		case PCNTextualTag9EditPart.VISUAL_ID:
			return getPCNTextualTag_3176OutgoingLinks(view);
		case PCNDelayTimeTag4EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3201OutgoingLinks(view);
		case PCNSyncTag9EditPart.VISUAL_ID:
			return getPCNSyncTag_3221OutgoingLinks(view);
		case PCNDoAndWaitStep5EditPart.VISUAL_ID:
			return getPCNDoAndWaitStep_3020OutgoingLinks(view);
		case PCNMonetaryBenefit10EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3084OutgoingLinks(view);
		case PCNMonetaryCost10EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3085OutgoingLinks(view);
		case PCNNonMonetaryBenefit10EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3086OutgoingLinks(view);
		case PCNNonMonetaryCost10EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3087OutgoingLinks(view);
		case PCNTextualTag10EditPart.VISUAL_ID:
			return getPCNTextualTag_3177OutgoingLinks(view);
		case PCNDelayTimeTag5EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3202OutgoingLinks(view);
		case PCNSyncTag10EditPart.VISUAL_ID:
			return getPCNSyncTag_3222OutgoingLinks(view);
		case PCNWaitStepEditPart.VISUAL_ID:
			return getPCNWaitStep_3021OutgoingLinks(view);
		case PCNMonetaryBenefit11EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3088OutgoingLinks(view);
		case PCNMonetaryCost11EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3089OutgoingLinks(view);
		case PCNNonMonetaryBenefit11EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3090OutgoingLinks(view);
		case PCNNonMonetaryCost11EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3091OutgoingLinks(view);
		case PCNTextualTag11EditPart.VISUAL_ID:
			return getPCNTextualTag_3178OutgoingLinks(view);
		case PCNDelayTimeTag6EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3203OutgoingLinks(view);
		case PCNSyncTag11EditPart.VISUAL_ID:
			return getPCNSyncTag_3223OutgoingLinks(view);
		case PCNWaitStep2EditPart.VISUAL_ID:
			return getPCNWaitStep_3022OutgoingLinks(view);
		case PCNMonetaryBenefit12EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3092OutgoingLinks(view);
		case PCNMonetaryCost12EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3093OutgoingLinks(view);
		case PCNNonMonetaryBenefit12EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3094OutgoingLinks(view);
		case PCNNonMonetaryCost12EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3095OutgoingLinks(view);
		case PCNTextualTag12EditPart.VISUAL_ID:
			return getPCNTextualTag_3179OutgoingLinks(view);
		case PCNDelayTimeTag7EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3204OutgoingLinks(view);
		case PCNSyncTag12EditPart.VISUAL_ID:
			return getPCNSyncTag_3224OutgoingLinks(view);
		case PCNWaitStep3EditPart.VISUAL_ID:
			return getPCNWaitStep_3023OutgoingLinks(view);
		case PCNMonetaryBenefit13EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3096OutgoingLinks(view);
		case PCNMonetaryCost13EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3097OutgoingLinks(view);
		case PCNNonMonetaryBenefit13EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3098OutgoingLinks(view);
		case PCNNonMonetaryCost13EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3099OutgoingLinks(view);
		case PCNTextualTag13EditPart.VISUAL_ID:
			return getPCNTextualTag_3180OutgoingLinks(view);
		case PCNDelayTimeTag8EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3205OutgoingLinks(view);
		case PCNSyncTag13EditPart.VISUAL_ID:
			return getPCNSyncTag_3225OutgoingLinks(view);
		case PCNWaitStep4EditPart.VISUAL_ID:
			return getPCNWaitStep_3024OutgoingLinks(view);
		case PCNMonetaryBenefit14EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3100OutgoingLinks(view);
		case PCNMonetaryCost14EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3101OutgoingLinks(view);
		case PCNNonMonetaryBenefit14EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3102OutgoingLinks(view);
		case PCNNonMonetaryCost14EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3103OutgoingLinks(view);
		case PCNTextualTag14EditPart.VISUAL_ID:
			return getPCNTextualTag_3181OutgoingLinks(view);
		case PCNDelayTimeTag9EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3206OutgoingLinks(view);
		case PCNSyncTag14EditPart.VISUAL_ID:
			return getPCNSyncTag_3226OutgoingLinks(view);
		case PCNWaitStep5EditPart.VISUAL_ID:
			return getPCNWaitStep_3025OutgoingLinks(view);
		case PCNMonetaryBenefit15EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3104OutgoingLinks(view);
		case PCNMonetaryCost15EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3105OutgoingLinks(view);
		case PCNNonMonetaryBenefit15EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3106OutgoingLinks(view);
		case PCNNonMonetaryCost15EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3107OutgoingLinks(view);
		case PCNTextualTag15EditPart.VISUAL_ID:
			return getPCNTextualTag_3182OutgoingLinks(view);
		case PCNDelayTimeTag10EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3207OutgoingLinks(view);
		case PCNSyncTag15EditPart.VISUAL_ID:
			return getPCNSyncTag_3227OutgoingLinks(view);
		case PCNInnovationStepEditPart.VISUAL_ID:
			return getPCNInnovationStep_3026OutgoingLinks(view);
		case PCNMonetaryBenefit16EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3108OutgoingLinks(view);
		case PCNMonetaryCost16EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3109OutgoingLinks(view);
		case PCNNonMonetaryBenefit16EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3110OutgoingLinks(view);
		case PCNNonMonetaryCost16EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3111OutgoingLinks(view);
		case PCNTextualTag16EditPart.VISUAL_ID:
			return getPCNTextualTag_3183OutgoingLinks(view);
		case PCNSyncTag16EditPart.VISUAL_ID:
			return getPCNSyncTag_3228OutgoingLinks(view);
		case PCNInnovationStep2EditPart.VISUAL_ID:
			return getPCNInnovationStep_3027OutgoingLinks(view);
		case PCNMonetaryBenefit17EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3112OutgoingLinks(view);
		case PCNMonetaryCost17EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3113OutgoingLinks(view);
		case PCNNonMonetaryBenefit17EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3114OutgoingLinks(view);
		case PCNNonMonetaryCost17EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3115OutgoingLinks(view);
		case PCNTextualTag17EditPart.VISUAL_ID:
			return getPCNTextualTag_3184OutgoingLinks(view);
		case PCNSyncTag17EditPart.VISUAL_ID:
			return getPCNSyncTag_3229OutgoingLinks(view);
		case PCNInnovationStep3EditPart.VISUAL_ID:
			return getPCNInnovationStep_3028OutgoingLinks(view);
		case PCNMonetaryBenefit18EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3116OutgoingLinks(view);
		case PCNMonetaryCost18EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3117OutgoingLinks(view);
		case PCNNonMonetaryBenefit18EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3118OutgoingLinks(view);
		case PCNNonMonetaryCost18EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3119OutgoingLinks(view);
		case PCNTextualTag18EditPart.VISUAL_ID:
			return getPCNTextualTag_3185OutgoingLinks(view);
		case PCNSyncTag18EditPart.VISUAL_ID:
			return getPCNSyncTag_3230OutgoingLinks(view);
		case PCNInnovationStep4EditPart.VISUAL_ID:
			return getPCNInnovationStep_3029OutgoingLinks(view);
		case PCNMonetaryBenefit19EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3120OutgoingLinks(view);
		case PCNMonetaryCost19EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3121OutgoingLinks(view);
		case PCNNonMonetaryBenefit19EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3122OutgoingLinks(view);
		case PCNNonMonetaryCost19EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3123OutgoingLinks(view);
		case PCNTextualTag19EditPart.VISUAL_ID:
			return getPCNTextualTag_3186OutgoingLinks(view);
		case PCNSyncTag19EditPart.VISUAL_ID:
			return getPCNSyncTag_3231OutgoingLinks(view);
		case PCNInnovationStep5EditPart.VISUAL_ID:
			return getPCNInnovationStep_3030OutgoingLinks(view);
		case PCNMonetaryBenefit20EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3124OutgoingLinks(view);
		case PCNMonetaryCost20EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3125OutgoingLinks(view);
		case PCNNonMonetaryBenefit20EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3126OutgoingLinks(view);
		case PCNNonMonetaryCost20EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3127OutgoingLinks(view);
		case PCNTextualTag20EditPart.VISUAL_ID:
			return getPCNTextualTag_3187OutgoingLinks(view);
		case PCNSyncTag20EditPart.VISUAL_ID:
			return getPCNSyncTag_3232OutgoingLinks(view);
		case PCNOutsourcedStepEditPart.VISUAL_ID:
			return getPCNOutsourcedStep_3031OutgoingLinks(view);
		case PCNMonetaryBenefit21EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3128OutgoingLinks(view);
		case PCNMonetaryCost21EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3129OutgoingLinks(view);
		case PCNNonMonetaryBenefit21EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3130OutgoingLinks(view);
		case PCNNonMonetaryCost21EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3131OutgoingLinks(view);
		case PCNTextualTag21EditPart.VISUAL_ID:
			return getPCNTextualTag_3188OutgoingLinks(view);
		case PCNSyncTag21EditPart.VISUAL_ID:
			return getPCNSyncTag_3233OutgoingLinks(view);
		case PCNOutsourcedStep2EditPart.VISUAL_ID:
			return getPCNOutsourcedStep_3032OutgoingLinks(view);
		case PCNMonetaryBenefit22EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3132OutgoingLinks(view);
		case PCNMonetaryCost22EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3133OutgoingLinks(view);
		case PCNNonMonetaryBenefit22EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3134OutgoingLinks(view);
		case PCNNonMonetaryCost22EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3135OutgoingLinks(view);
		case PCNTextualTag22EditPart.VISUAL_ID:
			return getPCNTextualTag_3189OutgoingLinks(view);
		case PCNSyncTag22EditPart.VISUAL_ID:
			return getPCNSyncTag_3234OutgoingLinks(view);
		case PCNOutsourcedStep3EditPart.VISUAL_ID:
			return getPCNOutsourcedStep_3033OutgoingLinks(view);
		case PCNMonetaryBenefit23EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3136OutgoingLinks(view);
		case PCNMonetaryCost23EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3137OutgoingLinks(view);
		case PCNNonMonetaryBenefit23EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3138OutgoingLinks(view);
		case PCNNonMonetaryCost23EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3139OutgoingLinks(view);
		case PCNTextualTag23EditPart.VISUAL_ID:
			return getPCNTextualTag_3190OutgoingLinks(view);
		case PCNSyncTag23EditPart.VISUAL_ID:
			return getPCNSyncTag_3235OutgoingLinks(view);
		case PCNOutsourcedStep4EditPart.VISUAL_ID:
			return getPCNOutsourcedStep_3034OutgoingLinks(view);
		case PCNMonetaryBenefit24EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3140OutgoingLinks(view);
		case PCNMonetaryCost24EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3141OutgoingLinks(view);
		case PCNNonMonetaryBenefit24EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3142OutgoingLinks(view);
		case PCNNonMonetaryCost24EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3143OutgoingLinks(view);
		case PCNTextualTag24EditPart.VISUAL_ID:
			return getPCNTextualTag_3191OutgoingLinks(view);
		case PCNSyncTag24EditPart.VISUAL_ID:
			return getPCNSyncTag_3236OutgoingLinks(view);
		case PCNOutsourcedStep5EditPart.VISUAL_ID:
			return getPCNOutsourcedStep_3035OutgoingLinks(view);
		case PCNMonetaryBenefit25EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3144OutgoingLinks(view);
		case PCNMonetaryCost25EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3145OutgoingLinks(view);
		case PCNNonMonetaryBenefit25EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3146OutgoingLinks(view);
		case PCNNonMonetaryCost25EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3147OutgoingLinks(view);
		case PCNTextualTag25EditPart.VISUAL_ID:
			return getPCNTextualTag_3192OutgoingLinks(view);
		case PCNSyncTag25EditPart.VISUAL_ID:
			return getPCNSyncTag_3237OutgoingLinks(view);
		case PCNDecisionStepEditPart.VISUAL_ID:
			return getPCNDecisionStep_3036OutgoingLinks(view);
		case PCNMonetaryBenefit26EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3148OutgoingLinks(view);
		case PCNMonetaryCost26EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3149OutgoingLinks(view);
		case PCNNonMonetaryBenefit26EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3150OutgoingLinks(view);
		case PCNNonMonetaryCost26EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3151OutgoingLinks(view);
		case PCNTextualTag26EditPart.VISUAL_ID:
			return getPCNTextualTag_3193OutgoingLinks(view);
		case PCNProbabilitiesTagEditPart.VISUAL_ID:
			return getPCNProbabilitiesTag_3208OutgoingLinks(view);
		case PCNSyncTag26EditPart.VISUAL_ID:
			return getPCNSyncTag_3238OutgoingLinks(view);
		case PCNDecisionStep2EditPart.VISUAL_ID:
			return getPCNDecisionStep_3037OutgoingLinks(view);
		case PCNMonetaryBenefit27EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3152OutgoingLinks(view);
		case PCNMonetaryCost27EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3153OutgoingLinks(view);
		case PCNNonMonetaryBenefit27EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3154OutgoingLinks(view);
		case PCNNonMonetaryCost27EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3155OutgoingLinks(view);
		case PCNTextualTag27EditPart.VISUAL_ID:
			return getPCNTextualTag_3194OutgoingLinks(view);
		case PCNProbabilitiesTag2EditPart.VISUAL_ID:
			return getPCNProbabilitiesTag_3209OutgoingLinks(view);
		case PCNSyncTag27EditPart.VISUAL_ID:
			return getPCNSyncTag_3239OutgoingLinks(view);
		case PCNDecisionStep3EditPart.VISUAL_ID:
			return getPCNDecisionStep_3038OutgoingLinks(view);
		case PCNMonetaryBenefit28EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3156OutgoingLinks(view);
		case PCNMonetaryCost28EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3157OutgoingLinks(view);
		case PCNNonMonetaryBenefit28EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3158OutgoingLinks(view);
		case PCNNonMonetaryCost28EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3159OutgoingLinks(view);
		case PCNTextualTag28EditPart.VISUAL_ID:
			return getPCNTextualTag_3195OutgoingLinks(view);
		case PCNProbabilitiesTag3EditPart.VISUAL_ID:
			return getPCNProbabilitiesTag_3210OutgoingLinks(view);
		case PCNSyncTag28EditPart.VISUAL_ID:
			return getPCNSyncTag_3240OutgoingLinks(view);
		case PCNDecisionStep4EditPart.VISUAL_ID:
			return getPCNDecisionStep_3039OutgoingLinks(view);
		case PCNMonetaryBenefit29EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3160OutgoingLinks(view);
		case PCNMonetaryCost29EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3161OutgoingLinks(view);
		case PCNNonMonetaryBenefit29EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3162OutgoingLinks(view);
		case PCNNonMonetaryCost29EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3163OutgoingLinks(view);
		case PCNTextualTag29EditPart.VISUAL_ID:
			return getPCNTextualTag_3196OutgoingLinks(view);
		case PCNProbabilitiesTag4EditPart.VISUAL_ID:
			return getPCNProbabilitiesTag_3211OutgoingLinks(view);
		case PCNSyncTag29EditPart.VISUAL_ID:
			return getPCNSyncTag_3241OutgoingLinks(view);
		case PCNDecisionStep5EditPart.VISUAL_ID:
			return getPCNDecisionStep_3040OutgoingLinks(view);
		case PCNMonetaryBenefit30EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3164OutgoingLinks(view);
		case PCNMonetaryCost30EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3165OutgoingLinks(view);
		case PCNNonMonetaryBenefit30EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3166OutgoingLinks(view);
		case PCNNonMonetaryCost30EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3167OutgoingLinks(view);
		case PCNTextualTag30EditPart.VISUAL_ID:
			return getPCNTextualTag_3197OutgoingLinks(view);
		case PCNProbabilitiesTag5EditPart.VISUAL_ID:
			return getPCNProbabilitiesTag_3212OutgoingLinks(view);
		case PCNSyncTag30EditPart.VISUAL_ID:
			return getPCNSyncTag_3242OutgoingLinks(view);
		case PCNReferenceEditPart.VISUAL_ID:
			return getPCNReference_3041OutgoingLinks(view);
		case PCNReference2EditPart.VISUAL_ID:
			return getPCNReference_3042OutgoingLinks(view);
		case PCNReference3EditPart.VISUAL_ID:
			return getPCNReference_3043OutgoingLinks(view);
		case PCNReference4EditPart.VISUAL_ID:
			return getPCNReference_3044OutgoingLinks(view);
		case PCNReference5EditPart.VISUAL_ID:
			return getPCNReference_3045OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDiagram_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNProcessEntity_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNStandardStep_3011ContainedLinks(View view) {
		PCNStandardStep modelElement = (PCNStandardStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3048ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3049ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3050ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3051ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3168ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3213ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNStandardStep_3012ContainedLinks(View view) {
		PCNStandardStep modelElement = (PCNStandardStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3052ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3053ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3054ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3055ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3169ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3214ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNStandardStep_3013ContainedLinks(View view) {
		PCNStandardStep modelElement = (PCNStandardStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3056ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3057ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3058ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3059ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3170ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3215ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNStandardStep_3014ContainedLinks(View view) {
		PCNStandardStep modelElement = (PCNStandardStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3060ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3061ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3062ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3063ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3171ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3216ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNStandardStep_3015ContainedLinks(View view) {
		PCNStandardStep modelElement = (PCNStandardStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3064ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3065ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3066ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3067ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3172ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3217ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDoAndWaitStep_3016ContainedLinks(View view) {
		PCNDoAndWaitStep modelElement = (PCNDoAndWaitStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDoAndWaitStep_3017ContainedLinks(View view) {
		PCNDoAndWaitStep modelElement = (PCNDoAndWaitStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDoAndWaitStep_3018ContainedLinks(View view) {
		PCNDoAndWaitStep modelElement = (PCNDoAndWaitStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDoAndWaitStep_3019ContainedLinks(View view) {
		PCNDoAndWaitStep modelElement = (PCNDoAndWaitStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDoAndWaitStep_3020ContainedLinks(View view) {
		PCNDoAndWaitStep modelElement = (PCNDoAndWaitStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNWaitStep_3021ContainedLinks(View view) {
		PCNWaitStep modelElement = (PCNWaitStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNWaitStep_3022ContainedLinks(View view) {
		PCNWaitStep modelElement = (PCNWaitStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNWaitStep_3023ContainedLinks(View view) {
		PCNWaitStep modelElement = (PCNWaitStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNWaitStep_3024ContainedLinks(View view) {
		PCNWaitStep modelElement = (PCNWaitStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNWaitStep_3025ContainedLinks(View view) {
		PCNWaitStep modelElement = (PCNWaitStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNInnovationStep_3026ContainedLinks(View view) {
		PCNInnovationStep modelElement = (PCNInnovationStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3068ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3069ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3070ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3071ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3173ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNInnovationStep_3027ContainedLinks(View view) {
		PCNInnovationStep modelElement = (PCNInnovationStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3072ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3073ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3074ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3075ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3174ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNInnovationStep_3028ContainedLinks(View view) {
		PCNInnovationStep modelElement = (PCNInnovationStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3076ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3077ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3078ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3079ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3175ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNInnovationStep_3029ContainedLinks(View view) {
		PCNInnovationStep modelElement = (PCNInnovationStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3080ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3081ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3082ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3083ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3176ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNInnovationStep_3030ContainedLinks(View view) {
		PCNInnovationStep modelElement = (PCNInnovationStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3084ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3085ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3086ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3087ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3177ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNOutsourcedStep_3031ContainedLinks(View view) {
		PCNOutsourcedStep modelElement = (PCNOutsourcedStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3088ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3089ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3090ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3091ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3178ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3203ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3223ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3198ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3218ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNOutsourcedStep_3032ContainedLinks(View view) {
		PCNOutsourcedStep modelElement = (PCNOutsourcedStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3132ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3133ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3134ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3135ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3189ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3234ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3112ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3113ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3114ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3115ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3184ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3229ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3092ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3093ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3094ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3095ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3179ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3204ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3224ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3199ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3219ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNOutsourcedStep_3033ContainedLinks(View view) {
		PCNOutsourcedStep modelElement = (PCNOutsourcedStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3136ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3137ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3138ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3139ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3190ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3235ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3116ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3117ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3118ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3119ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3185ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3230ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3096ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3097ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3098ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3099ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3180ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3205ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3225ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3200ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3220ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNOutsourcedStep_3034ContainedLinks(View view) {
		PCNOutsourcedStep modelElement = (PCNOutsourcedStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3140ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3141ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3142ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3143ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3191ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3236ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3120ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3121ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3122ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3123ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3186ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3231ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3100ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3101ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3102ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3103ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3181ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3206ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3226ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3201ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3221ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNOutsourcedStep_3035ContainedLinks(View view) {
		PCNOutsourcedStep modelElement = (PCNOutsourcedStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3144ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3145ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3146ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3147ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3192ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3237ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3128ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3129ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3130ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3131ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3188ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3233ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3124ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3125ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3126ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3127ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3187ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3232ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3108ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3109ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3110ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3111ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3183ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3228ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3104ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3105ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3106ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3107ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3182ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3207ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3227ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3202ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3222ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDecisionStep_3036ContainedLinks(View view) {
		PCNDecisionStep modelElement = (PCNDecisionStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3148ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3149ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3150ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3151ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3193ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNProbabilitiesTag_3208ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3238ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDecisionStep_3037ContainedLinks(View view) {
		PCNDecisionStep modelElement = (PCNDecisionStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3152ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3153ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3154ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3155ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3194ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNProbabilitiesTag_3209ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3239ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDecisionStep_3038ContainedLinks(View view) {
		PCNDecisionStep modelElement = (PCNDecisionStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3156ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3157ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3158ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3159ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3195ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNProbabilitiesTag_3210ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3240ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDecisionStep_3039ContainedLinks(View view) {
		PCNDecisionStep modelElement = (PCNDecisionStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3160ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3161ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3162ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3163ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3196ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNProbabilitiesTag_3211ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3241ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDecisionStep_3040ContainedLinks(View view) {
		PCNDecisionStep modelElement = (PCNDecisionStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3164ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3165ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3166ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3167ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3197ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNProbabilitiesTag_3212ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3242ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNReference_3041ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNReference_3042ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNReference_3043ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNReference_3044ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNReference_3045ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNProcessEntity_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNStandardStep_3011IncomingLinks(View view) {
		PCNStandardStep modelElement = (PCNStandardStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3048IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3049IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3050IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3051IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3168IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3213IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNStandardStep_3012IncomingLinks(View view) {
		PCNStandardStep modelElement = (PCNStandardStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3052IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3053IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3054IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3055IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3169IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3214IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNStandardStep_3013IncomingLinks(View view) {
		PCNStandardStep modelElement = (PCNStandardStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3056IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3057IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3058IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3059IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3170IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3215IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNStandardStep_3014IncomingLinks(View view) {
		PCNStandardStep modelElement = (PCNStandardStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3060IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3061IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3062IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3063IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3171IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3216IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNStandardStep_3015IncomingLinks(View view) {
		PCNStandardStep modelElement = (PCNStandardStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3064IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3065IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3066IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3067IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3172IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3217IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDoAndWaitStep_3016IncomingLinks(View view) {
		PCNDoAndWaitStep modelElement = (PCNDoAndWaitStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDoAndWaitStep_3017IncomingLinks(View view) {
		PCNDoAndWaitStep modelElement = (PCNDoAndWaitStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDoAndWaitStep_3018IncomingLinks(View view) {
		PCNDoAndWaitStep modelElement = (PCNDoAndWaitStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDoAndWaitStep_3019IncomingLinks(View view) {
		PCNDoAndWaitStep modelElement = (PCNDoAndWaitStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDoAndWaitStep_3020IncomingLinks(View view) {
		PCNDoAndWaitStep modelElement = (PCNDoAndWaitStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNWaitStep_3021IncomingLinks(View view) {
		PCNWaitStep modelElement = (PCNWaitStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNWaitStep_3022IncomingLinks(View view) {
		PCNWaitStep modelElement = (PCNWaitStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNWaitStep_3023IncomingLinks(View view) {
		PCNWaitStep modelElement = (PCNWaitStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNWaitStep_3024IncomingLinks(View view) {
		PCNWaitStep modelElement = (PCNWaitStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNWaitStep_3025IncomingLinks(View view) {
		PCNWaitStep modelElement = (PCNWaitStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNInnovationStep_3026IncomingLinks(View view) {
		PCNInnovationStep modelElement = (PCNInnovationStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3068IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3069IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3070IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3071IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3173IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNInnovationStep_3027IncomingLinks(View view) {
		PCNInnovationStep modelElement = (PCNInnovationStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3072IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3073IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3074IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3075IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3174IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNInnovationStep_3028IncomingLinks(View view) {
		PCNInnovationStep modelElement = (PCNInnovationStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3076IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3077IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3078IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3079IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3175IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNInnovationStep_3029IncomingLinks(View view) {
		PCNInnovationStep modelElement = (PCNInnovationStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3080IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3081IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3082IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3083IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3176IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNInnovationStep_3030IncomingLinks(View view) {
		PCNInnovationStep modelElement = (PCNInnovationStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3084IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3085IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3086IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3087IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3177IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNOutsourcedStep_3031IncomingLinks(View view) {
		PCNOutsourcedStep modelElement = (PCNOutsourcedStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3088IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3089IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3090IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3091IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3178IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3203IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3223IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3198IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3218IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNOutsourcedStep_3032IncomingLinks(View view) {
		PCNOutsourcedStep modelElement = (PCNOutsourcedStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3132IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3133IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3134IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3135IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3189IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3234IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3112IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3113IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3114IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3115IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3184IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3229IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3092IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3093IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3094IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3095IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3179IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3204IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3224IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3199IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3219IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNOutsourcedStep_3033IncomingLinks(View view) {
		PCNOutsourcedStep modelElement = (PCNOutsourcedStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3136IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3137IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3138IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3139IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3190IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3235IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3116IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3117IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3118IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3119IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3185IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3230IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3096IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3097IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3098IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3099IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3180IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3205IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3225IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3200IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3220IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNOutsourcedStep_3034IncomingLinks(View view) {
		PCNOutsourcedStep modelElement = (PCNOutsourcedStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3140IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3141IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3142IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3143IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3191IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3236IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3120IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3121IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3122IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3123IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3186IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3231IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3100IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3101IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3102IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3103IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3181IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3206IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3226IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3201IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3221IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNOutsourcedStep_3035IncomingLinks(View view) {
		PCNOutsourcedStep modelElement = (PCNOutsourcedStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3144IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3145IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3146IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3147IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3192IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3237IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3128IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3129IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3130IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3131IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3188IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3233IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3124IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3125IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3126IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3127IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3187IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3232IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3108IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3109IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3110IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3111IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3183IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3228IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3104IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3105IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3106IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3107IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3182IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3207IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3227IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3202IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3222IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDecisionStep_3036IncomingLinks(View view) {
		PCNDecisionStep modelElement = (PCNDecisionStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3148IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3149IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3150IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3151IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3193IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNProbabilitiesTag_3208IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3238IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDecisionStep_3037IncomingLinks(View view) {
		PCNDecisionStep modelElement = (PCNDecisionStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3152IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3153IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3154IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3155IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3194IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNProbabilitiesTag_3209IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3239IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDecisionStep_3038IncomingLinks(View view) {
		PCNDecisionStep modelElement = (PCNDecisionStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3156IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3157IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3158IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3159IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3195IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNProbabilitiesTag_3210IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3240IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDecisionStep_3039IncomingLinks(View view) {
		PCNDecisionStep modelElement = (PCNDecisionStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3160IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3161IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3162IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3163IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3196IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNProbabilitiesTag_3211IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3241IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDecisionStep_3040IncomingLinks(View view) {
		PCNDecisionStep modelElement = (PCNDecisionStep) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3164IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3165IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3166IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3167IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3197IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNProbabilitiesTag_3212IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3242IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNReference_3041IncomingLinks(View view) {
		PCNReference modelElement = (PCNReference) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNReference_3042IncomingLinks(View view) {
		PCNReference modelElement = (PCNReference) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNReference_3043IncomingLinks(View view) {
		PCNReference modelElement = (PCNReference) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNReference_3044IncomingLinks(View view) {
		PCNReference modelElement = (PCNReference) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNReference_3045IncomingLinks(View view) {
		PCNReference modelElement = (PCNReference) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement,
				crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNProcessEntity_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNStandardStep_3011OutgoingLinks(View view) {
		PCNStandardStep modelElement = (PCNStandardStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3048OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3049OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3050OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3051OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3168OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3213OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNStandardStep_3012OutgoingLinks(View view) {
		PCNStandardStep modelElement = (PCNStandardStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3052OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3053OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3054OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3055OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3169OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3214OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNStandardStep_3013OutgoingLinks(View view) {
		PCNStandardStep modelElement = (PCNStandardStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3056OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3057OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3058OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3059OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3170OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3215OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNStandardStep_3014OutgoingLinks(View view) {
		PCNStandardStep modelElement = (PCNStandardStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3060OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3061OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3062OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3063OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3171OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3216OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNStandardStep_3015OutgoingLinks(View view) {
		PCNStandardStep modelElement = (PCNStandardStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3064OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3065OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3066OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3067OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3172OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3217OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDoAndWaitStep_3016OutgoingLinks(View view) {
		PCNDoAndWaitStep modelElement = (PCNDoAndWaitStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDoAndWaitStep_3017OutgoingLinks(View view) {
		PCNDoAndWaitStep modelElement = (PCNDoAndWaitStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDoAndWaitStep_3018OutgoingLinks(View view) {
		PCNDoAndWaitStep modelElement = (PCNDoAndWaitStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDoAndWaitStep_3019OutgoingLinks(View view) {
		PCNDoAndWaitStep modelElement = (PCNDoAndWaitStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDoAndWaitStep_3020OutgoingLinks(View view) {
		PCNDoAndWaitStep modelElement = (PCNDoAndWaitStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNWaitStep_3021OutgoingLinks(View view) {
		PCNWaitStep modelElement = (PCNWaitStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNWaitStep_3022OutgoingLinks(View view) {
		PCNWaitStep modelElement = (PCNWaitStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNWaitStep_3023OutgoingLinks(View view) {
		PCNWaitStep modelElement = (PCNWaitStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNWaitStep_3024OutgoingLinks(View view) {
		PCNWaitStep modelElement = (PCNWaitStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNWaitStep_3025OutgoingLinks(View view) {
		PCNWaitStep modelElement = (PCNWaitStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNInnovationStep_3026OutgoingLinks(View view) {
		PCNInnovationStep modelElement = (PCNInnovationStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3068OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3069OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3070OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3071OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3173OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNInnovationStep_3027OutgoingLinks(View view) {
		PCNInnovationStep modelElement = (PCNInnovationStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3072OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3073OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3074OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3075OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3174OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNInnovationStep_3028OutgoingLinks(View view) {
		PCNInnovationStep modelElement = (PCNInnovationStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3076OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3077OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3078OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3079OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3175OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNInnovationStep_3029OutgoingLinks(View view) {
		PCNInnovationStep modelElement = (PCNInnovationStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3080OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3081OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3082OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3083OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3176OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNInnovationStep_3030OutgoingLinks(View view) {
		PCNInnovationStep modelElement = (PCNInnovationStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3084OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3085OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3086OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3087OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3177OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNOutsourcedStep_3031OutgoingLinks(View view) {
		PCNOutsourcedStep modelElement = (PCNOutsourcedStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3088OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3089OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3090OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3091OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3178OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3203OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3223OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3198OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3218OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNOutsourcedStep_3032OutgoingLinks(View view) {
		PCNOutsourcedStep modelElement = (PCNOutsourcedStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3132OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3133OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3134OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3135OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3189OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3234OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3112OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3113OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3114OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3115OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3184OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3229OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3092OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3093OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3094OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3095OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3179OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3204OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3224OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3199OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3219OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNOutsourcedStep_3033OutgoingLinks(View view) {
		PCNOutsourcedStep modelElement = (PCNOutsourcedStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3136OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3137OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3138OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3139OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3190OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3235OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3116OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3117OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3118OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3119OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3185OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3230OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3096OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3097OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3098OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3099OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3180OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3205OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3225OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3200OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3220OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNOutsourcedStep_3034OutgoingLinks(View view) {
		PCNOutsourcedStep modelElement = (PCNOutsourcedStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3140OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3141OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3142OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3143OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3191OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3236OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3120OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3121OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3122OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3123OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3186OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3231OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3100OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3101OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3102OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3103OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3181OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3206OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3226OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3201OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3221OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNOutsourcedStep_3035OutgoingLinks(View view) {
		PCNOutsourcedStep modelElement = (PCNOutsourcedStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3144OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3145OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3146OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3147OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3192OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3237OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3128OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3129OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3130OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3131OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3188OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3233OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3124OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3125OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3126OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3127OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3187OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3232OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3108OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3109OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3110OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3111OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3183OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3228OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3104OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3105OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3106OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3107OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3182OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3207OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3227OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNDelayTimeTag_3202OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3222OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDecisionStep_3036OutgoingLinks(View view) {
		PCNDecisionStep modelElement = (PCNDecisionStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3148OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3149OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3150OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3151OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3193OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNProbabilitiesTag_3208OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3238OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDecisionStep_3037OutgoingLinks(View view) {
		PCNDecisionStep modelElement = (PCNDecisionStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3152OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3153OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3154OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3155OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3194OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNProbabilitiesTag_3209OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3239OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDecisionStep_3038OutgoingLinks(View view) {
		PCNDecisionStep modelElement = (PCNDecisionStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3156OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3157OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3158OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3159OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3195OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNProbabilitiesTag_3210OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3240OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDecisionStep_3039OutgoingLinks(View view) {
		PCNDecisionStep modelElement = (PCNDecisionStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3160OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3161OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3162OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3163OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3196OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNProbabilitiesTag_3211OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3241OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNDecisionStep_3040OutgoingLinks(View view) {
		PCNDecisionStep modelElement = (PCNDecisionStep) view.getElement();
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryBenefit_3164OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNMonetaryCost_3165OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryBenefit_3166OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNNonMonetaryCost_3167OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNTextualTag_3197OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNProbabilitiesTag_3212OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PcnLinkDescriptor> getPCNSyncTag_3242OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNReference_3041OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNReference_3042OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNReference_3043OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNReference_3044OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PcnLinkDescriptor> getPCNReference_3045OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<PcnLinkDescriptor> getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(
			PCNProcessStep target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PcnPackage.eINSTANCE
					.getPCNRegularProcessStep_PCNStandardDependency()) {
				result.add(new PcnLinkDescriptor(setting.getEObject(), target,
						PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008,
						PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PcnLinkDescriptor> getIncomingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(
			PCNProcessStep target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PcnPackage.eINSTANCE
					.getPCNRegularProcessStep_PCNDelayedDependency()) {
				result.add(new PcnLinkDescriptor(setting.getEObject(), target,
						PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009,
						PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PcnLinkDescriptor> getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(
			PCNProcessStep target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PcnPackage.eINSTANCE.getPCNDecisionStep_PCNNegativeDecision()) {
				result.add(new PcnLinkDescriptor(setting.getEObject(), target,
						PcnElementTypes.PCNDecisionStepPCNNegativeDecision_4007,
						PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PcnLinkDescriptor> getIncomingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(
			PCNProcessStep target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PcnPackage.eINSTANCE.getPCNDecisionStep_PCNPositiveDecision()) {
				result.add(new PcnLinkDescriptor(setting.getEObject(), target,
						PcnElementTypes.PCNDecisionStepPCNPositiveDecision_4006,
						PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PcnLinkDescriptor> getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNStandardDependency_4008(
			PCNRegularProcessStep source) {
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		for (Iterator<?> destinations = source.getPCNStandardDependency().iterator(); destinations.hasNext();) {
			PCNProcessStep destination = (PCNProcessStep) destinations.next();
			result.add(new PcnLinkDescriptor(source, destination,
					PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008,
					PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PcnLinkDescriptor> getOutgoingFeatureModelFacetLinks_PCNRegularProcessStep_PCNDelayedDependency_4009(
			PCNRegularProcessStep source) {
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		for (Iterator<?> destinations = source.getPCNDelayedDependency().iterator(); destinations.hasNext();) {
			PCNProcessStep destination = (PCNProcessStep) destinations.next();
			result.add(new PcnLinkDescriptor(source, destination,
					PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009,
					PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PcnLinkDescriptor> getOutgoingFeatureModelFacetLinks_PCNDecisionStep_PCNNegativeDecision_4007(
			PCNDecisionStep source) {
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		PCNProcessStep destination = source.getPCNNegativeDecision();
		if (destination == null) {
			return result;
		}
		result.add(new PcnLinkDescriptor(source, destination, PcnElementTypes.PCNDecisionStepPCNNegativeDecision_4007,
				PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PcnLinkDescriptor> getOutgoingFeatureModelFacetLinks_PCNDecisionStep_PCNPositiveDecision_4006(
			PCNDecisionStep source) {
		LinkedList<PcnLinkDescriptor> result = new LinkedList<PcnLinkDescriptor>();
		PCNProcessStep destination = source.getPCNPositiveDecision();
		if (destination == null) {
			return result;
		}
		result.add(new PcnLinkDescriptor(source, destination, PcnElementTypes.PCNDecisionStepPCNPositiveDecision_4006,
				PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<PcnNodeDescriptor> getSemanticChildren(View view) {
			return PcnDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PcnLinkDescriptor> getContainedLinks(View view) {
			return PcnDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PcnLinkDescriptor> getIncomingLinks(View view) {
			return PcnDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PcnLinkDescriptor> getOutgoingLinks(View view) {
			return PcnDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
