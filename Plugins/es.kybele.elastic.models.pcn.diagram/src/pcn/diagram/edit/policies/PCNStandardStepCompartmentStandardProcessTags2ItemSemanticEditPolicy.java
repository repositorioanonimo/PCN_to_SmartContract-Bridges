package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNMonetaryBenefit2CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost2CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit2CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost2CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag2CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag2CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNStandardStepCompartmentStandardProcessTags2ItemSemanticEditPolicy
		extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNStandardStepCompartmentStandardProcessTags2ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNStandardStep_3012);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3052 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit2CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3053 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost2CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3054 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit2CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3055 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost2CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3169 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag2CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3214 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
