public class IncorrectWhileLoopControl {
 /*Error -->
public static void main(String[] args) {
 int num = 10;
 while (num = 10) {
 System.out.println(num);
 num--;
 }
 }*/

/*
C:\Users\hp\Desktop\LogicBuilding\Day3\Snippet10>javac IncorrectWhileLoopControl.java
IncorrectWhileLoopControl.java:4: error: incompatible types: int cannot be converted to boolean
 while (num = 10) {
            ^
1 error
*/

//What is wrong with the loop condition?  -- > condition definition wrong way

//Corrected Code
public static void main(String[] args) {
 int num = 10;
 while (num == 10) {
 System.out.println(num);
 num--;
 }
 }
}