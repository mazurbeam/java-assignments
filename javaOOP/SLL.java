public class SLL {
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public SLL() {
		this.setHead(null);
	}
	
	public void add(int val) {
		Node newNode = new Node(val);
		if(this.getHead() == null) {
			this.setHead(newNode);
		} else {
			Node runner = this.getHead();
			while(runner.getNext() != null) {
				runner = runner.getNext();
			}
			runner.setNext(newNode);
		}
		
	}
	
	public Node remove() {
		Node runner = this.getHead();
		while(runner.getNext().getNext() != null) {
			runner = runner.getNext();
		}
		Node remove = runner.getNext();
		runner.setNext(null);
		return remove;
	}
	
	public void printValues() {
		Node runner = this.getHead();
		while(runner != null) {
			System.out.println(runner.getValue());
			runner = runner.getNext();
		}
	}
	
	
}