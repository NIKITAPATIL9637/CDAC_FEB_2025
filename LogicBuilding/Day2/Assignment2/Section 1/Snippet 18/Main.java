public class Main {
// No Error
public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = a + b * 2;
 System.out.println(result);
 }

/* How does operator precedence affect the result?
Operators with higher precedence are evaluated before those with lower precedence.
Parentheses () always have the highest precedence, so operations inside parentheses are evaluated first.
If multiple operators have the same precedence, associativity determines the order of evaluation (whether the operators are evaluated left to right or right to left).
*/
} 
