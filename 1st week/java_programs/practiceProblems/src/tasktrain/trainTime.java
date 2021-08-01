package tasktrain;
import java.util.*;

public class trainTime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter train code : ");
		int code=sc.nextInt();
		
		if (code==12213) {
			durranto(code);
		}
		else {
			System.out.println("No train found");
		}
		

}
	public static void format() {	
		System.out.println("-------------------------------------------------------------");
		System.out.println("#   Code    Station           Arr.    Dep.");
		System.out.println("-------------------------------------------------------------");

	}
	
	
	public static void durranto(int code)
	{
		Train t=new Train(1,"YPR","Yasvantpur jr",00,23.40);
		System.out.printf("Yasvantpur Delhi Sarai Rohilla AC Duranto Express (%d) \n",code);
		format();
		
		Train [] train= {
				new Train(1,"YPR","Yasvantpur Jn",00,23.40),
				new Train(2,"GTL","Guntakal Jn",03.45,03.50),
				new Train(3,"SC","Secundrabad Jn",8.55,9.10),
				new Train(4,"BPQ","Ballarshah ",13.30,13.35),
				new Train(5,"HBJ","Habibganj",21.20,21.25),
				new Train(6,"JHS","Jhansi Jn",01.15,01.20),
				new Train(7,"DEE","Delhi S Rohilla",07.00,00.00)
		};
		for (Train trains :train) {
			trains.Display();
		}
	}
}
