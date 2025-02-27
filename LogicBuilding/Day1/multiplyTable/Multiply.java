import java.util.*;
public class Multiply{
   public static void main(String args[]){
     Scanner scn = new Scanner(System.in);
     System.out.print("Enter a number: ");
     int a = scn.nextInt();

     for(int i=1; i<=10; i++){

         System.out.println(a + "X" + i + "=" + a*i);     
     }      
   }
}