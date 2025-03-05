import java.util.*;
public class AbsoluteValue{
       public static void main(String args[]){
	   Scanner scn = new Scanner(System.in);
	   System.out.print("Enter a number: ");
	   int num = scn.nextInt();
	   
	   int absolute = (num < 0) ? -num : num;
	   
	   System.out.println("Absolute value of " + num + " is: " + absolute);
	   }
}