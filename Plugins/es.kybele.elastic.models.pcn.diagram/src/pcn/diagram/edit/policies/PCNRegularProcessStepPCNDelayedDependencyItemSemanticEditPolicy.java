package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNRegularProcessStepPCNDelayedDependencyItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNRegularProcessStepPCNDelayedDependencyItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
