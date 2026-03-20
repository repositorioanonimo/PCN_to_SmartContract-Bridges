/**
 */
package pcn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCN Probabilities Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcn.PCNProbabilitiesTag#getYesProbability <em>Yes Probability</em>}</li>
 *   <li>{@link pcn.PCNProbabilitiesTag#getNoProbability <em>No Probability</em>}</li>
 * </ul>
 *
 * @see pcn.PcnPackage#getPCNProbabilitiesTag()
 * @model
 * @generated
 */
public interface PCNProbabilitiesTag extends PCNTag {
	/**
	 * Returns the value of the '<em><b>Yes Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yes Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yes Probability</em>' attribute.
	 * @see #setYesProbability(String)
	 * @see pcn.PcnPackage#getPCNProbabilitiesTag_YesProbability()
	 * @model
	 * @generated
	 */
	String getYesProbability();

	/**
	 * Sets the value of the '{@link pcn.PCNProbabilitiesTag#getYesProbability <em>Yes Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yes Probability</em>' attribute.
	 * @see #getYesProbability()
	 * @generated
	 */
	void setYesProbability(String value);

	/**
	 * Returns the value of the '<em><b>No Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Probability</em>' attribute.
	 * @see #setNoProbability(String)
	 * @see pcn.PcnPackage#getPCNProbabilitiesTag_NoProbability()
	 * @model
	 * @generated
	 */
	String getNoProbability();

	/**
	 * Sets the value of the '{@link pcn.PCNProbabilitiesTag#getNoProbability <em>No Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Probability</em>' attribute.
	 * @see #getNoProbability()
	 * @generated
	 */
	void setNoProbability(String value);

} // PCNProbabilitiesTag
