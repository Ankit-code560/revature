package inherit;
import java.util.*;

public class FindArea extends Area{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int s=sc.nextInt();
		int b1=sc.nextInt();
		int b2 = sc.nextInt();
		
		
		FindArea c= new FindArea();
		c.Area(h, w, s, b1, b2);
		int s1 =sc.nextInt();
		if (s1==1)
		 {
			int j =c.Rectangle(h, w);
			c.Display(j);
	
		 }
		if (s1==2)
		 {
			c.Display(c.Square(s));
		 }
		if (s1==3)
		 {
			c.Display(c.Trapezium(b1, b2, h));
		 }
		
	}

}
