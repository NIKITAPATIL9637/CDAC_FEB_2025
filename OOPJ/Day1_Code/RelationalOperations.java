import java.util.*;
public class RelationalOperations{
     public static void main(String args[]){
	 Scanner scn = new Scanner(System.in);
	 System.out.println("Enter first integer: ");
	 int num1 = scn.nextInt();
	 
	 System.out.println("Enter second integer: ");
	 int num2 = scn.nextInt();
	 
	 System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));
	 System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));
	 System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));
	 System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));
	 System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));
	 System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
	 }
}