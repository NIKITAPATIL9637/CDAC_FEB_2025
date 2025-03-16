import java.util.Stack;
public class StackReversed{
	public static void main(String args[]){
		String str = "Nikita";
		
		Stack<Character> stack = new Stack<>();
		
		for(char ch : str.toCharArray()){
			stack.push(ch);
		}
		
		StringBuilder reversed = new StringBuilder();
		
		while(!stack.isEmpty()){
			reversed.append(stack.pop());
		}
		
		System.out.println("Reversed string using stack: " + reversed.toString());
	}
}
