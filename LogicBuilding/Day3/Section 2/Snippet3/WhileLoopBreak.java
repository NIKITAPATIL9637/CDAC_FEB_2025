public class WhileLoopBreak {
 public static void main(String[] args) {
 int count = 0;
 while (count < 5) {
 System.out.print(count + " ");
 count++;
 if (count == 3) break;
 }
 System.out.println(count);
 }

/* Dry Run -->
Initial Value --> count = 0
Loop Iterations
Iteration	count Before Loop	System.out.print(count + " ")	count++ (Increment)	if (count == 3) break	Final count
1st	    		0	                    Prints 0                count = 1                  No 1                 1
2nd	    	    	1   	                    Prints 1                count = 2                  No break	            2        
3rd			2		            Prints 2                count = 3                 Breaks loop      3(loop exits)

*/

//Guess Output --> 0 1 2 3
}