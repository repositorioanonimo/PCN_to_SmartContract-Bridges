package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNMonetaryBenefit12CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit13CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit17CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit7CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit8CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost12CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost13CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost17CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost7CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost8CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit12CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit13CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit17CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit7CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit8CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost12CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost13CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost17CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost7CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost8CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag17CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag17CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNInnovationStepCompartmentHighlightTags2ItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNInnovationStepCompartmentHighlightTags2ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNInnovationStep_3027);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3112 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit17CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3113 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost17CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3114 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit17CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3115 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost17CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3184 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag17CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3229 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag17CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
