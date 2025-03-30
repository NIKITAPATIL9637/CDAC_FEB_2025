class LinkedListDemo3{
	Node start;//starting point of the list
	static class Node{
		int data;//stores the value of node
		Node next;//reference stores the address of next node
		
		public Node(int d){
		    data = d; //default value for node.data
			next = null;//next link to null 
		}
	}
	
	//Display all the data values
	void display(){
		Node n = start;
		while(n != null){
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	//Insertion at the beging of given linkedlist
	void insert(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = start;
		start = new_node;
	}
	
	public static void main(String args[]){
		LinkedListDemo3 l1 = new LinkedListDemo3();
		
		l1.insert(100);
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		
		l1.display();
	}
}