public class Q11{
	Node start;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}

    void reverseAll(){
		Node prev = null;
		Node current = start;
		Node next = null;
		
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		start = prev;
	}

	void display(){
		Node n = start;
		while(n != null){
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	public static void main(String args[]){
		Q11 l1 = new Q11();
		l1.start = new Node(5);
		Node second = new Node(10);
		Node third = new Node(15);
		Node fourth = new Node(20);

        l1.start.next = second;
        second.next = third;
        third.next = fourth ;		
		
		l1.reverseAll();
		l1.display();
		
		
	}
}