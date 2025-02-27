public class NestedLoopOutput {
 public static void main(String[] args) {
 for (int i = 1; i <= 3; i++) {
 for (int j = 1; j <= 2; j++) {
 System.out.print(i + " " + j + " ");
 }
 System.out.println();
 }
 }
}

/* Dry Run -->
Outer loop i iterations:
i = 1

j = 1 → Prints 1 1
j = 2 → Prints 1 2
End of inner loop → New line 
i = 2

j = 1 → Prints 2 1
j = 2 → Prints 2 2
End of inner loop → New line 
i = 3

j = 1 → Prints 3 1
j = 2 → Prints 3 2
End of inner loop → New line (\n)
*/

//// Output Guess --->1 1 1 2 
                      2 1 2 2 
                      3 1 3 2 


