import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = scn.next().toLowerCase().charAt(0);
        
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u') ? "Vowel" : ((ch>='a' && ch<='z') ? "Consonant" : "Invalid Input");
        
        System.out.println("The character is: " + result);
    }
}
