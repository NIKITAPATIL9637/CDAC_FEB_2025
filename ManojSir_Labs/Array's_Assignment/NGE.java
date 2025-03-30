import java.util.*;
public class NGE{
	
	public static int[] findNGE(int arr[]){
		int n = arr.length;
		int result[] = new int[n];
		Stack<Integer> stack = new Stack<>();
		
		//traverse from right to left
		for(int i=n-1; i>=0; i--){
			//pop element from the stack if they are less than or equal to current element
			while(!stack.isEmpty() && stack.peek() <= arr[i]){
				stack.pop();
			}
			//If stack is empty, no greater elementother, top of the stack is the NGE
			result[i] = stack.isEmpty() ? -1 : stack.peek();
			
			//push the current element onto the stack
			stack.push(arr[i]);
		}
		return result; 
	}
	
	public static void main(String args[]){
		int arr[] = {4, 5, 2, 10, 8};
		int result[] = findNGE(arr);
		
		//Printing the result
		System.out.println(Arrays.toString(result));
	}
}