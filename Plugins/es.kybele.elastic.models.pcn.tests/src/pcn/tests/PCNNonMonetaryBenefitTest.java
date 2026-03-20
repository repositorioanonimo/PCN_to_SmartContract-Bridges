/**
 */
package pcn.tests;

import junit.textui.TestRunner;

import pcn.PCNNonMonetaryBenefit;
import pcn.PcnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCN Non Monetary Benefit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNNonMonetaryBenefitTest extends PCNNonMonetaryTagTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCNNonMonetaryBenefitTest.class);
	}

	/**
	 * Constructs a new PCN Non Monetary Benefit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNNonMonetaryBenefitTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCN Non Monetary Benefit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCNNonMonetaryBenefit getFixture() {
		return (PCNNonMonetaryBenefit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcnFactory.eINSTANCE.createPCNNonMonetaryBenefit());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PCNNonMonetaryBenefitTest
