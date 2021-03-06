/**
 * generated by Xtext 2.16.0
 */
package rat.rat.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rat.rat.E;
import rat.rat.Numerateur;
import rat.rat.RatPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numerateur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rat.rat.impl.NumerateurImpl#getValNum <em>Val Num</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumerateurImpl extends EImpl implements Numerateur
{
  /**
   * The cached value of the '{@link #getValNum() <em>Val Num</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValNum()
   * @generated
   * @ordered
   */
  protected E valNum;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumerateurImpl()
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
    return RatPackage.Literals.NUMERATEUR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public E getValNum()
  {
    return valNum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValNum(E newValNum, NotificationChain msgs)
  {
    E oldValNum = valNum;
    valNum = newValNum;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RatPackage.NUMERATEUR__VAL_NUM, oldValNum, newValNum);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValNum(E newValNum)
  {
    if (newValNum != valNum)
    {
      NotificationChain msgs = null;
      if (valNum != null)
        msgs = ((InternalEObject)valNum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RatPackage.NUMERATEUR__VAL_NUM, null, msgs);
      if (newValNum != null)
        msgs = ((InternalEObject)newValNum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RatPackage.NUMERATEUR__VAL_NUM, null, msgs);
      msgs = basicSetValNum(newValNum, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RatPackage.NUMERATEUR__VAL_NUM, newValNum, newValNum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RatPackage.NUMERATEUR__VAL_NUM:
        return basicSetValNum(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RatPackage.NUMERATEUR__VAL_NUM:
        return getValNum();
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
      case RatPackage.NUMERATEUR__VAL_NUM:
        setValNum((E)newValue);
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
      case RatPackage.NUMERATEUR__VAL_NUM:
        setValNum((E)null);
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
      case RatPackage.NUMERATEUR__VAL_NUM:
        return valNum != null;
    }
    return super.eIsSet(featureID);
  }

} //NumerateurImpl
