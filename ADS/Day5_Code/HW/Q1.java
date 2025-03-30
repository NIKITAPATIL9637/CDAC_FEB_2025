public class Q1{
	Node start;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	void insert(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = start;
		start = new_node;
	}
	
	void deletePosition(int position){
		if(start == null){
			System.out.print("Empty Linkedlis!");
			return;
		}
		Node temp = start;
		for(int i=0; temp!=null && i<position-1; i++){
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}
	
	void traverse(){
		Node temp = start;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print("null");
	}
	
	boolean search(int key){
		Node temp = start;
		while(temp != null){
			if(temp.data == key){
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	void display(){
			Node n = start;
			while(n != null){
				System.out.print(n.data + " ");
				n = n.next;
			}
	}
	
	public static void main(String args[]){
		Q1 l1 = new Q1();
		l1.start = new Node(5);
		Node second = new Node(10);
		Node third = new Node(20);
		Node fourth = new Node(30);
		
		l1.start.next = second;
		second.next = third;
		third.next = fourth;
		l1.display();
		
		l1.insert(15);
		System.out.print("\n");
		l1.display();
		
		l1.deletePosition(2);
		System.out.print("\n");
		l1.display();
		
		System.out.print("\n");
		l1.traverse();
		
		System.out.print("\n");
		System.out.print("Search 30: " + l1.search(30));
		
	}
}