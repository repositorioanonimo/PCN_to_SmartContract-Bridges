package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNMonetaryBenefit26CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost26CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit26CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost26CreateCommand;
import pcn.diagram.edit.commands.PCNProbabilitiesTagCreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag26CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag26CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNDecisionStepCompartmentDecisionProcessTagsItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNDecisionStepCompartmentDecisionProcessTagsItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNDecisionStep_3036);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3148 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit26CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3149 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost26CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3150 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit26CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3151 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost26CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3193 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag26CreateCommand(req));
		}
		if (PcnElementTypes.PCNProbabilitiesTag_3208 == req.getElementType()) {
			return getGEFWrapper(new PCNProbabilitiesTagCreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3238 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag26CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
