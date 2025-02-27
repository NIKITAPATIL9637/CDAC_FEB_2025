public class IncrementDecrement {
 public static void main(String[] args) {
 int x = 5;
 int y = ++x - x-- + --x + x++;
 System.out.println(y);
 }
}

/* Dry Run ---> 
Step	Expression Part	        x Value Before	              Operation	                      x Value After	Result
1	++x	                     5	             Pre-increment (x = x + 1)	                  6	          6
2	x--	                     6	             Post-decrement (x = x - 1 after use)	  5	       6 - 6 = 0
3	--x	                     5	             Pre-decrement (x = x - 1)	                  4	       0 + 4 = 4
4	x++	                     4	             Post-increment (x = x + 1 after use)	  5	       4 + 4 = 8
*/

Guess Output ---> 8