import java.util.*;
public class Largest{
     public static void main(String args[]){
	 Scanner scn = new Scanner(System.in);
	 System.out.println("Enter the number: ");
	 int num1 = scn.nextInt();
	 int num2 = scn.nextInt();
	 int num3 = scn.nextInt();
	 
	 int result = (num1>num2) ? (num1>num3 ? num1:num3) : (num2>num3 ? num2:num3);
	 
	 System.out.println("The largest number is: " + result);
	 }
}