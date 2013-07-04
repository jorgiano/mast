/**
 */
package function.function.impl;

import function.function.ComputingFunction;
import function.function.Dependency;
import function.function.FunctionPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computing Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link function.function.impl.ComputingFunctionImpl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link function.function.impl.ComputingFunctionImpl#isCommutativity <em>Commutativity</em>}</li>
 *   <li>{@link function.function.impl.ComputingFunctionImpl#isAssociativity <em>Associativity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComputingFunctionImpl extends FunctionImpl implements ComputingFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputingFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionPackage.Literals.COMPUTING_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getDependency() {
		return (Dependency)eGet(FunctionPackage.Literals.COMPUTING_FUNCTION__DEPENDENCY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependency(Dependency newDependency) {
		eSet(FunctionPackage.Literals.COMPUTING_FUNCTION__DEPENDENCY, newDependency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCommutativity() {
		return (Boolean)eGet(FunctionPackage.Literals.COMPUTING_FUNCTION__COMMUTATIVITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommutativity(boolean newCommutativity) {
		eSet(FunctionPackage.Literals.COMPUTING_FUNCTION__COMMUTATIVITY, newCommutativity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAssociativity() {
		return (Boolean)eGet(FunctionPackage.Literals.COMPUTING_FUNCTION__ASSOCIATIVITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociativity(boolean newAssociativity) {
		eSet(FunctionPackage.Literals.COMPUTING_FUNCTION__ASSOCIATIVITY, newAssociativity);
	}

} //ComputingFunctionImpl
