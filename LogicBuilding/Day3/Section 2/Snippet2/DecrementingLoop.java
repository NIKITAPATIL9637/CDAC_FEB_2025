public class DecrementingLoop {
 public static void main(String[] args) {
 int total = 0;
 for (int i = 5; i > 0; i--) {
 total += i;
 if (i == 3) continue;
 total -= 1;
 }
 System.out.println(total);
 }
} 

/* Dry Run --->
Initial Value -->  total = 0
i = 5 (loop start)
Loop Iterations
Iteration	i Value	total += i	if (i == 3) continue	       total -= 1	     Final total
1st	5	total = 0 + 5 = 5	false (skip continue)	    total = 5 - 1 = 4	         4
2nd	4	total = 4 + 4 = 8	false (skip continue)	    total = 8 - 1 = 7	         7
3rd	3	total = 7 + 3 = 10	true                            Skipped                  10                                     
4th	2	total = 10 + 2 = 12	false (skip continue)	    total = 12 - 1 = 11	         11
5th	1	total = 11 + 1 = 12	false (skip continue)	    total = 12 - 1 = 11	         11
*/

// Output Guess ---> 11
