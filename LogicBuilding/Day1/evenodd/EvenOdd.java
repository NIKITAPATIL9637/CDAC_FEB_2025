import java.util.*;
public class EvenOdd{
   public static void main(String args[]){
     Scanner scn = new Scanner(System.in);
     System.out.print("Enter a number: ");
     int a = scn.nextInt();

     if(a % 2 == 0){
       System.out.println("The number "+ a + " is Even.");
     }  
     else{
       System.out.println("The number "+ a + " is Odd.");
     }   
       
   }
}