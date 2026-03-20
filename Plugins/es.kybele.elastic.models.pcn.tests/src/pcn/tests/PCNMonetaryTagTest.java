/**
 */
package pcn.tests;

import junit.textui.TestRunner;

import pcn.PCNMonetaryTag;
import pcn.PcnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCN Monetary Tag</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNMonetaryTagTest extends PCNTagTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCNMonetaryTagTest.class);
	}

	/**
	 * Constructs a new PCN Monetary Tag test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNMonetaryTagTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCN Monetary Tag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCNMonetaryTag getFixture() {
		return (PCNMonetaryTag)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcnFactory.eINSTANCE.createPCNMonetaryTag());
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

} //PCNMonetaryTagTest
