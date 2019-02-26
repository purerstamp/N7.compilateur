package attributs;

/** Information associée à une constante dans la table des symboles : son type et sa valeur. */
public class InfoConst implements Info {
	
    /** Le type de la constante.
     * Nécessairement entier dans la version simplifiée.
     */
    private TypeDeBase type;
	
    /** La valeur de la constante.
     * Nécessairement Integer dans la version simplifiée.
     */
    private Object valeur;
	
	/** Construit une information sur une constante
	 *@param t, le type de la constante
	 *@param valeur, la valeur de la constante
	 */
    public InfoConst(TypeDeBase t, Object valeur) {
        this.type = t;
        this.valeur = valeur;
    }
	
    /** Renvoie le type de la constante.
     * Nécessairement entier dans la version simplifiée.
     */
    public TypeDeBase getType() {
        return type;
    }
	
    /** Renvoie la valeur de la constante.
     * Nécessairement java.lang.Integer dans la version simplifiée.
     */
    public Object getValeur() {
        return valeur;
    }
	
	/** Positionne la valeur de la constante
	 */
    public void setValeur(Object valeur) {
        this.valeur = valeur;
    }
	
	/**
	 * Surchage de la methode toString, pour l'affichage
	 */
    public String toString() {
        return "CONST(type=" + type + ",val=" + valeur + ")";
    }
	
}
