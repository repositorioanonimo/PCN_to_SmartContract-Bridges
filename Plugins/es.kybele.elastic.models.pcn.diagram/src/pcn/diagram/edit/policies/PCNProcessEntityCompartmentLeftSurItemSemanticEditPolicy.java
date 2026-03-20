package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

import pcn.diagram.edit.commands.PCNDecisionStep2CreateCommand;
import pcn.diagram.edit.commands.PCNInnovationStep2CreateCommand;
import pcn.diagram.edit.commands.PCNDoAndWaitStep2CreateCommand;
import pcn.diagram.edit.commands.PCNOutsourcedStep2CreateCommand;
import pcn.diagram.edit.commands.PCNReference2CreateCommand;
import pcn.diagram.edit.commands.PCNStandardStep2CreateCommand;
import pcn.diagram.edit.commands.PCNWaitStep2CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNProcessEntityCompartmentLeftSurItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNProcessEntityCompartmentLeftSurItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNProcessEntity_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNStandardStep_3012 == req.getElementType()) {
			return getGEFWrapper(new PCNStandardStep2CreateCommand(req));
		}
		if (PcnElementTypes.PCNDoAndWaitStep_3017 == req.getElementType()) {
			return getGEFWrapper(new PCNDoAndWaitStep2CreateCommand(req));
		}
		if (PcnElementTypes.PCNWaitStep_3022 == req.getElementType()) {
			return getGEFWrapper(new PCNWaitStep2CreateCommand(req));
		}
		if (PcnElementTypes.PCNInnovationStep_3027 == req.getElementType()) {
			return getGEFWrapper(new PCNInnovationStep2CreateCommand(req));
		}
		if (PcnElementTypes.PCNOutsourcedStep_3032 == req.getElementType()) {
			return getGEFWrapper(new PCNOutsourcedStep2CreateCommand(req));
		}
		if (PcnElementTypes.PCNDecisionStep_3037 == req.getElementType()) {
			return getGEFWrapper(new PCNDecisionStep2CreateCommand(req));
		}
		if (PcnElementTypes.PCNReference_3042 == req.getElementType()) {
			return getGEFWrapper(new PCNReference2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated NOT
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		//Para que no se puedan eliminar los compartment. 
		if (request instanceof DestroyRequest) {
			return null;
		}
		return super.getSemanticCommand(request);
	}
}
