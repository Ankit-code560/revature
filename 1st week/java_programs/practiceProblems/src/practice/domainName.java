package practice;

import java.util.Scanner;
import java.net.*;

public class domainName {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Wesbite URL :");
		String str = sc.nextLine();
		System.out.println(DOmain(str));
	}
		
		public static String  DOmain(String str) {
			
			int start= str.indexOf("//")+2;
			int end = str.indexOf("/", start);
			return (str.substring(start,end));
		}
		
		
		
	

}
