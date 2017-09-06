
public class Gorilla extends Mammal {
	
	// decreases energy by 5 and prints message that gorilla has thrown something
	public void throwSomething() {
		System.out.println("This gorilla threw something");
		int energy = this.getEnergyLevel()-5;
		this.setEnergyLevel(energy);
	}
	
	// prints out a message and increases energy by 10
	public void eatBananas() {
		System.out.println("This gorilla ate a bannana");
		this.setEnergyLevel(this.getEnergyLevel()+10);
	}
	
//	// prints out a message "gorilla has climbed a tree" and decreases energy by 10
	public void climb() {
		System.out.println("This gorilla climbed a tree");
		this.setEnergyLevel(this.getEnergyLevel()-10);
	}
}
