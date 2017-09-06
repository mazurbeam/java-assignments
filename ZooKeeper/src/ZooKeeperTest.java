
public class ZooKeeperTest {

	public static void main(String[] args) {
		
		Gorilla testGorilla = new Gorilla();
		
		testGorilla.displayEnergy();
		
		testGorilla.throwSomething();
		testGorilla.throwSomething();
		testGorilla.throwSomething();

		testGorilla.displayEnergy();
		
		testGorilla.eatBananas();
		testGorilla.eatBananas();
		
		testGorilla.displayEnergy();
		
		testGorilla.climb();
		
		testGorilla.displayEnergy();
	}

}
