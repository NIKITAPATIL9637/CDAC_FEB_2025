import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        String result = (num & 1) == 0 ? "Even" : "Odd";
        System.out.println("The number " + num + " is: " + result);
    }
}