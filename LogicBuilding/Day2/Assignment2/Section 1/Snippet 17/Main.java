public class Main {
/* Error -->
public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = a ** b;
 System.out.println(result);
 }
*/

/* C:\Users\hp\Desktop\LogicBuilding\Day2\Assignment2\Snippet 17>javac Main.java
Main.java:5: error: illegal start of expression
 int result = a ** b;
                 ^
1 error
*/

// Corrected Code
public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = a * b;
 System.out.println(result);
 }

/*
Why is the ** operator not valid in Java?
In Java, the ** operator is not valid because it does not exist in the language's syntax. Java does not support the exponentiation operator ** like some other languages (e.g., Python or JavaScript).
*/
} 
