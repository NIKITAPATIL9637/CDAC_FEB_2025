public class StringBuilderReversed{
	public static void main(String args[]){
		String str = "Nikita";
		
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println("Reversed string using stringBuilder method: " + reversed);
	}
}