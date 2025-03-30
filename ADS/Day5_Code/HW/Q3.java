public class Q3{
	Node start;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	void append(int new_data){
		Node new_node = new Node(new_data);
		if(start == null){
			start = new Node(new_data);
			return;
		}
		Node n = start;
		while(n.next != null){
			n = n.next;
		}
		n.next = new_node;
	}
	
	void display(){
		Node n = start;
		while(n != null){
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	public static void main(String args[]){
		Q3 l1 = new Q3();
		l1.start = new Node(5);
		Node second = new Node(15);
		Node third = new Node(20);
		Node fourth = new Node(25);
		
		l1.start.next = second;
		second.next = third;
		third.next = fourth;
		
		l1.display();
		System.out.print("\n");
		
		l1.append(30);
		l1.display();
	}
}