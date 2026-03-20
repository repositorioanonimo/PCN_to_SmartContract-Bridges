/**
 */
package pcn;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pcn.PcnPackage
 * @generated
 */
public interface PcnFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcnFactory eINSTANCE = pcn.impl.PcnFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PCN Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Diagram</em>'.
	 * @generated
	 */
	PCNDiagram createPCNDiagram();

	/**
	 * Returns a new object of class '<em>PCN Process Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Process Entity</em>'.
	 * @generated
	 */
	PCNProcessEntity createPCNProcessEntity();

	/**
	 * Returns a new object of class '<em>PCN Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Reference</em>'.
	 * @generated
	 */
	PCNReference createPCNReference();

	/**
	 * Returns a new object of class '<em>PCN Standard Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Standard Step</em>'.
	 * @generated
	 */
	PCNStandardStep createPCNStandardStep();

	/**
	 * Returns a new object of class '<em>PCN Do And Wait Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Do And Wait Step</em>'.
	 * @generated
	 */
	PCNDoAndWaitStep createPCNDoAndWaitStep();

	/**
	 * Returns a new object of class '<em>PCN Wait Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Wait Step</em>'.
	 * @generated
	 */
	PCNWaitStep createPCNWaitStep();

	/**
	 * Returns a new object of class '<em>PCN Decision Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Decision Step</em>'.
	 * @generated
	 */
	PCNDecisionStep createPCNDecisionStep();

	/**
	 * Returns a new object of class '<em>PCN Monetary Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Monetary Tag</em>'.
	 * @generated
	 */
	PCNMonetaryTag createPCNMonetaryTag();

	/**
	 * Returns a new object of class '<em>PCN Monetary Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Monetary Benefit</em>'.
	 * @generated
	 */
	PCNMonetaryBenefit createPCNMonetaryBenefit();

	/**
	 * Returns a new object of class '<em>PCN Monetary Cost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Monetary Cost</em>'.
	 * @generated
	 */
	PCNMonetaryCost createPCNMonetaryCost();

	/**
	 * Returns a new object of class '<em>PCN Non Monetary Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Non Monetary Tag</em>'.
	 * @generated
	 */
	PCNNonMonetaryTag createPCNNonMonetaryTag();

	/**
	 * Returns a new object of class '<em>PCN Non Monetary Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Non Monetary Benefit</em>'.
	 * @generated
	 */
	PCNNonMonetaryBenefit createPCNNonMonetaryBenefit();

	/**
	 * Returns a new object of class '<em>PCN Non Monetary Cost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Non Monetary Cost</em>'.
	 * @generated
	 */
	PCNNonMonetaryCost createPCNNonMonetaryCost();

	/**
	 * Returns a new object of class '<em>PCN Innovation Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Innovation Step</em>'.
	 * @generated
	 */
	PCNInnovationStep createPCNInnovationStep();

	/**
	 * Returns a new object of class '<em>PCN Outsourced Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Outsourced Step</em>'.
	 * @generated
	 */
	PCNOutsourcedStep createPCNOutsourcedStep();

	/**
	 * Returns a new object of class '<em>PCN Regular Process Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Regular Process Step</em>'.
	 * @generated
	 */
	PCNRegularProcessStep createPCNRegularProcessStep();

	/**
	 * Returns a new object of class '<em>PCN Textual Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Textual Tag</em>'.
	 * @generated
	 */
	PCNTextualTag createPCNTextualTag();

	/**
	 * Returns a new object of class '<em>PCN Delay Time Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Delay Time Tag</em>'.
	 * @generated
	 */
	PCNDelayTimeTag createPCNDelayTimeTag();

	/**
	 * Returns a new object of class '<em>PCN Probabilities Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Probabilities Tag</em>'.
	 * @generated
	 */
	PCNProbabilitiesTag createPCNProbabilitiesTag();

	/**
	 * Returns a new object of class '<em>PCN Sync Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PCN Sync Tag</em>'.
	 * @generated
	 */
	PCNSyncTag createPCNSyncTag();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PcnPackage getPcnPackage();

} //PcnFactory
