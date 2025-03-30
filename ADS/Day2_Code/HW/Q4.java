import java.util.*;
public class Q4{
	public static String reverse(String string){
		if(string == null || string.length() <= 1){
			return string;
		}
		return reverse(string.substring(1)) + string.charAt(0);
	}
	
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String string = scn.nextLine();
		
		String reversed = reverse(string);
		
		System.out.println("Reversed of string: " + reversed);
	}
}