package ObjectMaster;

public class Samurai extends Human {
	
	public Samurai(String newName) {
		super(newName);
		this.setHealth(200);
	}
	
	public void deathBlow(Human target) {
		target.setHealth(100);
		this.setHealth(this.getHealth()/2);
	}
	
	public void meditate() {
		this.setHealth(this.getHealth()+(this.getHealth()/2));
	}
	
}
