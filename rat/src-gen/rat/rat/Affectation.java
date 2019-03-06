/**
 * generated by Xtext 2.16.0
 */
package rat.rat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affectation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rat.rat.Affectation#getNomAff <em>Nom Aff</em>}</li>
 *   <li>{@link rat.rat.Affectation#getE <em>E</em>}</li>
 * </ul>
 * </p>
 *
 * @see rat.rat.RatPackage#getAffectation()
 * @model
 * @generated
 */
public interface Affectation extends I
{
  /**
   * Returns the value of the '<em><b>Nom Aff</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nom Aff</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nom Aff</em>' attribute.
   * @see #setNomAff(String)
   * @see rat.rat.RatPackage#getAffectation_NomAff()
   * @model
   * @generated
   */
  String getNomAff();

  /**
   * Sets the value of the '{@link rat.rat.Affectation#getNomAff <em>Nom Aff</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nom Aff</em>' attribute.
   * @see #getNomAff()
   * @generated
   */
  void setNomAff(String value);

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference.
   * @see #setE(E)
   * @see rat.rat.RatPackage#getAffectation_E()
   * @model containment="true"
   * @generated
   */
  E getE();

  /**
   * Sets the value of the '{@link rat.rat.Affectation#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(E value);

} // Affectation
