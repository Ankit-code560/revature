package chalenge;
import java.util.*;

public class CodeChallenge_1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any String");
		String str= sc.next();
		System.out.println(lovePalindromes(str));
	

	}
	
	public static String lovePalindromes(String str) {
		String result="Z";
		StringBuilder sb=new StringBuilder();
		if (!isPalindrome(str)) {
			String x= Character.toString(str.charAt(str.length()-1));

			System.out.printf("x is %s\n",x);
			sb.append(x).append(str);
			
			System.out.printf("\n%s\n",sb);
			if(sb.toString().equals(sb.reverse().toString())) {
				return x;
			}
			else
			{return result;}	
			
		}
		else {
			return Character.toString(str.charAt(str.length()-1));
		}
	}
	
	public static boolean isPalindrome(String str)
	{
		int l= str.length();
		boolean flag=true;
		for (int i=0;i<l;i++)
		{
			if (str.charAt(i)==str.charAt(l-1-i))
			{
				continue;
			}
			else {
				flag= false;
				break;
			}
		}
		return flag;
	}

}
