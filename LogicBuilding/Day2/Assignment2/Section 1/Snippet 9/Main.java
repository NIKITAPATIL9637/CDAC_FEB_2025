public class Main {
/* Error --> 
public static void main(String[] args) {
 int class = 10;
 System.out.println(class);
 }
*/
/* C:\Users\hp\Desktop\LogicBuilding\Day2\Assignment2\Snippet 9>javac Main.java
Main.java:3: error: not a statement
 int class = 10;
 ^
Main.java:3: error: ';' expected
 int class = 10;
    ^
Main.java:3: error: <identifier> expected
 int class = 10;
          ^
Main.java:4: error: <identifier> expected
 System.out.println(class);
                   ^
Main.java:4: error: illegal start of type
 System.out.println(class);
                    ^
Main.java:4: error: <identifier> expected
 System.out.println(class);
                         ^
Main.java:6: error: reached end of file while parsing
}
 ^
7 errors
*/

//Corrected Code
public static void main(String[] args) {
 int a = 10;
 System.out.println(a);
 }

/* Why can't reserved keywords be used as identifiers?
Reserved keywords in Java cannot be used as identifiers because they are predefined words that have specific meanings and functions within the language's syntax.
*/
}