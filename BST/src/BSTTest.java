
public class BSTTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST testBST = new BST();
		
		testBST.add(3);
		testBST.add(2);
		testBST.add(5);
		testBST.add(4);
		
		Node testHead = testBST.getHead();
		System.out.println("Head value: "+testHead.getValue());
		
		Node left = testHead.getLeft();
		System.out.println("Left value" + left.getValue());
		
		Node right = testHead.getRight();
		System.out.println("Right value: "+right.getValue());
		
		System.out.println(right.getLeft().getValue());
		
		System.out.println(testBST.contains(3));
		System.out.println(testBST.contains(4));

	}

}
