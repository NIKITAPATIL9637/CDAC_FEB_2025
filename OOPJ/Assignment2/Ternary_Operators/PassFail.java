import java.util.*;
public class PassFail{
       public static void main(String args[]){
	   Scanner scn = new Scanner(System.in);
	   System.out.print("Enter a percentage: ");
	   int percentage = scn.nextInt();
	   String result = (percentage >= 40) ? "Pass" : "Fail";
	   
	   System.out.println(result);
	   }
}