package attributs;

public class ReturnType {
	private IType type;
	private int size;
	private String code;
	
	public ReturnType(IType type, int size, String code) {
		this.type = type;
		this.size = size;
		this.code = code;
	}
	
	public ReturnType(IType type, String code) {
		this.type = type;
		size = 0;
		this.code = code;
	}
	
	public ReturnType(IType type) {
		this.type = type;
		size = 0;
		code = "";
	}
	
	public IType getType() {
		return type;
	}
	
	public int getSize() {
		return size;
	}
	
	public String getCode() {
		return code;
	}
}
