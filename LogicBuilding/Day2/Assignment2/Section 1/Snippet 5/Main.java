public class Main {
 /* No Error --->
 public static void main(String[] args) {
 System.out.println("Main method with String[] args");
 }
 public static void main(int[] args) {
 System.out.println("Overloaded main method with int[] args");
 }*/

 /*
  No Error
 */

 //Corrected Code
  public static void main(String[] args) {
     System.out.println("Main method with String[] args");
 } 
 public static void main(int[] args) {
 System.out.println("Overloaded main method with int[] args");
 }

/*  What do you observe?
Only one main method is executes at a one time whether if you define multiple also.*/
}