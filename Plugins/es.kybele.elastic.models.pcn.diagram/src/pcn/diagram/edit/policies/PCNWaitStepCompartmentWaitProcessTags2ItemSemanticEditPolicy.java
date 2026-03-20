package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNDelayTimeTag2CreateCommand;
import pcn.diagram.edit.commands.PCNDelayTimeTag7CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit12CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit7CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit8CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost12CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost7CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost8CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit12CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit7CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit8CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost12CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost7CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost8CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag12CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag12CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNWaitStepCompartmentWaitProcessTags2ItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNWaitStepCompartmentWaitProcessTags2ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNWaitStep_3022);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3092 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit12CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3093 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost12CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3094 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit12CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3095 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost12CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3179 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag12CreateCommand(req));
		}
		if (PcnElementTypes.PCNDelayTimeTag_3204 == req.getElementType()) {
			return getGEFWrapper(new PCNDelayTimeTag7CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3224 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag12CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
