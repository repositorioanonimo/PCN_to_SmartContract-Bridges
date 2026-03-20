package pcn.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

import pcn.PCNDecisionStep;
import pcn.PCNProcessStep;
import pcn.diagram.edit.policies.PcnBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class PCNDecisionStepPCNPositiveDecisionCreateCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final EObject source;

	/**
	* @generated
	*/
	private final EObject target;

	/**
	* @generated
	*/
	public PCNDecisionStepPCNPositiveDecisionCreateCommand(CreateRelationshipRequest request, EObject source,
			EObject target) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null && false == source instanceof PCNDecisionStep) {
			return false;
		}
		if (target != null && false == target instanceof PCNProcessStep) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		return PcnBaseItemSemanticEditPolicy.getLinkConstraints()
				.canCreatePCNDecisionStepPCNPositiveDecision_4006(getSource(), getTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in create link command"); //$NON-NLS-1$
		}

		if (getSource() != null && getTarget() != null) {
			getSource().setPCNPositiveDecision(getTarget());
		}
		return CommandResult.newOKCommandResult();

	}

	/**
	* @generated
	*/
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	* @generated
	*/
	protected PCNDecisionStep getSource() {
		return (PCNDecisionStep) source;
	}

	/**
	* @generated
	*/
	protected PCNProcessStep getTarget() {
		return (PCNProcessStep) target;
	}
}
