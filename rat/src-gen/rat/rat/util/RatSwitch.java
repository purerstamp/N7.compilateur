/**
 * generated by Xtext 2.16.0
 */
package rat.rat.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rat.rat.Affectation;
import rat.rat.Appel;
import rat.rat.Bloc;
import rat.rat.Conditionnelle;
import rat.rat.Constante;
import rat.rat.DP;
import rat.rat.Declaration;
import rat.rat.Denominateur;
import rat.rat.E;
import rat.rat.Entier;
import rat.rat.Fun;
import rat.rat.I;
import rat.rat.Identificateur;
import rat.rat.Numerateur;
import rat.rat.OpBin;
import rat.rat.Operande;
import rat.rat.Print;
import rat.rat.Prog;
import rat.rat.RatPackage;
import rat.rat.Rationnel;
import rat.rat.Tantque;
import rat.rat.Type;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see rat.rat.RatPackage
 * @generated
 */
public class RatSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RatPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RatSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RatPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RatPackage.PROG:
      {
        Prog prog = (Prog)theEObject;
        T result = caseProg(prog);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RatPackage.FUN:
      {
        Fun fun = (Fun)theEObject;
        T result = caseFun(fun);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RatPackage.BLOC:
      {
        Bloc bloc = (Bloc)theEObject;
        T result = caseBloc(bloc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RatPackage.I:
      {
        I i = (I)theEObject;
        T result = caseI(i);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RatPackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = caseI(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RatPackage.AFFECTATION:
      {
        Affectation affectation = (Affectation)theEObject;
        T result = caseAffectation(affectation);
        if (result == null) result = caseI(affectation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RatPackage.CONSTANTE:
      {
        Constante constante = (Constante)theEObject;
        T result = caseConstante(constante);
        if (result == null) result = caseI(constante);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RatPackage.PRINT:
      {
        Print print = (Print)theEObject;
        T result = casePrint(print);
        if (result == null) result = caseI(print);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RatPackage.CONDITIONNELLE:
      {
        Conditionnelle conditionnelle = (Conditionnelle)theEObject;
        T result = caseConditionnelle(conditionnelle);
        if (result == null) result = caseI(conditionnelle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RatPackage.TANTQUE:
      {
        Tantque tantque = (Tantque)theEObject;
        T result = caseTantque(tantque);
        if (result == null) result = caseI(tantque);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RatPackage.DP:
      {
        DP dp = (DP)theEObject;
        T result = caseDP(dp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RatPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RatPackage.E:
      {
        E e = (E)theEObject;
        T result = caseE(e);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RatPackage.APPEL:
      {
        Appel appel = (Appel)theEObject;
        T result = caseAppel(appel);
        if (result == null) result = caseE(appel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RatPackage.RATIONNEL:
      {
        Rationnel rationnel = (Rationnel)theEObject;
        T result = caseRationnel(rationnel);
        if (result == null) result = caseE(rationnel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RatPackage.NUMERATEUR:
      {
        Numerateur numerateur = (Numerateur)theEObject;
        T result = caseNumerateur(numerateur);
        if (result == null) result = caseE(numerateur);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RatPackage.DENOMINATEUR:
      {
        Denominateur denominateur = (Denominateur)theEObject;
        T result = caseDenominateur(denominateur);
        if (result == null) result = caseE(denominateur);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RatPackage.IDENTIFICATEUR:
      {
        Identificateur identificateur = (Identificateur)theEObject;
        T result = caseIdentificateur(identificateur);
        if (result == null) result = caseE(identificateur);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RatPackage.BOOLEAN:
      {
        rat.rat.Boolean boolean_ = (rat.rat.Boolean)theEObject;
        T result = caseBoolean(boolean_);
        if (result == null) result = caseE(boolean_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RatPackage.ENTIER:
      {
        Entier entier = (Entier)theEObject;
        T result = caseEntier(entier);
        if (result == null) result = caseE(entier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RatPackage.OP_BIN:
      {
        OpBin opBin = (OpBin)theEObject;
        T result = caseOpBin(opBin);
        if (result == null) result = caseE(opBin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RatPackage.OPERANDE:
      {
        Operande operande = (Operande)theEObject;
        T result = caseOperande(operande);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prog</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prog</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProg(Prog object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fun</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fun</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFun(Fun object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bloc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bloc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBloc(Bloc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>I</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>I</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseI(I object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaration(Declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Affectation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Affectation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAffectation(Affectation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constante</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constante</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstante(Constante object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Print</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Print</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrint(Print object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditionnelle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditionnelle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionnelle(Conditionnelle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tantque</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tantque</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTantque(Tantque object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDP(DP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>E</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>E</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseE(E object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Appel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Appel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAppel(Appel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rationnel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rationnel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRationnel(Rationnel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numerateur</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numerateur</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumerateur(Numerateur object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Denominateur</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Denominateur</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDenominateur(Denominateur object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Identificateur</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Identificateur</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdentificateur(Identificateur object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolean(rat.rat.Boolean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntier(Entier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Op Bin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Op Bin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOpBin(OpBin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operande</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operande</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperande(Operande object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RatSwitch
