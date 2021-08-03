package except_practice;
import java.util.regex.*;



public class businessMain {
	
public boolean isValidPan(String pan) throws InvalidPanException{
		
		if(pan!=null && pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			return true;
		}else {
			throw new InvalidPanException("Entered PAN "+pan+" is INVALID");
		}
}
	
	public boolean isValidAdharCard(String no) throws InvalidAadException{
		if(no.matches("^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$")) {
			return true;
		}
		else {
			throw new InvalidAadException("Entered AADHAR number is INVALID");
		}
	}
	
}
