/**
 */
package cdfg.cdfg.impl;

import cdfg.cdfg.DFG;
import cdfg.cdfg.DFGArc;
import cdfg.cdfg.DFGNode;
import cdfg.cdfg.Jump;
import cdfg.cdfg.Sink;
import cdfg.cdfg.Source;
import cdfg.cdfg.cdfgPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DFG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cdfg.cdfg.impl.DFGImpl#getSource <em>Source</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.DFGImpl#getSink <em>Sink</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.DFGImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.DFGImpl#getArcs <em>Arcs</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.DFGImpl#getFrom <em>From</em>}</li>
 *   <li>{@link cdfg.cdfg.impl.DFGImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DFGImpl extends AnnotableImpl implements DFG {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DFGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return cdfgPackage.Literals.DFG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getSource() {
		return (Source)eGet(cdfgPackage.Literals.DFG__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Source newSource) {
		eSet(cdfgPackage.Literals.DFG__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sink getSink() {
		return (Sink)eGet(cdfgPackage.Literals.DFG__SINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSink(Sink newSink) {
		eSet(cdfgPackage.Literals.DFG__SINK, newSink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DFGNode> getNodes() {
		return (EList<DFGNode>)eGet(cdfgPackage.Literals.DFG__NODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DFGArc> getArcs() {
		return (EList<DFGArc>)eGet(cdfgPackage.Literals.DFG__ARCS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Jump> getFrom() {
		return (EList<Jump>)eGet(cdfgPackage.Literals.DFG__FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Jump> getTo() {
		return (EList<Jump>)eGet(cdfgPackage.Literals.DFG__TO, true);
	}

} //DFGImpl
