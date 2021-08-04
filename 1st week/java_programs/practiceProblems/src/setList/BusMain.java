package setList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class BusMain {

	public static void main(String[] args) {

		List<Bus> busList = new ArrayList<>();
		
		busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f,50,20));
		busList.add(new Bus(101, "Abc Travels", 1100.22, 2.4f,55,25));
		busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f,70,10));
		busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f,90,15));
		busList.add(new Bus(104, "Java Travels", 900.22, 4.3f,90,5));
		busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f,110,40));
		Set<Bus> busList1=new HashSet<Bus>(busList);
		printBusList(busList);
		printBusSet(busList1);

		Collections.sort(busList);

		System.out.println("\nPrinting Buses sorted based on id....");
		printBusList(busList);

		Collections.sort(busList, new BusNameComparator());
		System.out.println("\nPrinting Buses sorted based on provider name(Z-A)");
		printBusList(busList);
		
		Collections.sort(busList, (Bus b1, Bus b2) -> {
			Double d1 = b1.getCost();
			Double d2 = b2.getCost();
			return d1.compareTo(d2);
		});
		System.out.println("\nPrinting Buses sorted based on cost");
		printBusList(busList);
		
		Collections.sort(busList, (Bus b1, Bus b2) -> {
			Float f1=b1.getRating();
			Float f2=b2.getRating();
			int x=f2.compareTo(f1);
			if(x==0) {
				Double d1 = b1.getCost();
				Double d2 = b2.getCost();
				x=d1.compareTo(d2);
			}
			return x;
		});
		
		System.out.println("\nPrinting Buses sorted based on highest rating and if 2 or more have same rating then by lowest cost");
		printBusList(busList);
		
		Collections.sort(busList, (Bus b1, Bus b2) -> {
			Integer i1= b1.getQuantity();
			Integer i2= b2.getQuantity();
			
			int x= i1.compareTo(i2);
			if(x!=0) {
				Integer q1=b1.getAvailableSeats();
				Integer q2= b2.getAvailableSeats();
				x=q1.compareTo(q2);
			}
			return x;
		});
		System.out.println("\nPrinting Buses sorted based on Quantity of bus (Seater ) and Availability of Seats");
		printBusList(busList);
		
	}

	public static void printBusList(List<Bus> busList) {
		for (Bus b : busList) {
			System.out.println(b);
		}
	}
	
	public static void printBusSet(Set<Bus> busList1) {
		System.out.println("\n\nUsing SET ....\n\nRemoved DUPLICATES based on ratings ...");
		Iterator<Bus> i=busList1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("\n\n");
	}

}
