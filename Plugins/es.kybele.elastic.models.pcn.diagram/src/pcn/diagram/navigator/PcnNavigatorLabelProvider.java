package pcn.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import pcn.PCNDecisionStep;
import pcn.PCNEndProcessStep;
import pcn.PCNInnovationStep;
import pcn.PCNDoAndWaitStep;
import pcn.PCNOutsourcedStep;
import pcn.PCNReference;
import pcn.PCNStandardStep;
import pcn.PCNStartProcessStep;
import pcn.PCNWaitStep;
import pcn.diagram.edit.parts.*;
import pcn.diagram.edit.parts.PCNDecisionStep2EditPart;
import pcn.diagram.edit.parts.PCNDecisionStep3EditPart;
import pcn.diagram.edit.parts.PCNDecisionStep4EditPart;
import pcn.diagram.edit.parts.PCNDecisionStep5EditPart;
import pcn.diagram.edit.parts.PCNDecisionStepEditPart;

import pcn.diagram.edit.parts.PCNDiagramEditPart;

import pcn.diagram.edit.parts.PCNInnovationStep2EditPart;
import pcn.diagram.edit.parts.PCNInnovationStep3EditPart;
import pcn.diagram.edit.parts.PCNInnovationStep4EditPart;
import pcn.diagram.edit.parts.PCNInnovationStep5EditPart;
import pcn.diagram.edit.parts.PCNInnovationStepActionEditPart;
import pcn.diagram.edit.parts.PCNInnovationStepEditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStep2EditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStep3EditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStep4EditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStep5EditPart;
import pcn.diagram.edit.parts.PCNDoAndWaitStepEditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefit2EditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefit3EditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefit4EditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefit5EditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefit6EditPart;
import pcn.diagram.edit.parts.PCNMonetaryBenefitEditPart;
import pcn.diagram.edit.parts.PCNMonetaryCost2EditPart;
import pcn.diagram.edit.parts.PCNMonetaryCost3EditPart;
import pcn.diagram.edit.parts.PCNMonetaryCost4EditPart;
import pcn.diagram.edit.parts.PCNMonetaryCost5EditPart;
import pcn.diagram.edit.parts.PCNMonetaryCost6EditPart;
import pcn.diagram.edit.parts.PCNMonetaryCostEditPart;

import pcn.diagram.edit.parts.PCNNonMonetaryBenefit2EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryBenefit3EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryBenefit4EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryBenefit5EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryBenefit6EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryBenefitEditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCost2EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCost3EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCost4EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCost5EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCost6EditPart;
import pcn.diagram.edit.parts.PCNNonMonetaryCostEditPart;

import pcn.diagram.edit.parts.PCNOutsourcedStep2EditPart;
import pcn.diagram.edit.parts.PCNOutsourcedStep3EditPart;
import pcn.diagram.edit.parts.PCNOutsourcedStep4EditPart;
import pcn.diagram.edit.parts.PCNOutsourcedStep5EditPart;
import pcn.diagram.edit.parts.PCNOutsourcedStepEditPart;
import pcn.diagram.edit.parts.PCNProcessEntityEditPart;
import pcn.diagram.edit.parts.PCNProcessEntityNameEditPart;
import pcn.diagram.edit.parts.PCNReference2EditPart;
import pcn.diagram.edit.parts.PCNReference3EditPart;
import pcn.diagram.edit.parts.PCNReference4EditPart;
import pcn.diagram.edit.parts.PCNReference5EditPart;
import pcn.diagram.edit.parts.PCNReferenceEditPart;

import pcn.diagram.edit.parts.PCNStandardStep2EditPart;
import pcn.diagram.edit.parts.PCNStandardStep3EditPart;
import pcn.diagram.edit.parts.PCNStandardStep4EditPart;
import pcn.diagram.edit.parts.PCNStandardStep5EditPart;
import pcn.diagram.edit.parts.PCNStandardStepAction2EditPart;
import pcn.diagram.edit.parts.PCNStandardStepAction3EditPart;
import pcn.diagram.edit.parts.PCNStandardStepAction4EditPart;
import pcn.diagram.edit.parts.PCNStandardStepAction5EditPart;
import pcn.diagram.edit.parts.PCNStandardStepActionEditPart;
import pcn.diagram.edit.parts.PCNStandardStepEditPart;

import pcn.diagram.edit.parts.PCNWaitStep2EditPart;
import pcn.diagram.edit.parts.PCNWaitStep3EditPart;
import pcn.diagram.edit.parts.PCNWaitStep4EditPart;
import pcn.diagram.edit.parts.PCNWaitStep5EditPart;
import pcn.diagram.edit.parts.PCNWaitStepEditPart;
import pcn.diagram.part.PcnDiagramEditorPlugin;
import pcn.diagram.part.PcnVisualIDRegistry;
import pcn.diagram.providers.PcnElementTypes;
import pcn.diagram.providers.PcnParserProvider;

/**
 * @generated
 */
