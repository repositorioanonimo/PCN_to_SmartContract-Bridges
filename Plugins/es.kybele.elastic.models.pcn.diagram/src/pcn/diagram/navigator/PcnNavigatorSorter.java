package pcn.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import pcn.diagram.part.PcnVisualIDRegistry;

/**
 * @generated
 */
public class PcnNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7037;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof PcnNavigatorItem) {
			PcnNavigatorItem item = (PcnNavigatorItem) element;
			return PcnVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
