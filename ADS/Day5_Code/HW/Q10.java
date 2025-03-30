public class Q10{
	Node start;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
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
		Q10 l1 = new Q10();
		l1.start = new Node(5);
		Node second = new Node(10);
		Node third = new Node(15);
		Node fourth = new Node(20);

        l1.start.next = second;
        second.next = third;
        third.next = fourth ;		
		
		l1.display();
	}
}