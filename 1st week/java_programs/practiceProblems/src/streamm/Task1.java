package streamm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Task1 {

	public static void main(String[] args) {
		// Find the minimum price in 'Xyz Travels'
		List<Bus> busList = new ArrayList<>();
		busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		busList.add(new Bus(101, "Abc Travels", 110.22, 2.4f));
		busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
		busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
		busList.add(new Bus(104, "Java Travels", 900.22, 4.3f));
		busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter travel name :  ");
		String str= sc.nextLine();
		
		
		List<Double> minPrice = busList.stream().filter(e -> e.getProviderName().equals(str))
				.map(e -> e.getCost()).sorted().collect(Collectors.toList());
		System.out.println(minPrice.get(0));
		
	}


}
