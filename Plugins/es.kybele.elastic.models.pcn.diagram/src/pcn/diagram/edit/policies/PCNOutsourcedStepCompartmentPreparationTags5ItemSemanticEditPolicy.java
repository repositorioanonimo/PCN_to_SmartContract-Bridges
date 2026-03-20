package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNMonetaryBenefit15CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit16CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit20CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit21CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit25CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost15CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost16CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost20CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost21CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost25CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit15CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit16CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit20CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit21CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit25CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost15CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost16CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost20CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost21CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost25CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag25CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag25CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNOutsourcedStepCompartmentPreparationTags5ItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNOutsourcedStepCompartmentPreparationTags5ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNOutsourcedStep_3035);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3144 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit25CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3145 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost25CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3146 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit25CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3147 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost25CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3192 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag25CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3237 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag25CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
