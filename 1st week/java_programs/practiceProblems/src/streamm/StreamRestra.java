package streamm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class StreamRestra {

	public static void main(String[] args) {
		
		List<RestaurantMenu> restMenu = new ArrayList<>();
		restMenu.add(new RestaurantMenu ("Paneer Tadka",250.23,2));
		restMenu.add(new RestaurantMenu ("Dal fry",150.10,3));
		restMenu.add(new RestaurantMenu ("Biryani",300.75,1));
		restMenu.add(new RestaurantMenu ("Roti",20,22));
		restMenu.add(new RestaurantMenu ("Chicken handi",700.50,1));
		

		List<RestaurantMenu> sortedList = restMenu.stream()
		        .sorted(Comparator.comparing(RestaurantMenu::getItemName))
		        .collect(Collectors.toList());
		
		
		Double totalBill= sortedList.stream()
				.map(e -> e.getPrice()*e.getQuantity())
				.reduce(0.0d,(s,el)-> s+el);
		
		
		
		
		System.out.println("Customer Bill for Table No. 01\n");
		
		int i=0;
		System.out.println("===============================================");
		System.out.println("No   Name             Price    Qty.  Total ");
		System.out.println("===============================================");
		for( RestaurantMenu rest : sortedList) {
		i++;
		RestaurantMenu.printMenu(i,rest);
		
		
	}
		System.out.println("==============================================");
		System.out.print("Total Bill (including GST of 5% )is  ");
		System.out.printf("%.2f",(totalBill+(totalBill*0.05)));
		

	
	
	

}
}
