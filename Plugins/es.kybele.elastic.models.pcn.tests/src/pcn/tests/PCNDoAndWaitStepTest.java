/**
 */
package pcn.tests;

import junit.textui.TestRunner;

import pcn.PCNDoAndWaitStep;
import pcn.PcnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCN Long Process Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNDoAndWaitStepTest extends PCNRegularProcessStepTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCNDoAndWaitStepTest.class);
	}

	/**
	 * Constructs a new PCN Do And Wait Step test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNDoAndWaitStepTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCN Do And Wait Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCNDoAndWaitStep getFixture() {
		return (PCNDoAndWaitStep)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcnFactory.eINSTANCE.createPCNDoAndWaitStep());
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

} //PCNDoAndWaitStepTest
