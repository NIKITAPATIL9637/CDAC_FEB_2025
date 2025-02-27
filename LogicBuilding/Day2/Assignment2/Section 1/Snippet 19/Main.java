public class Main {
 /* Error --->
 public static void main(String[] args) {
 int a = 10;
 int b = 0;
 int result = a / b;
 System.out.println(result);
 }
 */

/* C:\Users\hp\Desktop\LogicBuilding\Day2\Assignment2\Snippet 19>java Main
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Main.main(Main.java:5)
*/

//Corrected Code
public static void main(String[] args) {
 int a = 10;
 int b = 0;
 
 if(b != 0){
    int result = a / b;
    System.out.println(result);
 }
 else{
 System.out.println("Arithmetic Exception!");
 }
}
/*
What runtime exception is thrown? Why does division by zero cause an issue in Java?
Arithmetic Exception
In Java, division by zero causes an issue because division by zero is mathematically undefined for integer types. 
*/
} 