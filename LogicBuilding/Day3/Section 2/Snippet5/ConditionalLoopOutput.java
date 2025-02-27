public class ConditionalLoopOutput {
 public static void main(String[] args) {
 int num = 1;
 for (int i = 1; i <= 4; i++) {
 if (i % 2 == 0) {
 num += i;
 } else {
 num -= i;
 }
 }
 System.out.println(num);
 }
} 

/* Dry Run -->
Iteration	i	i % 2 == 0 (Even?)	Operation (num += i or num -= i)	num (Updated Value)
Start	        -	   -	                             Initial value	               1
1st loop	1	No (Odd)	           num = num - 1 → 1 - 1	               0
2nd loop	2	Yes (Even)	           num = num + 2 → 0 + 2	               2
3rd loop	3	No (Odd)	           num = num - 3 → 2 - 3	              -1
4th loop	4	Yes (Even)	           num = num + 4 → -1 + 4	               3
*/

//Guess Output ---> 3