package practice;
import java.util.*;

public class Palind {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String sentence = sc.nextLine();
		modifyPalindrome(sentence);
		
		
	}
	public static void modifyPalindrome(String str) {
		String st[] = str.split(" ");
		for(int i =0;i<st.length;i++) {
			StringBuilder ab =new StringBuilder(st[i]);
			String s= ab.reverse().toString();
			if (s.equals(ab)) {
				System.out.println(st[i]);
			}
			else {
			System.out.print(ab.toString().trim()+" ");
			}
		}
	}
}
