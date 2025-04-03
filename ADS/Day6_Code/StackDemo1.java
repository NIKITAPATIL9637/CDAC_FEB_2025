class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}
public class StackDemo1{
	Node start;
	StackDemo1(){
		this.start = null;
	}
	
	boolean isEmpty(){
		return start == null;
	}
	
	void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = start;
		start = new_node;
	}
	
	void pop(){
		if(isEmpty()){
			System.out.print("Stack underflow!");
			return;
		}
		Node temp = start;
		start = start.next;
		temp.next = null;
		temp = null;
	}
	
	int peek(){
		if(isEmpty()){
			System.out.println("Stack underflow");
			return -1;
		}else{
                        return start.data;
		}
	}
	
	public static void main(String args[]){
		StackDemo1 s1 = new StackDemo1();
		s1.push(80);
		s1.push(20);
		s1.push(40);
		System.out.println(s1.peek());
		s1.pop();
	}
}