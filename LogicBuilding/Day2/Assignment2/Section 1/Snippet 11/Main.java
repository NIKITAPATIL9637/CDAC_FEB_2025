public class Main {
/* Error --> 
public static void main(String[] args) {
 int[] arr = {1, 2, 3};
 System.out.println(arr[5]);
 }*/
/*
C:\Users\hp\Desktop\LogicBuilding\Day2\Assignment2\Snippet 11>java Main
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        at Main.main(Main.java:4)
*/

//Corrected Code
public static void main(String[] args) {
 int[] arr = {1, 2, 3, 4, 5, 6};
 System.out.println(arr[5]);
 }

/*What runtime exception do you encounter? Why does it occur?
The array arr is declared and initialized with 3 elements: {1, 2, 3}. In Java, array indexes are zero-based, meaning the valid indexes for this array are:

arr[0] for 1
arr[1] for 2
arr[2] for 3
When you try to access arr[5], you're attempting to access an index that is beyond the valid range of the array (which only has indexes 0, 1, and 2).
*/
} 