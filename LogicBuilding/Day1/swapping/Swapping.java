import java.util.*;
public class Swapping{
   public static void main(String args[]){
     Scanner scn = new Scanner(System.in);
     System.out.print("Enter first number: ");
     int a = scn.nextInt();
     System.out.print("Enter second number: ");
     int b = scn.nextInt();
     
     System.out.println("Before swapping: ");  
     System.out.println("First number: " + a);
     System.out.println("Second number: " + b);

     a = a+b;
     b = a-b;
     a = a-b;
     
     System.out.println("After swapping: ");  
     System.out.println("First number: " + a);
     System.out.println("Second number: " + b);         
  }
}