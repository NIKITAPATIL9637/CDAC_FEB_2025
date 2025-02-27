public class IncorrectWhileCondition {
/* Error --->
 public static void main(String[] args) {
 int count = 5;
 while (count = 0) {
 System.out.println(count);
 count--;
 }
 }*/

/* C:\Users\hp\Desktop\LogicBuilding\Day3\Snippet2>javac IncorrectWhileCondition.java
IncorrectWhileCondition.java:4: error: incompatible types: int cannot be converted to boolean
 while (count = 0) {
              ^
1 error
*/

// What is the issue with the condition in the `while` loop? ---> condition not define in right way.

//Corrected Code
public static void main(String[] args) {
 int count = 5;
 while (count > 0) {
 System.out.println(count);
 count--;
 }
 }
} 