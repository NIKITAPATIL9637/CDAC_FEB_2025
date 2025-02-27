import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = scn.nextInt();
        
        int reversedNum = 0;
        int originalNum = number;

        // Reversing 
        while (number != 0) {
            int digit = number % 10;
            reversedNum = reversedNum * 10 + digit;
            number = number/10;
        }

        // Printing Result
        System.out.println("The reverse of " + originalNum + " is " + reversedNum + ".");
    }
}