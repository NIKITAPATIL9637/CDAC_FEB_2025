public class IncorrectLoopUpdate {
/* Error --> No Error(Task Different)
 public static void main(String[] args) {
 int i = 0;
 while (i < 5) {
 System.out.println(i);
 i += 2; // Error: This may cause unexpected results in output
 }
 }*/

//How should the loop variable be updated to achieve the desired result? --> By incrementing the condition

//Corrected Code
public static void main(String[] args) {
 int i = 0;
 while (i < 5) {
 System.out.println(i);
 i++; // Error: This may cause unexpected results in output
 }
 }
} 