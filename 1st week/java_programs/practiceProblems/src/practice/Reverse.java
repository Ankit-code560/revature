package practice;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(checkPalindrome(str));

	}
	public static String checkPalindrome(String str) {
		String ar[]=str.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < ar.length; i++) {
			sb.append(ar[i]).append(Character.toUpperCase(ar[i].charAt((ar[i].length()-1)))).append(" ");
		}
		return sb.toString().trim();
}
}