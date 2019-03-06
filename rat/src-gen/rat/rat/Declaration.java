/**
 * generated by Xtext 2.16.0
 */
package rat.rat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rat.rat.Declaration#getType <em>Type</em>}</li>
 *   <li>{@link rat.rat.Declaration#getNomDecl <em>Nom Decl</em>}</li>
 *   <li>{@link rat.rat.Declaration#getE <em>E</em>}</li>
 * </ul>
 * </p>
 *
 * @see rat.rat.RatPackage#getDeclaration()
 * @model
 * @generated
 */
public interface Declaration extends I
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see rat.rat.RatPackage#getDeclaration_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link rat.rat.Declaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Nom Decl</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nom Decl</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nom Decl</em>' attribute.
   * @see #setNomDecl(String)
   * @see rat.rat.RatPackage#getDeclaration_NomDecl()
   * @model
   * @generated
   */
  String getNomDecl();

  /**
   * Sets the value of the '{@link rat.rat.Declaration#getNomDecl <em>Nom Decl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nom Decl</em>' attribute.
   * @see #getNomDecl()
   * @generated
   */
  void setNomDecl(String value);

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
   * @see rat.rat.RatPackage#getDeclaration_E()
   * @model containment="true"
   * @generated
   */
  E getE();

  /**
   * Sets the value of the '{@link rat.rat.Declaration#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(E value);

} // Declaration
