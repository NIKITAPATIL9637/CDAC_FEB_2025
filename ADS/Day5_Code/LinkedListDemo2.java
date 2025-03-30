class LinkedListDemo2{
	Node start;//starting point of the list
	static class Node{
		int data;//stores the value of node
		Node next;//reference stores the address of next node
		
		public Node(int d){
		    data = d; //default value for node.data
			next = null;//next link to null 
		}
	}
	
	void display(){
		Node n = start;
		while(n != null){
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	public static void main(String args[]){
		LinkedListDemo2 l1 = new LinkedListDemo2();
		
		l1.start = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node fourth = new Node(40);
		
		l1.start.next = second;
		second.next = third;
		third.next = fourth;
		
		l1.display();
	}
}