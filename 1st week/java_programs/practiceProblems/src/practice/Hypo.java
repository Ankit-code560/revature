package practice;

import java.util.*;
import java.math.*;

public class Hypo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter side A and side B of a Traingle :");
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		double c= Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
		System.out.println((int)c);

	}

}
