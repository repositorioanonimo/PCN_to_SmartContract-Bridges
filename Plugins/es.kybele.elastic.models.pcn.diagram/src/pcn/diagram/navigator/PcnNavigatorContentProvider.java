package pcn.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

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
import pcn.diagram.edit.parts.PCNInnovationStepCompartmentHighlightTagsEditPart;
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
import pcn.diagram.edit.parts.PCNProcessEntityCompartmentIndEditPart;
import pcn.diagram.edit.parts.PCNProcessEntityCompartmentLeftDirEditPart;
import pcn.diagram.edit.parts.PCNProcessEntityCompartmentLeftSurEditPart;
import pcn.diagram.edit.parts.PCNProcessEntityCompartmentRightDirEditPart;
import pcn.diagram.edit.parts.PCNProcessEntityCompartmentRightSurEditPart;
import pcn.diagram.edit.parts.PCNProcessEntityEditPart;
import pcn.diagram.edit.parts.PCNReference2EditPart;
import pcn.diagram.edit.parts.PCNReference3EditPart;
import pcn.diagram.edit.parts.PCNReference4EditPart;
import pcn.diagram.edit.parts.PCNReference5EditPart;
import pcn.diagram.edit.parts.PCNReferenceEditPart;

import pcn.diagram.edit.parts.PCNStandardStep2EditPart;
import pcn.diagram.edit.parts.PCNStandardStep3EditPart;
import pcn.diagram.edit.parts.PCNStandardStep4EditPart;
import pcn.diagram.edit.parts.PCNStandardStep5EditPart;
import pcn.diagram.edit.parts.PCNStandardStepCompartmentStandardProcessTags2EditPart;
import pcn.diagram.edit.parts.PCNStandardStepCompartmentStandardProcessTags3EditPart;
import pcn.diagram.edit.parts.PCNStandardStepCompartmentStandardProcessTags4EditPart;
import pcn.diagram.edit.parts.PCNStandardStepCompartmentStandardProcessTags5EditPart;
import pcn.diagram.edit.parts.PCNStandardStepCompartmentStandardProcessTagsEditPart;
import pcn.diagram.edit.parts.PCNStandardStepEditPart;

import pcn.diagram.edit.parts.PCNWaitStep2EditPart;
import pcn.diagram.edit.parts.PCNWaitStep3EditPart;
import pcn.diagram.edit.parts.PCNWaitStep4EditPart;
import pcn.diagram.edit.parts.PCNWaitStep5EditPart;
import pcn.diagram.edit.parts.PCNWaitStepEditPart;
import pcn.diagram.part.Messages;
import pcn.diagram.part.PcnVisualIDRegistry;

/**
 * @generated
 */
