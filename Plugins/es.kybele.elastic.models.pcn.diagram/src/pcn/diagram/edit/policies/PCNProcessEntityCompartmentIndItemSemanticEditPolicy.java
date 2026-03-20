package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

import pcn.diagram.edit.commands.PCNDecisionStep3CreateCommand;

import pcn.diagram.edit.commands.PCNInnovationStep3CreateCommand;
import pcn.diagram.edit.commands.PCNDoAndWaitStep3CreateCommand;
import pcn.diagram.edit.commands.PCNOutsourcedStep3CreateCommand;
import pcn.diagram.edit.commands.PCNReference3CreateCommand;
import pcn.diagram.edit.commands.PCNStandardStep3CreateCommand;
import pcn.diagram.edit.commands.PCNWaitStep3CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNProcessEntityCompartmentIndItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNProcessEntityCompartmentIndItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNProcessEntity_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNStandardStep_3013 == req.getElementType()) {
			return getGEFWrapper(new PCNStandardStep3CreateCommand(req));
		}
		if (PcnElementTypes.PCNDoAndWaitStep_3018 == req.getElementType()) {
			return getGEFWrapper(new PCNDoAndWaitStep3CreateCommand(req));
		}
		if (PcnElementTypes.PCNWaitStep_3023 == req.getElementType()) {
			return getGEFWrapper(new PCNWaitStep3CreateCommand(req));
		}
		if (PcnElementTypes.PCNInnovationStep_3028 == req.getElementType()) {
			return getGEFWrapper(new PCNInnovationStep3CreateCommand(req));
		}
		if (PcnElementTypes.PCNOutsourcedStep_3033 == req.getElementType()) {
			return getGEFWrapper(new PCNOutsourcedStep3CreateCommand(req));
		}
		if (PcnElementTypes.PCNDecisionStep_3038 == req.getElementType()) {
			return getGEFWrapper(new PCNDecisionStep3CreateCommand(req));
		}
		if (PcnElementTypes.PCNReference_3043 == req.getElementType()) {
			return getGEFWrapper(new PCNReference3CreateCommand(req));
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
