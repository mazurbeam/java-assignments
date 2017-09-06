
public class BST {
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public BST() {
		this.setHead(null);
	}
	
	public void add(int value) {
		Node newNode = new Node(value);
		if(this.getHead()==null) {
			this.setHead(newNode);
		} else {
			Node runner = this.getHead();
			while(runner != null) {
				if(value<runner.getValue() && runner.getLeft() == null) {
					runner.setLeft(newNode);
					break;
				} else if(value < runner.getValue()){
					runner = runner.getLeft();
				} else if (value > runner.getValue() && runner.getRight() == null) {
					runner.setRight(newNode);
					break;
				} else if (value > runner.getValue()) {
					runner = runner.getRight();
				}
			}
		}	
	}
	
	public boolean contains(int value) {
		if(this.getHead()==null) {
			return false;
		}
		Node runner = this.getHead();
		while(runner != null) {
			if(runner.getValue() == value) {
				return true;
			} else if(value > runner.getValue()) {
				runner = runner.getRight();
			} else if (value < runner.getValue()) {
				runner = runner.getLeft();
			}
		}
		return false;
	}
}
