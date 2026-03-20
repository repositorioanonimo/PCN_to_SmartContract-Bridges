/**
 */
package pcn.tests;

import junit.textui.TestRunner;

import pcn.PCNProbabilitiesTag;
import pcn.PcnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCN Probabilities Tag</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNProbabilitiesTagTest extends PCNTagTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCNProbabilitiesTagTest.class);
	}

	/**
	 * Constructs a new PCN Probabilities Tag test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNProbabilitiesTagTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCN Probabilities Tag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCNProbabilitiesTag getFixture() {
		return (PCNProbabilitiesTag)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcnFactory.eINSTANCE.createPCNProbabilitiesTag());
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

} //PCNProbabilitiesTagTest
