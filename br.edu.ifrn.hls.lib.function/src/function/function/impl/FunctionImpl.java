/**
 */
package function.function.impl;

import function.function.Function;
import function.function.FunctionPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link function.function.impl.FunctionImpl#getName <em>Name</em>}</li>
 *   <li>{@link function.function.impl.FunctionImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link function.function.impl.FunctionImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FunctionImpl extends CDOObjectImpl implements Function {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionPackage.Literals.FUNCTION;
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
	public String getName() {
		return (String)eGet(FunctionPackage.Literals.FUNCTION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(FunctionPackage.Literals.FUNCTION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getInputs() {
		return (EList<String>)eGet(FunctionPackage.Literals.FUNCTION__INPUTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getOutputs() {
		return (EList<String>)eGet(FunctionPackage.Literals.FUNCTION__OUTPUTS, true);
	}

} //FunctionImpl
