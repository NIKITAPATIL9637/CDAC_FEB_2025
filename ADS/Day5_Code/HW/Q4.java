public class Q4{
	Node start;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	void insertGivenPosition(int new_data, int position){
		Node new_node = new Node(new_data);
		//at start
		if(position == 0){
			new_node.next = start;
			start = new_node;
			return;
		}
		
		Node temp = start;
		int count = 0;
		
		//traverse
		while(temp != null && count < position-1){
			temp = temp.next;
			count++;
		}
		new_node.next = temp.next;
		temp.next = new_node;
	}
	
	void display(){
		Node n = start;
		while(n != null){
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	public static void main(String args[]){
		Q4 l1 = new Q4();
		l1.start = new Node(5);
		Node second = new Node(15);
		Node third = new Node(20);
		Node fourth = new Node(25);
		
		l1.start.next = second;
		second.next = third;
		third.next = fourth;
		
		l1.display();
		System.out.print("\n");
		
		l1.insertGivenPosition(20,1);
		System.out.print("After inserting 10 at position 1: ");
		l1.display();
	}
}