import java.util.*;
public class Numbers{
    public static void main(String args[]){
	   Scanner scn = new Scanner(System.in);
	   System.out.println("Enter a number: ");
	   
	   int num = scn.nextInt();
	   
	   String result = (num == 0) ? "Zero" : (num > 0) ? "Positive" : "Negative";
	   
	   System.out.println("The number " + num + " is: " + result);
	}
}