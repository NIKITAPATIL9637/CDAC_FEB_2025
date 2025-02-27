public class Main {
 /* Error-->
 public static void main(String[] args) {
 int x = y + 10;
 System.out.println(x);
 }*/
 
 /*
 C:\Users\hp\Desktop\LogicBuilding\Day2\Assignment2\Snippet 6>javac Main.java
Main.java:3: error: cannot find symbol
 int x = y + 10;
         ^
  symbol:   variable y
  location: class Main
1 error
 */
 
 //Corrected Code
 public static void main(String[] args) {
 int y = 20;
 int x = y + 10;
 System.out.println(x);
 }

/*  Why must variables be declared?
    1. Type Safety
    2. Memory Allocation
    3. Readability and Maintainability
    4. Compile-time Checking
    5. Predictable Behavior
*/ 
} 
