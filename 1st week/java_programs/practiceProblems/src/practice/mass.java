package practice;
import java.util.Scanner;
import java.math.*;
import java.math.BigDecimal;

public class mass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a  *  b^c");
		float a = sc.nextFloat();
		int b = sc.nextInt();
		int pow = sc.nextInt();
			
		double d = a * (Math.pow(b, pow));
		System.out.println(d);

	}

}
