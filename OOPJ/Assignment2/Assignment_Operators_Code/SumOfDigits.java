import java.util.*;
public class SumOfDigits{
    public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int num = scn.nextInt();
	
	int sum = 0;
	int temp = Math.abs(num);
	
	while(temp > 0){
	    sum = sum + temp % 10;
		temp = temp / 10;
	}
	System.out.println("Sum of digits: " + sum);
	}
}