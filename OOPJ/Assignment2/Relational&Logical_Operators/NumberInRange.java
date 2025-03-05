import java.util.*;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("Number is within range (20 to 50): " + (number >= 20 && number <= 50));
    }
}
