import java.util.*;
public class Calculator{
       public static void main(String args[]){
           Scanner scn = new Scanner(System.in);
           System.out.print("Enter first number: ");
           int num1 = scn.nextInt();
           
           System.out.print("Enter an operator (+, -, *, /): ");
           char operator = scn.next().charAt(0);
          
           System.out.print("Enter second number: ");
           int num2 = scn.nextInt();

           int result;
           boolean validOperation = true;

           switch(operator) {
             case '+': result = num1 + num2;
                       System.out.println("Result: " + result);
                       break;
             case '-': result = num1 - num2;
                       System.out.println("Result: " + result);
                       break;
             case '*': result = num1 * num2;
                       System.out.println("Result: " + result);
                       break;  

             case '/':
                       if(num2 == 0){
                             System.out.println("Error: Division by zero is not allowed.");
                       }
                       else{
                             result = num1 / num2;
                             System.out.println("Result: " + result);
                       }
                       break;
             default: validOperation = false;
                      System.out.println("Error: Invalid operator! Please use +, -, *, or /.");
           }
       }
}