import java.util.*;

public class NaturalNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
