package exception;

public class OperationInterditeException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public OperationInterditeException(int ligne, String m){
		super ("Ligne "+ligne+" : "+m);
	}
}
