/**
 */
package function.function.impl;

import function.function.FunctionPackage;
import function.function.IOFlag;
import function.function.MemoryAccess;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link function.function.impl.MemoryAccessImpl#getIo <em>Io</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemoryAccessImpl extends FunctionImpl implements MemoryAccess {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionPackage.Literals.MEMORY_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOFlag getIo() {
		return (IOFlag)eGet(FunctionPackage.Literals.MEMORY_ACCESS__IO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIo(IOFlag newIo) {
		eSet(FunctionPackage.Literals.MEMORY_ACCESS__IO, newIo);
	}

} //MemoryAccessImpl
