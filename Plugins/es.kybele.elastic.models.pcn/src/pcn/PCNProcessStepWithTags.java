/**
 */
package pcn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCN Process Step With Tags</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcn.PCNProcessStepWithTags#getNonMonetaryBenefits <em>Non Monetary Benefits</em>}</li>
 *   <li>{@link pcn.PCNProcessStepWithTags#getNonMonetaryCosts <em>Non Monetary Costs</em>}</li>
 *   <li>{@link pcn.PCNProcessStepWithTags#getMonetaryBenefits <em>Monetary Benefits</em>}</li>
 *   <li>{@link pcn.PCNProcessStepWithTags#getMonetaryCosts <em>Monetary Costs</em>}</li>
 *   <li>{@link pcn.PCNProcessStepWithTags#getAction <em>Action</em>}</li>
 *   <li>{@link pcn.PCNProcessStepWithTags#getTextualTags <em>Textual Tags</em>}</li>
 *   <li>{@link pcn.PCNProcessStepWithTags#getDelayTimeTags <em>Delay Time Tags</em>}</li>
 *   <li>{@link pcn.PCNProcessStepWithTags#getProbabilitiesTags <em>Probabilities Tags</em>}</li>
 *   <li>{@link pcn.PCNProcessStepWithTags#getSyncTags <em>Sync Tags</em>}</li>
 * </ul>
 *
 * @see pcn.PcnPackage#getPCNProcessStepWithTags()
 * @model abstract="true"
 * @generated
 */
public interface PCNProcessStepWithTags extends PCNProcessStep {
	/**
	 * Returns the value of the '<em><b>Non Monetary Benefits</b></em>' containment reference list.
	 * The list contents are of type {@link pcn.PCNNonMonetaryBenefit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Monetary Benefits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Monetary Benefits</em>' containment reference list.
	 * @see pcn.PcnPackage#getPCNProcessStepWithTags_NonMonetaryBenefits()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCNNonMonetaryBenefit> getNonMonetaryBenefits();

	/**
	 * Returns the value of the '<em><b>Non Monetary Costs</b></em>' containment reference list.
	 * The list contents are of type {@link pcn.PCNNonMonetaryCost}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Monetary Costs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Monetary Costs</em>' containment reference list.
	 * @see pcn.PcnPackage#getPCNProcessStepWithTags_NonMonetaryCosts()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCNNonMonetaryCost> getNonMonetaryCosts();

	/**
	 * Returns the value of the '<em><b>Monetary Benefits</b></em>' containment reference list.
	 * The list contents are of type {@link pcn.PCNMonetaryBenefit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monetary Benefits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monetary Benefits</em>' containment reference list.
	 * @see pcn.PcnPackage#getPCNProcessStepWithTags_MonetaryBenefits()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCNMonetaryBenefit> getMonetaryBenefits();

	/**
	 * Returns the value of the '<em><b>Monetary Costs</b></em>' containment reference list.
	 * The list contents are of type {@link pcn.PCNMonetaryCost}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monetary Costs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monetary Costs</em>' containment reference list.
	 * @see pcn.PcnPackage#getPCNProcessStepWithTags_MonetaryCosts()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCNMonetaryCost> getMonetaryCosts();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see pcn.PcnPackage#getPCNProcessStepWithTags_Action()
	 * @model
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link pcn.PCNProcessStepWithTags#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Textual Tags</b></em>' containment reference list.
	 * The list contents are of type {@link pcn.PCNTextualTag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Textual Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textual Tags</em>' containment reference list.
	 * @see pcn.PcnPackage#getPCNProcessStepWithTags_TextualTags()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCNTextualTag> getTextualTags();

	/**
	 * Returns the value of the '<em><b>Delay Time Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay Time Tags</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay Time Tags</em>' containment reference.
	 * @see #setDelayTimeTags(PCNDelayTimeTag)
	 * @see pcn.PcnPackage#getPCNProcessStepWithTags_DelayTimeTags()
	 * @model containment="true"
	 * @generated
	 */
	PCNDelayTimeTag getDelayTimeTags();

	/**
	 * Sets the value of the '{@link pcn.PCNProcessStepWithTags#getDelayTimeTags <em>Delay Time Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay Time Tags</em>' containment reference.
	 * @see #getDelayTimeTags()
	 * @generated
	 */
	void setDelayTimeTags(PCNDelayTimeTag value);

	/**
	 * Returns the value of the '<em><b>Probabilities Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probabilities Tags</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probabilities Tags</em>' containment reference.
	 * @see #setProbabilitiesTags(PCNProbabilitiesTag)
	 * @see pcn.PcnPackage#getPCNProcessStepWithTags_ProbabilitiesTags()
	 * @model containment="true"
	 * @generated
	 */
	PCNProbabilitiesTag getProbabilitiesTags();

	/**
	 * Sets the value of the '{@link pcn.PCNProcessStepWithTags#getProbabilitiesTags <em>Probabilities Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probabilities Tags</em>' containment reference.
	 * @see #getProbabilitiesTags()
	 * @generated
	 */
	void setProbabilitiesTags(PCNProbabilitiesTag value);

	/**
	 * Returns the value of the '<em><b>Sync Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sync Tags</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync Tags</em>' containment reference.
	 * @see #setSyncTags(PCNSyncTag)
	 * @see pcn.PcnPackage#getPCNProcessStepWithTags_SyncTags()
	 * @model containment="true"
	 * @generated
	 */
	PCNSyncTag getSyncTags();

	/**
	 * Sets the value of the '{@link pcn.PCNProcessStepWithTags#getSyncTags <em>Sync Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Tags</em>' containment reference.
	 * @see #getSyncTags()
	 * @generated
	 */
	void setSyncTags(PCNSyncTag value);

} // PCNProcessStepWithTags
