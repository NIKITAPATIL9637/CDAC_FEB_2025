public class Q6{
	Node start;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	void deleteByValue(int key){
		Node temp = start;
		Node prev = null;
		//Traverse
		while(temp!=null && temp.data != key){
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
	}

	void display(){
		Node n = start;
		while(n != null){
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	public static void main(String args[]){
		Q6 l1 = new Q6();
		l1.start = new Node(5);
		Node second = new Node(10);
		Node third = new Node(15);
		Node fourth = new Node(20);

        l1.start.next = second;
        second.next = third;
        third.next = fourth ;		
		
		l1.display();
		System.out.print("\n");
		
		l1.deleteByValue(15);
		l1.display();
	}
}