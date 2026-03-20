package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNMonetaryBenefit27CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost27CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit27CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost27CreateCommand;
import pcn.diagram.edit.commands.PCNProbabilitiesTag2CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag27CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag27CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNDecisionStepCompartmentDecisionProcessTags2ItemSemanticEditPolicy
		extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNDecisionStepCompartmentDecisionProcessTags2ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNDecisionStep_3037);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3152 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit27CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3153 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost27CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3154 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit27CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3155 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost27CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3194 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag27CreateCommand(req));
		}
		if (PcnElementTypes.PCNProbabilitiesTag_3209 == req.getElementType()) {
			return getGEFWrapper(new PCNProbabilitiesTag2CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3239 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag27CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
