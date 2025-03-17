public class Q1{
	public static void main(String args[]){
		try{
			String str = null;
			int length = str.length();
			System.out.println("The length of given string: " + length);
		}catch(NullPointerException e){
			System.out.println("Caught a NullPointerException: The string is null.");
		}
	}
}