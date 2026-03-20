package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNDelayTimeTag3CreateCommand;
import pcn.diagram.edit.commands.PCNDelayTimeTag8CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit13CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit8CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit9CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost13CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost8CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost9CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit13CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit8CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit9CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost13CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost8CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost9CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag13CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag13CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNWaitStepCompartmentWaitProcessTags3ItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNWaitStepCompartmentWaitProcessTags3ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNWaitStep_3023);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3096 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit13CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3097 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost13CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3098 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit13CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3099 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost13CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3180 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag13CreateCommand(req));
		}
		if (PcnElementTypes.PCNDelayTimeTag_3205 == req.getElementType()) {
			return getGEFWrapper(new PCNDelayTimeTag8CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3225 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag13CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
