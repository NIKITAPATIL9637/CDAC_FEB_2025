public class DoWhileLoop {
 public static void main(String[] args) {
 int i = 1;
 do {
 System.out.print(i + " ");
 i++;
 } while (i < 5);
 System.out.println(i);
 }
}

/* Dry Run
Initial Values --> i = 1
Loop Iterations
Iteration	i Before Loop	System.out.print(i + " ")	i++ (Increment)	   while (i < 5) Condition	Final i
1st	           1	              Prints 1                      i = 2                    true	           i
2nd	           2	              Prints 2	                    i = 3	             true	           3
3rd	           3	              Prints 3	                    i = 4	             true	           4
4th	           4	              Prints 4	                    i = 5	         false (loop exits)	   5
*/

//Guess Output --> 1 2 3 4 5