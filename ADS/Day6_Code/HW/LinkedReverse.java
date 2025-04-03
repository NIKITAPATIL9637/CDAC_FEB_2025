public class LinkedReverse{
	class Node {
		char data;
		Node next;
		Node(char d){
			data = d;
			next = null;
		}
	}
	Node start;
	LinkedReverse(){
		this.start = null;
	}
	boolean isEmpty(){
		return start == null;
	}
	void push(char new_data){
		Node new_node = new Node(new_data);
		new_node.next = start;
		start = new_node;
	}
	char pop(){
		if(isEmpty()){
			System.out.print("Stack underflow!");
		}
		char temp = start.data;
		start = start.next;
		return temp;
	}
	static void reverse(StringBuffer str){
		LinkedReverse stack = new LinkedReverse();
		int n = str.length();
		for(int i=0; i<n; i++){
			stack.push(str.charAt(i));
		}
		for(int i=0; i<n; i++){
			char ch = stack.pop();
			str.setCharAt(i,ch);
		}
	}
	public static void main(String args[]){
		StringBuffer s = new StringBuffer("NIKITA");
		reverse(s);
		System.out.print("Reverse= " + s);
	}
}