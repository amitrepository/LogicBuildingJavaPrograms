package Exception;

public class CustomException extends Exception {
	
	String msg;
	
	public CustomException(String s) {
		this.msg=s;
	}
	
	public String toString() {
		return ("MyException message is Nice");
	}

}
