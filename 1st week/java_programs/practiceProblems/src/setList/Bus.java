package setList;

import java.util.Objects;

public class Bus implements Comparable<Bus> {

	private int id;
	private String providerName;
	private double cost;
	private float rating;
	private int quantity;
	private int availableSeats;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}

	public Bus(int id, String providerName, double cost, float rating,int quantity,int availableSeats) {
		super();
		this.id = id;
		this.providerName = providerName;
		this.cost = cost;
		this.rating = rating;
		this.quantity=quantity;
		this.availableSeats = availableSeats;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", providerName=" + providerName + ", cost=" + cost + ", rating=" + rating + ", Quanity "+ quantity+ ", Availabe Seats "+ availableSeats+"]";
	}

	@Override
	public int compareTo(Bus o) {
		Integer i1=this.id;
		Integer i2=o.id;
		return i1.compareTo(i2);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(rating);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bus other = (Bus) obj;
		return rating == other.rating;
	}
}

