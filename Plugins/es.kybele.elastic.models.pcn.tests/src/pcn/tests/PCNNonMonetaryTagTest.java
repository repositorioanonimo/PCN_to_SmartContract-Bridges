/**
 */
package pcn.tests;

import junit.textui.TestRunner;

import pcn.PCNNonMonetaryTag;
import pcn.PcnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCN Non Monetary Tag</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNNonMonetaryTagTest extends PCNTagTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCNNonMonetaryTagTest.class);
	}

	/**
	 * Constructs a new PCN Non Monetary Tag test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNNonMonetaryTagTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCN Non Monetary Tag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCNNonMonetaryTag getFixture() {
		return (PCNNonMonetaryTag)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcnFactory.eINSTANCE.createPCNNonMonetaryTag());
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

} //PCNNonMonetaryTagTest
