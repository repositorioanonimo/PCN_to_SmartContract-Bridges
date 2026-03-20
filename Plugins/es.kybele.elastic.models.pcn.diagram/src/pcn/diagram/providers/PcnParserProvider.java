package pcn.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import pcn.PcnPackage;
import pcn.diagram.edit.parts.PCNDecisionStepAction2EditPart;
import pcn.diagram.edit.parts.PCNDecisionStepAction3EditPart;
import pcn.diagram.edit.parts.PCNDecisionStepAction4EditPart;
import pcn.diagram.edit.parts.PCNDecisionStepAction5EditPart;
import pcn.diagram.edit.parts.PCNDecisionStepActionEditPart;
import pcn.diagram.edit.parts.PCNDelayTimeTagDelayTime10EditPart;
import pcn.diagram.edit.parts.PCNDelayTimeTagDelayTime2EditPart;
import pcn.diagram.edit.parts.PCNDelayTimeTagDelayTime3EditPart;
import pcn.diagram.edit.parts.PCNDelayTimeTagDelayTime4EditPart;
import pcn.diagram.edit.parts.PCNDelayTimeTagDelayTime5EditPart;
import pcn.diagram.edit.parts.PCNDelayTimeTagDelayTime6EditPart;
import pcn.diagram.edit.parts.PCNDelayTimeTagDelayTime7EditPart;
import pcn.diagram.edit.parts.PCNDelayTimeTagDelayTime8EditPart;
import pcn.diagram.edit.parts.PCNDelayTimeTagDelayTime9EditPart;
import pcn.diagram.edit.parts.PCNDelayTimeTagDelayTimeEditPart;
import pcn.diagram.edit.parts.PCNInnovationStepAction2EditPart;
import pcn.diagram.edit.parts.PCNInnovationStepAction3EditPart;
import pcn.diagram.edit.parts.PCNInnovationStepAction4EditPart;
import pcn.diagram.edit.parts.PCNInnovationStepAction5EditPart;
import pcn.diagram.edit.parts.PCNInnovationStepActionEditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStepAction2EditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStepAction3EditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStepAction4EditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStepAction5EditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStepActionEditPart;
import pcn.diagram.edit.parts.PCNOutsourcedStepAction2EditPart;
import pcn.diagram.edit.parts.PCNOutsourcedStepAction3EditPart;
import pcn.diagram.edit.parts.PCNOutsourcedStepAction4EditPart;
import pcn.diagram.edit.parts.PCNOutsourcedStepAction5EditPart;
import pcn.diagram.edit.parts.PCNOutsourcedStepActionEditPart;
import pcn.diagram.edit.parts.PCNProbabilitiesTagNoProbability2EditPart;
import pcn.diagram.edit.parts.PCNProbabilitiesTagNoProbability3EditPart;
import pcn.diagram.edit.parts.PCNProbabilitiesTagNoProbability4EditPart;
import pcn.diagram.edit.parts.PCNProbabilitiesTagNoProbability5EditPart;
import pcn.diagram.edit.parts.PCNProbabilitiesTagNoProbabilityEditPart;
import pcn.diagram.edit.parts.PCNProbabilitiesTagYesProbability2EditPart;
import pcn.diagram.edit.parts.PCNProbabilitiesTagYesProbability3EditPart;
import pcn.diagram.edit.parts.PCNProbabilitiesTagYesProbability4EditPart;
import pcn.diagram.edit.parts.PCNProbabilitiesTagYesProbability5EditPart;
import pcn.diagram.edit.parts.PCNProbabilitiesTagYesProbabilityEditPart;
import pcn.diagram.edit.parts.PCNProcessEntityNameEditPart;
import pcn.diagram.edit.parts.PCNProcessEntityNameOrderEditPart;
import pcn.diagram.edit.parts.PCNReferenceLetter2EditPart;
import pcn.diagram.edit.parts.PCNReferenceLetter3EditPart;
import pcn.diagram.edit.parts.PCNReferenceLetter4EditPart;
import pcn.diagram.edit.parts.PCNReferenceLetter5EditPart;
import pcn.diagram.edit.parts.PCNReferenceLetterEditPart;
import pcn.diagram.edit.parts.PCNReferenceNumber2EditPart;
import pcn.diagram.edit.parts.PCNReferenceNumber3EditPart;
import pcn.diagram.edit.parts.PCNReferenceNumber4EditPart;
import pcn.diagram.edit.parts.PCNReferenceNumber5EditPart;
import pcn.diagram.edit.parts.PCNReferenceNumberEditPart;
import pcn.diagram.edit.parts.PCNStandardStepAction2EditPart;
import pcn.diagram.edit.parts.PCNStandardStepAction3EditPart;
import pcn.diagram.edit.parts.PCNStandardStepAction4EditPart;
import pcn.diagram.edit.parts.PCNStandardStepAction5EditPart;
import pcn.diagram.edit.parts.PCNStandardStepActionEditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag10EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag11EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag12EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag13EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag14EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag15EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag16EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag17EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag18EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag19EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag20EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag21EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag22EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag23EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag24EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag25EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag26EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag27EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag28EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag29EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag2EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag30EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag3EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag4EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag5EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag6EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag7EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag8EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTag9EditPart;
import pcn.diagram.edit.parts.PCNTextualTagTagEditPart;
import pcn.diagram.edit.parts.PCNWaitStepAction2EditPart;
import pcn.diagram.edit.parts.PCNWaitStepAction3EditPart;
import pcn.diagram.edit.parts.PCNWaitStepAction4EditPart;
import pcn.diagram.edit.parts.PCNWaitStepAction5EditPart;
import pcn.diagram.edit.parts.PCNWaitStepActionEditPart;
import pcn.diagram.parsers.MessageFormatParser;
import pcn.diagram.part.PcnVisualIDRegistry;

