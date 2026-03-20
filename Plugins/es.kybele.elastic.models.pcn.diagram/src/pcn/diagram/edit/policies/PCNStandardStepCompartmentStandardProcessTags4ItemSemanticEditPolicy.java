package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNMonetaryBenefit4CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost4CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit4CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost4CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag4CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag4CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNStandardStepCompartmentStandardProcessTags4ItemSemanticEditPolicy
		extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNStandardStepCompartmentStandardProcessTags4ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNStandardStep_3014);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3060 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit4CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3061 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost4CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3062 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit4CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3063 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost4CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3171 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag4CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3216 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
