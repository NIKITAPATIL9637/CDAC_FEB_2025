public class DLLDemo1 {
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

    Node head;

    // Insert at the beginning
    void insertBeginning(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        new_node.prev = null;
        if (head != null) {
            head.prev = new_node;
        }
        head = new_node;
    }

    // Insert between two nodes
    void insertBetween(Node prev, int new_data) {
        if (prev == null || prev.next == null) {
            System.out.println("Invalid position for insertion");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev.next;
        prev.next = new_node;
        new_node.prev = prev;
        if (new_node.next != null) {
            new_node.next.prev = new_node;
        }
    }

    // Insert at the end
    void append(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = null;

        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new_node;
        new_node.prev = temp;
    }

    // Delete a node
    void deletion(Node d) {
        if (head == null || d == null) {
            return;
        }

        // If node to be deleted is the head node
        if (head == d) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        // Update next if node to be deleted is NOT the last node
        if (d.next != null) {
            d.next.prev = d.prev;
        }

        // Update prev if node to be deleted is NOT the first node
        if (d.prev != null) {
            d.prev.next = d.next;
        }
    }

    // Display function
    void display(Node n) {
        Node tail = null;
        System.out.println("Forward traversal: ");
        while (n != null) {
            System.out.print(n.data + " --->");
            tail = n;
            n = n.next;
        }
		
        System.out.println();

        System.out.println("Backward traversal: ");
        while (tail != null) {
            System.out.print(tail.data + " <--- ");
            tail = tail.prev;
        }
    }

    public static void main(String args[]) {
        DLLDemo1 d1 = new DLLDemo1();
        
        d1.insertBeginning(30);
        d1.insertBeginning(20);
        d1.insertBeginning(10);
        System.out.println("\nAfter inserting at beginning:");
        d1.display(d1.head);

        d1.insertBetween(d1.head.next, 25);
        System.out.println("\nAfter inserting in between:");
        d1.display(d1.head);

        d1.append(50);
        System.out.println("\nAfter appending:");
        d1.display(d1.head);

        d1.deletion(d1.head);
        System.out.println("\nAfter deleting head node:");
        d1.display(d1.head);
    }
}
