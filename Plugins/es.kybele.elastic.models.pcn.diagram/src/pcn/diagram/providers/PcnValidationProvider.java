package pcn.diagram.providers;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.validation.model.IClientSelector;
import org.eclipse.gmf.runtime.notation.View;

import pcn.diagram.edit.parts.PCNDiagramEditPart;
import pcn.diagram.part.PcnDiagramEditorPlugin;
import pcn.diagram.part.PcnVisualIDRegistry;

/**
 * @generated
 */
public class PcnValidationProvider {

	/**
	* @generated
	*/
	private static boolean constraintsActive = false;

	/**
	* @generated
	*/
	public static boolean shouldConstraintsBePrivate() {
		return false;
	}

	/**
	* @generated
	*/
	public static void runWithConstraints(TransactionalEditingDomain editingDomain, Runnable operation) {
		final Runnable op = operation;
		Runnable task = new Runnable() {
			public void run() {
				try {
					constraintsActive = true;
					op.run();
				} finally {
					constraintsActive = false;
				}
			}
		};
		if (editingDomain != null) {
			try {
				editingDomain.runExclusive(task);
			} catch (Exception e) {
				PcnDiagramEditorPlugin.getInstance().logError("Validation failed", e); //$NON-NLS-1$
			}
		} else {
			task.run();
		}
	}

	/**
	* @generated
	*/
	static boolean isInDefaultEditorContext(Object object) {
		if (shouldConstraintsBePrivate() && !constraintsActive) {
			return false;
		}
		if (object instanceof View) {
			return constraintsActive
					&& PCNDiagramEditPart.MODEL_ID.equals(PcnVisualIDRegistry.getModelID((View) object));
		}
		return true;
	}

	/**
	* @generated
	*/
	public static class DefaultCtx implements IClientSelector {

		/**
		* @generated
		*/
		public boolean selects(Object object) {
			return isInDefaultEditorContext(object);
		}
	}

}
