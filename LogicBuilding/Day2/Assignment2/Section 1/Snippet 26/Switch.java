public class Switch {
/* Error --->  
public static void main(String[] args) {
 int number = 5;
 switch(number) {
 case 5:
 System.out.println("Number is 5");
 break;
 case 5:
 System.out.println("This is another case 5");
 break;
 default:
 System.out.println("This is the default case");
 }
 }*/

/*C:\Users\hp\Desktop\LogicBuilding\Day2\Assignment2\Snippet 26>javac Switch.java
Switch.java:8: error: duplicate case label
 case 5:
 ^
1 error
*/

//Corrected Code
public static void main(String[] args) {
 int number = 5;
 switch(number) {
 case 5:
 System.out.println("Number is 5");
 break;
 case 6:
 System.out.println("This is another case 5");
 break;
 default:
 System.out.println("This is the default case");
 }
 }
/*
Why does the compiler complain about duplicate case labels? What
happens when you have two identical case labels in the same switch block? 

Because Duplicate Cases are not allowed in Switch Block.
It Confused between both cases and thatswhy it throw duplicate case label error.
*/
}