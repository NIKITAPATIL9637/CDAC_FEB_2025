public class Q25 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = findDiagonalSum(matrix);
        System.out.println("Sum of both diagonals: " + sum);
    }

    public static int findDiagonalSum(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];            
            sum += matrix[i][n - i - 1];    
        }


        if (n % 2 == 1) {
            sum -= matrix[n / 2][n / 2];
        }

        return sum;
    }
}
