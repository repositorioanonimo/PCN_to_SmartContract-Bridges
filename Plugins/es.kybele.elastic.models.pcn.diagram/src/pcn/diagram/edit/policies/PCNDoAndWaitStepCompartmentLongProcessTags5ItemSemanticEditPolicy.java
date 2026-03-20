package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNDelayTimeTag5CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit10CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost10CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit10CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost10CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag10CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag10CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNDoAndWaitStepCompartmentLongProcessTags5ItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNDoAndWaitStepCompartmentLongProcessTags5ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNDoAndWaitStep_3020);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3084 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit10CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3085 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost10CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3086 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit10CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3087 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost10CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3177 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag10CreateCommand(req));
		}
		if (PcnElementTypes.PCNDelayTimeTag_3202 == req.getElementType()) {
			return getGEFWrapper(new PCNDelayTimeTag5CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3222 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag10CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
