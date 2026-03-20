package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNDelayTimeTagCreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit6CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost6CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit6CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost6CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag6CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag6CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNDoAndWaitStepCompartmentLongProcessTagsItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNDoAndWaitStepCompartmentLongProcessTagsItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNDoAndWaitStep_3016);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3068 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit6CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3069 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost6CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3070 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit6CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3071 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost6CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3173 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag6CreateCommand(req));
		}
		if (PcnElementTypes.PCNDelayTimeTag_3198 == req.getElementType()) {
			return getGEFWrapper(new PCNDelayTimeTagCreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3218 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
