package attributs;

/** Description des types.
 * Aux trois types de base (entier, booléen, rationnel), on ajoute le type erreur.
 *
 */
public class TypeDeBase implements IType{

	/** Nom du type */
    private String nom;
	/** Taille ncessaire en mmoire pour stocker les donnes de ce type */
    private int taille;
    
    public static TypeDeBase ENTIER = new TypeDeBase("entier",1);
    public static TypeDeBase BOOLEEN = new TypeDeBase("booleen",1);
    public static TypeDeBase RATIONEL = new TypeDeBase("rationel",2);
    public static TypeDeBase VOID =  new TypeDeBase("void",0);
    
	/** Construction d'un type  partir de son nom et sa taille */
    public TypeDeBase(String n, int t) {
        nom = n;
        taille = t;
    }
	
	/** Renvoie la taille du type */
    public int getTaille() {
        return taille;
    }
	
	/** Renvoie le nom du type */
    public String getNom() {
        return nom;
    }
	
    /** Renvoie vrai si les deux types sont compatibles. */
    public boolean estCompatible(TypeDeBase autre) {
        return (this.toString().equals(autre.toString()));
    }
	
	/** Surcharge de la mthode pour l'affichage */
    public String toString() {
        return "Type(" + nom + "," + taille + ")";
    }
}
