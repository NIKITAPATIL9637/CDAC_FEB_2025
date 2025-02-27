public class WrongInitializationForLoop {
/* Error --> Infinite Loop
 public static void main(String[] args) {
 for (int i = 10; i >= 0; i++) {
 System.out.println(i);
 }
 }*/

//Corrected Code
 public static void main(String[] args) {
 for (int i = 10; i >= 0; i--) {
 System.out.println(i);
 }
 }
} 