public class PcnNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public PcnNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<PcnNavigatorItem> result = new ArrayList<PcnNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(selectViewsByType(topViews, PCNDiagramEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof PcnNavigatorGroup) {
			PcnNavigatorGroup group = (PcnNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof PcnNavigatorItem) {
			PcnNavigatorItem navigatorItem = (PcnNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (PcnVisualIDRegistry.getVisualID(view)) {

		case PCNDiagramEditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			PcnNavigatorGroup links = new PcnNavigatorGroup(Messages.NavigatorGroupName_PCNDiagram_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case PCNProcessEntityEditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentLeftDirEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNStandardStepEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentLeftSurEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNStandardStep2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentIndEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNStandardStep3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentRightSurEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNStandardStep4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentRightDirEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNStandardStep5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentLeftDirEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentLeftSurEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentIndEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentRightSurEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentRightDirEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentLeftDirEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNWaitStepEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentLeftSurEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNWaitStep2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentIndEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNWaitStep3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentRightSurEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNWaitStep4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentRightDirEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNWaitStep5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentLeftDirEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNInnovationStepEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentLeftSurEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNInnovationStep2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentIndEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNInnovationStep3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentRightSurEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNInnovationStep4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentRightDirEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNInnovationStep5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentLeftDirEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNOutsourcedStepEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentLeftSurEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNOutsourcedStep2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentIndEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNOutsourcedStep3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentRightSurEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNOutsourcedStep4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentRightDirEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNOutsourcedStep5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentLeftDirEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNDecisionStepEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentLeftSurEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNDecisionStep2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentIndEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNDecisionStep3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentRightSurEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNDecisionStep4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentRightDirEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNDecisionStep5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentLeftDirEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNReferenceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentLeftSurEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNReference2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentIndEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNReference3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentRightSurEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNReference4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNProcessEntityCompartmentRightDirEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNReference5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case PCNStandardStepEditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNStandardStep_3011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNStandardStep_3011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCostEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCostEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTagEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTagEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNStandardStep2EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNStandardStep_3012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNStandardStep_3012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNStandardStep3EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNStandardStep_3013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNStandardStep_3013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNStandardStep4EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNStandardStep_3014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNStandardStep_3014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNStandardStep5EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNStandardStep_3015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNStandardStep_3015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepCompartmentStandardProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNDoAndWaitStepEditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDoAndWaitStep_3016_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDoAndWaitStep_3016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNDelayTimeTagEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNDoAndWaitStep2EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDoAndWaitStep_3017_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDoAndWaitStep_3017_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNDelayTimeTag2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNDoAndWaitStep3EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDoAndWaitStep_3018_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDoAndWaitStep_3018_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNDelayTimeTag3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNDoAndWaitStep4EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDoAndWaitStep_3019_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDoAndWaitStep_3019_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNDelayTimeTag4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNDoAndWaitStep5EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDoAndWaitStep_3020_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDoAndWaitStep_3020_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNDelayTimeTag5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepCompartmentLongProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNWaitStepEditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNWaitStep_3021_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNWaitStep_3021_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNDelayTimeTag6EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag11EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNWaitStep2EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNWaitStep_3022_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNWaitStep_3022_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNDelayTimeTag7EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag12EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNWaitStep3EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNWaitStep_3023_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNWaitStep_3023_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNDelayTimeTag8EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag13EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNWaitStep4EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNWaitStep_3024_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNWaitStep_3024_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNDelayTimeTag9EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag14EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNWaitStep5EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNWaitStep_3025_incominglinks, "icons/incomingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNWaitStep_3025_outgoinglinks, "icons/outgoingLinksNavigatorGroup.gif", //$NON-NLS-1$
					parentElement);
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit15EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost15EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit15EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost15EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag15EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNDelayTimeTag10EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepCompartmentWaitProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag15EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNInnovationStepEditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNInnovationStep_3026_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNInnovationStep_3026_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit16EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost16EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit16EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost16EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag16EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag16EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNInnovationStep2EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNInnovationStep_3027_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNInnovationStep_3027_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit17EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost17EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit17EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost17EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag17EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag17EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNInnovationStep3EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNInnovationStep_3028_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNInnovationStep_3028_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit18EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost18EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit18EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost18EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag18EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag18EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNInnovationStep4EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNInnovationStep_3029_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNInnovationStep_3029_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit19EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost19EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit19EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost19EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag19EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag19EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNInnovationStep5EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNInnovationStep_3030_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNInnovationStep_3030_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit20EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost20EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit20EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost20EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag20EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepCompartmentHighlightTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag20EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNOutsourcedStepEditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNOutsourcedStep_3031_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNOutsourcedStep_3031_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit21EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost21EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit21EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost21EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag21EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag21EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNOutsourcedStep2EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNOutsourcedStep_3032_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNOutsourcedStep_3032_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit22EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost22EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit22EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost22EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag22EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag22EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNOutsourcedStep3EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNOutsourcedStep_3033_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNOutsourcedStep_3033_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit23EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost23EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit23EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost23EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag23EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag23EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNOutsourcedStep4EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNOutsourcedStep_3034_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNOutsourcedStep_3034_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit24EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost24EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit24EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost24EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag24EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag24EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNOutsourcedStep5EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNOutsourcedStep_3035_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNOutsourcedStep_3035_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit25EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost25EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit25EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost25EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag25EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepCompartmentPreparationTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag25EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNDecisionStepEditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDecisionStep_3036_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDecisionStep_3036_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit26EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost26EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit26EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost26EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag26EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNProbabilitiesTagEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTagsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag26EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNDecisionStep2EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDecisionStep_3037_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDecisionStep_3037_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit27EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost27EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit27EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost27EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag27EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNProbabilitiesTag2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag27EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNDecisionStep3EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDecisionStep_3038_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDecisionStep_3038_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit28EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost28EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit28EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost28EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag28EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNProbabilitiesTag3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag28EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNDecisionStep4EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDecisionStep_3039_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDecisionStep_3039_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit29EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost29EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit29EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost29EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag29EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNProbabilitiesTag4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags4EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag29EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNDecisionStep5EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDecisionStep_3040_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup outgoinglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDecisionStep_3040_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryBenefit30EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNMonetaryCost30EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryBenefit30EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNNonMonetaryCost30EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNTextualTag30EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNProbabilitiesTag5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepCompartmentDecisionProcessTags5EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PcnVisualIDRegistry.getType(PCNSyncTag30EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PCNReferenceEditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNReference_3041_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case PCNReference2EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNReference_3042_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case PCNReference3EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNReference_3043_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case PCNReference4EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNReference_3044_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case PCNReference5EditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Node sv = (Node) view;
			PcnNavigatorGroup incominglinks = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNReference_3045_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case PCNDecisionStepPCNPositiveDecisionEditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PcnNavigatorGroup target = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDecisionStepPCNPositiveDecision_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup source = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDecisionStepPCNPositiveDecision_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNReferenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNReference2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNReference3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNReference4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNReference5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case PCNDecisionStepPCNNegativeDecisionEditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PcnNavigatorGroup target = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDecisionStepPCNNegativeDecision_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup source = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNDecisionStepPCNNegativeDecision_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNReferenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNReference2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNReference3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNReference4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNReference5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case PCNRegularProcessStepPCNStandardDependencyEditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PcnNavigatorGroup target = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNRegularProcessStepPCNStandardDependency_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup source = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNRegularProcessStepPCNStandardDependency_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNReferenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNReference2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNReference3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNReference4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNReference5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case PCNRegularProcessStepPCNDelayedDependencyEditPart.VISUAL_ID: {
			LinkedList<PcnAbstractNavigatorItem> result = new LinkedList<PcnAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PcnNavigatorGroup target = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNRegularProcessStepPCNDelayedDependency_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PcnNavigatorGroup source = new PcnNavigatorGroup(
					Messages.NavigatorGroupName_PCNRegularProcessStepPCNDelayedDependency_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStepEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDecisionStep5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNReferenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNReference2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNReference3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNReference4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNReference5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStepEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNStandardStep5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStepEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNDoAndWaitStep5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStepEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNWaitStep5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStepEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNInnovationStep5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStepEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PcnVisualIDRegistry.getType(PCNOutsourcedStep5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return PCNDiagramEditPart.MODEL_ID.equals(PcnVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<PcnNavigatorItem> createNavigatorItems(Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<PcnNavigatorItem> result = new ArrayList<PcnNavigatorItem>(views.size());
		for (View nextView : views) {
			result.add(new PcnNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof PcnAbstractNavigatorItem) {
			PcnAbstractNavigatorItem abstractNavigatorItem = (PcnAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
