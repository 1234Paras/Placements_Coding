public class TransposeMatrix {
    
    public static void printMatrix(int[][] matrix){
        System.out.println("The matrix is a : ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int rows = 2, cols = 3;
        int[][] matrix = { {2,3,7}, {5,6,7}};

        //Display the Original matrix
        printMatrix(matrix);

        int[][] transpose = new int[cols][rows];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        //Print the Transposed matrix
        printMatrix(transpose);
    }
}