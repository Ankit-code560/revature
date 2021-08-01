package practice;
import java.util.*;
public class removeFndLdigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String [] ar =new String[size];
		for(int i =0;i<size;i++) 
		{
			ar[i]=sc.next();
		}
		removeDigit(ar,size);
	}

	public static void removeDigit(String []ar, int size) {
		
		for(int i=0;i<size;i++)
		{
			int l=ar[i].length();
		
			if(ar[i].charAt(0)!=ar[i].charAt(l-1)) {
				System.out.printf(" %s ",ar[i]);
			}
		}
}
}
