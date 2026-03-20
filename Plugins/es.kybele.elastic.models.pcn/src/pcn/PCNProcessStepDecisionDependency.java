/**
 */
package pcn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCN Process Step Decision Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcn.PCNProcessStepDecisionDependency#getSourceProcessStepDecision <em>Source Process Step Decision</em>}</li>
 *   <li>{@link pcn.PCNProcessStepDecisionDependency#getTargetProcessStep <em>Target Process Step</em>}</li>
 * </ul>
 *
 * @see pcn.PcnPackage#getPCNProcessStepDecisionDependency()
 * @model abstract="true"
 * @generated
 */
public interface PCNProcessStepDecisionDependency extends PCNDependency {
	/**
	 * Returns the value of the '<em><b>Source Process Step Decision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Process Step Decision</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Process Step Decision</em>' reference.
	 * @see #setSourceProcessStepDecision(PCNDecisionStep)
	 * @see pcn.PcnPackage#getPCNProcessStepDecisionDependency_SourceProcessStepDecision()
	 * @model
	 * @generated
	 */
	PCNDecisionStep getSourceProcessStepDecision();

	/**
	 * Sets the value of the '{@link pcn.PCNProcessStepDecisionDependency#getSourceProcessStepDecision <em>Source Process Step Decision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Process Step Decision</em>' reference.
	 * @see #getSourceProcessStepDecision()
	 * @generated
	 */
	void setSourceProcessStepDecision(PCNDecisionStep value);

	/**
	 * Returns the value of the '<em><b>Target Process Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Process Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Process Step</em>' reference.
	 * @see #setTargetProcessStep(PCNProcessStep)
	 * @see pcn.PcnPackage#getPCNProcessStepDecisionDependency_TargetProcessStep()
	 * @model
	 * @generated
	 */
	PCNProcessStep getTargetProcessStep();

	/**
	 * Sets the value of the '{@link pcn.PCNProcessStepDecisionDependency#getTargetProcessStep <em>Target Process Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Process Step</em>' reference.
	 * @see #getTargetProcessStep()
	 * @generated
	 */
	void setTargetProcessStep(PCNProcessStep value);

} // PCNProcessStepDecisionDependency
