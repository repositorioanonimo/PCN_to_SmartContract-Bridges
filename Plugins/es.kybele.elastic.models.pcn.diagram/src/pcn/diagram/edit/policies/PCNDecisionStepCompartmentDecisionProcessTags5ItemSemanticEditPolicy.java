package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNMonetaryBenefit30CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost30CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit30CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost30CreateCommand;
import pcn.diagram.edit.commands.PCNProbabilitiesTag5CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag30CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag30CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNDecisionStepCompartmentDecisionProcessTags5ItemSemanticEditPolicy
		extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNDecisionStepCompartmentDecisionProcessTags5ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNDecisionStep_3040);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3164 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit30CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3165 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost30CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3166 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit30CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3167 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost30CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3197 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag30CreateCommand(req));
		}
		if (PcnElementTypes.PCNProbabilitiesTag_3212 == req.getElementType()) {
			return getGEFWrapper(new PCNProbabilitiesTag5CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3242 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag30CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
