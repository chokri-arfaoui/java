public class Mammal {
//	MEMBER VARIABLES
	protected int energyLevel;

	// 
//	empty constructor
	public Mammal() {
		super();
		this.energyLevel=100;
	}
	
//    overloading constructor
	public Mammal(int energyLevel) {
		super();
		this.energyLevel = energyLevel;
	}
	public int display () {
		System.out.println("Energy Level is = " +   this.energyLevel);
		return energyLevel;
	}
	
//SETTERS AND GETTERS
	public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}


}






