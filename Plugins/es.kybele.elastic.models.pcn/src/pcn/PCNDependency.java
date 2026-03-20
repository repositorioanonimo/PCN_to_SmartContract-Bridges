/**
 */
package pcn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCN Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcn.PCNDependency#getInDiagram <em>In Diagram</em>}</li>
 * </ul>
 *
 * @see pcn.PcnPackage#getPCNDependency()
 * @model abstract="true"
 * @generated
 */
public interface PCNDependency extends EObject {

	/**
	 * Returns the value of the '<em><b>In Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pcn.PCNDiagram#getDiagramDependencies <em>Diagram Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Diagram</em>' container reference.
	 * @see #setInDiagram(PCNDiagram)
	 * @see pcn.PcnPackage#getPCNDependency_InDiagram()
	 * @see pcn.PCNDiagram#getDiagramDependencies
	 * @model opposite="diagramDependencies" transient="false"
	 * @generated
	 */
	PCNDiagram getInDiagram();

	/**
	 * Sets the value of the '{@link pcn.PCNDependency#getInDiagram <em>In Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Diagram</em>' container reference.
	 * @see #getInDiagram()
	 * @generated
	 */
	void setInDiagram(PCNDiagram value);
} // PCNDependency
