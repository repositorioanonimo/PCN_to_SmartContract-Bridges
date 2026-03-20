package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNDelayTimeTag4CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit9CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost9CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit9CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost9CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag9CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag9CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNDoAndWaitStepCompartmentLongProcessTags4ItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNDoAndWaitStepCompartmentLongProcessTags4ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNDoAndWaitStep_3019);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3080 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit9CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3081 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost9CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3082 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit9CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3083 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost9CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3176 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag9CreateCommand(req));
		}
		if (PcnElementTypes.PCNDelayTimeTag_3201 == req.getElementType()) {
			return getGEFWrapper(new PCNDelayTimeTag4CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3221 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag9CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
