public class Main {
/* Error -->
 public static void main(String[] args) {
 String str = null;
 System.out.println(str.length());
 }
*/

/*
C:\Users\hp\Desktop\LogicBuilding\Day2\Assignment2\Snippet 13>java Main
Exception in thread "main" java.lang.
*/

//Corrected Code
public static void main(String[] args) {
    String str = "Nikita Patil";
       if (str != null) {
            System.out.println(str.length()); 
       } 
       else {
            System.out.println("String is null");
        }
    }

/* What exception is thrown? Why does it occur?
NullPointerException
 1. The variable str is assigned the value null, meaning it does not reference any valid String object.
 2. The length() method is called on str, but since str is null, it doesn't point to any actual String object. Therefore, Java   cannot call the length() method on a null reference.
 3. NullPointerException occurs because you are trying to invoke a method (length()) on a null object reference, which is illegal in Java.
*/
} 
