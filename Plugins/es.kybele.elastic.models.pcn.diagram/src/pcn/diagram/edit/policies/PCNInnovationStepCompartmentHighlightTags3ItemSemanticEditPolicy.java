package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNMonetaryBenefit13CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit14CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit18CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit8CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit9CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost13CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost14CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost18CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost8CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost9CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit13CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit14CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit18CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit8CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit9CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost13CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost14CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost18CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost8CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost9CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag18CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag18CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNInnovationStepCompartmentHighlightTags3ItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNInnovationStepCompartmentHighlightTags3ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNInnovationStep_3028);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3116 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit18CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3117 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost18CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3118 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit18CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3119 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost18CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3185 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag18CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3230 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag18CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
