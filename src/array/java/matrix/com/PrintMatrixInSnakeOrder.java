package array.java.matrix.com;

import com.sun.org.apache.xerces.internal.util.SymbolHash;

public class PrintMatrixInSnakeOrder {

    public static void printSnake(int mat[][]){

        for(int i=0;i<mat.length;i++){

            if(i%2==0){
                for(int j=0;j<mat[i].length;j++){
                    System.out.print(" "+mat[i][j]);
                }
               // System.out.println();
            }else {
                for(int j=mat[i].length-1;j>=0;j--){
                    System.out.print(" "+mat[i][j]);
                }
               // System.out.println();
            }
        }
    }
    public static void main(String [] args){
        int mat[][]=new int[][]{
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14},
                {16,17,18,19}
        };
        System.out.println();
        printSnake(mat);
    }
}
