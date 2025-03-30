public class Q14 {
    Node start;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node mergedSortedLists(Node l1, Node l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.data < l2.data) {
            l1.next = mergedSortedLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergedSortedLists(l1, l2.next);
            return l2;
        }
    }

    void display(Node head) {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Q14 l1 = new Q14();
        l1.start = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        Node fourth = new Node(20);
        Node fifth = new Node(25);

        l1.start.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        Q14 l2 = new Q14();
        l2.start = new Node(10);
        Node sec = new Node(20);
        Node thi = new Node(30);
        Node fou = new Node(40);
        Node fif = new Node(50);

        l2.start.next = sec;
        sec.next = thi;
        thi.next = fou;
        fou.next = fif;

        System.out.print("List 1: ");
        l1.display(l1.start);

        System.out.print("List 2: ");
        l2.display(l2.start);

        Node mergedHead = mergedSortedLists(l1.start, l2.start);
        System.out.print("Merged Sorted List: ");
        new Q14().display(mergedHead);  // Use new instance to call display
    }
}
