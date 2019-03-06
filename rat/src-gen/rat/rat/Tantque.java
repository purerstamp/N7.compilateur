/**
 * generated by Xtext 2.16.0
 */
package rat.rat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tantque</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rat.rat.Tantque#getCondt <em>Condt</em>}</li>
 *   <li>{@link rat.rat.Tantque#getBoucle <em>Boucle</em>}</li>
 * </ul>
 * </p>
 *
 * @see rat.rat.RatPackage#getTantque()
 * @model
 * @generated
 */
public interface Tantque extends I
{
  /**
   * Returns the value of the '<em><b>Condt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condt</em>' containment reference.
   * @see #setCondt(E)
   * @see rat.rat.RatPackage#getTantque_Condt()
   * @model containment="true"
   * @generated
   */
  E getCondt();

  /**
   * Sets the value of the '{@link rat.rat.Tantque#getCondt <em>Condt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condt</em>' containment reference.
   * @see #getCondt()
   * @generated
   */
  void setCondt(E value);

  /**
   * Returns the value of the '<em><b>Boucle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boucle</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boucle</em>' containment reference.
   * @see #setBoucle(Bloc)
   * @see rat.rat.RatPackage#getTantque_Boucle()
   * @model containment="true"
   * @generated
   */
  Bloc getBoucle();

  /**
   * Sets the value of the '{@link rat.rat.Tantque#getBoucle <em>Boucle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boucle</em>' containment reference.
   * @see #getBoucle()
   * @generated
   */
  void setBoucle(Bloc value);

} // Tantque
