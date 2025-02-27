public class LoopVariableScope {
/* Error -->
 public static void main(String[] args) {
 for (int i = 0; i < 5; i++) {
 int x = i * 2;
 }
 System.out.println(x); // Error: 'x' is not accessible here
 }*/

/* C:\Users\hp\Desktop\LogicBuilding\Day3\Snippet12>javac LoopVariableScope.java
LoopVariableScope.java:6: error: cannot find symbol
 System.out.println(x); // Error: 'x' is not accessible here
                    ^
  symbol:   variable x
  location: class LoopVariableScope
1 error
*/

//Why does the variable 'x' cause a compilation error? How does scope --> Because SOP Statement outside the for loop

// Corrected Code
public static void main(String[] args) {
 
 for (int i = 0; i < 5; i++) {
 int x = i * 2;
 System.out.println(x);
 }
 }
}