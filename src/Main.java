
public class Main {
	public static void main(String[] args) {
		
		//2*3 matrix
		int [][] matrix1 = new int[][]{{1,2,3},{4,5,6}};
		
		//3*4 matrix
		int [][] matrix2 = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		printMatrix(matrix1);
		
		System.out.println("******************");
		
		printMatrix(matrix2);
		
		System.out.println("******************");

		int [][] result = matrixMultiply(matrix1, matrix2);
		
		printMatrix(result);
		
		
		
	}
	
	
	public static int [][] matrixMultiply(int [][] matrix1, int [][] matrix2){
		int row1 = matrix1.length;
		int column1 = matrix1[0].length;

		int row2 = matrix2.length;
		int column2 = matrix2[0].length;
		
		if(column1 != row2){
			
			System.out.println("can not do the matrix multiply");
			
			return null;
		}
		
		//
		int [][] result = new int [row1][column2];
		
		for(int i=0;i<row1;i++){
			for(int j=0;j<column2;j++){
				
				int temp = 0;
				
				for(int k=0;k<column1;k++){
					temp = temp + matrix1[i][k] * matrix2[k][j];
				}
				
				result[i][j] = temp;
				
			}
		}
		
		
		return result;
		
	}
	
	public static void printMatrix(int [][] matrix){
		
		int row = matrix.length;
		
		int column = matrix[0].length;
		
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print(matrix[i][j]+"\t");
			}
			
			System.out.println();
		}
		
	}
}
