public class Q12{
	Node start;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	Node findMiddle(){
		if(start == null){
			return null;
		}
		Node slow = start;
		Node fast = start;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow; //slow is now at middle
	}

	void display(){
		Node n = start;
		while(n != null){
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	public static void main(String args[]){
		Q12 l1 = new Q12();
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
		
		Node middle = l1.findMiddle();
		System.out.print("Middle Node? " + (middle != null ? middle.data: "List is empty"));
	}
}