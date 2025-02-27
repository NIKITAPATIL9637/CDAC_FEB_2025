public class Main {
 /*Error -->
  public static void main() {
    System.out.println("Hello, World!");
 }*/

 /*
  C:\Users\hp\Desktop\LogicBuilding\Day2\Assignment2\Snippet 4>java Main
Error: Main method not found in class Main, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
*/

//Corrected Code
public static void main(String args[]) {
    System.out.println("Hello, World!");
 }

/*Why is String[] args needed?
The String[] args parameter in the main method is used to accept command-line arguments. When you run a Java application from the command line, you can pass arguments that can be accessed inside the program. These arguments are typically passed as a string array (String[]), where each element of the array corresponds to an argument.*/
} 
