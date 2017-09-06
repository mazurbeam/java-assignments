package ObjectMaster;

public class Human {
	private int strength;
	private int stealth;
	private int intelligence;
	private int health;
	
	// strength 
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	// stealth
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	
	// intelligence
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	// health
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	public Human() {
		this.setIntelligence(3);
		this.setStrength(3);
		this.setStealth(3);
		this.setHealth(100);
	}
	
	public void attack(Human target) {
		target.setHealth(target.getHealth()-this.getStrength());
	}
}
