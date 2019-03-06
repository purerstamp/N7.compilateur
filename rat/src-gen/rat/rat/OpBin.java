/**
 * generated by Xtext 2.16.0
 */
package rat.rat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Bin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rat.rat.OpBin#getE1 <em>E1</em>}</li>
 *   <li>{@link rat.rat.OpBin#getOp <em>Op</em>}</li>
 *   <li>{@link rat.rat.OpBin#getE2 <em>E2</em>}</li>
 * </ul>
 * </p>
 *
 * @see rat.rat.RatPackage#getOpBin()
 * @model
 * @generated
 */
public interface OpBin extends E
{
  /**
   * Returns the value of the '<em><b>E1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E1</em>' containment reference.
   * @see #setE1(E)
   * @see rat.rat.RatPackage#getOpBin_E1()
   * @model containment="true"
   * @generated
   */
  E getE1();

  /**
   * Sets the value of the '{@link rat.rat.OpBin#getE1 <em>E1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E1</em>' containment reference.
   * @see #getE1()
   * @generated
   */
  void setE1(E value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' containment reference.
   * @see #setOp(Operande)
   * @see rat.rat.RatPackage#getOpBin_Op()
   * @model containment="true"
   * @generated
   */
  Operande getOp();

  /**
   * Sets the value of the '{@link rat.rat.OpBin#getOp <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' containment reference.
   * @see #getOp()
   * @generated
   */
  void setOp(Operande value);

  /**
   * Returns the value of the '<em><b>E2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E2</em>' containment reference.
   * @see #setE2(E)
   * @see rat.rat.RatPackage#getOpBin_E2()
   * @model containment="true"
   * @generated
   */
  E getE2();

  /**
   * Sets the value of the '{@link rat.rat.OpBin#getE2 <em>E2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E2</em>' containment reference.
   * @see #getE2()
   * @generated
   */
  void setE2(E value);

} // OpBin
