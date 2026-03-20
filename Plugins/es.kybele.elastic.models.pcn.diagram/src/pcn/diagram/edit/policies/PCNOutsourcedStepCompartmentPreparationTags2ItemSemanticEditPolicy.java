package pcn.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import pcn.diagram.edit.commands.PCNMonetaryBenefit12CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit13CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit17CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit18CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryBenefit22CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost12CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost13CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost17CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost18CreateCommand;
import pcn.diagram.edit.commands.PCNMonetaryCost22CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit12CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit13CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit17CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit18CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryBenefit22CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost12CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost13CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost17CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost18CreateCommand;
import pcn.diagram.edit.commands.PCNNonMonetaryCost22CreateCommand;
import pcn.diagram.edit.commands.PCNSyncTag22CreateCommand;
import pcn.diagram.edit.commands.PCNTextualTag22CreateCommand;
import pcn.diagram.providers.PcnElementTypes;

/**
 * @generated
 */
public class PCNOutsourcedStepCompartmentPreparationTags2ItemSemanticEditPolicy extends PcnBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PCNOutsourcedStepCompartmentPreparationTags2ItemSemanticEditPolicy() {
		super(PcnElementTypes.PCNOutsourcedStep_3032);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PcnElementTypes.PCNMonetaryBenefit_3132 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryBenefit22CreateCommand(req));
		}
		if (PcnElementTypes.PCNMonetaryCost_3133 == req.getElementType()) {
			return getGEFWrapper(new PCNMonetaryCost22CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryBenefit_3134 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryBenefit22CreateCommand(req));
		}
		if (PcnElementTypes.PCNNonMonetaryCost_3135 == req.getElementType()) {
			return getGEFWrapper(new PCNNonMonetaryCost22CreateCommand(req));
		}
		if (PcnElementTypes.PCNTextualTag_3189 == req.getElementType()) {
			return getGEFWrapper(new PCNTextualTag22CreateCommand(req));
		}
		if (PcnElementTypes.PCNSyncTag_3234 == req.getElementType()) {
			return getGEFWrapper(new PCNSyncTag22CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
