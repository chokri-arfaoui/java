


public class Gorilla extends Mammal{
	
	
	public Gorilla(int energyLevel) {
		super(energyLevel);
		
	}
	
	public void throwSomeThihgs() {
		System.out.println("The Gorilla has throw somethings");
		setEnergyLevel(getEnergyLevel()-5);
		
	}
	public void eatBananas() {
		System.out.println("The Gorilla eat bananas");
		setEnergyLevel(getEnergyLevel()+10);
		
	}
	public void climb() {
		System.out.println("Gorilla has climbed a tree");
		setEnergyLevel(getEnergyLevel()-10);
		
	}
}