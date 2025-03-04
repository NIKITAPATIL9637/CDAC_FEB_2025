import java.util.*;
public class LogicalOperations{
    public static void main(String args[]){
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the first number: ");
	int num = scn.nextInt();
	
	if(num%2 == 0 && num > 0){
	    System.out.println(num + " is postive and even number.");
	}
	else{
	    System.out.println(num + " is not postive and even number");
	}
	
	if(num%2 == 0 || num > 0){
	    System.out.println(num + " either the number is non-positive or it is odd.");
	}
	
	if(!(num%2 == 0 && num > 0)){
	    System.out.println(num + " number is not both positive and even.");
	}
	}
}