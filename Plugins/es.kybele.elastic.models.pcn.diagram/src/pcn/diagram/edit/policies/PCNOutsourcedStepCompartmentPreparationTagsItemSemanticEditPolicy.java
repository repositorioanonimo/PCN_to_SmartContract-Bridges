package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNMonetaryBenefit11CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit12CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit16CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit17CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit21CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost11CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost12CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost16CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost17CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost21CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit11CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit12CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit16CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit17CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit21CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost11CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost12CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost16CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost17CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost21CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag21CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag21CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNOutsourcedStepCompartmentPreparationTagsItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNOutsourcedStepCompartmentPreparationTagsItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNOutsourcedStep_3031);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3128 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit21CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3129 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost21CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3130 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit21CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3131 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost21CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3188 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag21CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3233 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag21CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
