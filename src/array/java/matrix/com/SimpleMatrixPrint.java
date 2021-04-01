package array.java.matrix.com;

public class SimpleMatrixPrint {

    public static void print(int mat[][]){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(" "+mat[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        int mat[][]=new int[][]{
                {1,2,3,5,7,8},
                {1,5,6,9,10,14},
                {9,10,15,8,9,10}
        };
        print(mat);
    }
}
