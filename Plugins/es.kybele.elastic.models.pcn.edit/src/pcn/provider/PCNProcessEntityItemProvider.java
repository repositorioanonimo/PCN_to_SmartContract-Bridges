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

import pcn.PCNProcessEntity;
import pcn.PcnFactory;
import pcn.PcnPackage;

/**
 * This is the item provider adapter for a {@link pcn.PCNProcessEntity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNProcessEntityItemProvider 
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
	public PCNProcessEntityItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addOrderPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PCNProcessEntity_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PCNProcessEntity_name_feature", "_UI_PCNProcessEntity_type"),
				 PcnPackage.Literals.PCN_PROCESS_ENTITY__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PCNProcessEntity_order_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PCNProcessEntity_order_feature", "_UI_PCNProcessEntity_type"),
				 PcnPackage.Literals.PCN_PROCESS_ENTITY__ORDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(PcnPackage.Literals.PCN_PROCESS_ENTITY__NEXT_ENTITY);
			childrenFeatures.add(PcnPackage.Literals.PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS);
			childrenFeatures.add(PcnPackage.Literals.PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS);
			childrenFeatures.add(PcnPackage.Literals.PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES);
			childrenFeatures.add(PcnPackage.Literals.PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS);
			childrenFeatures.add(PcnPackage.Literals.PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS);
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
	 * This returns PCNProcessEntity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PCNProcessEntity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PCNProcessEntity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PCNProcessEntity_type") :
			getString("_UI_PCNProcessEntity_type") + " " + label;
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

		switch (notification.getFeatureID(PCNProcessEntity.class)) {
			case PcnPackage.PCN_PROCESS_ENTITY__NAME:
			case PcnPackage.PCN_PROCESS_ENTITY__ORDER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PcnPackage.PCN_PROCESS_ENTITY__NEXT_ENTITY:
			case PcnPackage.PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS:
			case PcnPackage.PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS:
			case PcnPackage.PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES:
			case PcnPackage.PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS:
			case PcnPackage.PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS:
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
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__NEXT_ENTITY,
				 PcnFactory.eINSTANCE.createPCNProcessEntity()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNReference()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNRegularProcessStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNStandardStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNDoAndWaitStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNWaitStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNDecisionStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNInnovationStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNOutsourcedStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNReference()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNRegularProcessStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNStandardStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNDoAndWaitStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNWaitStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNDecisionStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNInnovationStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNOutsourcedStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES,
				 PcnFactory.eINSTANCE.createPCNReference()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES,
				 PcnFactory.eINSTANCE.createPCNRegularProcessStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES,
				 PcnFactory.eINSTANCE.createPCNStandardStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES,
				 PcnFactory.eINSTANCE.createPCNDoAndWaitStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES,
				 PcnFactory.eINSTANCE.createPCNWaitStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES,
				 PcnFactory.eINSTANCE.createPCNDecisionStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES,
				 PcnFactory.eINSTANCE.createPCNInnovationStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES,
				 PcnFactory.eINSTANCE.createPCNOutsourcedStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNReference()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNRegularProcessStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNStandardStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNDoAndWaitStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNWaitStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNDecisionStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNInnovationStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNOutsourcedStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNReference()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNRegularProcessStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNStandardStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNDoAndWaitStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNWaitStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNDecisionStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNInnovationStep()));

		newChildDescriptors.add
			(createChildParameter
				(PcnPackage.Literals.PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS,
				 PcnFactory.eINSTANCE.createPCNOutsourcedStep()));
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
			childFeature == PcnPackage.Literals.PCN_PROCESS_ENTITY__LEFT_DIRECT_INTERACTIONS ||
			childFeature == PcnPackage.Literals.PCN_PROCESS_ENTITY__LEFT_SURROGATE_INTERACTIONS ||
			childFeature == PcnPackage.Literals.PCN_PROCESS_ENTITY__CENTER_INDEPENDENT_INTERACTIONS_ACTIVITIES ||
			childFeature == PcnPackage.Literals.PCN_PROCESS_ENTITY__RIGHT_SURROGATE_INTERACTIONS ||
			childFeature == PcnPackage.Literals.PCN_PROCESS_ENTITY__RIGHT_DIRECT_INTERACTIONS;

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
