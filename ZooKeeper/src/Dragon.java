
public class Dragon extends Mammal {

	public Dragon() {
		this.setEnergyLevel(300);
	}
	
	// prints dragon taking off and decreases energy by 50
	public void fly() {
		System.out.println("The dragon took off and started flying");
		this.setEnergyLevel(this.getEnergyLevel()-50);
	}
	
	// prints ate a human and increases energy by 25
	public void eatHumans() {
		System.out.println("The dragon ate some humans");
		this.setEnergyLevel(this.getEnergyLevel()+25);
	}
	
	public void attackTown() {
		System.out.println("The dragon set a town on fire");
		this.setEnergyLevel(this.getEnergyLevel()-100);
	}
}
