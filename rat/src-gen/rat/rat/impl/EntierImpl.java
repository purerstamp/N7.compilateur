/**
 * generated by Xtext 2.16.0
 */
package rat.rat.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rat.rat.Entier;
import rat.rat.RatPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rat.rat.impl.EntierImpl#getInt <em>Int</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntierImpl extends EImpl implements Entier
{
  /**
   * The default value of the '{@link #getInt() <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt()
   * @generated
   * @ordered
   */
  protected static final int INT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInt() <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt()
   * @generated
   * @ordered
   */
  protected int int_ = INT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntierImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RatPackage.Literals.ENTIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getInt()
  {
    return int_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInt(int newInt)
  {
    int oldInt = int_;
    int_ = newInt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RatPackage.ENTIER__INT, oldInt, int_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RatPackage.ENTIER__INT:
        return getInt();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RatPackage.ENTIER__INT:
        setInt((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RatPackage.ENTIER__INT:
        setInt(INT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RatPackage.ENTIER__INT:
        return int_ != INT_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (int: ");
    result.append(int_);
    result.append(')');
    return result.toString();
  }

} //EntierImpl
