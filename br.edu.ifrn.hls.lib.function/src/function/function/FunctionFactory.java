/**
 */
package function.function;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see function.function.FunctionPackage
 * @generated
 */
public interface FunctionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionFactory eINSTANCE = function.function.impl.FunctionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Functions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functions</em>'.
	 * @generated
	 */
	Functions createFunctions();

	/**
	 * Returns a new object of class '<em>Computing Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computing Function</em>'.
	 * @generated
	 */
	ComputingFunction createComputingFunction();

	/**
	 * Returns a new object of class '<em>Memory Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Access</em>'.
	 * @generated
	 */
	MemoryAccess createMemoryAccess();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FunctionPackage getFunctionPackage();

} //FunctionFactory