/**
 * @generated
 */
public class PcnParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser pCNProcessEntityName_5001Parser;

	/**
	* @generated
	*/
	private IParser getPCNProcessEntityName_5001Parser() {
		if (pCNProcessEntityName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessEntity_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNProcessEntityName_5001Parser = parser;
		}
		return pCNProcessEntityName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNProcessEntityOrder_5042Parser;

	/**
	* @generated
	*/
	private IParser getPCNProcessEntityOrder_5042Parser() {
		if (pCNProcessEntityOrder_5042Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessEntity_Order() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNProcessEntityOrder_5042Parser = parser;
		}
		return pCNProcessEntityOrder_5042Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNStandardStepAction_5002Parser;

	/**
	* @generated
	*/
	private IParser getPCNStandardStepAction_5002Parser() {
		if (pCNStandardStepAction_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNStandardStepAction_5002Parser = parser;
		}
		return pCNStandardStepAction_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5043Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5043Parser() {
		if (pCNTextualTagTag_5043Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5043Parser = parser;
		}
		return pCNTextualTagTag_5043Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNStandardStepAction_5003Parser;

	/**
	* @generated
	*/
	private IParser getPCNStandardStepAction_5003Parser() {
		if (pCNStandardStepAction_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNStandardStepAction_5003Parser = parser;
		}
		return pCNStandardStepAction_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5044Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5044Parser() {
		if (pCNTextualTagTag_5044Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5044Parser = parser;
		}
		return pCNTextualTagTag_5044Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNStandardStepAction_5004Parser;

	/**
	* @generated
	*/
	private IParser getPCNStandardStepAction_5004Parser() {
		if (pCNStandardStepAction_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNStandardStepAction_5004Parser = parser;
		}
		return pCNStandardStepAction_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5045Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5045Parser() {
		if (pCNTextualTagTag_5045Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5045Parser = parser;
		}
		return pCNTextualTagTag_5045Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNStandardStepAction_5005Parser;

	/**
	* @generated
	*/
	private IParser getPCNStandardStepAction_5005Parser() {
		if (pCNStandardStepAction_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNStandardStepAction_5005Parser = parser;
		}
		return pCNStandardStepAction_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5046Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5046Parser() {
		if (pCNTextualTagTag_5046Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5046Parser = parser;
		}
		return pCNTextualTagTag_5046Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNStandardStepAction_5006Parser;

	/**
	* @generated
	*/
	private IParser getPCNStandardStepAction_5006Parser() {
		if (pCNStandardStepAction_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNStandardStepAction_5006Parser = parser;
		}
		return pCNStandardStepAction_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5047Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5047Parser() {
		if (pCNTextualTagTag_5047Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5047Parser = parser;
		}
		return pCNTextualTagTag_5047Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNDoAndWaitStepAction_5022Parser;

	/**
	* @generated
	*/
	private IParser getPCNDoAndWaitStepAction_5022Parser() {
		if (pCNDoAndWaitStepAction_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNDoAndWaitStepAction_5022Parser = parser;
		}
		return pCNDoAndWaitStepAction_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5048Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5048Parser() {
		if (pCNTextualTagTag_5048Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5048Parser = parser;
		}
		return pCNTextualTagTag_5048Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNDoAndWaitStepAction_5023Parser;

	/**
	* @generated
	*/
	private IParser getPCNDoAndWaitStepAction_5023Parser() {
		if (pCNDoAndWaitStepAction_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNDoAndWaitStepAction_5023Parser = parser;
		}
		return pCNDoAndWaitStepAction_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5049Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5049Parser() {
		if (pCNTextualTagTag_5049Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5049Parser = parser;
		}
		return pCNTextualTagTag_5049Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNDoAndWaitStepAction_5024Parser;

	/**
	* @generated
	*/
	private IParser getPCNDoAndWaitStepAction_5024Parser() {
		if (pCNDoAndWaitStepAction_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNDoAndWaitStepAction_5024Parser = parser;
		}
		return pCNDoAndWaitStepAction_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5050Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5050Parser() {
		if (pCNTextualTagTag_5050Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5050Parser = parser;
		}
		return pCNTextualTagTag_5050Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNDoAndWaitStepAction_5025Parser;

	/**
	* @generated
	*/
	private IParser getPCNDoAndWaitStepAction_5025Parser() {
		if (pCNDoAndWaitStepAction_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNDoAndWaitStepAction_5025Parser = parser;
		}
		return pCNDoAndWaitStepAction_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5051Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5051Parser() {
		if (pCNTextualTagTag_5051Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5051Parser = parser;
		}
		return pCNTextualTagTag_5051Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNDoAndWaitStepAction_5026Parser;

	/**
	* @generated
	*/
	private IParser getPCNDoAndWaitStepAction_5026Parser() {
		if (pCNDoAndWaitStepAction_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNDoAndWaitStepAction_5026Parser = parser;
		}
		return pCNDoAndWaitStepAction_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5052Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5052Parser() {
		if (pCNTextualTagTag_5052Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5052Parser = parser;
		}
		return pCNTextualTagTag_5052Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNWaitStepAction_5017Parser;

	/**
	* @generated
	*/
	private IParser getPCNWaitStepAction_5017Parser() {
		if (pCNWaitStepAction_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNWaitStepAction_5017Parser = parser;
		}
		return pCNWaitStepAction_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5053Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5053Parser() {
		if (pCNTextualTagTag_5053Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5053Parser = parser;
		}
		return pCNTextualTagTag_5053Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNDelayTimeTagDelayTime_5078Parser;

	/**
	* @generated
	*/
	private IParser getPCNDelayTimeTagDelayTime_5078Parser() {
		if (pCNDelayTimeTagDelayTime_5078Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNDelayTimeTag_DelayTime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNDelayTimeTagDelayTime_5078Parser = parser;
		}
		return pCNDelayTimeTagDelayTime_5078Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNDelayTimeTagDelayTime_5073Parser;

	/**
	* @generated
	*/
	private IParser getPCNDelayTimeTagDelayTime_5073Parser() {
		if (pCNDelayTimeTagDelayTime_5073Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNDelayTimeTag_DelayTime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNDelayTimeTagDelayTime_5073Parser = parser;
		}
		return pCNDelayTimeTagDelayTime_5073Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNWaitStepAction_5018Parser;

	/**
	* @generated
	*/
	private IParser getPCNWaitStepAction_5018Parser() {
		if (pCNWaitStepAction_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNWaitStepAction_5018Parser = parser;
		}
		return pCNWaitStepAction_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5054Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5054Parser() {
		if (pCNTextualTagTag_5054Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5054Parser = parser;
		}
		return pCNTextualTagTag_5054Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNDelayTimeTagDelayTime_5079Parser;

	/**
	* @generated
	*/
	private IParser getPCNDelayTimeTagDelayTime_5079Parser() {
		if (pCNDelayTimeTagDelayTime_5079Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNDelayTimeTag_DelayTime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNDelayTimeTagDelayTime_5079Parser = parser;
		}
		return pCNDelayTimeTagDelayTime_5079Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNDelayTimeTagDelayTime_5074Parser;

	/**
	* @generated
	*/
	private IParser getPCNDelayTimeTagDelayTime_5074Parser() {
		if (pCNDelayTimeTagDelayTime_5074Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNDelayTimeTag_DelayTime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNDelayTimeTagDelayTime_5074Parser = parser;
		}
		return pCNDelayTimeTagDelayTime_5074Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNWaitStepAction_5019Parser;

	/**
	* @generated
	*/
	private IParser getPCNWaitStepAction_5019Parser() {
		if (pCNWaitStepAction_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNWaitStepAction_5019Parser = parser;
		}
		return pCNWaitStepAction_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5055Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5055Parser() {
		if (pCNTextualTagTag_5055Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5055Parser = parser;
		}
		return pCNTextualTagTag_5055Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNDelayTimeTagDelayTime_5080Parser;

	/**
	* @generated
	*/
	private IParser getPCNDelayTimeTagDelayTime_5080Parser() {
		if (pCNDelayTimeTagDelayTime_5080Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNDelayTimeTag_DelayTime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNDelayTimeTagDelayTime_5080Parser = parser;
		}
		return pCNDelayTimeTagDelayTime_5080Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNDelayTimeTagDelayTime_5075Parser;

	/**
	* @generated
	*/
	private IParser getPCNDelayTimeTagDelayTime_5075Parser() {
		if (pCNDelayTimeTagDelayTime_5075Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNDelayTimeTag_DelayTime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNDelayTimeTagDelayTime_5075Parser = parser;
		}
		return pCNDelayTimeTagDelayTime_5075Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNWaitStepAction_5020Parser;

	/**
	* @generated
	*/
	private IParser getPCNWaitStepAction_5020Parser() {
		if (pCNWaitStepAction_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNWaitStepAction_5020Parser = parser;
		}
		return pCNWaitStepAction_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5056Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5056Parser() {
		if (pCNTextualTagTag_5056Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5056Parser = parser;
		}
		return pCNTextualTagTag_5056Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNDelayTimeTagDelayTime_5081Parser;

	/**
	* @generated
	*/
	private IParser getPCNDelayTimeTagDelayTime_5081Parser() {
		if (pCNDelayTimeTagDelayTime_5081Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNDelayTimeTag_DelayTime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNDelayTimeTagDelayTime_5081Parser = parser;
		}
		return pCNDelayTimeTagDelayTime_5081Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNDelayTimeTagDelayTime_5076Parser;

	/**
	* @generated
	*/
	private IParser getPCNDelayTimeTagDelayTime_5076Parser() {
		if (pCNDelayTimeTagDelayTime_5076Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNDelayTimeTag_DelayTime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNDelayTimeTagDelayTime_5076Parser = parser;
		}
		return pCNDelayTimeTagDelayTime_5076Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNWaitStepAction_5021Parser;

	/**
	* @generated
	*/
	private IParser getPCNWaitStepAction_5021Parser() {
		if (pCNWaitStepAction_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNWaitStepAction_5021Parser = parser;
		}
		return pCNWaitStepAction_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5057Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5057Parser() {
		if (pCNTextualTagTag_5057Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5057Parser = parser;
		}
		return pCNTextualTagTag_5057Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNDelayTimeTagDelayTime_5082Parser;

	/**
	* @generated
	*/
	private IParser getPCNDelayTimeTagDelayTime_5082Parser() {
		if (pCNDelayTimeTagDelayTime_5082Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNDelayTimeTag_DelayTime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNDelayTimeTagDelayTime_5082Parser = parser;
		}
		return pCNDelayTimeTagDelayTime_5082Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNDelayTimeTagDelayTime_5077Parser;

	/**
	* @generated
	*/
	private IParser getPCNDelayTimeTagDelayTime_5077Parser() {
		if (pCNDelayTimeTagDelayTime_5077Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNDelayTimeTag_DelayTime() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNDelayTimeTagDelayTime_5077Parser = parser;
		}
		return pCNDelayTimeTagDelayTime_5077Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNInnovationStepAction_5007Parser;

	/**
	* @generated
	*/
	private IParser getPCNInnovationStepAction_5007Parser() {
		if (pCNInnovationStepAction_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNInnovationStepAction_5007Parser = parser;
		}
		return pCNInnovationStepAction_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5058Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5058Parser() {
		if (pCNTextualTagTag_5058Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5058Parser = parser;
		}
		return pCNTextualTagTag_5058Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNInnovationStepAction_5008Parser;

	/**
	* @generated
	*/
	private IParser getPCNInnovationStepAction_5008Parser() {
		if (pCNInnovationStepAction_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNInnovationStepAction_5008Parser = parser;
		}
		return pCNInnovationStepAction_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5059Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5059Parser() {
		if (pCNTextualTagTag_5059Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5059Parser = parser;
		}
		return pCNTextualTagTag_5059Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNInnovationStepAction_5009Parser;

	/**
	* @generated
	*/
	private IParser getPCNInnovationStepAction_5009Parser() {
		if (pCNInnovationStepAction_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNInnovationStepAction_5009Parser = parser;
		}
		return pCNInnovationStepAction_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5060Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5060Parser() {
		if (pCNTextualTagTag_5060Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5060Parser = parser;
		}
		return pCNTextualTagTag_5060Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNInnovationStepAction_5010Parser;

	/**
	* @generated
	*/
	private IParser getPCNInnovationStepAction_5010Parser() {
		if (pCNInnovationStepAction_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNInnovationStepAction_5010Parser = parser;
		}
		return pCNInnovationStepAction_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5061Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5061Parser() {
		if (pCNTextualTagTag_5061Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5061Parser = parser;
		}
		return pCNTextualTagTag_5061Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNInnovationStepAction_5011Parser;

	/**
	* @generated
	*/
	private IParser getPCNInnovationStepAction_5011Parser() {
		if (pCNInnovationStepAction_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNInnovationStepAction_5011Parser = parser;
		}
		return pCNInnovationStepAction_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5062Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5062Parser() {
		if (pCNTextualTagTag_5062Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5062Parser = parser;
		}
		return pCNTextualTagTag_5062Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNOutsourcedStepAction_5012Parser;

	/**
	* @generated
	*/
	private IParser getPCNOutsourcedStepAction_5012Parser() {
		if (pCNOutsourcedStepAction_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNOutsourcedStepAction_5012Parser = parser;
		}
		return pCNOutsourcedStepAction_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5063Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5063Parser() {
		if (pCNTextualTagTag_5063Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5063Parser = parser;
		}
		return pCNTextualTagTag_5063Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNOutsourcedStepAction_5013Parser;

	/**
	* @generated
	*/
	private IParser getPCNOutsourcedStepAction_5013Parser() {
		if (pCNOutsourcedStepAction_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNOutsourcedStepAction_5013Parser = parser;
		}
		return pCNOutsourcedStepAction_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5064Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5064Parser() {
		if (pCNTextualTagTag_5064Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5064Parser = parser;
		}
		return pCNTextualTagTag_5064Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNOutsourcedStepAction_5014Parser;

	/**
	* @generated
	*/
	private IParser getPCNOutsourcedStepAction_5014Parser() {
		if (pCNOutsourcedStepAction_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNOutsourcedStepAction_5014Parser = parser;
		}
		return pCNOutsourcedStepAction_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5065Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5065Parser() {
		if (pCNTextualTagTag_5065Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5065Parser = parser;
		}
		return pCNTextualTagTag_5065Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNOutsourcedStepAction_5015Parser;

	/**
	* @generated
	*/
	private IParser getPCNOutsourcedStepAction_5015Parser() {
		if (pCNOutsourcedStepAction_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNOutsourcedStepAction_5015Parser = parser;
		}
		return pCNOutsourcedStepAction_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5066Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5066Parser() {
		if (pCNTextualTagTag_5066Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5066Parser = parser;
		}
		return pCNTextualTagTag_5066Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNOutsourcedStepAction_5016Parser;

	/**
	* @generated
	*/
	private IParser getPCNOutsourcedStepAction_5016Parser() {
		if (pCNOutsourcedStepAction_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNOutsourcedStepAction_5016Parser = parser;
		}
		return pCNOutsourcedStepAction_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5067Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5067Parser() {
		if (pCNTextualTagTag_5067Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5067Parser = parser;
		}
		return pCNTextualTagTag_5067Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNDecisionStepAction_5027Parser;

	/**
	* @generated
	*/
	private IParser getPCNDecisionStepAction_5027Parser() {
		if (pCNDecisionStepAction_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNDecisionStepAction_5027Parser = parser;
		}
		return pCNDecisionStepAction_5027Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5068Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5068Parser() {
		if (pCNTextualTagTag_5068Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5068Parser = parser;
		}
		return pCNTextualTagTag_5068Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNProbabilitiesTagYesProbability_5083Parser;

	/**
	* @generated
	*/
	private IParser getPCNProbabilitiesTagYesProbability_5083Parser() {
		if (pCNProbabilitiesTagYesProbability_5083Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProbabilitiesTag_YesProbability() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNProbabilitiesTagYesProbability_5083Parser = parser;
		}
		return pCNProbabilitiesTagYesProbability_5083Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNProbabilitiesTagNoProbability_5088Parser;

	/**
	* @generated
	*/
	private IParser getPCNProbabilitiesTagNoProbability_5088Parser() {
		if (pCNProbabilitiesTagNoProbability_5088Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProbabilitiesTag_NoProbability() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNProbabilitiesTagNoProbability_5088Parser = parser;
		}
		return pCNProbabilitiesTagNoProbability_5088Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNDecisionStepAction_5028Parser;

	/**
	* @generated
	*/
	private IParser getPCNDecisionStepAction_5028Parser() {
		if (pCNDecisionStepAction_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNDecisionStepAction_5028Parser = parser;
		}
		return pCNDecisionStepAction_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5069Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5069Parser() {
		if (pCNTextualTagTag_5069Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5069Parser = parser;
		}
		return pCNTextualTagTag_5069Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNProbabilitiesTagYesProbability_5084Parser;

	/**
	* @generated
	*/
	private IParser getPCNProbabilitiesTagYesProbability_5084Parser() {
		if (pCNProbabilitiesTagYesProbability_5084Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProbabilitiesTag_YesProbability() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNProbabilitiesTagYesProbability_5084Parser = parser;
		}
		return pCNProbabilitiesTagYesProbability_5084Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNProbabilitiesTagNoProbability_5089Parser;

	/**
	* @generated
	*/
	private IParser getPCNProbabilitiesTagNoProbability_5089Parser() {
		if (pCNProbabilitiesTagNoProbability_5089Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProbabilitiesTag_NoProbability() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNProbabilitiesTagNoProbability_5089Parser = parser;
		}
		return pCNProbabilitiesTagNoProbability_5089Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNDecisionStepAction_5029Parser;

	/**
	* @generated
	*/
	private IParser getPCNDecisionStepAction_5029Parser() {
		if (pCNDecisionStepAction_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNDecisionStepAction_5029Parser = parser;
		}
		return pCNDecisionStepAction_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5070Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5070Parser() {
		if (pCNTextualTagTag_5070Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5070Parser = parser;
		}
		return pCNTextualTagTag_5070Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNProbabilitiesTagYesProbability_5085Parser;

	/**
	* @generated
	*/
	private IParser getPCNProbabilitiesTagYesProbability_5085Parser() {
		if (pCNProbabilitiesTagYesProbability_5085Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProbabilitiesTag_YesProbability() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNProbabilitiesTagYesProbability_5085Parser = parser;
		}
		return pCNProbabilitiesTagYesProbability_5085Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNProbabilitiesTagNoProbability_5090Parser;

	/**
	* @generated
	*/
	private IParser getPCNProbabilitiesTagNoProbability_5090Parser() {
		if (pCNProbabilitiesTagNoProbability_5090Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProbabilitiesTag_NoProbability() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNProbabilitiesTagNoProbability_5090Parser = parser;
		}
		return pCNProbabilitiesTagNoProbability_5090Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNDecisionStepAction_5030Parser;

	/**
	* @generated
	*/
	private IParser getPCNDecisionStepAction_5030Parser() {
		if (pCNDecisionStepAction_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNDecisionStepAction_5030Parser = parser;
		}
		return pCNDecisionStepAction_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5071Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5071Parser() {
		if (pCNTextualTagTag_5071Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5071Parser = parser;
		}
		return pCNTextualTagTag_5071Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNProbabilitiesTagYesProbability_5086Parser;

	/**
	* @generated
	*/
	private IParser getPCNProbabilitiesTagYesProbability_5086Parser() {
		if (pCNProbabilitiesTagYesProbability_5086Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProbabilitiesTag_YesProbability() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNProbabilitiesTagYesProbability_5086Parser = parser;
		}
		return pCNProbabilitiesTagYesProbability_5086Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNProbabilitiesTagNoProbability_5091Parser;

	/**
	* @generated
	*/
	private IParser getPCNProbabilitiesTagNoProbability_5091Parser() {
		if (pCNProbabilitiesTagNoProbability_5091Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProbabilitiesTag_NoProbability() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNProbabilitiesTagNoProbability_5091Parser = parser;
		}
		return pCNProbabilitiesTagNoProbability_5091Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNDecisionStepAction_5031Parser;

	/**
	* @generated
	*/
	private IParser getPCNDecisionStepAction_5031Parser() {
		if (pCNDecisionStepAction_5031Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProcessStepWithTags_Action() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNDecisionStepAction_5031Parser = parser;
		}
		return pCNDecisionStepAction_5031Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNTextualTagTag_5072Parser;

	/**
	* @generated
	*/
	private IParser getPCNTextualTagTag_5072Parser() {
		if (pCNTextualTagTag_5072Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNTextualTag_Tag() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNTextualTagTag_5072Parser = parser;
		}
		return pCNTextualTagTag_5072Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNProbabilitiesTagYesProbability_5087Parser;

	/**
	* @generated
	*/
	private IParser getPCNProbabilitiesTagYesProbability_5087Parser() {
		if (pCNProbabilitiesTagYesProbability_5087Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProbabilitiesTag_YesProbability() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNProbabilitiesTagYesProbability_5087Parser = parser;
		}
		return pCNProbabilitiesTagYesProbability_5087Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNProbabilitiesTagNoProbability_5092Parser;

	/**
	* @generated
	*/
	private IParser getPCNProbabilitiesTagNoProbability_5092Parser() {
		if (pCNProbabilitiesTagNoProbability_5092Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNProbabilitiesTag_NoProbability() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNProbabilitiesTagNoProbability_5092Parser = parser;
		}
		return pCNProbabilitiesTagNoProbability_5092Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNReferenceLetter_5032Parser;

	/**
	* @generated
	*/
	private IParser getPCNReferenceLetter_5032Parser() {
		if (pCNReferenceLetter_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNReference_Letter() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNReferenceLetter_5032Parser = parser;
		}
		return pCNReferenceLetter_5032Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNReferenceNumber_5033Parser;

	/**
	* @generated
	*/
	private IParser getPCNReferenceNumber_5033Parser() {
		if (pCNReferenceNumber_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNReference_Number() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNReferenceNumber_5033Parser = parser;
		}
		return pCNReferenceNumber_5033Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNReferenceLetter_5034Parser;

	/**
	* @generated
	*/
	private IParser getPCNReferenceLetter_5034Parser() {
		if (pCNReferenceLetter_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNReference_Letter() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNReferenceLetter_5034Parser = parser;
		}
		return pCNReferenceLetter_5034Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNReferenceNumber_5035Parser;

	/**
	* @generated
	*/
	private IParser getPCNReferenceNumber_5035Parser() {
		if (pCNReferenceNumber_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNReference_Number() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNReferenceNumber_5035Parser = parser;
		}
		return pCNReferenceNumber_5035Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNReferenceLetter_5036Parser;

	/**
	* @generated
	*/
	private IParser getPCNReferenceLetter_5036Parser() {
		if (pCNReferenceLetter_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNReference_Letter() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNReferenceLetter_5036Parser = parser;
		}
		return pCNReferenceLetter_5036Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNReferenceNumber_5037Parser;

	/**
	* @generated
	*/
	private IParser getPCNReferenceNumber_5037Parser() {
		if (pCNReferenceNumber_5037Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNReference_Number() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNReferenceNumber_5037Parser = parser;
		}
		return pCNReferenceNumber_5037Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNReferenceLetter_5038Parser;

	/**
	* @generated
	*/
	private IParser getPCNReferenceLetter_5038Parser() {
		if (pCNReferenceLetter_5038Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNReference_Letter() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNReferenceLetter_5038Parser = parser;
		}
		return pCNReferenceLetter_5038Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNReferenceNumber_5039Parser;

	/**
	* @generated
	*/
	private IParser getPCNReferenceNumber_5039Parser() {
		if (pCNReferenceNumber_5039Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNReference_Number() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNReferenceNumber_5039Parser = parser;
		}
		return pCNReferenceNumber_5039Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNReferenceLetter_5040Parser;

	/**
	* @generated
	*/
	private IParser getPCNReferenceLetter_5040Parser() {
		if (pCNReferenceLetter_5040Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNReference_Letter() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNReferenceLetter_5040Parser = parser;
		}
		return pCNReferenceLetter_5040Parser;
	}

	/**
	* @generated
	*/
	private IParser pCNReferenceNumber_5041Parser;

	/**
	* @generated
	*/
	private IParser getPCNReferenceNumber_5041Parser() {
		if (pCNReferenceNumber_5041Parser == null) {
			EAttribute[] features = new EAttribute[] { PcnPackage.eINSTANCE.getPCNReference_Number() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pCNReferenceNumber_5041Parser = parser;
		}
		return pCNReferenceNumber_5041Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case PCNProcessEntityNameEditPart.VISUAL_ID:
			return getPCNProcessEntityName_5001Parser();
		case PCNProcessEntityNameOrderEditPart.VISUAL_ID:
			return getPCNProcessEntityOrder_5042Parser();
		case PCNStandardStepActionEditPart.VISUAL_ID:
			return getPCNStandardStepAction_5002Parser();
		case PCNTextualTagTagEditPart.VISUAL_ID:
			return getPCNTextualTagTag_5043Parser();
		case PCNStandardStepAction2EditPart.VISUAL_ID:
			return getPCNStandardStepAction_5003Parser();
		case PCNTextualTagTag2EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5044Parser();
		case PCNStandardStepAction3EditPart.VISUAL_ID:
			return getPCNStandardStepAction_5004Parser();
		case PCNTextualTagTag3EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5045Parser();
		case PCNStandardStepAction4EditPart.VISUAL_ID:
			return getPCNStandardStepAction_5005Parser();
		case PCNTextualTagTag4EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5046Parser();
		case PCNStandardStepAction5EditPart.VISUAL_ID:
			return getPCNStandardStepAction_5006Parser();
		case PCNTextualTagTag5EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5047Parser();
		case PCNDoAndWaitStepActionEditPart.VISUAL_ID:
			return getPCNDoAndWaitStepAction_5022Parser();
		case PCNTextualTagTag6EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5048Parser();
		case PCNDelayTimeTagDelayTimeEditPart.VISUAL_ID:
			return getPCNDelayTimeTagDelayTime_5073Parser();
		case PCNDoAndWaitStepAction2EditPart.VISUAL_ID:
			return getPCNDoAndWaitStepAction_5023Parser();
		case PCNTextualTagTag7EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5049Parser();
		case PCNDelayTimeTagDelayTime2EditPart.VISUAL_ID:
			return getPCNDelayTimeTagDelayTime_5074Parser();
		case PCNDoAndWaitStepAction3EditPart.VISUAL_ID:
			return getPCNDoAndWaitStepAction_5024Parser();
		case PCNTextualTagTag8EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5050Parser();
		case PCNDelayTimeTagDelayTime3EditPart.VISUAL_ID:
			return getPCNDelayTimeTagDelayTime_5075Parser();
		case PCNDoAndWaitStepAction4EditPart.VISUAL_ID:
			return getPCNDoAndWaitStepAction_5025Parser();
		case PCNTextualTagTag9EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5051Parser();
		case PCNDelayTimeTagDelayTime4EditPart.VISUAL_ID:
			return getPCNDelayTimeTagDelayTime_5076Parser();
		case PCNDoAndWaitStepAction5EditPart.VISUAL_ID:
			return getPCNDoAndWaitStepAction_5026Parser();
		case PCNTextualTagTag10EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5052Parser();
		case PCNDelayTimeTagDelayTime5EditPart.VISUAL_ID:
			return getPCNDelayTimeTagDelayTime_5077Parser();
		case PCNWaitStepActionEditPart.VISUAL_ID:
			return getPCNWaitStepAction_5017Parser();
		case PCNTextualTagTag11EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5053Parser();
		case PCNDelayTimeTagDelayTime6EditPart.VISUAL_ID:
			return getPCNDelayTimeTagDelayTime_5078Parser();
		case PCNWaitStepAction2EditPart.VISUAL_ID:
			return getPCNWaitStepAction_5018Parser();
		case PCNTextualTagTag12EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5054Parser();
		case PCNDelayTimeTagDelayTime7EditPart.VISUAL_ID:
			return getPCNDelayTimeTagDelayTime_5079Parser();
		case PCNWaitStepAction3EditPart.VISUAL_ID:
			return getPCNWaitStepAction_5019Parser();
		case PCNTextualTagTag13EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5055Parser();
		case PCNDelayTimeTagDelayTime8EditPart.VISUAL_ID:
			return getPCNDelayTimeTagDelayTime_5080Parser();
		case PCNWaitStepAction4EditPart.VISUAL_ID:
			return getPCNWaitStepAction_5020Parser();
		case PCNTextualTagTag14EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5056Parser();
		case PCNDelayTimeTagDelayTime9EditPart.VISUAL_ID:
			return getPCNDelayTimeTagDelayTime_5081Parser();
		case PCNWaitStepAction5EditPart.VISUAL_ID:
			return getPCNWaitStepAction_5021Parser();
		case PCNTextualTagTag15EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5057Parser();
		case PCNDelayTimeTagDelayTime10EditPart.VISUAL_ID:
			return getPCNDelayTimeTagDelayTime_5082Parser();
		case PCNInnovationStepActionEditPart.VISUAL_ID:
			return getPCNInnovationStepAction_5007Parser();
		case PCNTextualTagTag16EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5058Parser();
		case PCNInnovationStepAction2EditPart.VISUAL_ID:
			return getPCNInnovationStepAction_5008Parser();
		case PCNTextualTagTag17EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5059Parser();
		case PCNInnovationStepAction3EditPart.VISUAL_ID:
			return getPCNInnovationStepAction_5009Parser();
		case PCNTextualTagTag18EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5060Parser();
		case PCNInnovationStepAction4EditPart.VISUAL_ID:
			return getPCNInnovationStepAction_5010Parser();
		case PCNTextualTagTag19EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5061Parser();
		case PCNInnovationStepAction5EditPart.VISUAL_ID:
			return getPCNInnovationStepAction_5011Parser();
		case PCNTextualTagTag20EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5062Parser();
		case PCNOutsourcedStepActionEditPart.VISUAL_ID:
			return getPCNOutsourcedStepAction_5012Parser();
		case PCNTextualTagTag21EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5063Parser();
		case PCNOutsourcedStepAction2EditPart.VISUAL_ID:
			return getPCNOutsourcedStepAction_5013Parser();
		case PCNTextualTagTag22EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5064Parser();
		case PCNOutsourcedStepAction3EditPart.VISUAL_ID:
			return getPCNOutsourcedStepAction_5014Parser();
		case PCNTextualTagTag23EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5065Parser();
		case PCNOutsourcedStepAction4EditPart.VISUAL_ID:
			return getPCNOutsourcedStepAction_5015Parser();
		case PCNTextualTagTag24EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5066Parser();
		case PCNOutsourcedStepAction5EditPart.VISUAL_ID:
			return getPCNOutsourcedStepAction_5016Parser();
		case PCNTextualTagTag25EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5067Parser();
		case PCNDecisionStepActionEditPart.VISUAL_ID:
			return getPCNDecisionStepAction_5027Parser();
		case PCNTextualTagTag26EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5068Parser();
		case PCNProbabilitiesTagYesProbabilityEditPart.VISUAL_ID:
			return getPCNProbabilitiesTagYesProbability_5083Parser();
		case PCNProbabilitiesTagNoProbabilityEditPart.VISUAL_ID:
			return getPCNProbabilitiesTagNoProbability_5088Parser();
		case PCNDecisionStepAction2EditPart.VISUAL_ID:
			return getPCNDecisionStepAction_5028Parser();
		case PCNTextualTagTag27EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5069Parser();
		case PCNProbabilitiesTagYesProbability2EditPart.VISUAL_ID:
			return getPCNProbabilitiesTagYesProbability_5084Parser();
		case PCNProbabilitiesTagNoProbability2EditPart.VISUAL_ID:
			return getPCNProbabilitiesTagNoProbability_5089Parser();
		case PCNDecisionStepAction3EditPart.VISUAL_ID:
			return getPCNDecisionStepAction_5029Parser();
		case PCNTextualTagTag28EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5070Parser();
		case PCNProbabilitiesTagYesProbability3EditPart.VISUAL_ID:
			return getPCNProbabilitiesTagYesProbability_5085Parser();
		case PCNProbabilitiesTagNoProbability3EditPart.VISUAL_ID:
			return getPCNProbabilitiesTagNoProbability_5090Parser();
		case PCNDecisionStepAction4EditPart.VISUAL_ID:
			return getPCNDecisionStepAction_5030Parser();
		case PCNTextualTagTag29EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5071Parser();
		case PCNProbabilitiesTagYesProbability4EditPart.VISUAL_ID:
			return getPCNProbabilitiesTagYesProbability_5086Parser();
		case PCNProbabilitiesTagNoProbability4EditPart.VISUAL_ID:
			return getPCNProbabilitiesTagNoProbability_5091Parser();
		case PCNDecisionStepAction5EditPart.VISUAL_ID:
			return getPCNDecisionStepAction_5031Parser();
		case PCNTextualTagTag30EditPart.VISUAL_ID:
			return getPCNTextualTagTag_5072Parser();
		case PCNProbabilitiesTagYesProbability5EditPart.VISUAL_ID:
			return getPCNProbabilitiesTagYesProbability_5087Parser();
		case PCNProbabilitiesTagNoProbability5EditPart.VISUAL_ID:
			return getPCNProbabilitiesTagNoProbability_5092Parser();
		case PCNReferenceLetterEditPart.VISUAL_ID:
			return getPCNReferenceLetter_5032Parser();
		case PCNReferenceNumberEditPart.VISUAL_ID:
			return getPCNReferenceNumber_5033Parser();
		case PCNReferenceLetter2EditPart.VISUAL_ID:
			return getPCNReferenceLetter_5034Parser();
		case PCNReferenceNumber2EditPart.VISUAL_ID:
			return getPCNReferenceNumber_5035Parser();
		case PCNReferenceLetter3EditPart.VISUAL_ID:
			return getPCNReferenceLetter_5036Parser();
		case PCNReferenceNumber3EditPart.VISUAL_ID:
			return getPCNReferenceNumber_5037Parser();
		case PCNReferenceLetter4EditPart.VISUAL_ID:
			return getPCNReferenceLetter_5038Parser();
		case PCNReferenceNumber4EditPart.VISUAL_ID:
			return getPCNReferenceNumber_5039Parser();
		case PCNReferenceLetter5EditPart.VISUAL_ID:
			return getPCNReferenceLetter_5040Parser();
		case PCNReferenceNumber5EditPart.VISUAL_ID:
			return getPCNReferenceNumber_5041Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(PcnVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(PcnVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (PcnElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
