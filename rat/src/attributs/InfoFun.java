package attributs;

import java.util.*;

/** Information associée à une variable dans la table des symboles :
 * son type et son adresse (sa place en mémoire).
 */
public class InfoFun implements Info,IType {
	
    /** Le type de la fonction. */
    private TypeDeBase type;
	/** Types (et nombre) des parametres de la fonction */
	private Vector<TypeDeBase> typesParam;
	
	/** Construit une information associee a une fonction
	 *@param t, le type de retour de la fonction
	 *@param tp, le type des parametres de la fonction
	 */
    public InfoFun(TypeDeBase t, Vector<TypeDeBase> tp) {
        this.type = t;
        this.typesParam = tp;
    }
	
	/** Construit une information associee a une fonction
	 *@param tp, le type des parametres de la fonction
	 *@param t, le type de retour de la fonction
	 */
    public InfoFun(Vector<TypeDeBase> tp,TypeDeBase t) {
        this.type = t;
        this.typesParam = tp;
    }
	
    /** Renvoie le type de retour de la fonction. */
    public TypeDeBase getTypeRetour() {
        return type;
    } 
    
    public void setTypeRetour(TypeDeBase t) {
        this.type = t;
    }
	
	/** Renvoie le type des parametres de la fonction */
	public Vector<TypeDeBase> getTypesParametres(){
		return typesParam;
	}
	
	public void setTypesParametres(Vector<TypeDeBase> p){
		this.typesParam=p;
	}
	
	/** Renvoie la taille necessaire en memoire pour stocker le retour */
	public int getTailleRetour(){
		return this.type.getTaille();
	}
	
	/** Renvoie la taille necessaire en memoire pour stocker les parametres */
	public int getTailleParam(){
		int taille = 0;
		for(int i = 0 ; i <this.typesParam.size(); i ++){
			taille += this.typesParam.get(i).getTaille();
		}
		return taille;
	}
	
	/** Indique si un vecteur de type est compatible avec l'appel de la fonction */
    public boolean estCompatibleParam(Vector<TypeDeBase> vtreel){
		boolean ok = true;
		if( vtreel.size() != this.typesParam.size()){
			ok = false;
		}else{
			for(int i = 0 ; i < vtreel.size(); i++){
				ok = ok && (vtreel.get(i).estCompatible(this.typesParam.get(i)));
			}
		}
		return ok;
    }
	
	/** Surcharge de la methode toString, pour l'affichage */
    public String toString() {
		String tp = "";
		for(TypeDeBase t : this.typesParam){
			tp += " " + t;
		}
        return "FUN("+tp+"->" + type +")";
    }
	
	
	
}
