package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNDelayTimeTag6CreateCommand;
import pcn.diagram.edit.commands.PCNDelayTimeTagCreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit11CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit6CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit7CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost11CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost6CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost7CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit11CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit6CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit7CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost11CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost6CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost7CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag11CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag11CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNWaitStepCompartmentWaitProcessTagsItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNWaitStepCompartmentWaitProcessTagsItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNWaitStep_3021);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3088 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit11CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3089 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost11CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3090 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit11CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3091 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost11CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3178 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag11CreateCommand(req));
		}
		if (PcnElementTypes.PCNDelayTimeTag_3203 == req.getElementType()) {
			return getGEFWrapper(new PCNDelayTimeTag6CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3223 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag11CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
