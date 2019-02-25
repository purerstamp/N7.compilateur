import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import rat.RatStandaloneSetup;


public class AnalyseSyntaxique {
	
	public static void main(String[] args) {
		//new RatStandaloneSetup().createInjectorAndDoEMFRegistration();

		RatStandaloneSetup.doSetup();
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(URI.createURI("./src-rat/testAffectation1.rat"), true);
		
		if(!resource.getErrors().isEmpty()){
			//Analyse syntaxique
			for(Diagnostic d : resource.getErrors()){
				System.out.println(d.toString());
			}
		}
	}
}