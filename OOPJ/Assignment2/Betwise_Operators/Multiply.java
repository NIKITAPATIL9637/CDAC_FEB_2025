import java.util.*;
public class Multiply{
   public static void main(String args[]){
   Scanner scn = new Scanner(System.in);
   System.out.print("Enter a number: ");
   int num = scn.nextInt();
    
   int result = multiplyBy8(num);
   
   System.out.println(num + " multiplied by 8 is: " + result);
   }
   
   public static int multiplyBy8(int n){
   return n << 3;
   }
   
}