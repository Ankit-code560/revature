package inherit;
import java.util.*;

public class Area  {
	
	protected int height;
	protected int width;
	protected int side;
	protected int base1;
	protected int base2;
	
	void Area(int height,int width,int side,int base1,int base2)
	{this.height= height;
	this.width= width;
	this.side= side;
	this.base1= base1;
	this.base2= base2;
	}
	
	
	public void Display(int n) {
		System.out.println(n);
	}
	
	public int Rectangle(int height, int width) {
		return height* width;
	}
	
	public int Square(int side) {
		return side*side;
	}
	
	public int Trapezium(int base1, int base2,int height) {
		return ((base1*base2)/2)*height;
	}
}
