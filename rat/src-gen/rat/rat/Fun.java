/**
 * generated by Xtext 2.16.0
 */
package rat.rat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fun</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rat.rat.Fun#getType <em>Type</em>}</li>
 *   <li>{@link rat.rat.Fun#getNomFun <em>Nom Fun</em>}</li>
 *   <li>{@link rat.rat.Fun#getParam <em>Param</em>}</li>
 *   <li>{@link rat.rat.Fun#getIs <em>Is</em>}</li>
 *   <li>{@link rat.rat.Fun#getRetour <em>Retour</em>}</li>
 * </ul>
 * </p>
 *
 * @see rat.rat.RatPackage#getFun()
 * @model
 * @generated
 */
public interface Fun extends EObject
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
   * @see rat.rat.RatPackage#getFun_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link rat.rat.Fun#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Nom Fun</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nom Fun</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nom Fun</em>' attribute.
   * @see #setNomFun(String)
   * @see rat.rat.RatPackage#getFun_NomFun()
   * @model
   * @generated
   */
  String getNomFun();

  /**
   * Sets the value of the '{@link rat.rat.Fun#getNomFun <em>Nom Fun</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nom Fun</em>' attribute.
   * @see #getNomFun()
   * @generated
   */
  void setNomFun(String value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference list.
   * The list contents are of type {@link rat.rat.DP}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference list.
   * @see rat.rat.RatPackage#getFun_Param()
   * @model containment="true"
   * @generated
   */
  EList<DP> getParam();

  /**
   * Returns the value of the '<em><b>Is</b></em>' containment reference list.
   * The list contents are of type {@link rat.rat.I}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is</em>' containment reference list.
   * @see rat.rat.RatPackage#getFun_Is()
   * @model containment="true"
   * @generated
   */
  EList<I> getIs();

  /**
   * Returns the value of the '<em><b>Retour</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Retour</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Retour</em>' containment reference.
   * @see #setRetour(E)
   * @see rat.rat.RatPackage#getFun_Retour()
   * @model containment="true"
   * @generated
   */
  E getRetour();

  /**
   * Sets the value of the '{@link rat.rat.Fun#getRetour <em>Retour</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Retour</em>' containment reference.
   * @see #getRetour()
   * @generated
   */
  void setRetour(E value);

} // Fun
