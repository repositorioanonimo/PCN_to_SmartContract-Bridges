package pcn.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import pcn.PCNProcessStep;
import pcn.PCNRegularProcessStep;
import pcn.diagram.edit.policies.PcnBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class PCNRegularProcessStepPCNStandardDependencyReorientCommand extends EditElementCommand {

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
	public PCNRegularProcessStepPCNStandardDependencyReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof PCNRegularProcessStep) {
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
		if (!(oldEnd instanceof PCNProcessStep && newEnd instanceof PCNRegularProcessStep)) {
			return false;
		}
		return PcnBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistPCNRegularProcessStepPCNStandardDependency_4008(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof PCNProcessStep && newEnd instanceof PCNProcessStep)) {
			return false;
		}
		return PcnBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistPCNRegularProcessStepPCNStandardDependency_4008(getOldSource(), getNewTarget());
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
		getOldSource().getPCNStandardDependency().remove(getOldTarget());
		getNewSource().getPCNStandardDependency().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getPCNStandardDependency().remove(getOldTarget());
		getOldSource().getPCNStandardDependency().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected PCNRegularProcessStep getOldSource() {
		return (PCNRegularProcessStep) referenceOwner;
	}

	/**
	* @generated
	*/
	protected PCNRegularProcessStep getNewSource() {
		return (PCNRegularProcessStep) newEnd;
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
