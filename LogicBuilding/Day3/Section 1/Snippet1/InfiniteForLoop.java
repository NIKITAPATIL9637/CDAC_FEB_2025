public class InfiniteForLoop {
/* Error---> Infinite loop running
 public static void main(String[] args) {
 for (int i = 0; i < 10; i--) {
 System.out.println(i);
 }
 }
*/
/*
An incorrect update can lead to infinite loops, which can freeze or crash a program.
Fixed --> insted if decrementing the condition adjust the condition by incrementating
*/

//Corrected code
public static void main(String[] args) {
 for (int i = 0; i < 10; i++) {
 System.out.println(i);
 }
 }

}