public class Q8{
	Node start;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	int length(){
		int count = 0;
		Node temp = start;
		while(temp != null){
			count++;
			temp = temp.next;
		}
		return count;
	}

	void display(){
		Node n = start;
		while(n != null){
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	public static void main(String args[]){
		Q8 l1 = new Q8();
		l1.start = new Node(5);
		Node second = new Node(10);
		Node third = new Node(15);
		Node fourth = new Node(20);

        l1.start.next = second;
        second.next = third;
        third.next = fourth ;		
		
		l1.display();
		System.out.print("\n");
		
		System.out.print("Get the length of linkedList: " + l1.length());
		
	}
}