package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNDelayTimeTag3CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit8CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost8CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit8CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost8CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag8CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag8CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNDoAndWaitStepCompartmentLongProcessTags3ItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNDoAndWaitStepCompartmentLongProcessTags3ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNDoAndWaitStep_3018);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3076 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit8CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3077 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost8CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3078 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit8CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3079 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost8CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3175 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag8CreateCommand(req));
		}
		if (PcnElementTypes.PCNDelayTimeTag_3200 == req.getElementType()) {
			return getGEFWrapper(new PCNDelayTimeTag3CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3220 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag8CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
