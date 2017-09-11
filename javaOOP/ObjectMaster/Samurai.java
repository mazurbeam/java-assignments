package ObjectMaster;

public class Samurai extends Human {
	private static int numberOfSamurai = 0;
	
	public Samurai(String newName) {
		super(newName);
		this.setHealth(200);
		numberOfSamurai++;
	}
	
	public void deathBlow(Human target) {
		target.setHealth(100);
		this.setHealth(this.getHealth()/2);
	}
	
	public void meditate() {
		this.setHealth(this.getHealth()+(this.getHealth()/2));
	}

	public static int getNumberOfSamurai() {
		return numberOfSamurai;
	}

	public static void setNumberOfSamurai(int numberOfSamurai) {
		Samurai.numberOfSamurai = numberOfSamurai;
	}
	
}
