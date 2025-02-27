public class UninitializedWhileLoop {
/* Error --->  
public static void main(String[] args) {
 int count;
 while (count < 10) {
 System.out.println(count);
 count++;
 }
 }*/

 /* C:\Users\hp\Desktop\LogicBuilding\Day3\Snippet7>javac UninitializedWhileLoop.java
UninitializedWhileLoop.java:4: error: variable count might not have been initialized
 while (count < 10) {
        ^
1 error*/

// Why does this code produce a compilation error? -> variable count not have been initialized

//Corrected code
public static void main(String[] args) {
 int count = 0;
 while (count < 10) {
 System.out.println(count);
 count++;
 }
 }
}