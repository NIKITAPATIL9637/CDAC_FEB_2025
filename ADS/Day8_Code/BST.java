import java.util.*;

class BST {
    Node root;

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }

    BST() {
        root = null; // Empty root node creation
    }

    // Recursive insertion method
    Node insertion(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.data) {
            root.left = insertion(root.left, key);
        } else {
            root.right = insertion(root.right, key);
        }
        return root;
    }

    // Public method to insert a new key
    void insert(int key) {
        root = insertion(root, key);
    }

    // Deletion - right subtree smallest element replace
    Node deletion(Node root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.data) {
            root.left = deletion(root.left, key);
        } else if (key > root.data) {
            root.right = deletion(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);
            root.right = deletion(root.right, root.data);
        }
        return root;
    }

    // Find the minimum value node in the right subtree
    int minValue(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    // Public method to delete a key
    void delete(int key) {
        root = deletion(root, key);
    }

    // Inorder traversal: Left - Root - Right
    void inorder(Node n) {
        if (n == null) {
            return;
        }
        inorder(n.left);
        System.out.print(n.data + " ");
        inorder(n.right);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BST bst = new BST();
        int n = sc.nextInt(); // Number of operations

        for (int i = 0; i < n; i++) {
            String operation = sc.next();
            if (operation.equals("insert")) {
                int key = sc.nextInt();
                bst.insert(key);
            } else if (operation.equals("delete")) {
                int key = sc.nextInt();
                bst.delete(key);
            } else if (operation.equals("inorder")) {
                bst.inorder(bst.root);
                System.out.println();
            }
        }
        sc.close();
    }
}
