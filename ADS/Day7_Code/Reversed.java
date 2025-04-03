public class Reversed {
    Node head;
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int d) {
            data = d;
            prev = null;
            next = null;
        }
    }
 
    // Insertion
    void insert(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        new_node.prev = null;
        if (head != null) {
            head.prev = new_node;
        }
        head = new_node;
    }
	
	//Reversing
	/*void reverse(){
		Node current = head;
		Node temp = null;
		
		while(current != null){
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev; // move to the next node
		}
		if(temp != null){
			head = temp.prev;
		}
	}*/
	
    // Display function
    void display() {
        Node tail = head;
        while (tail != null) {
            System.out.print(tail.data + " ");
            tail = tail.next;
        }
    }

    public static void main(String args[]) {
        Reversed d1 = new Reversed();
        
        d1.insert(50);
		d1.insert(40);
		d1.insert(30);
		d1.insert(20);
		d1.insert(10);
		
		System.out.print("Original list: ");
		d1.display();
	
	    System.out.print("\n");
	
		System.out.print("Reversing the list: ");
		d1.reverse();
		d1.display();
    }
}
