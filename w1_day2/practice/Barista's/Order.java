import java.util.ArrayList;

public class Order {
	// MEMBER VARIABLES
	private String name; // default value of null
	private boolean ready; // default value false
	private ArrayList<Item> items; // defaults to null


//   EMPTY CONSTRUCTOR
	public Order() {
		this.name = "Guest";
		this.items = new ArrayList<Item>();
	}
////	OVERLOADING CONSTRUCTER
	public Order(String name) {
		
		this.name = name;
        this.items = new ArrayList<Item>();
	}
	

//	

	// ORDER METHODS
	public void addItem(Item item) {
		items.add(item);
	}

	public String getStatusMessage() {
		if (ready = true) {
			return "Your order is ready";
		} else {
			return "Thank you for waiting. Your order will be ready soon.";
		}

	}

	public double getOrderTotal() {
		double sum = 0.0;
		for (Item item : items) {
			sum += item.getPrice();
		}
		return sum;
	}

	public void display() {
		System.out.println("----- Order Details -----");
		System.out.printf("Customer Name: %s\n", this.name);
		for (Item item : items) {
			System.out.println(item.getName() + " - " + item.getPrice());
		}
		System.out.printf("Total: $%.2f\n", getOrderTotal());
	}

//    GETERS AND SETERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isReady() {
		return ready;
	}

	public void setReady(boolean ready) {
		this.ready = ready;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	
}