public class PcnNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		PcnDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		PcnDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof PcnNavigatorItem && !isOwnView(((PcnNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof PcnNavigatorGroup) {
			PcnNavigatorGroup group = (PcnNavigatorGroup) element;
			return PcnDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof PcnNavigatorItem) {
			PcnNavigatorItem navigatorItem = (PcnNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (PcnVisualIDRegistry.getVisualID(view)) {
		case PCNDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.kybele.es/elastic/models/pcn/1.0?PCNDiagram", //$NON-NLS-1$
					PcnElementTypes.PCNDiagram_1000);
		case PCNProcessEntityEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.kybele.es/elastic/models/pcn/1.0?PCNProcessEntity", //$NON-NLS-1$
					PcnElementTypes.PCNProcessEntity_2001);
		case PCNStandardStepEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNStandardStep", //$NON-NLS-1$
					PcnElementTypes.PCNStandardStep_3011);
		case PCNStandardStep2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNStandardStep", //$NON-NLS-1$
					PcnElementTypes.PCNStandardStep_3012);
		case PCNStandardStep3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNStandardStep", //$NON-NLS-1$
					PcnElementTypes.PCNStandardStep_3013);
		case PCNStandardStep4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNStandardStep", //$NON-NLS-1$
					PcnElementTypes.PCNStandardStep_3014);
		case PCNStandardStep5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNStandardStep", //$NON-NLS-1$
					PcnElementTypes.PCNStandardStep_3015);
		case PCNDoAndWaitStepEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNDoAndWaitStep", //$NON-NLS-1$
					PcnElementTypes.PCNDoAndWaitStep_3016);
		case PCNDoAndWaitStep2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNDoAndWaitStep", //$NON-NLS-1$
					PcnElementTypes.PCNDoAndWaitStep_3017);
		case PCNDoAndWaitStep3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNDoAndWaitStep", //$NON-NLS-1$
					PcnElementTypes.PCNDoAndWaitStep_3018);
		case PCNDoAndWaitStep4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNDoAndWaitStep", //$NON-NLS-1$
					PcnElementTypes.PCNDoAndWaitStep_3019);
		case PCNDoAndWaitStep5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNDoAndWaitStep", //$NON-NLS-1$
					PcnElementTypes.PCNDoAndWaitStep_3020);
		case PCNWaitStepEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNWaitStep", //$NON-NLS-1$
					PcnElementTypes.PCNWaitStep_3021);
		case PCNWaitStep2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNWaitStep", //$NON-NLS-1$
					PcnElementTypes.PCNWaitStep_3022);
		case PCNWaitStep3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNWaitStep", //$NON-NLS-1$
					PcnElementTypes.PCNWaitStep_3023);
		case PCNWaitStep4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNWaitStep", //$NON-NLS-1$
					PcnElementTypes.PCNWaitStep_3024);
		case PCNWaitStep5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNWaitStep", //$NON-NLS-1$
					PcnElementTypes.PCNWaitStep_3025);
		case PCNInnovationStepEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNInnovationStep", //$NON-NLS-1$
					PcnElementTypes.PCNInnovationStep_3026);
		case PCNInnovationStep2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNInnovationStep", //$NON-NLS-1$
					PcnElementTypes.PCNInnovationStep_3027);
		case PCNInnovationStep3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNInnovationStep", //$NON-NLS-1$
					PcnElementTypes.PCNInnovationStep_3028);
		case PCNInnovationStep4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNInnovationStep", //$NON-NLS-1$
					PcnElementTypes.PCNInnovationStep_3029);
		case PCNInnovationStep5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNInnovationStep", //$NON-NLS-1$
					PcnElementTypes.PCNInnovationStep_3030);
		case PCNOutsourcedStepEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNOutsourcedStep", //$NON-NLS-1$
					PcnElementTypes.PCNOutsourcedStep_3031);
		case PCNOutsourcedStep2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNOutsourcedStep", //$NON-NLS-1$
					PcnElementTypes.PCNOutsourcedStep_3032);
		case PCNOutsourcedStep3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNOutsourcedStep", //$NON-NLS-1$
					PcnElementTypes.PCNOutsourcedStep_3033);
		case PCNOutsourcedStep4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNOutsourcedStep", //$NON-NLS-1$
					PcnElementTypes.PCNOutsourcedStep_3034);
		case PCNOutsourcedStep5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNOutsourcedStep", //$NON-NLS-1$
					PcnElementTypes.PCNOutsourcedStep_3035);
		case PCNDecisionStepEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNDecisionStep", //$NON-NLS-1$
					PcnElementTypes.PCNDecisionStep_3036);
		case PCNDecisionStep2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNDecisionStep", //$NON-NLS-1$
					PcnElementTypes.PCNDecisionStep_3037);
		case PCNDecisionStep3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNDecisionStep", //$NON-NLS-1$
					PcnElementTypes.PCNDecisionStep_3038);
		case PCNDecisionStep4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNDecisionStep", //$NON-NLS-1$
					PcnElementTypes.PCNDecisionStep_3039);
		case PCNDecisionStep5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNDecisionStep", //$NON-NLS-1$
					PcnElementTypes.PCNDecisionStep_3040);
		case PCNReferenceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNReference", //$NON-NLS-1$
					PcnElementTypes.PCNReference_3041);
		case PCNReference2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNReference", //$NON-NLS-1$
					PcnElementTypes.PCNReference_3042);
		case PCNReference3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNReference", //$NON-NLS-1$
					PcnElementTypes.PCNReference_3043);
		case PCNReference4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNReference", //$NON-NLS-1$
					PcnElementTypes.PCNReference_3044);
		case PCNReference5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNReference", //$NON-NLS-1$
					PcnElementTypes.PCNReference_3045);
		case PCNMonetaryBenefitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3048);
		case PCNMonetaryCostEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3049);
		case PCNNonMonetaryBenefitEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3050);
		case PCNNonMonetaryCostEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3051);
		case PCNMonetaryBenefit2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3052);
		case PCNMonetaryCost2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3053);
		case PCNNonMonetaryBenefit2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3054);
		case PCNNonMonetaryCost2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3055);
		case PCNMonetaryBenefit3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3056);
		case PCNMonetaryCost3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3057);
		case PCNNonMonetaryBenefit3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3058);
		case PCNNonMonetaryCost3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3059);
		case PCNMonetaryBenefit4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3060);
		case PCNMonetaryCost4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3061);
		case PCNNonMonetaryBenefit4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3062);
		case PCNNonMonetaryCost4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3063);
		case PCNMonetaryBenefit5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3064);
		case PCNMonetaryCost5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3065);
		case PCNNonMonetaryBenefit5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3066);
		case PCNNonMonetaryCost5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3067);
		case PCNMonetaryBenefit6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3068);
		case PCNMonetaryCost6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3069);
		case PCNNonMonetaryBenefit6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3070);
		case PCNNonMonetaryCost6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3071);
		case PCNMonetaryBenefit7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3072);
		case PCNMonetaryCost7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3073);
		case PCNNonMonetaryBenefit7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3074);
		case PCNNonMonetaryCost7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3075);
		case PCNMonetaryBenefit8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3076);
		case PCNMonetaryCost8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3077);
		case PCNNonMonetaryBenefit8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3078);
		case PCNNonMonetaryCost8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3079);
		case PCNMonetaryBenefit9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3080);
		case PCNMonetaryCost9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3081);
		case PCNNonMonetaryBenefit9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3082);
		case PCNNonMonetaryCost9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3083);
		case PCNMonetaryBenefit10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3084);
		case PCNMonetaryCost10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3085);
		case PCNNonMonetaryBenefit10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3086);
		case PCNNonMonetaryCost10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3087);
		case PCNMonetaryBenefit11EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3088);
		case PCNMonetaryCost11EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3089);
		case PCNNonMonetaryBenefit11EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3090);
		case PCNNonMonetaryCost11EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3091);
		case PCNMonetaryBenefit12EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3092);
		case PCNMonetaryCost12EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3093);
		case PCNNonMonetaryBenefit12EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3094);
		case PCNNonMonetaryCost12EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3095);
		case PCNMonetaryBenefit13EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3096);
		case PCNMonetaryCost13EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3097);
		case PCNNonMonetaryBenefit13EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3098);
		case PCNNonMonetaryCost13EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3099);
		case PCNMonetaryBenefit14EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3100);
		case PCNMonetaryCost14EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3101);
		case PCNNonMonetaryBenefit14EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3102);
		case PCNNonMonetaryCost14EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3103);
		case PCNMonetaryBenefit15EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3104);
		case PCNMonetaryCost15EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3105);
		case PCNNonMonetaryBenefit15EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3106);
		case PCNNonMonetaryCost15EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3107);
		case PCNMonetaryBenefit16EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3108);
		case PCNMonetaryCost16EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3109);
		case PCNNonMonetaryBenefit16EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3110);
		case PCNNonMonetaryCost16EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3111);
		case PCNMonetaryBenefit17EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3112);
		case PCNMonetaryCost17EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3113);
		case PCNNonMonetaryBenefit17EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3114);
		case PCNNonMonetaryCost17EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3115);
		case PCNMonetaryBenefit18EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3116);
		case PCNMonetaryCost18EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3117);
		case PCNNonMonetaryBenefit18EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3118);
		case PCNNonMonetaryCost18EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3119);
		case PCNMonetaryBenefit19EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3120);
		case PCNMonetaryCost19EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3121);
		case PCNNonMonetaryBenefit19EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3122);
		case PCNNonMonetaryCost19EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3123);
		case PCNMonetaryBenefit20EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3124);
		case PCNMonetaryCost20EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3125);
		case PCNNonMonetaryBenefit20EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3126);
		case PCNNonMonetaryCost20EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3127);
		case PCNMonetaryBenefit21EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3128);
		case PCNMonetaryCost21EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3129);
		case PCNNonMonetaryBenefit21EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3130);
		case PCNNonMonetaryCost21EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3131);
		case PCNMonetaryBenefit22EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3132);
		case PCNMonetaryCost22EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3133);
		case PCNNonMonetaryBenefit22EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3134);
		case PCNNonMonetaryCost22EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3135);
		case PCNMonetaryBenefit23EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3136);
		case PCNMonetaryCost23EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3137);
		case PCNNonMonetaryBenefit23EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3138);
		case PCNNonMonetaryCost23EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3139);
		case PCNMonetaryBenefit24EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3140);
		case PCNMonetaryCost24EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3141);
		case PCNNonMonetaryBenefit24EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3142);
		case PCNNonMonetaryCost24EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3143);
		case PCNMonetaryBenefit25EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3144);
		case PCNMonetaryCost25EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3145);
		case PCNNonMonetaryBenefit25EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3146);
		case PCNNonMonetaryCost25EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3147);
		case PCNMonetaryBenefit26EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3148);
		case PCNMonetaryCost26EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3149);
		case PCNNonMonetaryBenefit26EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3150);
		case PCNNonMonetaryCost26EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3151);
		case PCNMonetaryBenefit27EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3152);
		case PCNMonetaryCost27EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3153);
		case PCNNonMonetaryBenefit27EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3154);
		case PCNNonMonetaryCost27EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3155);
		case PCNMonetaryBenefit28EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3156);
		case PCNMonetaryCost28EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3157);
		case PCNNonMonetaryBenefit28EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3158);
		case PCNNonMonetaryCost28EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3159);
		case PCNMonetaryBenefit29EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3160);
		case PCNMonetaryCost29EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3161);
		case PCNNonMonetaryBenefit29EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3162);
		case PCNNonMonetaryCost29EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3163);
		case PCNMonetaryBenefit30EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryBenefit_3164);
		case PCNMonetaryCost30EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNMonetaryCost_3165);
		case PCNNonMonetaryBenefit30EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryBenefit", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryBenefit_3166);
		case PCNNonMonetaryCost30EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNNonMonetaryCost", //$NON-NLS-1$
					PcnElementTypes.PCNNonMonetaryCost_3167);
		case PCNTextualTagEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3168);
		case PCNTextualTag2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3169);
		case PCNTextualTag3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3170);
		case PCNTextualTag4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3171);
		case PCNTextualTag5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3172);
		case PCNTextualTag6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3173);
		case PCNTextualTag7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3174);
		case PCNTextualTag8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3175);
		case PCNTextualTag9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3176);
		case PCNTextualTag10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3177);
		case PCNTextualTag11EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3178);
		case PCNTextualTag12EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3179);
		case PCNTextualTag13EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3180);
		case PCNTextualTag14EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3181);
		case PCNTextualTag15EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3182);
		case PCNTextualTag16EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3183);
		case PCNTextualTag17EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3184);
		case PCNTextualTag18EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3185);
		case PCNTextualTag19EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3186);
		case PCNTextualTag20EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3187);
		case PCNTextualTag21EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3188);
		case PCNTextualTag22EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3189);
		case PCNTextualTag23EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3190);
		case PCNTextualTag24EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3191);
		case PCNTextualTag25EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3192);
		case PCNTextualTag26EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3193);
		case PCNTextualTag27EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3194);
		case PCNTextualTag28EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3195);
		case PCNTextualTag29EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3196);
		case PCNTextualTag30EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNTextualTag", //$NON-NLS-1$
					PcnElementTypes.PCNTextualTag_3197);
		case PCNDelayTimeTagEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNDelayTimeTag", //$NON-NLS-1$
					PcnElementTypes.PCNDelayTimeTag_3198);
		case PCNDelayTimeTag2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNDelayTimeTag", //$NON-NLS-1$
					PcnElementTypes.PCNDelayTimeTag_3199);
		case PCNDelayTimeTag3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNDelayTimeTag", //$NON-NLS-1$
					PcnElementTypes.PCNDelayTimeTag_3200);
		case PCNDelayTimeTag4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNDelayTimeTag", //$NON-NLS-1$
					PcnElementTypes.PCNDelayTimeTag_3201);
		case PCNDelayTimeTag5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNDelayTimeTag", //$NON-NLS-1$
					PcnElementTypes.PCNDelayTimeTag_3202);
		case PCNDelayTimeTag6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNDelayTimeTag", //$NON-NLS-1$
					PcnElementTypes.PCNDelayTimeTag_3203);
		case PCNDelayTimeTag7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNDelayTimeTag", //$NON-NLS-1$
					PcnElementTypes.PCNDelayTimeTag_3204);
		case PCNDelayTimeTag8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNDelayTimeTag", //$NON-NLS-1$
					PcnElementTypes.PCNDelayTimeTag_3205);
		case PCNDelayTimeTag9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNDelayTimeTag", //$NON-NLS-1$
					PcnElementTypes.PCNDelayTimeTag_3206);
		case PCNDelayTimeTag10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNDelayTimeTag", //$NON-NLS-1$
					PcnElementTypes.PCNDelayTimeTag_3207);
		case PCNProbabilitiesTagEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNProbabilitiesTag", //$NON-NLS-1$
					PcnElementTypes.PCNProbabilitiesTag_3208);
		case PCNProbabilitiesTag2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNProbabilitiesTag", //$NON-NLS-1$
					PcnElementTypes.PCNProbabilitiesTag_3209);
		case PCNProbabilitiesTag3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNProbabilitiesTag", //$NON-NLS-1$
					PcnElementTypes.PCNProbabilitiesTag_3210);
		case PCNProbabilitiesTag4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNProbabilitiesTag", //$NON-NLS-1$
					PcnElementTypes.PCNProbabilitiesTag_3211);
		case PCNProbabilitiesTag5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNProbabilitiesTag", //$NON-NLS-1$
					PcnElementTypes.PCNProbabilitiesTag_3212);
		case PCNSyncTagEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3213);
		case PCNSyncTag2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3214);
		case PCNSyncTag3EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3215);
		case PCNSyncTag4EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3216);
		case PCNSyncTag5EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3217);
		case PCNSyncTag6EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3218);
		case PCNSyncTag7EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3219);
		case PCNSyncTag8EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3220);
		case PCNSyncTag9EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3221);
		case PCNSyncTag10EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3222);
		case PCNSyncTag11EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3223);
		case PCNSyncTag12EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3224);
		case PCNSyncTag13EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3225);
		case PCNSyncTag14EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3226);
		case PCNSyncTag15EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3227);
		case PCNSyncTag16EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3228);
		case PCNSyncTag17EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3229);
		case PCNSyncTag18EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3230);
		case PCNSyncTag19EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3231);
		case PCNSyncTag20EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3232);
		case PCNSyncTag21EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3233);
		case PCNSyncTag22EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3234);
		case PCNSyncTag23EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3235);
		case PCNSyncTag24EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3236);
		case PCNSyncTag25EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3237);
		case PCNSyncTag26EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3238);
		case PCNSyncTag27EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3239);
		case PCNSyncTag28EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3240);
		case PCNSyncTag29EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3241);
		case PCNSyncTag30EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.kybele.es/elastic/models/pcn/1.0?PCNSyncTag", //$NON-NLS-1$
					PcnElementTypes.PCNSyncTag_3242);
		case PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.kybele.es/elastic/models/pcn/1.0?PCNDecisionStep?PCNPositiveDecision", //$NON-NLS-1$
					PcnElementTypes.PCNDecisionStepPCNPositiveDecision_4006);
		case PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.kybele.es/elastic/models/pcn/1.0?PCNDecisionStep?PCNNegativeDecision", //$NON-NLS-1$
					PcnElementTypes.PCNDecisionStepPCNNegativeDecision_4007);
		case PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.kybele.es/elastic/models/pcn/1.0?PCNRegularProcessStep?PCNStandardDependency", //$NON-NLS-1$
					PcnElementTypes.PCNRegularProcessStepPCNStandardDependency_4008);
		case PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.kybele.es/elastic/models/pcn/1.0?PCNRegularProcessStep?PCNDelayedDependency", //$NON-NLS-1$
					PcnElementTypes.PCNRegularProcessStepPCNDelayedDependency_4009);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = PcnDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && PcnElementTypes.isKnownElementType(elementType)) {
			image = PcnElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof PcnNavigatorGroup) {
			PcnNavigatorGroup group = (PcnNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof PcnNavigatorItem) {
			PcnNavigatorItem navigatorItem = (PcnNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (PcnVisualIDRegistry.getVisualID(view)) {
		case PCNDiagramEditPart.VISUAL_ID:
			return getPCNDiagram_1000Text(view);
		case PCNProcessEntityEditPart.VISUAL_ID:
			return getPCNProcessEntity_2001Text(view);
		case PCNStandardStepEditPart.VISUAL_ID:
			return getPCNStandardStep_3011Text(view);
		case PCNStandardStep2EditPart.VISUAL_ID:
			return getPCNStandardStep_3012Text(view);
		case PCNStandardStep3EditPart.VISUAL_ID:
			return getPCNStandardStep_3013Text(view);
		case PCNStandardStep4EditPart.VISUAL_ID:
			return getPCNStandardStep_3014Text(view);
		case PCNStandardStep5EditPart.VISUAL_ID:
			return getPCNStandardStep_3015Text(view);
		case PCNDoAndWaitStepEditPart.VISUAL_ID:
			return getPCNDoAndWaitStep_3016Text(view);
		case PCNDoAndWaitStep2EditPart.VISUAL_ID:
			return getPCNDoAndWaitStep_3017Text(view);
		case PCNDoAndWaitStep3EditPart.VISUAL_ID:
			return getPCNDoAndWaitStep_3018Text(view);
		case PCNDoAndWaitStep4EditPart.VISUAL_ID:
			return getPCNDoAndWaitStep_3019Text(view);
		case PCNDoAndWaitStep5EditPart.VISUAL_ID:
			return getPCNDoAndWaitStep_3020Text(view);
		case PCNWaitStepEditPart.VISUAL_ID:
			return getPCNWaitStep_3021Text(view);
		case PCNWaitStep2EditPart.VISUAL_ID:
			return getPCNWaitStep_3022Text(view);
		case PCNWaitStep3EditPart.VISUAL_ID:
			return getPCNWaitStep_3023Text(view);
		case PCNWaitStep4EditPart.VISUAL_ID:
			return getPCNWaitStep_3024Text(view);
		case PCNWaitStep5EditPart.VISUAL_ID:
			return getPCNWaitStep_3025Text(view);
		case PCNInnovationStepEditPart.VISUAL_ID:
			return getPCNInnovationStep_3026Text(view);
		case PCNInnovationStep2EditPart.VISUAL_ID:
			return getPCNInnovationStep_3027Text(view);
		case PCNInnovationStep3EditPart.VISUAL_ID:
			return getPCNInnovationStep_3028Text(view);
		case PCNInnovationStep4EditPart.VISUAL_ID:
			return getPCNInnovationStep_3029Text(view);
		case PCNInnovationStep5EditPart.VISUAL_ID:
			return getPCNInnovationStep_3030Text(view);
		case PCNOutsourcedStepEditPart.VISUAL_ID:
			return getPCNOutsourcedStep_3031Text(view);
		case PCNOutsourcedStep2EditPart.VISUAL_ID:
			return getPCNOutsourcedStep_3032Text(view);
		case PCNOutsourcedStep3EditPart.VISUAL_ID:
			return getPCNOutsourcedStep_3033Text(view);
		case PCNOutsourcedStep4EditPart.VISUAL_ID:
			return getPCNOutsourcedStep_3034Text(view);
		case PCNOutsourcedStep5EditPart.VISUAL_ID:
			return getPCNOutsourcedStep_3035Text(view);
		case PCNDecisionStepEditPart.VISUAL_ID:
			return getPCNDecisionStep_3036Text(view);
		case PCNDecisionStep2EditPart.VISUAL_ID:
			return getPCNDecisionStep_3037Text(view);
		case PCNDecisionStep3EditPart.VISUAL_ID:
			return getPCNDecisionStep_3038Text(view);
		case PCNDecisionStep4EditPart.VISUAL_ID:
			return getPCNDecisionStep_3039Text(view);
		case PCNDecisionStep5EditPart.VISUAL_ID:
			return getPCNDecisionStep_3040Text(view);
		case PCNReferenceEditPart.VISUAL_ID:
			return getPCNReference_3041Text(view);
		case PCNReference2EditPart.VISUAL_ID:
			return getPCNReference_3042Text(view);
		case PCNReference3EditPart.VISUAL_ID:
			return getPCNReference_3043Text(view);
		case PCNReference4EditPart.VISUAL_ID:
			return getPCNReference_3044Text(view);
		case PCNReference5EditPart.VISUAL_ID:
			return getPCNReference_3045Text(view);
		case PCNMonetaryBenefitEditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3048Text(view);
		case PCNMonetaryCostEditPart.VISUAL_ID:
			return getPCNMonetaryCost_3049Text(view);
		case PCNNonMonetaryBenefitEditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3050Text(view);
		case PCNNonMonetaryCostEditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3051Text(view);
		case PCNMonetaryBenefit2EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3052Text(view);
		case PCNMonetaryCost2EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3053Text(view);
		case PCNNonMonetaryBenefit2EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3054Text(view);
		case PCNNonMonetaryCost2EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3055Text(view);
		case PCNMonetaryBenefit3EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3056Text(view);
		case PCNMonetaryCost3EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3057Text(view);
		case PCNNonMonetaryBenefit3EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3058Text(view);
		case PCNNonMonetaryCost3EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3059Text(view);
		case PCNMonetaryBenefit4EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3060Text(view);
		case PCNMonetaryCost4EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3061Text(view);
		case PCNNonMonetaryBenefit4EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3062Text(view);
		case PCNNonMonetaryCost4EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3063Text(view);
		case PCNMonetaryBenefit5EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3064Text(view);
		case PCNMonetaryCost5EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3065Text(view);
		case PCNNonMonetaryBenefit5EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3066Text(view);
		case PCNNonMonetaryCost5EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3067Text(view);
		case PCNMonetaryBenefit6EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3068Text(view);
		case PCNMonetaryCost6EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3069Text(view);
		case PCNNonMonetaryBenefit6EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3070Text(view);
		case PCNNonMonetaryCost6EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3071Text(view);
		case PCNMonetaryBenefit7EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3072Text(view);
		case PCNMonetaryCost7EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3073Text(view);
		case PCNNonMonetaryBenefit7EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3074Text(view);
		case PCNNonMonetaryCost7EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3075Text(view);
		case PCNMonetaryBenefit8EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3076Text(view);
		case PCNMonetaryCost8EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3077Text(view);
		case PCNNonMonetaryBenefit8EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3078Text(view);
		case PCNNonMonetaryCost8EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3079Text(view);
		case PCNMonetaryBenefit9EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3080Text(view);
		case PCNMonetaryCost9EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3081Text(view);
		case PCNNonMonetaryBenefit9EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3082Text(view);
		case PCNNonMonetaryCost9EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3083Text(view);
		case PCNMonetaryBenefit10EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3084Text(view);
		case PCNMonetaryCost10EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3085Text(view);
		case PCNNonMonetaryBenefit10EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3086Text(view);
		case PCNNonMonetaryCost10EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3087Text(view);
		case PCNMonetaryBenefit11EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3088Text(view);
		case PCNMonetaryCost11EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3089Text(view);
		case PCNNonMonetaryBenefit11EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3090Text(view);
		case PCNNonMonetaryCost11EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3091Text(view);
		case PCNMonetaryBenefit12EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3092Text(view);
		case PCNMonetaryCost12EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3093Text(view);
		case PCNNonMonetaryBenefit12EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3094Text(view);
		case PCNNonMonetaryCost12EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3095Text(view);
		case PCNMonetaryBenefit13EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3096Text(view);
		case PCNMonetaryCost13EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3097Text(view);
		case PCNNonMonetaryBenefit13EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3098Text(view);
		case PCNNonMonetaryCost13EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3099Text(view);
		case PCNMonetaryBenefit14EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3100Text(view);
		case PCNMonetaryCost14EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3101Text(view);
		case PCNNonMonetaryBenefit14EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3102Text(view);
		case PCNNonMonetaryCost14EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3103Text(view);
		case PCNMonetaryBenefit15EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3104Text(view);
		case PCNMonetaryCost15EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3105Text(view);
		case PCNNonMonetaryBenefit15EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3106Text(view);
		case PCNNonMonetaryCost15EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3107Text(view);
		case PCNMonetaryBenefit16EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3108Text(view);
		case PCNMonetaryCost16EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3109Text(view);
		case PCNNonMonetaryBenefit16EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3110Text(view);
		case PCNNonMonetaryCost16EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3111Text(view);
		case PCNMonetaryBenefit17EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3112Text(view);
		case PCNMonetaryCost17EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3113Text(view);
		case PCNNonMonetaryBenefit17EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3114Text(view);
		case PCNNonMonetaryCost17EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3115Text(view);
		case PCNMonetaryBenefit18EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3116Text(view);
		case PCNMonetaryCost18EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3117Text(view);
		case PCNNonMonetaryBenefit18EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3118Text(view);
		case PCNNonMonetaryCost18EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3119Text(view);
		case PCNMonetaryBenefit19EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3120Text(view);
		case PCNMonetaryCost19EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3121Text(view);
		case PCNNonMonetaryBenefit19EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3122Text(view);
		case PCNNonMonetaryCost19EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3123Text(view);
		case PCNMonetaryBenefit20EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3124Text(view);
		case PCNMonetaryCost20EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3125Text(view);
		case PCNNonMonetaryBenefit20EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3126Text(view);
		case PCNNonMonetaryCost20EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3127Text(view);
		case PCNMonetaryBenefit21EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3128Text(view);
		case PCNMonetaryCost21EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3129Text(view);
		case PCNNonMonetaryBenefit21EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3130Text(view);
		case PCNNonMonetaryCost21EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3131Text(view);
		case PCNMonetaryBenefit22EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3132Text(view);
		case PCNMonetaryCost22EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3133Text(view);
		case PCNNonMonetaryBenefit22EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3134Text(view);
		case PCNNonMonetaryCost22EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3135Text(view);
		case PCNMonetaryBenefit23EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3136Text(view);
		case PCNMonetaryCost23EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3137Text(view);
		case PCNNonMonetaryBenefit23EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3138Text(view);
		case PCNNonMonetaryCost23EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3139Text(view);
		case PCNMonetaryBenefit24EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3140Text(view);
		case PCNMonetaryCost24EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3141Text(view);
		case PCNNonMonetaryBenefit24EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3142Text(view);
		case PCNNonMonetaryCost24EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3143Text(view);
		case PCNMonetaryBenefit25EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3144Text(view);
		case PCNMonetaryCost25EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3145Text(view);
		case PCNNonMonetaryBenefit25EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3146Text(view);
		case PCNNonMonetaryCost25EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3147Text(view);
		case PCNMonetaryBenefit26EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3148Text(view);
		case PCNMonetaryCost26EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3149Text(view);
		case PCNNonMonetaryBenefit26EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3150Text(view);
		case PCNNonMonetaryCost26EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3151Text(view);
		case PCNMonetaryBenefit27EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3152Text(view);
		case PCNMonetaryCost27EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3153Text(view);
		case PCNNonMonetaryBenefit27EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3154Text(view);
		case PCNNonMonetaryCost27EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3155Text(view);
		case PCNMonetaryBenefit28EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3156Text(view);
		case PCNMonetaryCost28EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3157Text(view);
		case PCNNonMonetaryBenefit28EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3158Text(view);
		case PCNNonMonetaryCost28EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3159Text(view);
		case PCNMonetaryBenefit29EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3160Text(view);
		case PCNMonetaryCost29EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3161Text(view);
		case PCNNonMonetaryBenefit29EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3162Text(view);
		case PCNNonMonetaryCost29EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3163Text(view);
		case PCNMonetaryBenefit30EditPart.VISUAL_ID:
			return getPCNMonetaryBenefit_3164Text(view);
		case PCNMonetaryCost30EditPart.VISUAL_ID:
			return getPCNMonetaryCost_3165Text(view);
		case PCNNonMonetaryBenefit30EditPart.VISUAL_ID:
			return getPCNNonMonetaryBenefit_3166Text(view);
		case PCNNonMonetaryCost30EditPart.VISUAL_ID:
			return getPCNNonMonetaryCost_3167Text(view);
		case PCNTextualTagEditPart.VISUAL_ID:
			return getPCNTextualTag_3168Text(view);
		case PCNTextualTag2EditPart.VISUAL_ID:
			return getPCNTextualTag_3169Text(view);
		case PCNTextualTag3EditPart.VISUAL_ID:
			return getPCNTextualTag_3170Text(view);
		case PCNTextualTag4EditPart.VISUAL_ID:
			return getPCNTextualTag_3171Text(view);
		case PCNTextualTag5EditPart.VISUAL_ID:
			return getPCNTextualTag_3172Text(view);
		case PCNTextualTag6EditPart.VISUAL_ID:
			return getPCNTextualTag_3173Text(view);
		case PCNTextualTag7EditPart.VISUAL_ID:
			return getPCNTextualTag_3174Text(view);
		case PCNTextualTag8EditPart.VISUAL_ID:
			return getPCNTextualTag_3175Text(view);
		case PCNTextualTag9EditPart.VISUAL_ID:
			return getPCNTextualTag_3176Text(view);
		case PCNTextualTag10EditPart.VISUAL_ID:
			return getPCNTextualTag_3177Text(view);
		case PCNTextualTag11EditPart.VISUAL_ID:
			return getPCNTextualTag_3178Text(view);
		case PCNTextualTag12EditPart.VISUAL_ID:
			return getPCNTextualTag_3179Text(view);
		case PCNTextualTag13EditPart.VISUAL_ID:
			return getPCNTextualTag_3180Text(view);
		case PCNTextualTag14EditPart.VISUAL_ID:
			return getPCNTextualTag_3181Text(view);
		case PCNTextualTag15EditPart.VISUAL_ID:
			return getPCNTextualTag_3182Text(view);
		case PCNTextualTag16EditPart.VISUAL_ID:
			return getPCNTextualTag_3183Text(view);
		case PCNTextualTag17EditPart.VISUAL_ID:
			return getPCNTextualTag_3184Text(view);
		case PCNTextualTag18EditPart.VISUAL_ID:
			return getPCNTextualTag_3185Text(view);
		case PCNTextualTag19EditPart.VISUAL_ID:
			return getPCNTextualTag_3186Text(view);
		case PCNTextualTag20EditPart.VISUAL_ID:
			return getPCNTextualTag_3187Text(view);
		case PCNTextualTag21EditPart.VISUAL_ID:
			return getPCNTextualTag_3188Text(view);
		case PCNTextualTag22EditPart.VISUAL_ID:
			return getPCNTextualTag_3189Text(view);
		case PCNTextualTag23EditPart.VISUAL_ID:
			return getPCNTextualTag_3190Text(view);
		case PCNTextualTag24EditPart.VISUAL_ID:
			return getPCNTextualTag_3191Text(view);
		case PCNTextualTag25EditPart.VISUAL_ID:
			return getPCNTextualTag_3192Text(view);
		case PCNTextualTag26EditPart.VISUAL_ID:
			return getPCNTextualTag_3193Text(view);
		case PCNTextualTag27EditPart.VISUAL_ID:
			return getPCNTextualTag_3194Text(view);
		case PCNTextualTag28EditPart.VISUAL_ID:
			return getPCNTextualTag_3195Text(view);
		case PCNTextualTag29EditPart.VISUAL_ID:
			return getPCNTextualTag_3196Text(view);
		case PCNTextualTag30EditPart.VISUAL_ID:
			return getPCNTextualTag_3197Text(view);
		case PCNDelayTimeTagEditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3198Text(view);
		case PCNDelayTimeTag2EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3199Text(view);
		case PCNDelayTimeTag3EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3200Text(view);
		case PCNDelayTimeTag4EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3201Text(view);
		case PCNDelayTimeTag5EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3202Text(view);
		case PCNDelayTimeTag6EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3203Text(view);
		case PCNDelayTimeTag7EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3204Text(view);
		case PCNDelayTimeTag8EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3205Text(view);
		case PCNDelayTimeTag9EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3206Text(view);
		case PCNDelayTimeTag10EditPart.VISUAL_ID:
			return getPCNDelayTimeTag_3207Text(view);
		case PCNProbabilitiesTagEditPart.VISUAL_ID:
			return getPCNProbabilitiesTag_3208Text(view);
		case PCNProbabilitiesTag2EditPart.VISUAL_ID:
			return getPCNProbabilitiesTag_3209Text(view);
		case PCNProbabilitiesTag3EditPart.VISUAL_ID:
			return getPCNProbabilitiesTag_3210Text(view);
		case PCNProbabilitiesTag4EditPart.VISUAL_ID:
			return getPCNProbabilitiesTag_3211Text(view);
		case PCNProbabilitiesTag5EditPart.VISUAL_ID:
			return getPCNProbabilitiesTag_3212Text(view);
		case PCNSyncTagEditPart.VISUAL_ID:
			return getPCNSyncTag_3213Text(view);
		case PCNSyncTag2EditPart.VISUAL_ID:
			return getPCNSyncTag_3214Text(view);
		case PCNSyncTag3EditPart.VISUAL_ID:
			return getPCNSyncTag_3215Text(view);
		case PCNSyncTag4EditPart.VISUAL_ID:
			return getPCNSyncTag_3216Text(view);
		case PCNSyncTag5EditPart.VISUAL_ID:
			return getPCNSyncTag_3217Text(view);
		case PCNSyncTag6EditPart.VISUAL_ID:
			return getPCNSyncTag_3218Text(view);
		case PCNSyncTag7EditPart.VISUAL_ID:
			return getPCNSyncTag_3219Text(view);
		case PCNSyncTag8EditPart.VISUAL_ID:
			return getPCNSyncTag_3220Text(view);
		case PCNSyncTag9EditPart.VISUAL_ID:
			return getPCNSyncTag_3221Text(view);
		case PCNSyncTag10EditPart.VISUAL_ID:
			return getPCNSyncTag_3222Text(view);
		case PCNSyncTag11EditPart.VISUAL_ID:
			return getPCNSyncTag_3223Text(view);
		case PCNSyncTag12EditPart.VISUAL_ID:
			return getPCNSyncTag_3224Text(view);
		case PCNSyncTag13EditPart.VISUAL_ID:
			return getPCNSyncTag_3225Text(view);
		case PCNSyncTag14EditPart.VISUAL_ID:
			return getPCNSyncTag_3226Text(view);
		case PCNSyncTag15EditPart.VISUAL_ID:
			return getPCNSyncTag_3227Text(view);
		case PCNSyncTag16EditPart.VISUAL_ID:
			return getPCNSyncTag_3228Text(view);
		case PCNSyncTag17EditPart.VISUAL_ID:
			return getPCNSyncTag_3229Text(view);
		case PCNSyncTag18EditPart.VISUAL_ID:
			return getPCNSyncTag_3230Text(view);
		case PCNSyncTag19EditPart.VISUAL_ID:
			return getPCNSyncTag_3231Text(view);
		case PCNSyncTag20EditPart.VISUAL_ID:
			return getPCNSyncTag_3232Text(view);
		case PCNSyncTag21EditPart.VISUAL_ID:
			return getPCNSyncTag_3233Text(view);
		case PCNSyncTag22EditPart.VISUAL_ID:
			return getPCNSyncTag_3234Text(view);
		case PCNSyncTag23EditPart.VISUAL_ID:
			return getPCNSyncTag_3235Text(view);
		case PCNSyncTag24EditPart.VISUAL_ID:
			return getPCNSyncTag_3236Text(view);
		case PCNSyncTag25EditPart.VISUAL_ID:
			return getPCNSyncTag_3237Text(view);
		case PCNSyncTag26EditPart.VISUAL_ID:
			return getPCNSyncTag_3238Text(view);
		case PCNSyncTag27EditPart.VISUAL_ID:
			return getPCNSyncTag_3239Text(view);
		case PCNSyncTag28EditPart.VISUAL_ID:
			return getPCNSyncTag_3240Text(view);
		case PCNSyncTag29EditPart.VISUAL_ID:
			return getPCNSyncTag_3241Text(view);
		case PCNSyncTag30EditPart.VISUAL_ID:
			return getPCNSyncTag_3242Text(view);
		case PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID:
			return getPCNDecisionStepPCNPositiveDecision_4006Text(view);
		case PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID:
			return getPCNDecisionStepPCNNegativeDecision_4007Text(view);
		case PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID:
			return getPCNRegularProcessStepPCNStandardDependency_4008Text(view);
		case PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID:
			return getPCNRegularProcessStepPCNDelayedDependency_4009Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getPCNDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNProcessEntity_2001Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNProcessEntity_2001,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNProcessEntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNStandardStep_3011Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNStandardStep_3011,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNStandardStepActionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNStandardStep_3012Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNStandardStep_3012,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNStandardStepAction2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNStandardStep_3013Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNStandardStep_3013,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNStandardStepAction3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNStandardStep_3014Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNStandardStep_3014,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNStandardStepAction4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNStandardStep_3015Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNStandardStep_3015,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNStandardStepAction5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNDoAndWaitStep_3016Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNDoAndWaitStep_3016,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNDoAndWaitStepActionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNDoAndWaitStep_3017Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNDoAndWaitStep_3017,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNDoAndWaitStepAction2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNDoAndWaitStep_3018Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNDoAndWaitStep_3018,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNDoAndWaitStepAction3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNDoAndWaitStep_3019Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNDoAndWaitStep_3019,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNDoAndWaitStepAction4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNDoAndWaitStep_3020Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNDoAndWaitStep_3020,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNDoAndWaitStepAction5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNWaitStep_3021Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNWaitStep_3021,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNWaitStepActionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNWaitStep_3022Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNWaitStep_3022,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNWaitStepAction2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNWaitStep_3023Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNWaitStep_3023,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNWaitStepAction3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNWaitStep_3024Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNWaitStep_3024,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNWaitStepAction4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNWaitStep_3025Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNWaitStep_3025,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNWaitStepAction5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNInnovationStep_3026Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNInnovationStep_3026,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNInnovationStepActionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNInnovationStep_3027Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNInnovationStep_3027,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNInnovationStepAction2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNInnovationStep_3028Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNInnovationStep_3028,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNInnovationStepAction3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNInnovationStep_3029Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNInnovationStep_3029,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNInnovationStepAction4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNInnovationStep_3030Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNInnovationStep_3030,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNInnovationStepAction5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNOutsourcedStep_3031Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNOutsourcedStep_3031,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNOutsourcedStepActionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNOutsourcedStep_3032Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNOutsourcedStep_3032,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNOutsourcedStepAction2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNOutsourcedStep_3033Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNOutsourcedStep_3033,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNOutsourcedStepAction3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNOutsourcedStep_3034Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNOutsourcedStep_3034,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNOutsourcedStepAction4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNOutsourcedStep_3035Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNOutsourcedStep_3035,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNOutsourcedStepAction5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNDecisionStep_3036Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNDecisionStep_3036,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNDecisionStepActionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNDecisionStep_3037Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNDecisionStep_3037,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNDecisionStepAction2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNDecisionStep_3038Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNDecisionStep_3038,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNDecisionStepAction3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNDecisionStep_3039Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNDecisionStep_3039,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNDecisionStepAction4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNDecisionStep_3040Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNDecisionStep_3040,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNDecisionStepAction5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNReference_3041Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNReference_3041,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNReferenceLetterEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNReference_3042Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNReference_3042,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNReferenceLetter2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNReference_3043Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNReference_3043,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNReferenceLetter3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNReference_3044Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNReference_3044,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNReferenceLetter4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNReference_3045Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNReference_3045,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNReferenceLetter5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3048Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3049Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3050Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3051Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3052Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3053Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3054Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3055Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3056Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3057Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3058Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3059Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3060Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3061Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3062Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3063Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3064Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3065Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3066Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3067Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3068Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3069Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3070Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3071Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3072Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3073Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3074Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3075Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3076Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3077Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3078Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3079Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3080Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3081Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3082Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3083Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3084Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3085Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3086Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3087Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3088Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3089Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3090Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3091Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3092Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3093Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3094Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3095Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3096Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3097Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3098Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3099Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3100Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3101Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3102Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3103Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3104Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3105Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3106Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3107Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3108Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3109Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3110Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3111Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3112Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3113Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3114Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3115Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3116Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3117Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3118Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3119Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3120Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3121Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3122Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3123Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3124Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3125Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3126Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3127Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3128Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3129Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3130Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3131Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3132Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3133Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3134Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3135Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3136Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3137Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3138Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3139Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3140Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3141Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3142Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3143Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3144Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3145Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3146Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3147Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3148Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3149Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3150Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3151Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3152Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3153Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3154Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3155Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3156Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3157Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3158Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3159Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3160Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3161Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3162Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3163Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryBenefit_3164Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNMonetaryCost_3165Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryBenefit_3166Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNNonMonetaryCost_3167Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3168Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3168,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTagEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3169Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3169,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3170Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3170,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3171Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3171,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3172Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3172,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3173Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3173,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3174Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3174,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3175Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3175,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3176Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3176,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3177Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3177,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3178Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3178,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag11EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3179Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3179,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag12EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3180Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3180,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag13EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3181Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3181,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag14EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5056); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3182Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3182,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag15EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3183Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3183,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag16EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5058); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3184Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3184,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag17EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3185Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3185,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag18EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3186Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3186,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag19EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5061); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3187Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3187,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag20EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5062); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3188Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3188,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag21EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5063); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3189Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3189,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag22EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5064); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3190Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3190,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag23EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5065); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3191Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3191,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag24EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5066); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3192Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3192,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag25EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5067); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3193Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3193,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag26EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5068); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3194Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3194,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag27EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5069); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3195Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3195,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag28EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5070); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3196Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3196,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag29EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5071); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNTextualTag_3197Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNTextualTag_3197,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNTextualTagTag30EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5072); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNDelayTimeTag_3198Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNDelayTimeTag_3198,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNDelayTimeTagDelayTimeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5073); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNDelayTimeTag_3199Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNDelayTimeTag_3199,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNDelayTimeTagDelayTime2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5074); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNDelayTimeTag_3200Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNDelayTimeTag_3200,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNDelayTimeTagDelayTime3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5075); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNDelayTimeTag_3201Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNDelayTimeTag_3201,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNDelayTimeTagDelayTime4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5076); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNDelayTimeTag_3202Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNDelayTimeTag_3202,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNDelayTimeTagDelayTime5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5077); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNDelayTimeTag_3203Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNDelayTimeTag_3203,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNDelayTimeTagDelayTime6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5078); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNDelayTimeTag_3204Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNDelayTimeTag_3204,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNDelayTimeTagDelayTime7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5079); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNDelayTimeTag_3205Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNDelayTimeTag_3205,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNDelayTimeTagDelayTime8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5080); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNDelayTimeTag_3206Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNDelayTimeTag_3206,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNDelayTimeTagDelayTime9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5081); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNDelayTimeTag_3207Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNDelayTimeTag_3207,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNDelayTimeTagDelayTime10EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5082); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNProbabilitiesTag_3208Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNProbabilitiesTag_3208,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNProbabilitiesTagYesProbabilityEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5083); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNProbabilitiesTag_3209Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNProbabilitiesTag_3209,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNProbabilitiesTagYesProbability2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5084); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNProbabilitiesTag_3210Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNProbabilitiesTag_3210,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNProbabilitiesTagYesProbability3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5085); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNProbabilitiesTag_3211Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNProbabilitiesTag_3211,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNProbabilitiesTagYesProbability4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5086); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNProbabilitiesTag_3212Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNProbabilitiesTag_3212,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(PCNProbabilitiesTagYesProbability5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5087); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3213Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3214Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3215Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3216Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3217Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3218Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3219Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3220Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3221Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3222Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3223Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3224Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3225Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3226Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3227Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3228Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3229Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3230Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3231Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3232Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3233Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3234Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3235Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3236Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3237Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3238Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3239Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3240Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3241Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNSyncTag_3242Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNDecisionStepPCNPositiveDecision_4006Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNDecisionStepPCNPositiveDecision_4006,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNDecisionStepPCNNegativeDecision_4007Text(View view) {
		IParser parser = PcnParserProvider.getParser(PcnElementTypes.PCNDecisionStepPCNNegativeDecision_4007,
				view.getElement() != null ? view.getElement() : view,
				PcnVisualIDRegistry.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PcnDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPCNRegularProcessStepPCNStandardDependency_4008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getPCNRegularProcessStepPCNDelayedDependency_4009Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return PCNDiagramEditPart.MODEL_ID.equals(PcnVisualIDRegistry.getModelID(view));
	}

}
