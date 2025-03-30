public class Q13{
	Node start;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	boolean hasCycle(){
		if(start == null){
			return false;
		}
		Node slow = start;
		Node fast = start;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast){
				return true; //Cycle detected
			}
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
		Q13 l1 = new Q13();
		l1.start = new Node(5);
		Node second = new Node(10);
		Node third = new Node(15);
		Node fourth = new Node(20);
		Node fifth = new Node(25);

        l1.start.next = second;
        second.next = third;
        third.next = fourth ;
        fourth.next = fifth;		
		
		l1.display();
		System.out.print("\n");
	
	    l1.start.next.next.next.next.next = l1.start.next;
		System.out.print("Does the linked list have a cycle? " + l1.hasCycle());
	}
}