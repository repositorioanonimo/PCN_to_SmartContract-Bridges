package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNDelayTimeTag4CreateCommand;
import pcn.diagram.edit.commands.PCNDelayTimeTag9CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit10CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit14CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit9CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost10CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost14CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost9CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit10CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit14CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit9CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost10CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost14CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost9CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag14CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag14CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNWaitStepCompartmentWaitProcessTags4ItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNWaitStepCompartmentWaitProcessTags4ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNWaitStep_3024);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3100 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit14CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3101 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost14CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3102 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit14CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3103 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost14CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3181 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag14CreateCommand(req));
		}
		if (PcnElementTypes.PCNDelayTimeTag_3206 == req.getElementType()) {
			return getGEFWrapper(new PCNDelayTimeTag9CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3226 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag14CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
