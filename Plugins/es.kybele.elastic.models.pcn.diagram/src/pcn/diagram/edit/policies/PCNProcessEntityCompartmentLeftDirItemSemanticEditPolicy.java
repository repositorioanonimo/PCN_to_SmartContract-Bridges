package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

import pcn.diagram.edit.commands.PCNDecisionStepCreateCommand;
import pcn.diagram.edit.commands.PCNInnovationStepCreateCommand;
import pcn.diagram.edit.commands.PCNDoAndWaitStepCreateCommand;
import pcn.diagram.edit.commands.PCNOutsourcedStepCreateCommand;
import pcn.diagram.edit.commands.PCNReferenceCreateCommand;
import pcn.diagram.edit.commands.PCNStandardStepCreateCommand;
import pcn.diagram.edit.commands.PCNWaitStepCreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNProcessEntityCompartmentLeftDirItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNProcessEntityCompartmentLeftDirItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNProcessEntity_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNStandardStep_3011 == req.getElementType()) {
			return getGEFWrapper(new PCNStandardStepCreateCommand(req));
		}
		if (PcnElementTypes.PCNDoAndWaitStep_3016 == req.getElementType()) {
			return getGEFWrapper(new PCNDoAndWaitStepCreateCommand(req));
		}
		if (PcnElementTypes.PCNWaitStep_3021 == req.getElementType()) {
			return getGEFWrapper(new PCNWaitStepCreateCommand(req));
		}
		if (PcnElementTypes.PCNInnovationStep_3026 == req.getElementType()) {
			return getGEFWrapper(new PCNInnovationStepCreateCommand(req));
		}
		if (PcnElementTypes.PCNOutsourcedStep_3031 == req.getElementType()) {
			return getGEFWrapper(new PCNOutsourcedStepCreateCommand(req));
		}
		if (PcnElementTypes.PCNDecisionStep_3036 == req.getElementType()) {
			return getGEFWrapper(new PCNDecisionStepCreateCommand(req));
		}
		if (PcnElementTypes.PCNReference_3041 == req.getElementType()) {
			return getGEFWrapper(new PCNReferenceCreateCommand(req));
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
