public class Main {
/* Error --> 
public static void main(String[] args) {
 double num = "Hello";
 System.out.println(num);
 }
*/

/*
C:\Users\hp\Desktop\LogicBuilding\Day2\Assignment2\Snipeet 14>javac Main.java
Main.java:3: error: incompatible types: String cannot be converted to double
 double num = "Hello";
*/

//Corrected Code
public static void main(String[] args) {
 String num = "Hello";
 System.out.println(num);
 }

/* Why does Java enforce data type constraints?
Java enforces data type constraints to provide several key benefits related to safety, performance, and clarity in programming. 
*/
}