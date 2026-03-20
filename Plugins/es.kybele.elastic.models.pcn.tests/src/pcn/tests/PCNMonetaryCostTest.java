/**
 */
package pcn.tests;

import junit.textui.TestRunner;

import pcn.PCNMonetaryCost;
import pcn.PcnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCN Monetary Cost</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNMonetaryCostTest extends PCNMonetaryTagTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCNMonetaryCostTest.class);
	}

	/**
	 * Constructs a new PCN Monetary Cost test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNMonetaryCostTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCN Monetary Cost test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCNMonetaryCost getFixture() {
		return (PCNMonetaryCost)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcnFactory.eINSTANCE.createPCNMonetaryCost());
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

} //PCNMonetaryCostTest
