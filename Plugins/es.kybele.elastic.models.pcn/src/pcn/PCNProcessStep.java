/**
 */
package pcn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCN Process Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcn.PCNProcessStep#getTags <em>Tags</em>}</li>
 *   <li>{@link pcn.PCNProcessStep#getPCNStandardDependencySource <em>PCN Standard Dependency Source</em>}</li>
 *   <li>{@link pcn.PCNProcessStep#getPCNDelayedDependencySource <em>PCN Delayed Dependency Source</em>}</li>
 *   <li>{@link pcn.PCNProcessStep#getPCNPositiveDecisionSource <em>PCN Positive Decision Source</em>}</li>
 *   <li>{@link pcn.PCNProcessStep#getPCNNegativeDecisionSource <em>PCN Negative Decision Source</em>}</li>
 * </ul>
 *
 * @see pcn.PcnPackage#getPCNProcessStep()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PCNProcessStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link pcn.PCNTag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see pcn.PcnPackage#getPCNProcessStep_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCNTag> getTags();

	/**
	 * Returns the value of the '<em><b>PCN Standard Dependency Source</b></em>' reference list.
	 * The list contents are of type {@link pcn.PCNRegularProcessStep}.
	 * It is bidirectional and its opposite is '{@link pcn.PCNRegularProcessStep#getPCNStandardDependency <em>PCN Standard Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PCN Standard Dependency Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PCN Standard Dependency Source</em>' reference list.
	 * @see pcn.PcnPackage#getPCNProcessStep_PCNStandardDependencySource()
	 * @see pcn.PCNRegularProcessStep#getPCNStandardDependency
	 * @model opposite="PCNStandardDependency"
	 * @generated
	 */
	EList<PCNRegularProcessStep> getPCNStandardDependencySource();

	/**
	 * Returns the value of the '<em><b>PCN Delayed Dependency Source</b></em>' reference list.
	 * The list contents are of type {@link pcn.PCNRegularProcessStep}.
	 * It is bidirectional and its opposite is '{@link pcn.PCNRegularProcessStep#getPCNDelayedDependency <em>PCN Delayed Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PCN Delayed Dependency Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PCN Delayed Dependency Source</em>' reference list.
	 * @see pcn.PcnPackage#getPCNProcessStep_PCNDelayedDependencySource()
	 * @see pcn.PCNRegularProcessStep#getPCNDelayedDependency
	 * @model opposite="PCNDelayedDependency"
	 * @generated
	 */
	EList<PCNRegularProcessStep> getPCNDelayedDependencySource();

	/**
	 * Returns the value of the '<em><b>PCN Positive Decision Source</b></em>' reference list.
	 * The list contents are of type {@link pcn.PCNDecisionStep}.
	 * It is bidirectional and its opposite is '{@link pcn.PCNDecisionStep#getPCNPositiveDecision <em>PCN Positive Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PCN Positive Decision Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PCN Positive Decision Source</em>' reference list.
	 * @see pcn.PcnPackage#getPCNProcessStep_PCNPositiveDecisionSource()
	 * @see pcn.PCNDecisionStep#getPCNPositiveDecision
	 * @model opposite="PCNPositiveDecision"
	 * @generated
	 */
	EList<PCNDecisionStep> getPCNPositiveDecisionSource();

	/**
	 * Returns the value of the '<em><b>PCN Negative Decision Source</b></em>' reference list.
	 * The list contents are of type {@link pcn.PCNDecisionStep}.
	 * It is bidirectional and its opposite is '{@link pcn.PCNDecisionStep#getPCNNegativeDecision <em>PCN Negative Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PCN Negative Decision Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PCN Negative Decision Source</em>' reference list.
	 * @see pcn.PcnPackage#getPCNProcessStep_PCNNegativeDecisionSource()
	 * @see pcn.PCNDecisionStep#getPCNNegativeDecision
	 * @model opposite="PCNNegativeDecision"
	 * @generated
	 */
	EList<PCNDecisionStep> getPCNNegativeDecisionSource();

} // PCNProcessStep
