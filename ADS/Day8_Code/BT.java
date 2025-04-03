class BT{
	Node root;
	static class Node{
		int data;
		Node left;
		Node right;
	
		Node(int d){
			data = d;
			left = null;
			right = null;
		}
    }
	
	BT(){
		root = null;//empty root node creation
	}
	
	BT(int d){
		root = new Node(d);
	}
	//root-lc-rc
	void preorder(Node n){
		if(n == null){
			return;
		}
		System.out.print(n.data + " ");
		preorder(n.left);
		preorder(n.right);
	}
	//lc-root-rc
	void inorder(Node n){
		if(n == null){
			return;
		}
		inorder(n.left);
		System.out.print(n.data + " ");
		inorder(n.right);
	}
	//lc-rc-root
	void postorder(Node n){
		if(n == null){
			return;
		}
		postorder(n.left);
		postorder(n.right);
		System.out.print(n.data + " ");
	}
	
	public static void main(String args[]){
		BT t1 = new BT();
		t1.root = new Node(20);
		t1.root.left = new Node(30);
		t1.root.right = new Node(40);
		t1.root.left.left = new Node(15);
		t1.root.left.right = new Node(27);
		t1.root.right.left = new Node(35);
		t1.root.right.right = new Node(45);
		
		System.out.print("Preorder: ");
        t1.preorder(t1.root);
        System.out.println();

        System.out.print("Inorder: ");
        t1.inorder(t1.root);
        System.out.println();

        System.out.print("Postorder: ");
        t1.postorder(t1.root);
        System.out.println();
	}
}	