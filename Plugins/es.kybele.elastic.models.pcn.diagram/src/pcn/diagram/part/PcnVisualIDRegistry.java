package pcn.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import pcn.PCNDiagram;
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
import pcn.diagram.edit.parts.PCNInnovationStepActionEditPart;
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
import pcn.diagram.edit.parts.PCNProcessEntityNameEditPart;
import pcn.diagram.edit.parts.PCNReference2EditPart;
import pcn.diagram.edit.parts.PCNReference3EditPart;
import pcn.diagram.edit.parts.PCNReference4EditPart;
import pcn.diagram.edit.parts.PCNReference5EditPart;
import pcn.diagram.edit.parts.PCNReferenceEditPart;

import pcn.diagram.edit.parts.PCNStandardStep2EditPart;
import pcn.diagram.edit.parts.PCNStandardStep3EditPart;
import pcn.diagram.edit.parts.PCNStandardStep4EditPart;
import pcn.diagram.edit.parts.PCNStandardStep5EditPart;
import pcn.diagram.edit.parts.PCNStandardStepAction2EditPart;
import pcn.diagram.edit.parts.PCNStandardStepAction3EditPart;
import pcn.diagram.edit.parts.PCNStandardStepAction4EditPart;
import pcn.diagram.edit.parts.PCNStandardStepAction5EditPart;
import pcn.diagram.edit.parts.PCNStandardStepActionEditPart;
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

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class PcnVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "es.kybele.elastic.models.pcn.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (PCNDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return PCNDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return pcn.diagram.part.PcnVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				PcnDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (PcnPackage.eINSTANCE.getPCNDiagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((PCNDiagram) domainElement)) {
			return PCNDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = pcn.diagram.part.PcnVisualIDRegistry.getModelID(containerView);
		if (!PCNDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (PCNDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = pcn.diagram.part.PcnVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PCNDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case PCNDiagramEditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNProcessEntity().isSuperTypeOf(domainElement.eClass())) {
				return PCNProcessEntityEditPart.VISUAL_ID;
			}
			break;
		case PCNProcessEntityCompartmentLeftDirEditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNStandardStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNStandardStepEditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNDoAndWaitStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNDoAndWaitStepEditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNWaitStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNWaitStepEditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNInnovationStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNInnovationStepEditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNOutsourcedStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNOutsourcedStepEditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNDecisionStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNDecisionStepEditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNReference().isSuperTypeOf(domainElement.eClass())) {
				return PCNReferenceEditPart.VISUAL_ID;
			}
			break;
		case PCNProcessEntityCompartmentLeftSurEditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNStandardStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNStandardStep2EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNDoAndWaitStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNDoAndWaitStep2EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNWaitStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNWaitStep2EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNInnovationStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNInnovationStep2EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNOutsourcedStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNOutsourcedStep2EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNDecisionStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNDecisionStep2EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNReference().isSuperTypeOf(domainElement.eClass())) {
				return PCNReference2EditPart.VISUAL_ID;
			}
			break;
		case PCNProcessEntityCompartmentIndEditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNStandardStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNStandardStep3EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNDoAndWaitStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNDoAndWaitStep3EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNWaitStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNWaitStep3EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNInnovationStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNInnovationStep3EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNOutsourcedStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNOutsourcedStep3EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNDecisionStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNDecisionStep3EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNReference().isSuperTypeOf(domainElement.eClass())) {
				return PCNReference3EditPart.VISUAL_ID;
			}
			break;
		case PCNProcessEntityCompartmentRightSurEditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNStandardStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNStandardStep4EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNDoAndWaitStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNDoAndWaitStep4EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNWaitStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNWaitStep4EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNInnovationStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNInnovationStep4EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNOutsourcedStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNOutsourcedStep4EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNDecisionStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNDecisionStep4EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNReference().isSuperTypeOf(domainElement.eClass())) {
				return PCNReference4EditPart.VISUAL_ID;
			}
			break;
		case PCNProcessEntityCompartmentRightDirEditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNStandardStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNStandardStep5EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNDoAndWaitStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNDoAndWaitStep5EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNWaitStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNWaitStep5EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNInnovationStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNInnovationStep5EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNOutsourcedStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNOutsourcedStep5EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNDecisionStep().isSuperTypeOf(domainElement.eClass())) {
				return PCNDecisionStep5EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNReference().isSuperTypeOf(domainElement.eClass())) {
				return PCNReference5EditPart.VISUAL_ID;
			}
			break;
		case PCNStandardStepCompartmentStandardProcessTagsEditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefitEditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCostEditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefitEditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCostEditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTagEditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTagEditPart.VISUAL_ID;
			}
			break;
		case PCNStandardStepCompartmentStandardProcessTags2EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit2EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost2EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit2EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost2EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag2EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag2EditPart.VISUAL_ID;
			}
			break;
		case PCNStandardStepCompartmentStandardProcessTags3EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit3EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost3EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit3EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost3EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag3EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag3EditPart.VISUAL_ID;
			}
			break;
		case PCNStandardStepCompartmentStandardProcessTags4EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit4EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost4EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit4EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost4EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag4EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag4EditPart.VISUAL_ID;
			}
			break;
		case PCNStandardStepCompartmentStandardProcessTags5EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit5EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost5EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit5EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost5EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag5EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag5EditPart.VISUAL_ID;
			}
			break;
		case PCNDoAndWaitStepCompartmentLongProcessTagsEditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit6EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost6EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit6EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost6EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag6EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNDelayTimeTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNDelayTimeTagEditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag6EditPart.VISUAL_ID;
			}
			break;
		case PCNDoAndWaitStepCompartmentLongProcessTags2EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit7EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost7EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit7EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost7EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag7EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNDelayTimeTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNDelayTimeTag2EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag7EditPart.VISUAL_ID;
			}
			break;
		case PCNDoAndWaitStepCompartmentLongProcessTags3EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit8EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost8EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit8EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost8EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag8EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNDelayTimeTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNDelayTimeTag3EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag8EditPart.VISUAL_ID;
			}
			break;
		case PCNDoAndWaitStepCompartmentLongProcessTags4EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit9EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost9EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit9EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost9EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag9EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNDelayTimeTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNDelayTimeTag4EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag9EditPart.VISUAL_ID;
			}
			break;
		case PCNDoAndWaitStepCompartmentLongProcessTags5EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit10EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost10EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit10EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost10EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag10EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNDelayTimeTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNDelayTimeTag5EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag10EditPart.VISUAL_ID;
			}
			break;
		case PCNWaitStepCompartmentWaitProcessTagsEditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit11EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost11EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit11EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost11EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag11EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNDelayTimeTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNDelayTimeTag6EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag11EditPart.VISUAL_ID;
			}
			break;
		case PCNWaitStepCompartmentWaitProcessTags2EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit12EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost12EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit12EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost12EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag12EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNDelayTimeTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNDelayTimeTag7EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag12EditPart.VISUAL_ID;
			}
			break;
		case PCNWaitStepCompartmentWaitProcessTags3EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit13EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost13EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit13EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost13EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag13EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNDelayTimeTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNDelayTimeTag8EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag13EditPart.VISUAL_ID;
			}
			break;
		case PCNWaitStepCompartmentWaitProcessTags4EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit14EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost14EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit14EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost14EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag14EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNDelayTimeTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNDelayTimeTag9EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag14EditPart.VISUAL_ID;
			}
			break;
		case PCNWaitStepCompartmentWaitProcessTags5EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit15EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost15EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit15EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost15EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag15EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNDelayTimeTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNDelayTimeTag10EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag15EditPart.VISUAL_ID;
			}
			break;
		case PCNInnovationStepCompartmentHighlightTagsEditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit16EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost16EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit16EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost16EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag16EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag16EditPart.VISUAL_ID;
			}
			break;
		case PCNInnovationStepCompartmentHighlightTags2EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit17EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost17EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit17EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost17EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag17EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag17EditPart.VISUAL_ID;
			}
			break;
		case PCNInnovationStepCompartmentHighlightTags3EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit18EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost18EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit18EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost18EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag18EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag18EditPart.VISUAL_ID;
			}
			break;
		case PCNInnovationStepCompartmentHighlightTags4EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit19EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost19EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit19EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost19EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag19EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag19EditPart.VISUAL_ID;
			}
			break;
		case PCNInnovationStepCompartmentHighlightTags5EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit20EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost20EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit20EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost20EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag20EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag20EditPart.VISUAL_ID;
			}
			break;
		case PCNOutsourcedStepCompartmentPreparationTagsEditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit21EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost21EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit21EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost21EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag21EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag21EditPart.VISUAL_ID;
			}
			break;
		case PCNOutsourcedStepCompartmentPreparationTags2EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit22EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost22EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit22EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost22EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag22EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag22EditPart.VISUAL_ID;
			}
			break;
		case PCNOutsourcedStepCompartmentPreparationTags3EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit23EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost23EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit23EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost23EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag23EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag23EditPart.VISUAL_ID;
			}
			break;
		case PCNOutsourcedStepCompartmentPreparationTags4EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit24EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost24EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit24EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost24EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag24EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag24EditPart.VISUAL_ID;
			}
			break;
		case PCNOutsourcedStepCompartmentPreparationTags5EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit25EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost25EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit25EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost25EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag25EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag25EditPart.VISUAL_ID;
			}
			break;
		case PCNDecisionStepCompartmentDecisionProcessTagsEditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit26EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost26EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit26EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost26EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag26EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNProbabilitiesTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNProbabilitiesTagEditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag26EditPart.VISUAL_ID;
			}
			break;
		case PCNDecisionStepCompartmentDecisionProcessTags2EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit27EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost27EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit27EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost27EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag27EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNProbabilitiesTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNProbabilitiesTag2EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag27EditPart.VISUAL_ID;
			}
			break;
		case PCNDecisionStepCompartmentDecisionProcessTags3EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit28EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost28EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit28EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost28EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag28EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNProbabilitiesTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNProbabilitiesTag3EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag28EditPart.VISUAL_ID;
			}
			break;
		case PCNDecisionStepCompartmentDecisionProcessTags4EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit29EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost29EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit29EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost29EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag29EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNProbabilitiesTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNProbabilitiesTag4EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag29EditPart.VISUAL_ID;
			}
			break;
		case PCNDecisionStepCompartmentDecisionProcessTags5EditPart.VISUAL_ID:
			if (PcnPackage.eINSTANCE.getPCNMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryBenefit30EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNMonetaryCost30EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryBenefit().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryBenefit30EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNNonMonetaryCost().isSuperTypeOf(domainElement.eClass())) {
				return PCNNonMonetaryCost30EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNTextualTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNTextualTag30EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNProbabilitiesTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNProbabilitiesTag5EditPart.VISUAL_ID;
			}
			if (PcnPackage.eINSTANCE.getPCNSyncTag().isSuperTypeOf(domainElement.eClass())) {
				return PCNSyncTag30EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = pcn.diagram.part.PcnVisualIDRegistry.getModelID(containerView);
		if (!PCNDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (PCNDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = pcn.diagram.part.PcnVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PCNDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case PCNDiagramEditPart.VISUAL_ID:
			if (PCNProcessEntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNProcessEntityEditPart.VISUAL_ID:
			if (PCNProcessEntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNProcessEntityNameOrderEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNProcessEntityCompartmentLeftDirEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNProcessEntityCompartmentLeftSurEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNProcessEntityCompartmentIndEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNProcessEntityCompartmentRightSurEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNProcessEntityCompartmentRightDirEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNStandardStepEditPart.VISUAL_ID:
			if (PCNStandardStepActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNStandardStepCompartmentStandardProcessTagsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTagEditPart.VISUAL_ID:
			if (PCNTextualTagTagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNStandardStep2EditPart.VISUAL_ID:
			if (PCNStandardStepAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNStandardStepCompartmentStandardProcessTags2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag2EditPart.VISUAL_ID:
			if (PCNTextualTagTag2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNStandardStep3EditPart.VISUAL_ID:
			if (PCNStandardStepAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNStandardStepCompartmentStandardProcessTags3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag3EditPart.VISUAL_ID:
			if (PCNTextualTagTag3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNStandardStep4EditPart.VISUAL_ID:
			if (PCNStandardStepAction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNStandardStepCompartmentStandardProcessTags4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag4EditPart.VISUAL_ID:
			if (PCNTextualTagTag4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNStandardStep5EditPart.VISUAL_ID:
			if (PCNStandardStepAction5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNStandardStepCompartmentStandardProcessTags5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag5EditPart.VISUAL_ID:
			if (PCNTextualTagTag5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDoAndWaitStepEditPart.VISUAL_ID:
			if (PCNDoAndWaitStepActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDoAndWaitStepCompartmentLongProcessTagsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag6EditPart.VISUAL_ID:
			if (PCNTextualTagTag6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDelayTimeTagEditPart.VISUAL_ID:
			if (PCNDelayTimeTagDelayTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDoAndWaitStep2EditPart.VISUAL_ID:
			if (PCNDoAndWaitStepAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDoAndWaitStepCompartmentLongProcessTags2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag7EditPart.VISUAL_ID:
			if (PCNTextualTagTag7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDelayTimeTag2EditPart.VISUAL_ID:
			if (PCNDelayTimeTagDelayTime2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDoAndWaitStep3EditPart.VISUAL_ID:
			if (PCNDoAndWaitStepAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDoAndWaitStepCompartmentLongProcessTags3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag8EditPart.VISUAL_ID:
			if (PCNTextualTagTag8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDelayTimeTag3EditPart.VISUAL_ID:
			if (PCNDelayTimeTagDelayTime3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDoAndWaitStep4EditPart.VISUAL_ID:
			if (PCNDoAndWaitStepAction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDoAndWaitStepCompartmentLongProcessTags4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag9EditPart.VISUAL_ID:
			if (PCNTextualTagTag9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDelayTimeTag4EditPart.VISUAL_ID:
			if (PCNDelayTimeTagDelayTime4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDoAndWaitStep5EditPart.VISUAL_ID:
			if (PCNDoAndWaitStepAction5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDoAndWaitStepCompartmentLongProcessTags5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag10EditPart.VISUAL_ID:
			if (PCNTextualTagTag10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDelayTimeTag5EditPart.VISUAL_ID:
			if (PCNDelayTimeTagDelayTime5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNWaitStepEditPart.VISUAL_ID:
			if (PCNWaitStepActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNWaitStepCompartmentWaitProcessTagsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag11EditPart.VISUAL_ID:
			if (PCNTextualTagTag11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDelayTimeTag6EditPart.VISUAL_ID:
			if (PCNDelayTimeTagDelayTime6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNWaitStep2EditPart.VISUAL_ID:
			if (PCNWaitStepAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNWaitStepCompartmentWaitProcessTags2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag12EditPart.VISUAL_ID:
			if (PCNTextualTagTag12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDelayTimeTag7EditPart.VISUAL_ID:
			if (PCNDelayTimeTagDelayTime7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNWaitStep3EditPart.VISUAL_ID:
			if (PCNWaitStepAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNWaitStepCompartmentWaitProcessTags3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag13EditPart.VISUAL_ID:
			if (PCNTextualTagTag13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDelayTimeTag8EditPart.VISUAL_ID:
			if (PCNDelayTimeTagDelayTime8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNWaitStep4EditPart.VISUAL_ID:
			if (PCNWaitStepAction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNWaitStepCompartmentWaitProcessTags4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag14EditPart.VISUAL_ID:
			if (PCNTextualTagTag14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDelayTimeTag9EditPart.VISUAL_ID:
			if (PCNDelayTimeTagDelayTime9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNWaitStep5EditPart.VISUAL_ID:
			if (PCNWaitStepAction5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNWaitStepCompartmentWaitProcessTags5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag15EditPart.VISUAL_ID:
			if (PCNTextualTagTag15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDelayTimeTag10EditPart.VISUAL_ID:
			if (PCNDelayTimeTagDelayTime10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNInnovationStepEditPart.VISUAL_ID:
			if (PCNInnovationStepActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNInnovationStepCompartmentHighlightTagsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag16EditPart.VISUAL_ID:
			if (PCNTextualTagTag16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNInnovationStep2EditPart.VISUAL_ID:
			if (PCNInnovationStepAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNInnovationStepCompartmentHighlightTags2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag17EditPart.VISUAL_ID:
			if (PCNTextualTagTag17EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNInnovationStep3EditPart.VISUAL_ID:
			if (PCNInnovationStepAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNInnovationStepCompartmentHighlightTags3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag18EditPart.VISUAL_ID:
			if (PCNTextualTagTag18EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNInnovationStep4EditPart.VISUAL_ID:
			if (PCNInnovationStepAction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNInnovationStepCompartmentHighlightTags4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag19EditPart.VISUAL_ID:
			if (PCNTextualTagTag19EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNInnovationStep5EditPart.VISUAL_ID:
			if (PCNInnovationStepAction5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNInnovationStepCompartmentHighlightTags5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag20EditPart.VISUAL_ID:
			if (PCNTextualTagTag20EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNOutsourcedStepEditPart.VISUAL_ID:
			if (PCNOutsourcedStepActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNOutsourcedStepCompartmentPreparationTagsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag21EditPart.VISUAL_ID:
			if (PCNTextualTagTag21EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNOutsourcedStep2EditPart.VISUAL_ID:
			if (PCNOutsourcedStepAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNOutsourcedStepCompartmentPreparationTags2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag22EditPart.VISUAL_ID:
			if (PCNTextualTagTag22EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNOutsourcedStep3EditPart.VISUAL_ID:
			if (PCNOutsourcedStepAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNOutsourcedStepCompartmentPreparationTags3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag23EditPart.VISUAL_ID:
			if (PCNTextualTagTag23EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNOutsourcedStep4EditPart.VISUAL_ID:
			if (PCNOutsourcedStepAction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNOutsourcedStepCompartmentPreparationTags4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag24EditPart.VISUAL_ID:
			if (PCNTextualTagTag24EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNOutsourcedStep5EditPart.VISUAL_ID:
			if (PCNOutsourcedStepAction5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNOutsourcedStepCompartmentPreparationTags5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag25EditPart.VISUAL_ID:
			if (PCNTextualTagTag25EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDecisionStepEditPart.VISUAL_ID:
			if (PCNDecisionStepActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDecisionStepCompartmentDecisionProcessTagsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag26EditPart.VISUAL_ID:
			if (PCNTextualTagTag26EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNProbabilitiesTagEditPart.VISUAL_ID:
			if (PCNProbabilitiesTagYesProbabilityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNProbabilitiesTagNoProbabilityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDecisionStep2EditPart.VISUAL_ID:
			if (PCNDecisionStepAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDecisionStepCompartmentDecisionProcessTags2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag27EditPart.VISUAL_ID:
			if (PCNTextualTagTag27EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNProbabilitiesTag2EditPart.VISUAL_ID:
			if (PCNProbabilitiesTagYesProbability2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNProbabilitiesTagNoProbability2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDecisionStep3EditPart.VISUAL_ID:
			if (PCNDecisionStepAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDecisionStepCompartmentDecisionProcessTags3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag28EditPart.VISUAL_ID:
			if (PCNTextualTagTag28EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNProbabilitiesTag3EditPart.VISUAL_ID:
			if (PCNProbabilitiesTagYesProbability3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNProbabilitiesTagNoProbability3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDecisionStep4EditPart.VISUAL_ID:
			if (PCNDecisionStepAction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDecisionStepCompartmentDecisionProcessTags4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag29EditPart.VISUAL_ID:
			if (PCNTextualTagTag29EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNProbabilitiesTag4EditPart.VISUAL_ID:
			if (PCNProbabilitiesTagYesProbability4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNProbabilitiesTagNoProbability4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDecisionStep5EditPart.VISUAL_ID:
			if (PCNDecisionStepAction5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDecisionStepCompartmentDecisionProcessTags5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNTextualTag30EditPart.VISUAL_ID:
			if (PCNTextualTagTag30EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNProbabilitiesTag5EditPart.VISUAL_ID:
			if (PCNProbabilitiesTagYesProbability5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNProbabilitiesTagNoProbability5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNReferenceEditPart.VISUAL_ID:
			if (PCNReferenceLetterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNReferenceNumberEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNReference2EditPart.VISUAL_ID:
			if (PCNReferenceLetter2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNReferenceNumber2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNReference3EditPart.VISUAL_ID:
			if (PCNReferenceLetter3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNReferenceNumber3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNReference4EditPart.VISUAL_ID:
			if (PCNReferenceLetter4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNReferenceNumber4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNReference5EditPart.VISUAL_ID:
			if (PCNReferenceLetter5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNReferenceNumber5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNProcessEntityCompartmentLeftDirEditPart.VISUAL_ID:
			if (PCNStandardStepEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDoAndWaitStepEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNWaitStepEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNInnovationStepEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNOutsourcedStepEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDecisionStepEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNReferenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNProcessEntityCompartmentLeftSurEditPart.VISUAL_ID:
			if (PCNStandardStep2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDoAndWaitStep2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNWaitStep2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNInnovationStep2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNOutsourcedStep2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDecisionStep2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNReference2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNProcessEntityCompartmentIndEditPart.VISUAL_ID:
			if (PCNStandardStep3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDoAndWaitStep3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNWaitStep3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNInnovationStep3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNOutsourcedStep3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDecisionStep3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNReference3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNProcessEntityCompartmentRightSurEditPart.VISUAL_ID:
			if (PCNStandardStep4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDoAndWaitStep4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNWaitStep4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNInnovationStep4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNOutsourcedStep4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDecisionStep4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNReference4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNProcessEntityCompartmentRightDirEditPart.VISUAL_ID:
			if (PCNStandardStep5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDoAndWaitStep5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNWaitStep5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNInnovationStep5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNOutsourcedStep5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDecisionStep5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNReference5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNStandardStepCompartmentStandardProcessTagsEditPart.VISUAL_ID:
			if (PCNMonetaryBenefitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCostEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCostEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNStandardStepCompartmentStandardProcessTags2EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNStandardStepCompartmentStandardProcessTags3EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNStandardStepCompartmentStandardProcessTags4EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNStandardStepCompartmentStandardProcessTags5EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDoAndWaitStepCompartmentLongProcessTagsEditPart.VISUAL_ID:
			if (PCNMonetaryBenefit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDelayTimeTagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDoAndWaitStepCompartmentLongProcessTags2EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDelayTimeTag2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDoAndWaitStepCompartmentLongProcessTags3EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDelayTimeTag3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDoAndWaitStepCompartmentLongProcessTags4EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDelayTimeTag4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDoAndWaitStepCompartmentLongProcessTags5EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDelayTimeTag5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNWaitStepCompartmentWaitProcessTagsEditPart.VISUAL_ID:
			if (PCNMonetaryBenefit11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDelayTimeTag6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag11EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNWaitStepCompartmentWaitProcessTags2EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDelayTimeTag7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag12EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNWaitStepCompartmentWaitProcessTags3EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDelayTimeTag8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag13EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNWaitStepCompartmentWaitProcessTags4EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDelayTimeTag9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag14EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNWaitStepCompartmentWaitProcessTags5EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNDelayTimeTag10EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag15EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNInnovationStepCompartmentHighlightTagsEditPart.VISUAL_ID:
			if (PCNMonetaryBenefit16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag16EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNInnovationStepCompartmentHighlightTags2EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit17EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost17EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit17EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost17EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag17EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag17EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNInnovationStepCompartmentHighlightTags3EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit18EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost18EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit18EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost18EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag18EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag18EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNInnovationStepCompartmentHighlightTags4EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit19EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost19EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit19EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost19EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag19EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag19EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNInnovationStepCompartmentHighlightTags5EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit20EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost20EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit20EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost20EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag20EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag20EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNOutsourcedStepCompartmentPreparationTagsEditPart.VISUAL_ID:
			if (PCNMonetaryBenefit21EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost21EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit21EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost21EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag21EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag21EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNOutsourcedStepCompartmentPreparationTags2EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit22EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost22EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit22EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost22EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag22EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag22EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNOutsourcedStepCompartmentPreparationTags3EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit23EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost23EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit23EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost23EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag23EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag23EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNOutsourcedStepCompartmentPreparationTags4EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit24EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost24EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit24EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost24EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag24EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag24EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNOutsourcedStepCompartmentPreparationTags5EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit25EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost25EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit25EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost25EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag25EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag25EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDecisionStepCompartmentDecisionProcessTagsEditPart.VISUAL_ID:
			if (PCNMonetaryBenefit26EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost26EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit26EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost26EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag26EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNProbabilitiesTagEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag26EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDecisionStepCompartmentDecisionProcessTags2EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit27EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost27EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit27EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost27EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag27EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNProbabilitiesTag2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag27EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDecisionStepCompartmentDecisionProcessTags3EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit28EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost28EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit28EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost28EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag28EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNProbabilitiesTag3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag28EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDecisionStepCompartmentDecisionProcessTags4EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit29EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost29EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit29EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost29EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag29EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNProbabilitiesTag4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag29EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDecisionStepCompartmentDecisionProcessTags5EditPart.VISUAL_ID:
			if (PCNMonetaryBenefit30EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNMonetaryCost30EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryBenefit30EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNNonMonetaryCost30EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNTextualTag30EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNProbabilitiesTag5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PCNSyncTag30EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(PCNDiagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case PCNProcessEntityCompartmentLeftDirEditPart.VISUAL_ID:
		case PCNProcessEntityCompartmentLeftSurEditPart.VISUAL_ID:
		case PCNProcessEntityCompartmentIndEditPart.VISUAL_ID:
		case PCNProcessEntityCompartmentRightSurEditPart.VISUAL_ID:
		case PCNProcessEntityCompartmentRightDirEditPart.VISUAL_ID:
		case PCNStandardStepCompartmentStandardProcessTagsEditPart.VISUAL_ID:
		case PCNStandardStepCompartmentStandardProcessTags2EditPart.VISUAL_ID:
		case PCNStandardStepCompartmentStandardProcessTags3EditPart.VISUAL_ID:
		case PCNStandardStepCompartmentStandardProcessTags4EditPart.VISUAL_ID:
		case PCNStandardStepCompartmentStandardProcessTags5EditPart.VISUAL_ID:
		case PCNDoAndWaitStepCompartmentLongProcessTagsEditPart.VISUAL_ID:
		case PCNDoAndWaitStepCompartmentLongProcessTags2EditPart.VISUAL_ID:
		case PCNDoAndWaitStepCompartmentLongProcessTags3EditPart.VISUAL_ID:
		case PCNDoAndWaitStepCompartmentLongProcessTags4EditPart.VISUAL_ID:
		case PCNDoAndWaitStepCompartmentLongProcessTags5EditPart.VISUAL_ID:
		case PCNWaitStepCompartmentWaitProcessTagsEditPart.VISUAL_ID:
		case PCNWaitStepCompartmentWaitProcessTags2EditPart.VISUAL_ID:
		case PCNWaitStepCompartmentWaitProcessTags3EditPart.VISUAL_ID:
		case PCNWaitStepCompartmentWaitProcessTags4EditPart.VISUAL_ID:
		case PCNWaitStepCompartmentWaitProcessTags5EditPart.VISUAL_ID:
		case PCNInnovationStepCompartmentHighlightTagsEditPart.VISUAL_ID:
		case PCNInnovationStepCompartmentHighlightTags2EditPart.VISUAL_ID:
		case PCNInnovationStepCompartmentHighlightTags3EditPart.VISUAL_ID:
		case PCNInnovationStepCompartmentHighlightTags4EditPart.VISUAL_ID:
		case PCNInnovationStepCompartmentHighlightTags5EditPart.VISUAL_ID:
		case PCNOutsourcedStepCompartmentPreparationTagsEditPart.VISUAL_ID:
		case PCNOutsourcedStepCompartmentPreparationTags2EditPart.VISUAL_ID:
		case PCNOutsourcedStepCompartmentPreparationTags3EditPart.VISUAL_ID:
		case PCNOutsourcedStepCompartmentPreparationTags4EditPart.VISUAL_ID:
		case PCNOutsourcedStepCompartmentPreparationTags5EditPart.VISUAL_ID:
		case PCNDecisionStepCompartmentDecisionProcessTagsEditPart.VISUAL_ID:
		case PCNDecisionStepCompartmentDecisionProcessTags2EditPart.VISUAL_ID:
		case PCNDecisionStepCompartmentDecisionProcessTags3EditPart.VISUAL_ID:
		case PCNDecisionStepCompartmentDecisionProcessTags4EditPart.VISUAL_ID:
		case PCNDecisionStepCompartmentDecisionProcessTags5EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case PCNDiagramEditPart.VISUAL_ID:
			return false;
		case PCNReferenceEditPart.VISUAL_ID:
		case PCNReference2EditPart.VISUAL_ID:
		case PCNReference3EditPart.VISUAL_ID:
		case PCNReference4EditPart.VISUAL_ID:
		case PCNReference5EditPart.VISUAL_ID:
		case PCNMonetaryBenefitEditPart.VISUAL_ID:
		case PCNMonetaryCostEditPart.VISUAL_ID:
		case PCNNonMonetaryBenefitEditPart.VISUAL_ID:
		case PCNNonMonetaryCostEditPart.VISUAL_ID:
		case PCNMonetaryBenefit2EditPart.VISUAL_ID:
		case PCNMonetaryCost2EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit2EditPart.VISUAL_ID:
		case PCNNonMonetaryCost2EditPart.VISUAL_ID:
		case PCNMonetaryBenefit3EditPart.VISUAL_ID:
		case PCNMonetaryCost3EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit3EditPart.VISUAL_ID:
		case PCNNonMonetaryCost3EditPart.VISUAL_ID:
		case PCNMonetaryBenefit4EditPart.VISUAL_ID:
		case PCNMonetaryCost4EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit4EditPart.VISUAL_ID:
		case PCNNonMonetaryCost4EditPart.VISUAL_ID:
		case PCNMonetaryBenefit5EditPart.VISUAL_ID:
		case PCNMonetaryCost5EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit5EditPart.VISUAL_ID:
		case PCNNonMonetaryCost5EditPart.VISUAL_ID:
		case PCNMonetaryBenefit6EditPart.VISUAL_ID:
		case PCNMonetaryCost6EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit6EditPart.VISUAL_ID:
		case PCNNonMonetaryCost6EditPart.VISUAL_ID:
		case PCNMonetaryBenefit7EditPart.VISUAL_ID:
		case PCNMonetaryCost7EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit7EditPart.VISUAL_ID:
		case PCNNonMonetaryCost7EditPart.VISUAL_ID:
		case PCNMonetaryBenefit8EditPart.VISUAL_ID:
		case PCNMonetaryCost8EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit8EditPart.VISUAL_ID:
		case PCNNonMonetaryCost8EditPart.VISUAL_ID:
		case PCNMonetaryBenefit9EditPart.VISUAL_ID:
		case PCNMonetaryCost9EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit9EditPart.VISUAL_ID:
		case PCNNonMonetaryCost9EditPart.VISUAL_ID:
		case PCNMonetaryBenefit10EditPart.VISUAL_ID:
		case PCNMonetaryCost10EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit10EditPart.VISUAL_ID:
		case PCNNonMonetaryCost10EditPart.VISUAL_ID:
		case PCNMonetaryBenefit11EditPart.VISUAL_ID:
		case PCNMonetaryCost11EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit11EditPart.VISUAL_ID:
		case PCNNonMonetaryCost11EditPart.VISUAL_ID:
		case PCNMonetaryBenefit12EditPart.VISUAL_ID:
		case PCNMonetaryCost12EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit12EditPart.VISUAL_ID:
		case PCNNonMonetaryCost12EditPart.VISUAL_ID:
		case PCNMonetaryBenefit13EditPart.VISUAL_ID:
		case PCNMonetaryCost13EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit13EditPart.VISUAL_ID:
		case PCNNonMonetaryCost13EditPart.VISUAL_ID:
		case PCNMonetaryBenefit14EditPart.VISUAL_ID:
		case PCNMonetaryCost14EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit14EditPart.VISUAL_ID:
		case PCNNonMonetaryCost14EditPart.VISUAL_ID:
		case PCNMonetaryBenefit15EditPart.VISUAL_ID:
		case PCNMonetaryCost15EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit15EditPart.VISUAL_ID:
		case PCNNonMonetaryCost15EditPart.VISUAL_ID:
		case PCNMonetaryBenefit16EditPart.VISUAL_ID:
		case PCNMonetaryCost16EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit16EditPart.VISUAL_ID:
		case PCNNonMonetaryCost16EditPart.VISUAL_ID:
		case PCNMonetaryBenefit17EditPart.VISUAL_ID:
		case PCNMonetaryCost17EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit17EditPart.VISUAL_ID:
		case PCNNonMonetaryCost17EditPart.VISUAL_ID:
		case PCNMonetaryBenefit18EditPart.VISUAL_ID:
		case PCNMonetaryCost18EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit18EditPart.VISUAL_ID:
		case PCNNonMonetaryCost18EditPart.VISUAL_ID:
		case PCNMonetaryBenefit19EditPart.VISUAL_ID:
		case PCNMonetaryCost19EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit19EditPart.VISUAL_ID:
		case PCNNonMonetaryCost19EditPart.VISUAL_ID:
		case PCNMonetaryBenefit20EditPart.VISUAL_ID:
		case PCNMonetaryCost20EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit20EditPart.VISUAL_ID:
		case PCNNonMonetaryCost20EditPart.VISUAL_ID:
		case PCNMonetaryBenefit21EditPart.VISUAL_ID:
		case PCNMonetaryCost21EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit21EditPart.VISUAL_ID:
		case PCNNonMonetaryCost21EditPart.VISUAL_ID:
		case PCNMonetaryBenefit22EditPart.VISUAL_ID:
		case PCNMonetaryCost22EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit22EditPart.VISUAL_ID:
		case PCNNonMonetaryCost22EditPart.VISUAL_ID:
		case PCNMonetaryBenefit23EditPart.VISUAL_ID:
		case PCNMonetaryCost23EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit23EditPart.VISUAL_ID:
		case PCNNonMonetaryCost23EditPart.VISUAL_ID:
		case PCNMonetaryBenefit24EditPart.VISUAL_ID:
		case PCNMonetaryCost24EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit24EditPart.VISUAL_ID:
		case PCNNonMonetaryCost24EditPart.VISUAL_ID:
		case PCNMonetaryBenefit25EditPart.VISUAL_ID:
		case PCNMonetaryCost25EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit25EditPart.VISUAL_ID:
		case PCNNonMonetaryCost25EditPart.VISUAL_ID:
		case PCNMonetaryBenefit26EditPart.VISUAL_ID:
		case PCNMonetaryCost26EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit26EditPart.VISUAL_ID:
		case PCNNonMonetaryCost26EditPart.VISUAL_ID:
		case PCNMonetaryBenefit27EditPart.VISUAL_ID:
		case PCNMonetaryCost27EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit27EditPart.VISUAL_ID:
		case PCNNonMonetaryCost27EditPart.VISUAL_ID:
		case PCNMonetaryBenefit28EditPart.VISUAL_ID:
		case PCNMonetaryCost28EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit28EditPart.VISUAL_ID:
		case PCNNonMonetaryCost28EditPart.VISUAL_ID:
		case PCNMonetaryBenefit29EditPart.VISUAL_ID:
		case PCNMonetaryCost29EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit29EditPart.VISUAL_ID:
		case PCNNonMonetaryCost29EditPart.VISUAL_ID:
		case PCNMonetaryBenefit30EditPart.VISUAL_ID:
		case PCNMonetaryCost30EditPart.VISUAL_ID:
		case PCNNonMonetaryBenefit30EditPart.VISUAL_ID:
		case PCNNonMonetaryCost30EditPart.VISUAL_ID:
		case PCNTextualTagEditPart.VISUAL_ID:
		case PCNTextualTag2EditPart.VISUAL_ID:
		case PCNTextualTag3EditPart.VISUAL_ID:
		case PCNTextualTag4EditPart.VISUAL_ID:
		case PCNTextualTag5EditPart.VISUAL_ID:
		case PCNTextualTag6EditPart.VISUAL_ID:
		case PCNTextualTag7EditPart.VISUAL_ID:
		case PCNTextualTag8EditPart.VISUAL_ID:
		case PCNTextualTag9EditPart.VISUAL_ID:
		case PCNTextualTag10EditPart.VISUAL_ID:
		case PCNTextualTag11EditPart.VISUAL_ID:
		case PCNTextualTag12EditPart.VISUAL_ID:
		case PCNTextualTag13EditPart.VISUAL_ID:
		case PCNTextualTag14EditPart.VISUAL_ID:
		case PCNTextualTag15EditPart.VISUAL_ID:
		case PCNTextualTag16EditPart.VISUAL_ID:
		case PCNTextualTag17EditPart.VISUAL_ID:
		case PCNTextualTag18EditPart.VISUAL_ID:
		case PCNTextualTag19EditPart.VISUAL_ID:
		case PCNTextualTag20EditPart.VISUAL_ID:
		case PCNTextualTag21EditPart.VISUAL_ID:
		case PCNTextualTag22EditPart.VISUAL_ID:
		case PCNTextualTag23EditPart.VISUAL_ID:
		case PCNTextualTag24EditPart.VISUAL_ID:
		case PCNTextualTag25EditPart.VISUAL_ID:
		case PCNTextualTag26EditPart.VISUAL_ID:
		case PCNTextualTag27EditPart.VISUAL_ID:
		case PCNTextualTag28EditPart.VISUAL_ID:
		case PCNTextualTag29EditPart.VISUAL_ID:
		case PCNTextualTag30EditPart.VISUAL_ID:
		case PCNDelayTimeTagEditPart.VISUAL_ID:
		case PCNDelayTimeTag2EditPart.VISUAL_ID:
		case PCNDelayTimeTag3EditPart.VISUAL_ID:
		case PCNDelayTimeTag4EditPart.VISUAL_ID:
		case PCNDelayTimeTag5EditPart.VISUAL_ID:
		case PCNDelayTimeTag6EditPart.VISUAL_ID:
		case PCNDelayTimeTag7EditPart.VISUAL_ID:
		case PCNDelayTimeTag8EditPart.VISUAL_ID:
		case PCNDelayTimeTag9EditPart.VISUAL_ID:
		case PCNDelayTimeTag10EditPart.VISUAL_ID:
		case PCNProbabilitiesTagEditPart.VISUAL_ID:
		case PCNProbabilitiesTag2EditPart.VISUAL_ID:
		case PCNProbabilitiesTag3EditPart.VISUAL_ID:
		case PCNProbabilitiesTag4EditPart.VISUAL_ID:
		case PCNProbabilitiesTag5EditPart.VISUAL_ID:
		case PCNSyncTagEditPart.VISUAL_ID:
		case PCNSyncTag2EditPart.VISUAL_ID:
		case PCNSyncTag3EditPart.VISUAL_ID:
		case PCNSyncTag4EditPart.VISUAL_ID:
		case PCNSyncTag5EditPart.VISUAL_ID:
		case PCNSyncTag6EditPart.VISUAL_ID:
		case PCNSyncTag7EditPart.VISUAL_ID:
		case PCNSyncTag8EditPart.VISUAL_ID:
		case PCNSyncTag9EditPart.VISUAL_ID:
		case PCNSyncTag10EditPart.VISUAL_ID:
		case PCNSyncTag11EditPart.VISUAL_ID:
		case PCNSyncTag12EditPart.VISUAL_ID:
		case PCNSyncTag13EditPart.VISUAL_ID:
		case PCNSyncTag14EditPart.VISUAL_ID:
		case PCNSyncTag15EditPart.VISUAL_ID:
		case PCNSyncTag16EditPart.VISUAL_ID:
		case PCNSyncTag17EditPart.VISUAL_ID:
		case PCNSyncTag18EditPart.VISUAL_ID:
		case PCNSyncTag19EditPart.VISUAL_ID:
		case PCNSyncTag20EditPart.VISUAL_ID:
		case PCNSyncTag21EditPart.VISUAL_ID:
		case PCNSyncTag22EditPart.VISUAL_ID:
		case PCNSyncTag23EditPart.VISUAL_ID:
		case PCNSyncTag24EditPart.VISUAL_ID:
		case PCNSyncTag25EditPart.VISUAL_ID:
		case PCNSyncTag26EditPart.VISUAL_ID:
		case PCNSyncTag27EditPart.VISUAL_ID:
		case PCNSyncTag28EditPart.VISUAL_ID:
		case PCNSyncTag29EditPart.VISUAL_ID:
		case PCNSyncTag30EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return pcn.diagram.part.PcnVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return pcn.diagram.part.PcnVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return pcn.diagram.part.PcnVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return pcn.diagram.part.PcnVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return pcn.diagram.part.PcnVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return pcn.diagram.part.PcnVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
