package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNMonetaryBenefit10CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit11CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit15CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit16CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit20CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost10CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost11CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost15CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost16CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost20CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit10CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit11CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit15CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit16CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit20CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost10CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost11CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost15CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost16CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost20CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag20CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag20CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNInnovationStepCompartmentHighlightTags5ItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNInnovationStepCompartmentHighlightTags5ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNInnovationStep_3030);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3124 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit20CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3125 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost20CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3126 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit20CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3127 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost20CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3187 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag20CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3232 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag20CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
