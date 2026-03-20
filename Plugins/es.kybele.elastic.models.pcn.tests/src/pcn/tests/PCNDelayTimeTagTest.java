/**
 */
package pcn.tests;

import junit.textui.TestRunner;

import pcn.PCNDelayTimeTag;
import pcn.PcnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCN Delay Time Tag</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNDelayTimeTagTest extends PCNTagTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCNDelayTimeTagTest.class);
	}

	/**
	 * Constructs a new PCN Delay Time Tag test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNDelayTimeTagTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PCN Delay Time Tag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PCNDelayTimeTag getFixture() {
		return (PCNDelayTimeTag)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcnFactory.eINSTANCE.createPCNDelayTimeTag());
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

} //PCNDelayTimeTagTest
