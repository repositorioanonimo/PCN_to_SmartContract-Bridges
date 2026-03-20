package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNMonetaryBenefit3CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost3CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit3CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost3CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag3CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag3CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNStandardStepCompartmentStandardProcessTags3ItemSemanticEditPolicy
		extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNStandardStepCompartmentStandardProcessTags3ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNStandardStep_3013);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3056 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit3CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3057 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost3CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3058 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit3CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3059 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost3CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3170 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag3CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3215 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
