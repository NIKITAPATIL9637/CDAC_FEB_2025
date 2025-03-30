class LinkedListDemo5{
	Node start;//starting point of the list
	static class Node{
		int data;//stores the value of node
		Node next;//reference stores the address of next node+
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
	
	//Insertion in between 2 node
	void insertAfter(Node prev_node, int new_data){
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	
	//Deletion of any node
	//prequisite condition list should be present
	
	void deleteNode(int key){
		//first node
		Node temp = start, prev=null;
		if(temp != null && temp.data == key){
			start = temp.next;
			return;
		}
		//between node
		while(temp != null && temp.data != key){
			prev = temp;
			temp = temp.next;
		}
		//last node
		if(temp == null){
			return;
		}
		prev.next = temp.next;
	}
	
	
	public static void main(String args[]){
		LinkedListDemo5 l1 = new LinkedListDemo5();
		
		l1.insert(100);
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		
		//l1.display();
		
		//l1.insertAfter(l1.start, 150);
		//l1.display();
		
		l1.deleteNode(20);
		l1.display();
	}
}