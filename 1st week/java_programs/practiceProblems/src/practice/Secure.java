package practice;
import java.util.*;

public class Secure {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Wesbite URL :");
		String url =  sc.nextLine();
		
		if(url.substring(0,5).equals("https"))
		{
			System.out.println(" It is Secure ");
		}
		else {
			System.out.println("It is NOT SECURE  ");
		}

	}

}
