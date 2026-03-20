/**
 */
package pcn;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCN Regular Process Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcn.PCNRegularProcessStep#getPCNStandardDependency <em>PCN Standard Dependency</em>}</li>
 *   <li>{@link pcn.PCNRegularProcessStep#getPCNDelayedDependency <em>PCN Delayed Dependency</em>}</li>
 * </ul>
 *
 * @see pcn.PcnPackage#getPCNRegularProcessStep()
 * @model
 * @generated
 */
public interface PCNRegularProcessStep extends PCNProcessStepWithTags {

	/**
	 * Returns the value of the '<em><b>PCN Standard Dependency</b></em>' reference list.
	 * The list contents are of type {@link pcn.PCNProcessStep}.
	 * It is bidirectional and its opposite is '{@link pcn.PCNProcessStep#getPCNStandardDependencySource <em>PCN Standard Dependency Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PCN Standard Dependency</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PCN Standard Dependency</em>' reference list.
	 * @see pcn.PcnPackage#getPCNRegularProcessStep_PCNStandardDependency()
	 * @see pcn.PCNProcessStep#getPCNStandardDependencySource
	 * @model opposite="PCNStandardDependencySource"
	 * @generated
	 */
	EList<PCNProcessStep> getPCNStandardDependency();

	/**
	 * Returns the value of the '<em><b>PCN Delayed Dependency</b></em>' reference list.
	 * The list contents are of type {@link pcn.PCNProcessStep}.
	 * It is bidirectional and its opposite is '{@link pcn.PCNProcessStep#getPCNDelayedDependencySource <em>PCN Delayed Dependency Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PCN Delayed Dependency</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PCN Delayed Dependency</em>' reference list.
	 * @see pcn.PcnPackage#getPCNRegularProcessStep_PCNDelayedDependency()
	 * @see pcn.PCNProcessStep#getPCNDelayedDependencySource
	 * @model opposite="PCNDelayedDependencySource"
	 * @generated
	 */
	EList<PCNProcessStep> getPCNDelayedDependency();
} // PCNRegularProcessStep
