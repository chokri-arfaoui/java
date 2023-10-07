public class TestBarista {

	public static void main(String[] args) {
		
//		items menu
		
		Item item1 = new Item("mocha",3.5);

        Item item2 = new Item("latte",4.5);

        Item item3 = new Item("drip coffe",2.5);

        Item item4 = new Item("capuccino",4.2);

     // create 2 orders for unspecified guests
        Order order1 = new Order();
        Order order2 = new Order();
        
        // create 3 orders with names
        Order order3 = new Order("John");
        Order order4 = new Order("Mark");
        Order order5 = new Order("Sandy");
        
//        order3.display();
        // add 2 items to each order
        order1.addItem(item2);
        order1.addItem(item3);
        
        order2.addItem(item1);
        order2.addItem(item4);
        
        order3.addItem(item4);
        order3.addItem(item3);
        
        order4.addItem(item1);
        order4.addItem(item2);
        
        // test getStatusMessage
        order2.setReady(true); 
        System.out.println(order2.getStatusMessage());
        
       
        
	}

}

