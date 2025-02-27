public class Main {
/* Error --->  
public static void main(String[] args) {
 int value = 2;
 switch(value) {
 case 1:
 System.out.println("Value is 1");
 case 2:
 System.out.println("Value is 2");
 case 3:
 System.out.println("Value is 3");
 default:
 System.out.println("Default case");
 }
 }*/

/*C:\Users\hp\Desktop\LogicBuilding\Day2\Assignment2\Snippet 23>javac Main.java
Main.java:1: error: class Confusion is public, should be declared in a file named Confusion.java
public class Confusion {
       ^
1 error
*/

//Corrected Code
 public static void main(String[] args) {
 int value = 2;
 switch(value) {
 case 1:
 System.out.println("Value is 1");
 case 2:
 System.out.println("Value is 2");
 case 3:
 System.out.println("Value is 3");
 break;
 default:
 System.out.println("Default case");
 break;
 }
}

/* Why does the default case print after "Value is 2"? How can you prevent
the program from executing the default case? 


*/ 
} 
