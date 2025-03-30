public class PowerFunction{
	public static int power(int exponent, int num){
		if(num == 0){
			return 1;
		}
		return exponent*power(exponent, num-1);
	}
	
	public static void main(String args[]){
		int num = 2;
		int exponent = 5;
		
		System.out.println(num + "^" + exponent + "=" + power(num,exponent));
	}
}