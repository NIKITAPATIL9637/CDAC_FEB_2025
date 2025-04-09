import java.util.Scanner;

public class BT {
    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
        }
    }

    // Builds the tree in pre-order using -1 as null marker
    static Node buildTree(Scanner scn) {
        if (!scn.hasNextInt()) return null;
        int val = scn.nextInt();
        if (val == -1) return null;

        Node node = new Node(val);
        node.left = buildTree(scn);
        node.right = buildTree(scn);
        return node;
    }

    static void preorder(Node n) {
        if (n == null) return;
        System.out.print(n.data + " ");
        preorder(n.left);
        preorder(n.right);
    }

    static void inorder(Node n) {
        if (n == null) return;
        inorder(n.left);
        System.out.print(n.data + " ");
        inorder(n.right);
    }

    static void postorder(Node n) {
        if (n == null) return;
        postorder(n.left);
        postorder(n.right);
        System.out.print(n.data + " ");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Node root = buildTree(scn);

        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
    }
}
