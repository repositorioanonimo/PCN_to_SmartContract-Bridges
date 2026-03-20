/**
 */
package pcn.tests;

import junit.textui.TestRunner;

import pcn.PCNOutsourcedStep;
import pcn.PcnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCN Preparation Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNOutsourcedStepTest extends PCNRegularProcessStepTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCNOutsourcedStepTest.class);
	}

	/**
	 * Constructs a new PCN Outsourced Step test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNOutsourcedStepTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCN Outsourced Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCNOutsourcedStep getFixture() {
		return (PCNOutsourcedStep)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcnFactory.eINSTANCE.createPCNOutsourcedStep());
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

} //PCNOutsourcedStepTest
