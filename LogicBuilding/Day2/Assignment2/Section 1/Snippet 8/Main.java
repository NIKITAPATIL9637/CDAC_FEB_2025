public class Main {
/* Error --> 
public static void main(String[] args) {
    System.out.println("Hello, World!"
 }
*/

/* C:\Users\hp\Desktop\LogicBuilding\Day2\Assignment2\Snippet 8>javac Main.java
Main.java:3: error: ')' expected
    System.out.println("Hello, World!"
                                      ^
1 error
*/

//Corrected Code
public static void main(String[] args) {
    System.out.println("Hello, World!");
 }

/*
How do they affect compilation?
In the line System.out.println("Hello, World!", the println method call is missing a closing parenthesis ) at the end.
Compilation Error: The Java compiler will not be able to compile this code because the method call is not correctly formed.
*/
} 
