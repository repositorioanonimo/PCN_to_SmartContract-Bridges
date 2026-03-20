/**
 */
package pcn.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pcn.PCNSyncTag;
import pcn.PcnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PCN Sync Tag</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PCNSyncTagTest extends TestCase {

	/**
	 * The fixture for this PCN Sync Tag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCNSyncTag fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PCNSyncTagTest.class);
	}

	/**
	 * Constructs a new PCN Sync Tag test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCNSyncTagTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this PCN Sync Tag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PCNSyncTag fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this PCN Sync Tag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCNSyncTag getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PcnFactory.eINSTANCE.createPCNSyncTag());
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

} //PCNSyncTagTest
