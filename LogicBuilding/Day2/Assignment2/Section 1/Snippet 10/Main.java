public class Main {
/* Error --> 
public void display() {
 System.out.println("No parameters");
 }
 public void display(int num) {
 System.out.println("With parameter: " + num);
 }
 public static void main(String[] args) {
 display();
 display(5);
 }*/

/* C:\Users\hp\Desktop\LogicBuilding\Day2\Assignment2\Snippet 10>javac Main.java
Main.java:9: error: non-static method display() cannot be referenced from a static context
 display();
 ^
Main.java:10: error: non-static method display(int) cannot be referenced from a static context
 display(5);
 ^
2 errors
*/

//Corrected Code
public void display() {
        System.out.println("No parameters");
    }

    public void display(int num) {
        System.out.println("With parameter: " + num);
    }

    public static void main(String[] args) {
        Main obj = new Main();  
        obj.display();  
        obj.display(5);  
    }
/*
Yes, method overloading is allowed in Java.

Key Points:
The method name must be the same.
The parameter list must be different (in number, type, or both).
Return type does not play a role in method overloading—it's based on parameters alone.
*/
} 