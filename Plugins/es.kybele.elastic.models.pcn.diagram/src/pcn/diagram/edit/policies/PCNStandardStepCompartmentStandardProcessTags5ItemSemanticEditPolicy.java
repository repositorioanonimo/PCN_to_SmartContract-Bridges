package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import pcn.diagram.edit.commands.PCNMonetaryBenefit5CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost5CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit5CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost5CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag5CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag5CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNStandardStepCompartmentStandardProcessTags5ItemSemanticEditPolicy
		extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNStandardStepCompartmentStandardProcessTags5ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNStandardStep_3015);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3064 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit5CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3065 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost5CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3066 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit5CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3067 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost5CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3172 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag5CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3217 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
