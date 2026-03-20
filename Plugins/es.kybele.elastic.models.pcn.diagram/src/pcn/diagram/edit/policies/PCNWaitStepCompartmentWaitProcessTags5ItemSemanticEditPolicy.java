package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNDelayTimeTag10CreateCommand;
import pcn.diagram.edit.commands.PCNDelayTimeTag5CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit10CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit11CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit15CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost10CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost11CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost15CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit10CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit11CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit15CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost10CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost11CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost15CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag15CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag15CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNWaitStepCompartmentWaitProcessTags5ItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNWaitStepCompartmentWaitProcessTags5ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNWaitStep_3025);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3104 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit15CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3105 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost15CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3106 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit15CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3107 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost15CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3182 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag15CreateCommand(req));
		}
		if (PcnElementTypes.PCNDelayTimeTag_3207 == req.getElementType()) {
			return getGEFWrapper(new PCNDelayTimeTag10CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3227 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag15CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
