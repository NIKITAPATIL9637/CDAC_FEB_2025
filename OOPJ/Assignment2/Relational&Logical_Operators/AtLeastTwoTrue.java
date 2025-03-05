import java.util.*;

public class AtLeastTwoTrue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter first boolean value (true/false): ");
        boolean a = scn.nextBoolean();
        
        System.out.print("Enter second boolean value (true/false): ");
        boolean b = scn.nextBoolean();
        
        System.out.print("Enter third boolean value (true/false): ");
        boolean c = scn.nextBoolean();
        
        boolean result = (a && b) || (a && c) || (b && c);
        
        System.out.println("At least two values are true: " + result);
    }
}
