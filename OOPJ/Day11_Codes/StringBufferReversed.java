public class StringBufferReversed{
	public static void main(String args[]){
		String str = "Nikita";
		
		String reversed = new StringBuffer(str).reverse().toString();
		System.out.println("The reversed of string using the stringBuffer object: " + reversed);
	}
}