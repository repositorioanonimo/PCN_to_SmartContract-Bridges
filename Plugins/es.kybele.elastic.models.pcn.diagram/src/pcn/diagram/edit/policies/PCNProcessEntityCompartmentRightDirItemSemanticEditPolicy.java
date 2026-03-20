package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

import pcn.diagram.edit.commands.PCNDecisionStep5CreateCommand;
import pcn.diagram.edit.commands.PCNInnovationStep5CreateCommand;
import pcn.diagram.edit.commands.PCNDoAndWaitStep5CreateCommand;
import pcn.diagram.edit.commands.PCNOutsourcedStep5CreateCommand;
import pcn.diagram.edit.commands.PCNReference5CreateCommand;
import pcn.diagram.edit.commands.PCNStandardStep5CreateCommand;
import pcn.diagram.edit.commands.PCNWaitStep5CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNProcessEntityCompartmentRightDirItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNProcessEntityCompartmentRightDirItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNProcessEntity_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNStandardStep_3015 == req.getElementType()) {
			return getGEFWrapper(new PCNStandardStep5CreateCommand(req));
		}
		if (PcnElementTypes.PCNDoAndWaitStep_3020 == req.getElementType()) {
			return getGEFWrapper(new PCNDoAndWaitStep5CreateCommand(req));
		}
		if (PcnElementTypes.PCNWaitStep_3025 == req.getElementType()) {
			return getGEFWrapper(new PCNWaitStep5CreateCommand(req));
		}
		if (PcnElementTypes.PCNInnovationStep_3030 == req.getElementType()) {
			return getGEFWrapper(new PCNInnovationStep5CreateCommand(req));
		}
		if (PcnElementTypes.PCNOutsourcedStep_3035 == req.getElementType()) {
			return getGEFWrapper(new PCNOutsourcedStep5CreateCommand(req));
		}
		if (PcnElementTypes.PCNDecisionStep_3040 == req.getElementType()) {
			return getGEFWrapper(new PCNDecisionStep5CreateCommand(req));
		}
		if (PcnElementTypes.PCNReference_3045 == req.getElementType()) {
			return getGEFWrapper(new PCNReference5CreateCommand(req));
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
