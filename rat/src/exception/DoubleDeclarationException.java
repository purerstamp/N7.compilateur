package exception;

public class DoubleDeclarationException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public DoubleDeclarationException(int ligne, String m){
		super ("Ligne "+ligne+" : La variable "+m+" est déclarée deux fois dans le même bloc.");
	}

}
