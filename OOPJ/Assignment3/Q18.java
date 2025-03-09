public class Q18{
	public static void printMatrix(int[][] matrix){
		
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		System.out.println("Matrix Elements (Row-wise):");
		
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
    public static void main(String args[]){
	    int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        printMatrix(matrix);
	}
}