package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNMonetaryBenefitCreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCostCreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefitCreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCostCreateCommand;
import pcn.diagram.edit.commands.PCNSyncTagCreateCommand;
import pcn.diagram.edit.commands.PCNTextualTagCreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNStandardStepCompartmentStandardProcessTagsItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNStandardStepCompartmentStandardProcessTagsItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNStandardStep_3011);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3048 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefitCreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3049 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCostCreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3050 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefitCreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3051 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCostCreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3168 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTagCreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3213 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTagCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
