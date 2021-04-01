package array.java.matrix.com;

public class MakingTransposeOfAMatrix {

    // Naive approach
    public static void convertInTranspose(int mat[][]){
   // first make a temporary matrix and copy element in opposite order
        // if observe in matrix for making transpose element of matrix
        // column become row and vice versa
        int row=mat.length,column=mat[0].length;
        int temp[][]=new int[row][column];
        for(int i=0;i<row;i++){
             for(int j=0;j<column;j++){
                 temp[j][i]=mat[i][j];
             }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                mat[i][j]=temp[i][j];
            }
        }
    }
    public static void main(String [] args){
        int matrix[][]=new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        convertInTranspose(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
    }
}
