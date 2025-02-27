public class Main {
/* Error --->
 public static void main(String[] args) {
 int num1 = 10;
 double num2 = 5.5;
 int result = num1 + num2;
 System.out.println(result);
 }
*/

/*
C:\Users\hp\Desktop\LogicBuilding\Day2\Assignment2\Snippet 15>javac Main.java
Main.java:5: error: incompatible types: possible lossy conversion from double to int
 int result = num1 + num2;
                   ^
1 error
*/

//Corrected Code
public static void main(String[] args) {
 int num1 = 10;
 double num2 = 5.5;
 int result = (int) (num1 + num2);
 System.out.println(result);
 }

/* What error occurs when compiling this code? How should you handle different data types
in operations?

Compilation Error
int result = num1 + num2; trying to assign the result of adding an int (num1) and a double (num2) to an int variable (result).
The expression num1 + num2 results in a double because adding an int and a double automatically promotes the int to double, and the result is of type double.
*/
}