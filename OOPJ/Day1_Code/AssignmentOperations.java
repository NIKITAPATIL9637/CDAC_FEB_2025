import java.util.*;
public class AssignmentOperations{
    public static void main(String args[]){
	   
   	    int num1 = 20;
		int num2 = 20;
		
		int result;
		
		result = num1;
		System.out.println("After '=' assignment: " + result);
		
		result = result + num2;
		System.out.println("After '+=' assignment: " + result);
		
		result = result - num2;
		System.out.println("After '-=' assignment: " + result);
		
		result = result * num2;
		System.out.println("After '*=' assignment: " + result);
		
		if (num2 != 0) {
            result /= num2;
            System.out.println("After '/=' assignment: " + result);
        } else {
            System.out.println("Skipping '/=' assignment (division by zero not allowed).");
        }

        if (num2 != 0) {
            result %= num2;
            System.out.println("After '%=' assignment:  " + result);
        } else {
            System.out.println("Skipping '%=' assignment (modulus by zero not allowed).");
        }

		
	}
}