package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNDecisionStepPCNNegativeDecisionItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNDecisionStepPCNNegativeDecisionItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNDecisionStepPCNNegativeDecision_4007);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
