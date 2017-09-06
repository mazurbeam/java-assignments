package ObjectMaster;

public class HumanTest {
	public static void main(String[] args) {
		Human testHuman1 = new Human();
		Human testHuman2 = new Human();
		
		System.out.println("testHuman1 attacks testHuman2");
		testHuman1.attack(testHuman2);
		
		System.out.println("testHuman2's health "+testHuman2.getHealth());
		
		
		
	}
}
