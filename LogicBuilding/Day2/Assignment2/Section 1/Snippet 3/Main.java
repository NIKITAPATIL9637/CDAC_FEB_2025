public class Main {
 /* Error --->
public static int main(String[] args) {
 System.out.println("Hello, World!");
 return 0;*/

/*C:\Users\hp\Desktop\LogicBuilding\Day2\Assignment2\Sinppet 3>java Main
Error: Main method must return a value of type void in class Main, please
define the main method as:
   public static void main(String[] args)

C:\Users\hp\Desktop\LogicBuilding\Day2\Assignment2\Sinppet 3>javac Main.java
Main.java:8: error: incompatible types: unexpected return value
 return 0;
*/
  
//Corrected Code
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }
//Void --> The void in the main method in Java indicates that this method does not return any value.
}