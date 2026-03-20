package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNDelayTimeTag2CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit7CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost7CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit7CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost7CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag7CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag7CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNDoAndWaitStepCompartmentLongProcessTags2ItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNDoAndWaitStepCompartmentLongProcessTags2ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNDoAndWaitStep_3017);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3072 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit7CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3073 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost7CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3074 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit7CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3075 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost7CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3174 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag7CreateCommand(req));
		}
		if (PcnElementTypes.PCNDelayTimeTag_3199 == req.getElementType()) {
			return getGEFWrapper(new PCNDelayTimeTag2CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3219 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag7CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
