/**
 */
package pcn.tests;

import junit.textui.TestRunner;

import pcn.PCNInnovationStep;
import pcn.PcnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCN Highlight Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNInnovationStepTest extends PCNRegularProcessStepTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCNInnovationStepTest.class);
	}

	/**
	 * Constructs a new PCN Innovation Step test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNInnovationStepTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCN Innovation Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCNInnovationStep getFixture() {
		return (PCNInnovationStep)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcnFactory.eINSTANCE.createPCNInnovationStep());
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

} //PCNInnovationStepTest
