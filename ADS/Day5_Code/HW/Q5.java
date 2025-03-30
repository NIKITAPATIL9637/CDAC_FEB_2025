public class Q5{
	Node start;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	void deletionPostion(int pos){
		Node temp = start;
		//trverse
		for(int i=0; temp!=null && i<pos-1; i++){
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}

	void display(){
		Node n = start;
		while(n != null){
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	public static void main(String args[]){
		Q5 l1 = new Q5();
		l1.start = new Node(5);
		Node second = new Node(10);
		Node third = new Node(15);
		Node fourth = new Node(20);

        l1.start.next = second;
        second.next = third;
        third.next = fourth ;		
		
		l1.display();
		System.out.print("\n");
		
		l1.deletionPostion(2);
		l1.display();
	}
}