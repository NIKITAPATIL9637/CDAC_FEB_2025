class Stack{
	static final int MAX = 7;
	int top;
	int a[] = new int[MAX];
	
	Stack(){
		top = -1;
	}
	
	boolean isEmpty(){
		return top < 0;
	}
	
	boolean isFull(){
		return top > MAX-1;
	}
	
	boolean push(int x){
		if(top >= (MAX - 1)){
			System.out.println("Stck Overflow!");
			return false;
		}else{
			a[++top] = x;
			System.out.println(x + " Element pushed");
			return true;
		}
	}
	int pop(){
		if(top < 0){
			System.out.println("Stack Underflow");
			return 0;
		}else{
			int x = a[top--];
			return x;
		}
	}
	
	int peek(){
		if(top < 0){
			System.out.println("Stack underflow!");
			return 0;
		}else{
			int x = a[top];
			return x;
		}
	}
}
public class StackDemo{
	public static void main(String args[]){
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.push(70);
		
		System.out.println(s.peek());
		System.out.println(s.pop());
	}
}