public class Q15{
	Node start;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	void removeDuplicates(){
		if(start == null){
			return;
		}
		Node current = start;
		while(current != null && current.next != null){
			if(current.data == current.next.data){
				current.next = current.next.next;
			} else{
				current = current.next;
			}
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
		Q15 l1 = new Q15();
		l1.start = new Node(10);
		Node second = new Node(20);
		Node third = new Node(40);
		Node fourth = new Node(40);
		Node fifth = new Node(50);

        l1.start.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;		
		
		l1.display();
		
		l1.removeDuplicates();
		System.out.print("List after removing duplicates: ");
        l1.display();
	}
}