package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNMonetaryBenefit28CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost28CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit28CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost28CreateCommand;
import pcn.diagram.edit.commands.PCNProbabilitiesTag3CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag28CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag28CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNDecisionStepCompartmentDecisionProcessTags3ItemSemanticEditPolicy
		extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNDecisionStepCompartmentDecisionProcessTags3ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNDecisionStep_3038);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3156 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit28CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3157 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost28CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3158 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit28CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3159 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost28CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3195 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag28CreateCommand(req));
		}
		if (PcnElementTypes.PCNProbabilitiesTag_3210 == req.getElementType()) {
			return getGEFWrapper(new PCNProbabilitiesTag3CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3240 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag28CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
