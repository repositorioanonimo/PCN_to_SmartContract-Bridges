/**
 */
package pcn.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import pcn.PCNOutsourcedStep;
import pcn.PcnPackage;

/**
 * This is the item provider adapter for a {@link pcn.PCNOutsourcedStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNOutsourcedStepItemProvider extends PCNRegularProcessStepItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNOutsourcedStepItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns PCNOutsourcedStep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PCNOutsourcedStep"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PCNOutsourcedStep)object).getAction();
		return label == null || label.length() == 0 ?
			getString("_UI_PCNOutsourcedStep_type") :
			getString("_UI_PCNOutsourcedStep_type") + " " + label;
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

}
