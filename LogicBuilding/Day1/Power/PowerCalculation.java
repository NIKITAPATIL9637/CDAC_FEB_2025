import java.util.*;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Taking input for base
        System.out.print("Enter base number: ");
        int base = scn.nextInt();
 
        // Taking input for exponent
        System.out.print("Enter exponent number: ");
        int exponent = scn.nextInt();

        // Calculating 
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }

        // Printing result
        System.out.println(base + " raised to the power " + exponent + " is " + result + ".");
    }
}