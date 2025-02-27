public class DoWhileIncorrectCondition {
/* Error ---> Infinite loop running
 public static void main(String[] args) {
 int num = 0;
 do {
 System.out.println(num);
 num++;
 } while (num > 0);
 }*/

//What is wrong with the loop condition in the `dowhile` loop?  ---> Use decrementation instead of incrementation

// Corrected code
public static void main(String[] args) {
 int num = 0;
 do {
 System.out.println(num);
 num--;
 } while (num > 0);
 }
} 