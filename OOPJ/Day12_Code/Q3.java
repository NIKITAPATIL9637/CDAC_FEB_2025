public class Q3{
	public static void main(String args[]){
		try{
			int numbers[] = {10, 20, 30, 40, 50};
			int num = numbers[7];
			System.out.println("Accessing index 10: " + num);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Caught an ArrayIndexOutOfBoundsException: Index 7 does not exist in the array.");
		}
	}
}