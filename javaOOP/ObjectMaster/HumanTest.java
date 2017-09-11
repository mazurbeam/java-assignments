package ObjectMaster;

public class HumanTest {
	public static void main(String[] args) {
		Human testHuman1 = new Human("human1");
		Human testHuman2 = new Human("human2");
		
		System.out.println("testHuman1 attacks testHuman2");
		testHuman1.attack(testHuman2);
		
		System.out.println("testHuman2's health "+testHuman2.getHealth());
		
		Wizard wizardMerlin = new Wizard("Merlin");
		System.out.println(wizardMerlin.getName());
		System.out.println(wizardMerlin.getName()+"'s stealth " +wizardMerlin.getStealth());
		
		System.out.println("Wizards health " +wizardMerlin.getHealth());
		
		Samurai samuraiJack = new Samurai("Jack");
		
		System.out.println("Number of samurai: "+Samurai.getNumberOfSamurai());
	}
}
