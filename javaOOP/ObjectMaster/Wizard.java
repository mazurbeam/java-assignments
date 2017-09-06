package ObjectMaster;

public class Wizard extends Human {
	public Wizard(String newName) {
		super(newName);
		this.setHealth(50);
		this.setIntelligence(8);
	}
	
	public void heal(Human target) {
		target.setHealth(target.getHealth()+this.getIntelligence());
	}
	
	public void fireball(Human target) {
		target.setHealth(target.getHealth()-this.getIntelligence()*3);
	}
}
