package practice;
import java.util.*;

import java.util.Scanner;

public class Convert {
 
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer(sc.nextLine());
        convertOpposite(sb);
    }
    
    static void convertOpposite(StringBuffer str)
    {
        int ln = str.length()/2;
 
            Character c = str.charAt(ln);
            if (Character.isLowerCase(c)) {
                str.replace(ln, ln+1, Character.toUpperCase(c)+"");
                System.out.println(str);
                }
            			
            else {
                str.replace(0,1,
                            Character.toUpperCase(str.charAt(0)) + "");
                System.out.println(str);}
        
    }
}
