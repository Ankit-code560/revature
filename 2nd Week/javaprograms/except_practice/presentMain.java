package except_practice;
import java.util.*;

public class presentMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String aadhar =sc.nextLine();
		String pan = sc.nextLine();
		businessMain b =new businessMain();
		try {
			if (b.isValidAdharCard(aadhar))
			{
				System.out.println("Aadhar VALID");
			}
		} catch (InvalidAadException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		try {
			if(b.isValidPan(pan)) {
				System.out.println("Pan VALID");
			}
			
		}catch(InvalidPanException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
