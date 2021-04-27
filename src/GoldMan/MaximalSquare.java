package GoldMan;

public class MaximalSquare {

	public static void main(String[] args) {
		
		int [][] matrix = {
				 {1,0,1,0,0},
				 {1,0,1,1,1},
				 {1,1,1,1,1},
				 {1,0,0,1,0},};
		
		int sum= maximumSum(matrix);
		System.out.println(sum);

	
}

	private static int maximumSum(int[][] matrix) {
		
		int row =matrix.length;
		
		int sum=0; 
		for(int i=1;i<matrix.length;i++) {
			for(int j=1;j<matrix[0].length;j++) {
				if(matrix[i][j]!=0) {
				
					matrix[i][j]=Math.min( Math.min( matrix[i-1][j], matrix[i-1][j-1]), matrix[i][j-1])+1;
					sum =Math.max(sum, matrix[i][j]);
				}
			}
		}
		
		return sum*sum;
	}
}
