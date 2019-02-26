package exception;

public class NoDeclarationException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public NoDeclarationException(int ligne,String m){
		super ("Ligne "+ligne+" : La variable "+m+" est utilisée sans avoir été déclarée.");
	}

}
