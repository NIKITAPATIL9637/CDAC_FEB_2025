import java.util.*;
public class DivisibleBy3{
    public static void main(String args[]){
	Scanner scn = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int num = scn.nextInt();
	
	System.out.println("Is the number " + num + " is divisible by 3? --> " + isDivisibleBy3(num));
	}
	
	public static boolean isDivisibleBy3(int num){
	
	num = Math.abs(num);
	
	while(num >= 3){
	  num = num - 3;
	}
	return num == 0;
	}
}