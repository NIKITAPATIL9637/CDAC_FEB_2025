import java.util.ArrayDeque;
public class DequeReversed{
	public static void main(String args[]){
		String str = "Nikita";
		
		ArrayDeque<Character> deque = new ArrayDeque<>();
		
		for(char ch : str.toCharArray()){
			deque.push(ch);
		}
		
		StringBuilder reversed = new StringBuilder();
		
		while(!deque.isEmpty()){
			reversed.append(deque.pop());
		}
		
		System.out.println("Reversed string using deque: " + reversed.toString());
	}
}