package attributs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.impl.BasicEObjectImpl;

/** Hierarchical symbol table.
 * This implantation reuses HashMap but the only useable methods are:
 * <ul>
 *   <li>inserer</li>
 *   <li>chercherLocalement (in this table only)</li>
 *   <li>chercherGlobalement (in this table and recursively in the parent tables).</li>
 * </ul>
 *
 */
public class TDS extends HashMap<String, Info> {
	
	
	/** Table parente de la table courante */
    private TDS parente;
	
	/** Creation d'une TDS sans table mÃ¨re */
    public TDS() {
        this(null);
    }
	
	/** CrÃ©artion d'une TDS avec table parente */
    public TDS(TDS p) {
    	super();
        parente = p;
    }
	
    /** Returns the information associated with <code>name</code> in the local table
     * or <code>null</code> if not found.
     */
    public Info chercherLocalement(String name) {
        return get(name);
    }
	
    /** Returns the information associated with <code>name</code> in the local table
     * or recursively in the parent tables, or <code>null</code> if not found.
     */
    public Info chercherGlobalement(String name) {
        Info i = chercherLocalement(name);
        if (i == null)
			if (parente != null)
				return parente.chercherGlobalement(name);
        return i;
    }
	
    /** Inserts a <code>name</code> with its associated <code>info</code> in the local table.
     * Replaces the old information if the name was already present.
     */
    public void inserer(String name, Info info) {
        put(name, info);
    }
	
	/** Surcharge de la mÃ©thode d'affichage */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        Set<Map.Entry<String, Info>> s = entrySet();
        for (Map.Entry<String, Info> e : s){
            sb.append("; " + e.getKey() + " : " + e.getValue() + '\n');
			
        }
        return sb.toString();
    }
    
    /** renvoie la taille des variables local au bloc */
    public int getTailleBlocLocal(){
    	Set<String> cles = this.keySet();
    	int taille = 0;
    	for(String varlocale : cles){
    		Info i = this.get(varlocale);
    		if (i instanceof InfoVar){
    			taille += ((InfoVar)i).getType().getTaille();
    		}
    	}
    	return taille;
    }
}
