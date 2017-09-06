package ObjectMaster;

public class Ninja extends Human {
	
	public Ninja(String newName) {
		super(newName);
		this.setStealth(10);
	}
	
	public void steal(Human target) {
		target.setHealth(target.getHealth()-this.getStealth());
		this.setHealth(this.getHealth()+this.getStealth());
	}
	
	public void runaway() {
		this.setHealth(this.getHealth()-10);
	}
	
	
}
