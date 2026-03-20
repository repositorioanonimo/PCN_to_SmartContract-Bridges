package pcn.diagram.expressions;

import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.Variable;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.options.ParsingOptions;

import pcn.diagram.part.PcnDiagramEditorPlugin;

/**
 * @generated
 */
public class PcnOCLFactory {

	/**
	* @generated
	*/
	private final PcnAbstractExpression[] expressions;

	/**
	* @generated
	*/
	private final String[] expressionBodies;

	/**
	* @generated
	*/
	protected PcnOCLFactory() {
		this.expressions = new PcnAbstractExpression[6];
		this.expressionBodies = new String[] { "self.action <> \'\'", //$NON-NLS-1$
				"self.letter <> \'\'", //$NON-NLS-1$
				"self.number <> \'\'", //$NON-NLS-1$
				"self.tag <> \'\'", //$NON-NLS-1$
				"self.order <> \'\'", //$NON-NLS-1$
				"self.name <> \'\'", //$NON-NLS-1$
		};
	}

	/**
	* @generated
	*/
	private static PcnOCLFactory getInstance() {
		PcnOCLFactory instance = PcnDiagramEditorPlugin.getInstance().getPcnOCLFactory();
		if (instance == null) {
			PcnDiagramEditorPlugin.getInstance().setPcnOCLFactory(instance = new PcnOCLFactory());
		}
		return instance;
	}

	/**
	* @generated
	*/
	public static String getExpressionBody(int index) {
		return getInstance().expressionBodies[index];
	}

	/**
	* @generated
	*/
	public static PcnAbstractExpression getExpression(int index, EClassifier context,
			Map<String, EClassifier> environment) {
		PcnOCLFactory cached = getInstance();
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			cached.expressions[index] = getExpression(cached.expressionBodies[index], context,
					environment == null ? Collections.<String, EClassifier> emptyMap() : environment);
		}
		return cached.expressions[index];
	}

	/**
	* This is factory method, callers are responsible to keep reference to the return value if they want to reuse parsed expression
	* @generated
	*/
	public static PcnAbstractExpression getExpression(String body, EClassifier context,
			Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	* This method will become private in the next release
	* @generated
	*/
	public static PcnAbstractExpression getExpression(String body, EClassifier context) {
		return getExpression(body, context, Collections.<String, EClassifier> emptyMap());
	}

	/**
	* @generated
	*/
	private static class Expression extends PcnAbstractExpression {

		/**
		* @generated
		*/
		private final org.eclipse.ocl.ecore.OCL oclInstance;

		/**
		* @generated
		*/
		private OCLExpression oclExpression;

		/**
		* @generated
		*/
		public Expression(String body, EClassifier context, Map<String, EClassifier> environment) {
			super(body, context);
			oclInstance = org.eclipse.ocl.ecore.OCL.newInstance();
			initCustomEnv(oclInstance.getEnvironment(), environment);
			Helper oclHelper = oclInstance.createOCLHelper();
			oclHelper.setContext(context());
			try {
				oclExpression = oclHelper.createQuery(body());
				setStatus(IStatus.OK, null, null);
			} catch (ParserException e) {
				setStatus(IStatus.ERROR, e.getMessage(), e);
			}
		}

		/**
		* @generated
		*/
		@SuppressWarnings("rawtypes")
		protected Object doEvaluate(Object context, Map env) {
			if (oclExpression == null) {
				return null;
			}
			// on the first call, both evalEnvironment and extentMap are clear, for later we have finally, below.
			EvaluationEnvironment<?, ?, ?, ?, ?> evalEnv = oclInstance.getEvaluationEnvironment();
			// initialize environment
			for (Object nextKey : env.keySet()) {
				evalEnv.replace((String) nextKey, env.get(nextKey));
			}
			try {
				Object result = oclInstance.evaluate(context, oclExpression);
				return oclInstance.isInvalid(result) ? null : result;
			} finally {
				evalEnv.clear();
				oclInstance.setExtentMap(null); // clear allInstances cache, and get the oclInstance ready for the next call
			}
		}

		/**
		* @generated
		*/
		private static void initCustomEnv(Environment<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, ?, ?, ?> ecoreEnv,
				Map<String, EClassifier> environment) {
			// Use EObject as implicit root class for any object, to allow eContainer() and other EObject operations from OCL expressions
			ParsingOptions.setOption(ecoreEnv, ParsingOptions.implicitRootClass(ecoreEnv),
					EcorePackage.eINSTANCE.getEObject());
			for (String varName : environment.keySet()) {
				EClassifier varType = environment.get(varName);
				ecoreEnv.addElement(varName, createVar(ecoreEnv, varName, varType), false);
			}
		}

		/**
		* @generated
		*/
		private static Variable createVar(Environment<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ecoreEnv,
				String name, EClassifier type) {
			Variable var = EcoreFactory.eINSTANCE.createVariable();
			var.setName(name);
			var.setType(ecoreEnv.getUMLReflection().getOCLType(type));
			return var;
		}
	}
}
