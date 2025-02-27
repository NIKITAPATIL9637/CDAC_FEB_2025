import java.util.*;

public class Counter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scn.nextInt();
       
        int count = countDigits(number);
        
        System.out.println("The number " + number + " has " + count + " digits.");
    }

    public static int countDigits(int num) {
        if (num == 0) {
            return 1; 
        }
        
        int count = 0;
        num = Math.abs(num);         
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}