package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNMonetaryBenefit14CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit15CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit19CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit20CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit24CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost14CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost15CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost19CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost20CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost24CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit14CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit15CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit19CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit20CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit24CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost14CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost15CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost19CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost20CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost24CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag24CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag24CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNOutsourcedStepCompartmentPreparationTags4ItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNOutsourcedStepCompartmentPreparationTags4ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNOutsourcedStep_3034);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3140 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit24CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3141 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost24CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3142 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit24CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3143 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost24CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3191 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag24CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3236 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag24CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
