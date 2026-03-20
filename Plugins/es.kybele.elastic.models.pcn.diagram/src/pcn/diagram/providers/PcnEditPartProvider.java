package pcn.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import pcn.diagram.edit.parts.PCNDiagramEditPart;
import pcn.diagram.edit.parts.PcnEditPartFactory;
import pcn.diagram.part.PcnVisualIDRegistry;

/**
 * @generated
 */
public class PcnEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public PcnEditPartProvider() {
		super(new PcnEditPartFactory(), PcnVisualIDRegistry.TYPED_INSTANCE, PCNDiagramEditPart.MODEL_ID);
	}

}
