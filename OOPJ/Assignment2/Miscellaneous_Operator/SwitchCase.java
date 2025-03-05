import java.util.*;
public class SwitchCase{
     public static void main(String args[]){
	 Scanner scn = new Scanner(System.in);
	 System.out.print("Enter a first number: ");
	 double num1 = scn.nextDouble();
	 
	 System.out.print("Enter an operator (+, -, *, /): ");
	 char operator = scn.next().charAt(0);
	 
	 System.out.print("Enter a second number : ");
	 double num2 = scn.nextDouble();
	 
	 double result = 0;
	 
	 switch(operator){
	     case '+': 
		        result = num1 + num2;
				break;
		 case '-':
		        result = num1 - num2;
				break;
		 case '*':
		        result = num1 * num2;
				break;
		 case '/':
		        if(num2 != 0)
				   result = num1 / num2;
				else{
				   System.out.println("Error! Division by zero is not allowed.");
                   return;				   
				}
				break;
		  default:
		        System.out.println("Invalid operator! Please enter +, -, *, or /."); 
	 }
	 System.out.println("Result: " + result);
	 }
}