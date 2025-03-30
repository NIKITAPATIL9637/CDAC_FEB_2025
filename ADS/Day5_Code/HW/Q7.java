public class Q7{
	Node start;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
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
		Q7 l1 = new Q7();
		l1.start = new Node(5);
		Node second = new Node(10);
		Node third = new Node(15);
		Node fourth = new Node(20);

        l1.start.next = second;
        second.next = third;
        third.next = fourth ;		
		
		l1.display();
		System.out.print("\n");
		
		System.out.print("Search 15: " + l1.search(15));
		
	}
}