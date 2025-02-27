import java.util.*;

public class AverageNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Input first number: ");
        double num1 = scn.nextDouble();
        
        System.out.print("Input second number: ");
        double num2 = scn.nextDouble();
        
        System.out.print("Input third number: ");
        double num3 = scn.nextDouble();
        
        double average = (num1 + num2 + num3) / 3;
        
        System.out.println("The average is: " + average);
    }
}
