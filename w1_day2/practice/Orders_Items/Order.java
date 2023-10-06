import java.util.ArrayList;

public class Order {
    
    // Members Variables
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items = new ArrayList<Item>();

//  


// geters and seters 
public String getName() {
    return this.name;
}
public void setName(String name) {
    this.name = name;
}
public double getTotal() {
    return this.total;
}
public void setTotal(double total) {
    this.total = total;
}
public boolean getReady() {
    return this.ready;
}
public void setReady(boolean ready) {
    this.ready = ready;
}
public ArrayList<Item> getItems() {
    return items;

}
    
}



