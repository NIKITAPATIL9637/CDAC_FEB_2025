public class Q4{
	public static void main(String args[]){
		try{
			String str = "Nikita";
			int number = Integer.parseInt(str);
			System.out.println("The converted number is: " + number);
		}catch(NumberFormatException e){
			System.out.println("Caught a NumberFormatException");
		}
	}
}