package streamm;

public class RestaurantMenu {
	//			Calculate total and print bill.
	//          Item Name          Price    Qty.    Line Total
	//          Line Total = Price * Qty.
	//          Bill Total = Total of Line Total + 5% tax;
	//          Items needs to be sorted based on Item Name.
	
	private String itemName;
	private double price;
	private int quantity;
	
	
	public RestaurantMenu(String itemName, double price,int quantity) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.quantity=quantity;

	}
	
	
	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item name" +itemName+" Price "+price+" Quantity "+quantity;
	}
	
	public static void printMenu(int i,RestaurantMenu mennu) {
		System.out.printf("%-4d %-16s %.2f \t%-4d %.2f\n", i, mennu.itemName,mennu.price,mennu.quantity,mennu.price*mennu.quantity);
	}
	
	
}
