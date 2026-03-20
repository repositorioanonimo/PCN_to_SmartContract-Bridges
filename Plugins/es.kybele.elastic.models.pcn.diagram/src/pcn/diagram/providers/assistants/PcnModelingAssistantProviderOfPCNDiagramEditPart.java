package pcn.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import pcn.diagram.providers.PcnElementTypes;
import pcn.diagram.providers.PcnModelingAssistantProvider;

/**
 * @generated
 */
public class PcnModelingAssistantProviderOfPCNDiagramEditPart extends PcnModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(PcnElementTypes.PCNProcessEntity_2001);
		return types;
	}

}
