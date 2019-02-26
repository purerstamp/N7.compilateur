package exception;

public class TypeException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public TypeException(int ligne, String m){
		super ("Ligne "+ligne+" : "+m);
	}
}
