package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

import pcn.diagram.edit.commands.PCNDecisionStep4CreateCommand;

import pcn.diagram.edit.commands.PCNInnovationStep4CreateCommand;
import pcn.diagram.edit.commands.PCNDoAndWaitStep4CreateCommand;
import pcn.diagram.edit.commands.PCNOutsourcedStep4CreateCommand;
import pcn.diagram.edit.commands.PCNReference4CreateCommand;
import pcn.diagram.edit.commands.PCNStandardStep4CreateCommand;

import pcn.diagram.edit.commands.PCNWaitStep4CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNProcessEntityCompartmentRightSurItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNProcessEntityCompartmentRightSurItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNProcessEntity_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNStandardStep_3014 == req.getElementType()) {
			return getGEFWrapper(new PCNStandardStep4CreateCommand(req));
		}
		if (PcnElementTypes.PCNDoAndWaitStep_3019 == req.getElementType()) {
			return getGEFWrapper(new PCNDoAndWaitStep4CreateCommand(req));
		}
		if (PcnElementTypes.PCNWaitStep_3024 == req.getElementType()) {
			return getGEFWrapper(new PCNWaitStep4CreateCommand(req));
		}
		if (PcnElementTypes.PCNInnovationStep_3029 == req.getElementType()) {
			return getGEFWrapper(new PCNInnovationStep4CreateCommand(req));
		}
		if (PcnElementTypes.PCNOutsourcedStep_3034 == req.getElementType()) {
			return getGEFWrapper(new PCNOutsourcedStep4CreateCommand(req));
		}
		if (PcnElementTypes.PCNDecisionStep_3039 == req.getElementType()) {
			return getGEFWrapper(new PCNDecisionStep4CreateCommand(req));
		}
		if (PcnElementTypes.PCNReference_3044 == req.getElementType()) {
			return getGEFWrapper(new PCNReference4CreateCommand(req));
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
