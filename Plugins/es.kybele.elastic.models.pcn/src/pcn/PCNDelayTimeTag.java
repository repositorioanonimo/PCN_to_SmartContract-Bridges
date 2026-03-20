/**
 */
package pcn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCN Delay Time Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcn.PCNDelayTimeTag#getDelayTime <em>Delay Time</em>}</li>
 * </ul>
 *
 * @see pcn.PcnPackage#getPCNDelayTimeTag()
 * @model
 * @generated
 */
public interface PCNDelayTimeTag extends PCNTag {
	/**
	 * Returns the value of the '<em><b>Delay Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay Time</em>' attribute.
	 * @see #setDelayTime(String)
	 * @see pcn.PcnPackage#getPCNDelayTimeTag_DelayTime()
	 * @model
	 * @generated
	 */
	String getDelayTime();

	/**
	 * Sets the value of the '{@link pcn.PCNDelayTimeTag#getDelayTime <em>Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay Time</em>' attribute.
	 * @see #getDelayTime()
	 * @generated
	 */
	void setDelayTime(String value);

} // PCNDelayTimeTag
