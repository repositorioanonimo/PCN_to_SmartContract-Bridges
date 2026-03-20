package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNMonetaryBenefit13CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit14CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit18CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit19CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit23CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost13CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost14CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost18CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost19CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost23CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit13CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit14CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit18CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit19CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit23CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost13CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost14CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost18CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost19CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost23CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag23CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag23CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNOutsourcedStepCompartmentPreparationTags3ItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNOutsourcedStepCompartmentPreparationTags3ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNOutsourcedStep_3033);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3136 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit23CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3137 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost23CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3138 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit23CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3139 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost23CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3190 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag23CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3235 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag23CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
