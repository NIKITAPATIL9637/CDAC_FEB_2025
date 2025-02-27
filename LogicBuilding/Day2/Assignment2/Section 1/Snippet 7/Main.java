public class Main {
/*Error -->
 public static void main(String[] args) {
   int x = "Hello";
   System.out.println(x);
 }*/

/*Main.java:3: error: incompatible types: String cannot be converted to int
   int x = "Hello";
           ^
1 error
*/

//Corrected Code
public static void main(String[] args) {
   String x = "Hello";
   System.out.println(x);
 }

/* Why does Java enforce type safety?
 Java enforces type safety for several important reasons, primarily aimed at ensuring correctness, preventing errors, and improving the reliability of software.*/
} 