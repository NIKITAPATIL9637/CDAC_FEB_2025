public class ForReversed{
	public static void main(String args[]){
	String str = "Nikita";
	String reversed = "";
	
	for(int i=str.length()-1; i>=0; i--){
		reversed = reversed + str.charAt(i);
	}
	
	System.out.println("Reversed string using for loop: " + reversed);
    }
}