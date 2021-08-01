package practice;
import java.util.*;

public class checkPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int []ar=new int[size];
		for(int i=0;i<size;i++) {
			ar[i]=sc.nextInt();
		}
		
		checkPrime(ar,size);
	}
	
	public static void checkPrime(int[]ar ,int size) {
		int count=0;
		for(int i=0;i<size;i++) {
			for(int j=2;j<ar[i]/2;j++) {
				if( ar[i]%j==0)
				{count++;
				break;
				}
		}
			if(count ==0) {
				System.out.println(ar[i]);
			}
		}
	}

}
