import java.util.*;
public class Arithmetic{
   public static void main(String args[]){
     Scanner scn = new Scanner(System.in);
     System.out.print("Input first number: ");
     int a = scn.nextInt();

     System.out.print("Input second number: ");
     int b = scn.nextInt();

     int c = a+b;
     int d = a-b;
     int e = a*b;
     int f = a/b;
     int g = a%b;
     
     System.out.println("125 + 24 = " + c);
     System.out.println("125 - 24 = " + d);
     System.out.println("125 * 24 = " + e);
     System.out.println("125 / 24 = " + f);
     System.out.println("125 mod 24 = " + g);
     
   }
}