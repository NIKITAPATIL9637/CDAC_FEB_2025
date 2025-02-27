public class Main {
/*Error --->
 public static void main(String[] args) {
 static void displayMessage() {
 System.out.println("Message");
 }
 }
*/

/* C:\Users\hp\Desktop\LogicBuilding\Day2\Assignment2\Snippet 22>javac Main.java
Main.java:3: error: illegal start of expression
 static void displayMessage() {
 ^
Main.java:7: error: class, interface, or enum expected
}
^
2 errors
*/

//Corrected Code
  public static void main(String[] args) {
         displayMessage();
  }
    static void displayMessage() {
      System.out.println("Message");
  }

/* What syntax error occurs? Can a method be declared inside another method?
Methods in Java must be declared at the class level, not inside other methods like main.
*/
} 