package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNMonetaryBenefit10CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit14CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit15CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit19CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit9CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost10CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost14CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost15CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost19CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost9CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit10CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit14CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit15CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit19CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit9CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost10CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost14CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost15CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost19CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost9CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag19CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag19CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNInnovationStepCompartmentHighlightTags4ItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNInnovationStepCompartmentHighlightTags4ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNInnovationStep_3029);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3120 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit19CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3121 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost19CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3122 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit19CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3123 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost19CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3186 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag19CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3231 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag19CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
