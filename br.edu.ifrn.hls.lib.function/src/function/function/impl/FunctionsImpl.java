/**
 */
package function.function.impl;

import function.function.Function;
import function.function.FunctionPackage;
import function.function.Functions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link function.function.impl.FunctionsImpl#getFunctions <em>Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionsImpl extends CDOObjectImpl implements Functions {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionPackage.Literals.FUNCTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Function> getFunctions() {
		return (EList<Function>)eGet(FunctionPackage.Literals.FUNCTIONS__FUNCTIONS, true);
	}

} //FunctionsImpl
