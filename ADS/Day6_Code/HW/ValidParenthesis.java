public class ValidParenthesis{
	class Node{
		char data;
		Node next;
		Node(char d){
			data = d;
			next = null;
		}
	}
	Node start;
	ValidParenthesis(){
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
			return '\0';//return a null character
		}
		char temp = start.data;
		start = start.next;
		return temp;
	}
	
	public static boolean isValidParenthesis(String expression){
		ValidParenthesis stack = new ValidParenthesis();
		
		for(char ch : expression.toCharArray()){
			if(ch == '(' || ch == '{' || ch == ']'){
				stack.push(ch);
			}else if(ch == ')' || ch == '}' || ch == ']'){
				if(stack.isEmpty()){
					return false; //No matching opening bracket
				}
				char top = stack.pop();
				if(!isMatchingPair(top, ch)){
					return false; //Mismatched brackets
				}
			}
		}
		return stack.isEmpty();//If stack is empty, parenthesis are valid
	}	
	private static boolean isMatchingPair(char open, char close){
		return (open == '(' && close == ')') ||
		       (open == '{' && close == '}') ||
			   (open == '[' && close == ']');
	}
	
	public static void main(String args[]){
		String expression1 = "{[()]}";
		System.out.println("Is the expression valid? " + isValidParenthesis(expression1));
		
		String expression2 = "{[(])}";
		System.out.println("Is the expression valid? " + isValidParenthesis(expression2));
	}
}