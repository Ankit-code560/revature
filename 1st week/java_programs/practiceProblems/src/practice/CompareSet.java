// Program to Compare Treeset

package practice;
import java.util.Scanner;
import java.util.TreeSet;
public class CompareSet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<String> ele = new TreeSet<String>();
		ele.add("j");
		ele.add("a");
		ele.add("v");
		ele.add("a");

		TreeSet<String> ele2 = new TreeSet<String>();
		ele2.add("j");
		ele2.add("a");
		ele2.add("v");
		ele2.add("a");
		System.out.println("Compares tree, if same returns TRUE");
		System.out.println(ele.equals(ele2));
		
		System.out.println("Enter element to remove from TREE 1, String is 'java'");
		String str= sc.nextLine();
		
		System.out.println("Compare tree, after removing a value from tree, returns False");
		ele.remove(str);
		System.out.println(ele.equals(ele2));
		
	}

}
