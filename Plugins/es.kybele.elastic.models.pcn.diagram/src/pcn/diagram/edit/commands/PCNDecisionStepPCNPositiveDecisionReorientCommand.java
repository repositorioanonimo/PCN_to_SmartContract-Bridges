package pcn.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import pcn.PCNDecisionStep;
import pcn.PCNProcessStep;
import pcn.diagram.edit.policies.PcnBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class PCNDecisionStepPCNPositiveDecisionReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public PCNDecisionStepPCNPositiveDecisionReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof PCNDecisionStep) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof PCNProcessStep && newEnd instanceof PCNDecisionStep)) {
			return false;
		}
		return PcnBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistPCNDecisionStepPCNPositiveDecision_4006(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof PCNProcessStep && newEnd instanceof PCNProcessStep)) {
			return false;
		}
		return PcnBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistPCNDecisionStepPCNPositiveDecision_4006(getOldSource(), getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().setPCNPositiveDecision(null);
		getNewSource().setPCNPositiveDecision(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setPCNPositiveDecision(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected PCNDecisionStep getOldSource() {
		return (PCNDecisionStep) referenceOwner;
	}

	/**
	* @generated
	*/
	protected PCNDecisionStep getNewSource() {
		return (PCNDecisionStep) newEnd;
	}

	/**
	* @generated
	*/
	protected PCNProcessStep getOldTarget() {
		return (PCNProcessStep) oldEnd;
	}

	/**
	* @generated
	*/
	protected PCNProcessStep getNewTarget() {
		return (PCNProcessStep) newEnd;
	}
}
