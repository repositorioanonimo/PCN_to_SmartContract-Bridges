package pcn.diagram.providers;

import pcn.PCNMonetaryBenefit;
import pcn.diagram.part.PcnDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = PcnDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			PcnDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
