/**
 */
package pcn.tests;

import junit.textui.TestRunner;

import pcn.PCNNonMonetaryCost;
import pcn.PcnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCN Non Monetary Cost</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNNonMonetaryCostTest extends PCNNonMonetaryTagTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCNNonMonetaryCostTest.class);
	}

	/**
	 * Constructs a new PCN Non Monetary Cost test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNNonMonetaryCostTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCN Non Monetary Cost test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCNNonMonetaryCost getFixture() {
		return (PCNNonMonetaryCost)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcnFactory.eINSTANCE.createPCNNonMonetaryCost());
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

} //PCNNonMonetaryCostTest
