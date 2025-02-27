public class Switch {
/* Error ---> 
public static void main(String[] args) {
 double score = 85.0;
 switch(score) {
 case 100:
 System.out.println("Perfect score!");
 break;
 case 85:
 System.out.println("Great job!");
 break;
 default:
 System.out.println("Keep trying!");
 }
 }
*/

/* C:\Users\hp\Desktop\LogicBuilding\Day2\Assignment2\Snippet 25>javac Switch.java
Switch.java:4: error: incompatible types: possible lossy conversion from double to int
 switch(score) {
       ^
1 error
*/

//Corrected Code
public static void main(String[] args) {
 double score = 85.0;
 int scoreInt = (int) score;
 switch(scoreInt) {
 case 100:
 System.out.println("Perfect score!");
 break;
 case 85:
 System.out.println("Great job!");
 break;
 default:
 System.out.println("Keep trying!");
 }
 }

/* Why does this code not compile? What does the error tell you about the
types allowed in switch expressions? How can you modify the code to make it work? 
 
Need to do Explicit Type Casting
} 
