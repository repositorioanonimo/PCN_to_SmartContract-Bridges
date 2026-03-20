package pcn.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import pcn.diagram.edit.commands.PCNDecisionStepPCNNegativeDecisionCreateCommand;
import pcn.diagram.edit.commands.PCNDecisionStepPCNNegativeDecisionReorientCommand;
import pcn.diagram.edit.commands.PCNDecisionStepPCNPositiveDecisionCreateCommand;
import pcn.diagram.edit.commands.PCNDecisionStepPCNPositiveDecisionReorientCommand;

import pcn.diagram.edit.commands.PCNRegularProcessStepPCNDelayedDependencyCreateCommand;
import pcn.diagram.edit.commands.PCNRegularProcessStepPCNDelayedDependencyReorientCommand;

import pcn.diagram.edit.commands.PCNRegularProcessStepPCNStandardDependencyCreateCommand;
import pcn.diagram.edit.commands.PCNRegularProcessStepPCNStandardDependencyReorientCommand;

import pcn.diagram.edit.parts.PCNDecisionStepPCNNegativeDecisionEditPart;
import pcn.diagram.edit.parts.PCNDecisionStepPCNPositiveDecisionEditPart;

import pcn.diagram.edit.parts.PCNRegularProcessStepPCNDelayedDependencyEditPart;

import pcn.diagram.edit.parts.PCNRegularProcessStepPCNStandardDependencyEditPart;

import pcn.diagram.part.PcnVisualIDRegistry;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNReference5ItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNReference5ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNReference_3045);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (PcnVisualIDRegistry
					.getVisualID(incomingLink) == PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (PcnVisualIDRegistry
					.getVisualID(incomingLink) == PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (PcnVisualIDRegistry.getVisualID(incomingLink) == PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (PcnVisualIDRegistry.getVisualID(incomingLink) == PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008 == req.getElementType()) {
			return null;
		}
		if (PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009 == req.getElementType()) {
			return null;
		}
		if (PcnElementTypes.PCNDecisionStepPCNNegativeDecision_4007 == req.getElementType()) {
			return null;
		}
		if (PcnElementTypes.PCNDecisionStepPCNPositiveDecision_4006 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008 == req.getElementType()) {
			return getGEFWrapper(
					new PCNRegularProcessStepPCNStandardDependencyCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009 == req.getElementType()) {
			return getGEFWrapper(
					new PCNRegularProcessStepPCNDelayedDependencyCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (PcnElementTypes.PCNDecisionStepPCNNegativeDecision_4007 == req.getElementType()) {
			return getGEFWrapper(
					new PCNDecisionStepPCNNegativeDecisionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (PcnElementTypes.PCNDecisionStepPCNPositiveDecision_4006 == req.getElementType()) {
			return getGEFWrapper(
					new PCNDecisionStepPCNPositiveDecisionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	* Returns command to reorient EReference based link. New link target or source
	* should be the domain model element associated with this node.
	* 
	* @generated
	*/
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID:
			return getGEFWrapper(new PCNRegularProcessStepPCNStandardDependencyReorientCommand(req));
		case PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID:
			return getGEFWrapper(new PCNRegularProcessStepPCNDelayedDependencyReorientCommand(req));
		case PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID:
			return getGEFWrapper(new PCNDecisionStepPCNNegativeDecisionReorientCommand(req));
		case PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID:
			return getGEFWrapper(new PCNDecisionStepPCNPositiveDecisionReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
