package except_practice;

public class InvalidAadException extends Exception{
	public InvalidAadException() {
		super();
	}
	
	public InvalidAadException(String message) {
		super(message);
	}

}
