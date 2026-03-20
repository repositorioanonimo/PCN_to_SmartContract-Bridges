/**
 */
package pcn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCN Process Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcn.PCNProcessEntity#getName <em>Name</em>}</li>
 *   <li>{@link pcn.PCNProcessEntity#getOrder <em>Order</em>}</li>
 *   <li>{@link pcn.PCNProcessEntity#getBackEntity <em>Back Entity</em>}</li>
 *   <li>{@link pcn.PCNProcessEntity#getNextEntity <em>Next Entity</em>}</li>
 *   <li>{@link pcn.PCNProcessEntity#getLeftDirectInteractions <em>Left Direct Interactions</em>}</li>
 *   <li>{@link pcn.PCNProcessEntity#getLeftSurrogateInteractions <em>Left Surrogate Interactions</em>}</li>
 *   <li>{@link pcn.PCNProcessEntity#getCenterIndependentInteractionsActivities <em>Center Independent Interactions Activities</em>}</li>
 *   <li>{@link pcn.PCNProcessEntity#getRightSurrogateInteractions <em>Right Surrogate Interactions</em>}</li>
 *   <li>{@link pcn.PCNProcessEntity#getRightDirectInteractions <em>Right Direct Interactions</em>}</li>
 * </ul>
 *
 * @see pcn.PcnPackage#getPCNProcessEntity()
 * @model
 * @generated
 */
public interface PCNProcessEntity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pcn.PcnPackage#getPCNProcessEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pcn.PCNProcessEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see pcn.PcnPackage#getPCNProcessEntity_Order()
	 * @model
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link pcn.PCNProcessEntity#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

	/**
	 * Returns the value of the '<em><b>Back Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pcn.PCNProcessEntity#getNextEntity <em>Next Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Back Entity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Back Entity</em>' container reference.
	 * @see #setBackEntity(PCNProcessEntity)
	 * @see pcn.PcnPackage#getPCNProcessEntity_BackEntity()
	 * @see pcn.PCNProcessEntity#getNextEntity
	 * @model opposite="nextEntity" transient="false"
	 * @generated
	 */
	PCNProcessEntity getBackEntity();

	/**
	 * Sets the value of the '{@link pcn.PCNProcessEntity#getBackEntity <em>Back Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back Entity</em>' container reference.
	 * @see #getBackEntity()
	 * @generated
	 */
	void setBackEntity(PCNProcessEntity value);

	/**
	 * Returns the value of the '<em><b>Next Entity</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link pcn.PCNProcessEntity#getBackEntity <em>Back Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Entity</em>' containment reference.
	 * @see #setNextEntity(PCNProcessEntity)
	 * @see pcn.PcnPackage#getPCNProcessEntity_NextEntity()
	 * @see pcn.PCNProcessEntity#getBackEntity
	 * @model opposite="backEntity" containment="true"
	 * @generated
	 */
	PCNProcessEntity getNextEntity();

	/**
	 * Sets the value of the '{@link pcn.PCNProcessEntity#getNextEntity <em>Next Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Entity</em>' containment reference.
	 * @see #getNextEntity()
	 * @generated
	 */
	void setNextEntity(PCNProcessEntity value);

	/**
	 * Returns the value of the '<em><b>Left Direct Interactions</b></em>' containment reference list.
	 * The list contents are of type {@link pcn.PCNProcessStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Direct Interactions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Direct Interactions</em>' containment reference list.
	 * @see pcn.PcnPackage#getPCNProcessEntity_LeftDirectInteractions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCNProcessStep> getLeftDirectInteractions();

	/**
	 * Returns the value of the '<em><b>Left Surrogate Interactions</b></em>' containment reference list.
	 * The list contents are of type {@link pcn.PCNProcessStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Surrogate Interactions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Surrogate Interactions</em>' containment reference list.
	 * @see pcn.PcnPackage#getPCNProcessEntity_LeftSurrogateInteractions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCNProcessStep> getLeftSurrogateInteractions();

	/**
	 * Returns the value of the '<em><b>Center Independent Interactions Activities</b></em>' containment reference list.
	 * The list contents are of type {@link pcn.PCNProcessStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Center Independent Interactions Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center Independent Interactions Activities</em>' containment reference list.
	 * @see pcn.PcnPackage#getPCNProcessEntity_CenterIndependentInteractionsActivities()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCNProcessStep> getCenterIndependentInteractionsActivities();

	/**
	 * Returns the value of the '<em><b>Right Surrogate Interactions</b></em>' containment reference list.
	 * The list contents are of type {@link pcn.PCNProcessStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Surrogate Interactions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Surrogate Interactions</em>' containment reference list.
	 * @see pcn.PcnPackage#getPCNProcessEntity_RightSurrogateInteractions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCNProcessStep> getRightSurrogateInteractions();

	/**
	 * Returns the value of the '<em><b>Right Direct Interactions</b></em>' containment reference list.
	 * The list contents are of type {@link pcn.PCNProcessStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Direct Interactions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Direct Interactions</em>' containment reference list.
	 * @see pcn.PcnPackage#getPCNProcessEntity_RightDirectInteractions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCNProcessStep> getRightDirectInteractions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='leftDirectInteractionsActivities->includesAll(rightDirectInteractionsActivities)'"
	 * @generated
	 */
	EList<?> getDirectInteractions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='leftSurrogateInteractionsActivities->includesAll(rightSurrogateInteractionsActivities)'"
	 * @generated
	 */
	EList<?> getSurrogateInteractions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" many="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='independentInteractionsActivities'"
	 * @generated
	 */
	EList<?> getIndependentInteractios();

} // PCNProcessEntity
