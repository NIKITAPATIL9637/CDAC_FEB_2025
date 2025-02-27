public class Main {
/*Error -->
 public static void main(String[] args) {
 while (true) {
 System.out.println("Infinite Loop");
 }
 }*/

/*
Infinite loop
*/

//Corrected Code
  public static void main(String[] args) {
    int counter = 0;
    while (counter < 5) {
         System.out.println("This loop will run 5 times");
         counter++;      }
  }

/*  How can you avoid infinite loops?
Using a Counter: You can use a counter that limits the number of iterations.
*/
} 
