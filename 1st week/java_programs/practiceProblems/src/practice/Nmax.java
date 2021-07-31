package practice;
import java.util.Arrays;
import java.util.Scanner;

public class Nmax {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int max = sc.nextInt();
		int[] ar = new int[n];  
		for(int i =0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		findMax(ar,max,n);
	}	
		
	public static void findMax(int[] ar, int max,int n)	
	{
		Arrays.sort(ar);
		int temp[]= new int[n];
		int j=0;
		for(int i =0;i<n-1;i++)
		{
			if(ar[i]!=ar[i+1])
			{
				temp[j]=ar[i];
				j+=1;
			}
		}
		temp[j++]=ar[n-1];
		System.out.println(temp[max-1]);
	}
}
