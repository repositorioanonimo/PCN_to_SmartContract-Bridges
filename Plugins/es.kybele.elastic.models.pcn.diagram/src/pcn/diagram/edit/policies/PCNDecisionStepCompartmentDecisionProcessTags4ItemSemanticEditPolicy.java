package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNMonetaryBenefit29CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost29CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit29CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost29CreateCommand;
import pcn.diagram.edit.commands.PCNProbabilitiesTag4CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag29CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag29CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNDecisionStepCompartmentDecisionProcessTags4ItemSemanticEditPolicy
		extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNDecisionStepCompartmentDecisionProcessTags4ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNDecisionStep_3039);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3160 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit29CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3161 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost29CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3162 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit29CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3163 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost29CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3196 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag29CreateCommand(req));
		}
		if (PcnElementTypes.PCNProbabilitiesTag_3211 == req.getElementType()) {
			return getGEFWrapper(new PCNProbabilitiesTag4CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3241 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag29CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
