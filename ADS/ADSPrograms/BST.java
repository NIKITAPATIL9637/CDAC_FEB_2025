import java.util.Scanner;
public class BST{
    static class Node{
        int data; 
        Node left, right;
        Node(int d){
            data = d;
        }
    }
    
    static Node root;
    
    //Insertion of elements
    static Node insert(Node root, int key){
        if(root == null){
            return new Node(key);
        }
        if(key < root.data){
            root.left = insert(root.left, key);
        }else{
            root.right = insert(root.right, key);
        }
        return root;
    }
    
    //Deletion - right subtree smallest element replace
    static Node delete(Node root, int key){
        if(root == null){
            return null;
        }
        if(key < root.data){
            root.left = delete(root.left, key);
        }else if(key > root.data){
            root.right = delete(root.right, key);
        }else{
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }
    
    //Minimum value node in right subtree
    static int minValue(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }
    
    static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int i=0; i<n; i++){
		    String op = scn.next();
		    if(op.equals("insert")){
		        int key = scn.nextInt();
		        root = insert(root, key);
		    }else if(op.equals("delete")){
		        int key = scn.nextInt();
		        root = delete(root, key);
		    }else if(op.equals("inOrder")){
		        inOrder(root);
		    }
		}
		scn.close();
	}
}