import java.util.*;
public class LargestThreeNumber{
   public static void main(String args[]){
     Scanner scn = new Scanner(System.in);
     System.out.print("Enter first number: ");
     int num1 = scn.nextInt();

     System.out.print("Enter second number: ");
     int num2 = scn.nextInt();

     System.out.print("Enter third number: ");
     int num3 = scn.nextInt();

     int largest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

     System.out.println("The largest number is " + largest + ".");
     
   }
}