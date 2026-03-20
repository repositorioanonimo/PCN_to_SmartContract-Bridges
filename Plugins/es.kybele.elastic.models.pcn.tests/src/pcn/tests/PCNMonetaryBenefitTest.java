/**
 */
package pcn.tests;

import junit.textui.TestRunner;

import pcn.PCNMonetaryBenefit;
import pcn.PcnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCN Monetary Benefit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNMonetaryBenefitTest extends PCNMonetaryTagTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCNMonetaryBenefitTest.class);
	}

	/**
	 * Constructs a new PCN Monetary Benefit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNMonetaryBenefitTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCN Monetary Benefit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCNMonetaryBenefit getFixture() {
		return (PCNMonetaryBenefit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcnFactory.eINSTANCE.createPCNMonetaryBenefit());
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

} //PCNMonetaryBenefitTest
