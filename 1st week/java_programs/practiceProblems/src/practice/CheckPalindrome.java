package practice;
import java.util.*;

public class CheckPalindrome {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String [] ar =new String[size];
		for(int i =0;i<size;i++) 
		{
			ar[i]=sc.next();
		}
		checkPalindrome(ar,size);
	}
	
	public static void checkPalindrome(String[] ar,int size)
	{
		StringBuffer sb=new StringBuffer();
		for(int j=0;j<size;j++)
		{
			String s1=ar[j];
			int l= s1.length()-1;
			String s2= s1.substring(0,1);
			if( s2.equals(s1.toString().substring(l)))
			{
				continue;
			}
			else
			{
				sb.append(s1).append(" ");
			}
		}
		System.out.println(sb);
	}
}
