package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNMonetaryBenefit11CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit12CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit16CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit6CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit7CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost11CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost12CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost16CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost6CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost7CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit11CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit12CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit16CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit6CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit7CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost11CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost12CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost16CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost6CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost7CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag16CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag16CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNInnovationStepCompartmentHighlightTagsItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNInnovationStepCompartmentHighlightTagsItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNInnovationStep_3026);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3108 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit16CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3109 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost16CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3110 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit16CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3111 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost16CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3183 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag16CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3228 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag16CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
