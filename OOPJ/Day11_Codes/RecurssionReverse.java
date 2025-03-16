public class RecurssionReverse{
	public static String reverse(String str){
		if(str.isEmpty()){
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}
	
	public static void main(String args[]){
		String str = "Nikita";
		String reversed = reverse(str);
		System.out.println("The reverse of string using the recurssion function: " + reversed);
	}
}