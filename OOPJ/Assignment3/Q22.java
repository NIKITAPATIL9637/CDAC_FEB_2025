import java.util.*;
public class Q22 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {9, 5, 6},
            {7, 8, 4}
        };

        int max = findMaxElement(matrix);
        System.out.println("Maximum Element in the Matrix: " + max);
    }

    public static int findMaxElement(int[][] matrix) {
        int maxElement = Integer.MIN_VALUE;

        for (int[] row : matrix) {
            for (int num : row) {
                if (num > maxElement) {
                    maxElement = num;
                }
            }
        }
        return maxElement;
    }
}
