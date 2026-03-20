package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNRegularProcessStepPCNStandardDependencyItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNRegularProcessStepPCNStandardDependencyItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
