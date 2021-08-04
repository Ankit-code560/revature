package maps;

import java.util.*;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;

public class taskOneTwo {


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String ss= sc.nextLine();
		String s = "hey hello everyone its getting complicated right that's why we should wrap up the tasks given on same day but we rarely stick to it sad";
		
		System.out.println(sortBasedOnVowels(s));
		System.out.println(sortBasedOnVowels(ss));
		countNoOfVowels(s);


	}
	
	public static String sortBasedOnVowels(String s) {
		Map<Integer, String> map= new TreeMap<>(Collections.reverseOrder());
		
		String ar[] = s.split(" ");
		Arrays.sort(ar, Collections.reverseOrder());
		int count=0;
		StringBuilder sb=new StringBuilder();
		for (String str :ar) {
			count=0;
			
			str.toLowerCase();
			int length = str.length();
			for(int i = 0; i < length; i++) 	{
				if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
					count++;
				}
				
			}

			if(map.containsKey(count)) {
				String temp=map.get(count);
				temp=temp+" "+str;
				map.put(count,temp);
			}else {
				map.put(count, str);
			}
		}
		
		
		
		for(Entry<Integer,String> e:map.entrySet()) {
			sb.append(e.getValue()).append(" ");
		}
			
		return sb.toString().trim();
		
	}
	
	public static void countNoOfVowels(String str) {
		String ar[]= str.split(" ");
		for( String ss : ar) {
			int a=0,e=0,i=0,o=0,u = 0;
			int count=0;
			ss.toLowerCase();
			if(ss.contains("a")) {a=1;}
			if(ss.contains("e")) {e=1;}
			if(ss.contains("i")) {i=1;}
			if(ss.contains("o")) {o=1;}
			if(ss.contains("u")) {u=1;}
			count=a+e+i+o+u;
						
			System.out.print(ss+"->"+count+"  ");
		
	}

}
}

