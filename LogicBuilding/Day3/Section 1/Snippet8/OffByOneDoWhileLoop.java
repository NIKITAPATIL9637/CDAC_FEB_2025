public class OffByOneDoWhileLoop {
/* Error --> No Error (Task Different)
public static void main(String[] args) {
    int num = 1;
    do {
       System.out.println(num);
       num--;
    } while (num > 0);
 }*/

/* What adjustments are needed to print the
numbers from 1 to 5? --> need incrementation and codition defination in right way
*/

 public static void main(String[] args) {
    int num = 0;
    do {
       System.out.println(num);
       num++;
    } while (num < 10);
 }
}