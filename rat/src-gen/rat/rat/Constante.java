/**
 * generated by Xtext 2.16.0
 */
package rat.rat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rat.rat.Constante#getNomConst <em>Nom Const</em>}</li>
 *   <li>{@link rat.rat.Constante#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see rat.rat.RatPackage#getConstante()
 * @model
 * @generated
 */
public interface Constante extends I
{
  /**
   * Returns the value of the '<em><b>Nom Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nom Const</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nom Const</em>' attribute.
   * @see #setNomConst(String)
   * @see rat.rat.RatPackage#getConstante_NomConst()
   * @model
   * @generated
   */
  String getNomConst();

  /**
   * Sets the value of the '{@link rat.rat.Constante#getNomConst <em>Nom Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nom Const</em>' attribute.
   * @see #getNomConst()
   * @generated
   */
  void setNomConst(String value);

  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see #setVal(int)
   * @see rat.rat.RatPackage#getConstante_Val()
   * @model
   * @generated
   */
  int getVal();

  /**
   * Sets the value of the '{@link rat.rat.Constante#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(int value);

} // Constante
