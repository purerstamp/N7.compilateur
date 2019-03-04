import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

//import analyseurs.*;
import attributs.TDS;
import rat.RatStandaloneSetup;
import rat.rat.Prog;


public class AnalyseSemantique {




	public static void main(String[] args) {
		try {
			analyseFichier("./src-rat/testDoubleDeclarationFonction.rat");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}


	public static void analyseFichier(String fichier) {
		RatStandaloneSetup.doSetup();
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(URI.createURI(fichier), true);

		if(!resource.getErrors().isEmpty()){
			//Analyse syntaxique
			for(Diagnostic d : resource.getErrors()){
				System.out.println(d.toString());
			}
		}
		else{
			// Analyse sémantique
			Prog prog = (Prog) resource.getContents().get(0);
			new Visiteur().doSwitch(prog);
		}
	}

}