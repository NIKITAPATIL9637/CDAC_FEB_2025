import java.util.*;
public class Case{
     public static void main(String args[]){
	 Scanner scn = new Scanner(System.in);
	 System.out.print("Enter a character: ");
	 char ch = scn.next().charAt(0);
	 
	 String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase" 
	                :(ch >= 'a' && ch <= 'z') ? "Lowercase"
					: "Not a letter";
	 System.out.println("The character " + ch + " is: " + result);
	 }
}