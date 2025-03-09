import java.util.Arrays;

public class Q21 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        computeRowColumnSum(matrix);
    }

    public static void computeRowColumnSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] rowSum = new int[rows];
        int[] colSum = new int[cols];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rowSum[i] += matrix[i][j];  
                colSum[j] += matrix[i][j];  
            }
        }

        System.out.println("Row-wise Sums: " + Arrays.toString(rowSum));

        System.out.println("Column-wise Sums: " + Arrays.toString(colSum));
    }
}
