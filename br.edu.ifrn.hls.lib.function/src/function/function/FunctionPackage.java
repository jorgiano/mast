/**
 */
package function.function;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see function.function.FunctionFactory
 * @model kind="package"
 * @generated
 */
public interface FunctionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "function";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ifrn.edu.br/hls/lib/Function/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "function";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionPackage eINSTANCE = function.function.impl.FunctionPackageImpl.init();

	/**
	 * The meta object id for the '{@link function.function.impl.FunctionsImpl <em>Functions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see function.function.impl.FunctionsImpl
	 * @see function.function.impl.FunctionPackageImpl#getFunctions()
	 * @generated
	 */
	int FUNCTIONS = 0;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS__FUNCTIONS = 0;

	/**
	 * The number of structural features of the '<em>Functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Functions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link function.function.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see function.function.impl.FunctionImpl
	 * @see function.function.impl.FunctionPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INPUTS = 1;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OUTPUTS = 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link function.function.impl.ComputingFunctionImpl <em>Computing Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see function.function.impl.ComputingFunctionImpl
	 * @see function.function.impl.FunctionPackageImpl#getComputingFunction()
	 * @generated
	 */
	int COMPUTING_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_FUNCTION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_FUNCTION__INPUTS = FUNCTION__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_FUNCTION__OUTPUTS = FUNCTION__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_FUNCTION__DEPENDENCY = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commutativity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_FUNCTION__COMMUTATIVITY = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Associativity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_FUNCTION__ASSOCIATIVITY = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Computing Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Computing Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link function.function.impl.MemoryAccessImpl <em>Memory Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see function.function.impl.MemoryAccessImpl
	 * @see function.function.impl.FunctionPackageImpl#getMemoryAccess()
	 * @generated
	 */
	int MEMORY_ACCESS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_ACCESS__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_ACCESS__INPUTS = FUNCTION__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_ACCESS__OUTPUTS = FUNCTION__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Io</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_ACCESS__IO = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Memory Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_ACCESS_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Memory Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_ACCESS_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link function.function.IOFlag <em>IO Flag</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see function.function.IOFlag
	 * @see function.function.impl.FunctionPackageImpl#getIOFlag()
	 * @generated
	 */
	int IO_FLAG = 4;

	/**
	 * The meta object id for the '{@link function.function.Dependency <em>Dependency</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see function.function.Dependency
	 * @see function.function.impl.FunctionPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 5;


	/**
	 * Returns the meta object for class '{@link function.function.Functions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functions</em>'.
	 * @see function.function.Functions
	 * @generated
	 */
	EClass getFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link function.function.Functions#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see function.function.Functions#getFunctions()
	 * @see #getFunctions()
	 * @generated
	 */
	EReference getFunctions_Functions();

	/**
	 * Returns the meta object for class '{@link function.function.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see function.function.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link function.function.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see function.function.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the attribute list '{@link function.function.Function#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Inputs</em>'.
	 * @see function.function.Function#getInputs()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Inputs();

	/**
	 * Returns the meta object for the attribute list '{@link function.function.Function#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Outputs</em>'.
	 * @see function.function.Function#getOutputs()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Outputs();

	/**
	 * Returns the meta object for class '{@link function.function.ComputingFunction <em>Computing Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Function</em>'.
	 * @see function.function.ComputingFunction
	 * @generated
	 */
	EClass getComputingFunction();

	/**
	 * Returns the meta object for the attribute '{@link function.function.ComputingFunction#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependency</em>'.
	 * @see function.function.ComputingFunction#getDependency()
	 * @see #getComputingFunction()
	 * @generated
	 */
	EAttribute getComputingFunction_Dependency();

	/**
	 * Returns the meta object for the attribute '{@link function.function.ComputingFunction#isCommutativity <em>Commutativity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commutativity</em>'.
	 * @see function.function.ComputingFunction#isCommutativity()
	 * @see #getComputingFunction()
	 * @generated
	 */
	EAttribute getComputingFunction_Commutativity();

	/**
	 * Returns the meta object for the attribute '{@link function.function.ComputingFunction#isAssociativity <em>Associativity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Associativity</em>'.
	 * @see function.function.ComputingFunction#isAssociativity()
	 * @see #getComputingFunction()
	 * @generated
	 */
	EAttribute getComputingFunction_Associativity();

	/**
	 * Returns the meta object for class '{@link function.function.MemoryAccess <em>Memory Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Access</em>'.
	 * @see function.function.MemoryAccess
	 * @generated
	 */
	EClass getMemoryAccess();

	/**
	 * Returns the meta object for the attribute '{@link function.function.MemoryAccess#getIo <em>Io</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Io</em>'.
	 * @see function.function.MemoryAccess#getIo()
	 * @see #getMemoryAccess()
	 * @generated
	 */
	EAttribute getMemoryAccess_Io();

	/**
	 * Returns the meta object for enum '{@link function.function.IOFlag <em>IO Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IO Flag</em>'.
	 * @see function.function.IOFlag
	 * @generated
	 */
	EEnum getIOFlag();

	/**
	 * Returns the meta object for enum '{@link function.function.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dependency</em>'.
	 * @see function.function.Dependency
	 * @generated
	 */
	EEnum getDependency();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FunctionFactory getFunctionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link function.function.impl.FunctionsImpl <em>Functions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see function.function.impl.FunctionsImpl
		 * @see function.function.impl.FunctionPackageImpl#getFunctions()
		 * @generated
		 */
		EClass FUNCTIONS = eINSTANCE.getFunctions();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONS__FUNCTIONS = eINSTANCE.getFunctions_Functions();

		/**
		 * The meta object literal for the '{@link function.function.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see function.function.impl.FunctionImpl
		 * @see function.function.impl.FunctionPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__INPUTS = eINSTANCE.getFunction_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__OUTPUTS = eINSTANCE.getFunction_Outputs();

		/**
		 * The meta object literal for the '{@link function.function.impl.ComputingFunctionImpl <em>Computing Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see function.function.impl.ComputingFunctionImpl
		 * @see function.function.impl.FunctionPackageImpl#getComputingFunction()
		 * @generated
		 */
		EClass COMPUTING_FUNCTION = eINSTANCE.getComputingFunction();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_FUNCTION__DEPENDENCY = eINSTANCE.getComputingFunction_Dependency();

		/**
		 * The meta object literal for the '<em><b>Commutativity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_FUNCTION__COMMUTATIVITY = eINSTANCE.getComputingFunction_Commutativity();

		/**
		 * The meta object literal for the '<em><b>Associativity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_FUNCTION__ASSOCIATIVITY = eINSTANCE.getComputingFunction_Associativity();

		/**
		 * The meta object literal for the '{@link function.function.impl.MemoryAccessImpl <em>Memory Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see function.function.impl.MemoryAccessImpl
		 * @see function.function.impl.FunctionPackageImpl#getMemoryAccess()
		 * @generated
		 */
		EClass MEMORY_ACCESS = eINSTANCE.getMemoryAccess();

		/**
		 * The meta object literal for the '<em><b>Io</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_ACCESS__IO = eINSTANCE.getMemoryAccess_Io();

		/**
		 * The meta object literal for the '{@link function.function.IOFlag <em>IO Flag</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see function.function.IOFlag
		 * @see function.function.impl.FunctionPackageImpl#getIOFlag()
		 * @generated
		 */
		EEnum IO_FLAG = eINSTANCE.getIOFlag();

		/**
		 * The meta object literal for the '{@link function.function.Dependency <em>Dependency</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see function.function.Dependency
		 * @see function.function.impl.FunctionPackageImpl#getDependency()
		 * @generated
		 */
		EEnum DEPENDENCY = eINSTANCE.getDependency();

	}

} //FunctionPackage
