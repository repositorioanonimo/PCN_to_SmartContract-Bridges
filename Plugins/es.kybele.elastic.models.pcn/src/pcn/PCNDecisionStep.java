/**
 */
package pcn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCN Decision Process Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcn.PCNDecisionStep#getPCNPositiveDecision <em>PCN Positive Decision</em>}</li>
 *   <li>{@link pcn.PCNDecisionStep#getPCNNegativeDecision <em>PCN Negative Decision</em>}</li>
 * </ul>
 *
 * @see pcn.PcnPackage#getPCNDecisionStep()
 * @model
 * @generated
 */
public interface PCNDecisionStep extends PCNProcessStepWithTags {

	/**
	 * Returns the value of the '<em><b>PCN Positive Decision</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pcn.PCNProcessStep#getPCNPositiveDecisionSource <em>PCN Positive Decision Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PCN Positive Decision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PCN Positive Decision</em>' reference.
	 * @see #setPCNPositiveDecision(PCNProcessStep)
	 * @see pcn.PcnPackage#getPCNDecisionStep_PCNPositiveDecision()
	 * @see pcn.PCNProcessStep#getPCNPositiveDecisionSource
	 * @model opposite="PCNPositiveDecisionSource"
	 * @generated
	 */
	PCNProcessStep getPCNPositiveDecision();

	/**
	 * Sets the value of the '{@link pcn.PCNDecisionStep#getPCNPositiveDecision <em>PCN Positive Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PCN Positive Decision</em>' reference.
	 * @see #getPCNPositiveDecision()
	 * @generated
	 */
	void setPCNPositiveDecision(PCNProcessStep value);

	/**
	 * Returns the value of the '<em><b>PCN Negative Decision</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pcn.PCNProcessStep#getPCNNegativeDecisionSource <em>PCN Negative Decision Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PCN Negative Decision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PCN Negative Decision</em>' reference.
	 * @see #setPCNNegativeDecision(PCNProcessStep)
	 * @see pcn.PcnPackage#getPCNDecisionStep_PCNNegativeDecision()
	 * @see pcn.PCNProcessStep#getPCNNegativeDecisionSource
	 * @model opposite="PCNNegativeDecisionSource"
	 * @generated
	 */
	PCNProcessStep getPCNNegativeDecision();

	/**
	 * Sets the value of the '{@link pcn.PCNDecisionStep#getPCNNegativeDecision <em>PCN Negative Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PCN Negative Decision</em>' reference.
	 * @see #getPCNNegativeDecision()
	 * @generated
	 */
	void setPCNNegativeDecision(PCNProcessStep value);
} // PCNDecisionStep
