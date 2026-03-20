/**
 */
package pcn.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import pcn.PCNProcessStepWithTags;
import pcn.PcnFactory;
import pcn.PcnPackage;

/**
 * This is the item provider adapter for a {@link pcn.PCNProcessStepWithTags} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNProcessStepWithTagsItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNProcessStepWithTagsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPCNStandardDependencySourcePropertyDescriptor(object);
			addPCNDelayedDependencySourcePropertyDescriptor(object);
			addPCNPositiveDecisionSourcePropertyDescriptor(object);
			addPCNNegativeDecisionSourcePropertyDescriptor(object);
			addActionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the PCN Standard Dependency Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPCNStandardDependencySourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PCNProcessStep_PCNStandardDependencySource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PCNProcessStep_PCNStandardDependencySource_feature", "_UI_PCNProcessStep_type"),
				 PcnPackage.Literals.PCN_PROCESS_STEP__PCN_STANDARD_DEPENDENCY_SOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PCN Delayed Dependency Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPCNDelayedDependencySourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PCNProcessStep_PCNDelayedDependencySource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PCNProcessStep_PCNDelayedDependencySource_feature", "_UI_PCNProcessStep_type"),
				 PcnPackage.Literals.PCN_PROCESS_STEP__PCN_DELAYED_DEPENDENCY_SOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PCN Positive Decision Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPCNPositiveDecisionSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PCNProcessStep_PCNPositiveDecisionSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PCNProcessStep_PCNPositiveDecisionSource_feature", "_UI_PCNProcessStep_type"),
				 PcnPackage.Literals.PCN_PROCESS_STEP__PCN_POSITIVE_DECISION_SOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the PCN Negative Decision Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPCNNegativeDecisionSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PCNProcessStep_PCNNegativeDecisionSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PCNProcessStep_PCNNegativeDecisionSource_feature", "_UI_PCNProcessStep_type"),
				 PcnPackage.Literals.PCN_PROCESS_STEP__PCN_NEGATIVE_DECISION_SOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PCNProcessStepWithTags_action_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PCNProcessStepWithTags_action_feature", "_UI_PCNProcessStepWithTags_type"),
				 PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__ACTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PcnPackage.Literals.PCN_PROCESS_STEP__TAGS);
			childrenFeatures.add(PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS);
			childrenFeatures.add(PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS);
			childrenFeatures.add(PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS);
			childrenFeatures.add(PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS);
			childrenFeatures.add(PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__TEXTUAL_TAGS);
			childrenFeatures.add(PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__DELAY_TIME_TAGS);
			childrenFeatures.add(PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__PROBABILITIES_TAGS);
			childrenFeatures.add(PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__SYNC_TAGS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PCNProcessStepWithTags)object).getAction();
		return label == null || label.length() == 0 ?
			getString("_UI_PCNProcessStepWithTags_type") :
			getString("_UI_PCNProcessStepWithTags_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PCNProcessStepWithTags.class)) {
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__ACTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__TAGS:
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS:
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS:
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS:
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS:
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__TEXTUAL_TAGS:
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__DELAY_TIME_TAGS:
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__PROBABILITIES_TAGS:
			case PcnPackage.PCN_PROCESS_STEP_WITH_TAGS__SYNC_TAGS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_STEP__TAGS,
				 PcnFactory.eINSTANCE.createPCNMonetaryTag()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_STEP__TAGS,
				 PcnFactory.eINSTANCE.createPCNMonetaryBenefit()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_STEP__TAGS,
				 PcnFactory.eINSTANCE.createPCNMonetaryCost()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_STEP__TAGS,
				 PcnFactory.eINSTANCE.createPCNNonMonetaryTag()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_STEP__TAGS,
				 PcnFactory.eINSTANCE.createPCNNonMonetaryBenefit()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_STEP__TAGS,
				 PcnFactory.eINSTANCE.createPCNNonMonetaryCost()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_STEP__TAGS,
				 PcnFactory.eINSTANCE.createPCNTextualTag()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_STEP__TAGS,
				 PcnFactory.eINSTANCE.createPCNDelayTimeTag()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_STEP__TAGS,
				 PcnFactory.eINSTANCE.createPCNProbabilitiesTag()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS,
				 PcnFactory.eINSTANCE.createPCNNonMonetaryBenefit()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS,
				 PcnFactory.eINSTANCE.createPCNNonMonetaryCost()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS,
				 PcnFactory.eINSTANCE.createPCNMonetaryBenefit()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS,
				 PcnFactory.eINSTANCE.createPCNMonetaryCost()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__TEXTUAL_TAGS,
				 PcnFactory.eINSTANCE.createPCNTextualTag()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__DELAY_TIME_TAGS,
				 PcnFactory.eINSTANCE.createPCNDelayTimeTag()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__PROBABILITIES_TAGS,
				 PcnFactory.eINSTANCE.createPCNProbabilitiesTag()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__SYNC_TAGS,
				 PcnFactory.eINSTANCE.createPCNSyncTag()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == PcnPackage.Literals.PCN_PROCESS_STEP__TAGS ||
			childFeature == PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_BENEFITS ||
			childFeature == PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__MONETARY_COSTS ||
			childFeature == PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_BENEFITS ||
			childFeature == PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__NON_MONETARY_COSTS ||
			childFeature == PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__TEXTUAL_TAGS ||
			childFeature == PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__DELAY_TIME_TAGS ||
			childFeature == PcnPackage.Literals.PCN_PROCESS_STEP_WITH_TAGS__PROBABILITIES_TAGS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PcnEditPlugin.INSTANCE;
	}

}
