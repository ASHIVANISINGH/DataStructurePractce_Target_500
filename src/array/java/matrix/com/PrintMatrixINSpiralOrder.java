package array.java.matrix.com;

import java.util.Arrays;

public class PrintMatrixINSpiralOrder {

    public static void printSpiral(int mat[][]){
        if(mat.length==1){
            for(int i=0;i<mat[0].length;i++){
                System.out.print(" "+mat[0][i]);
            }
        }else if(mat[0].length==1){
            for(int i=0;i<mat.length;i++){
                System.out.print(" "+mat[i][0]);
            }
        }else {
            int top=0,bottom=mat[0].length-1,left=0,right=mat[0].length-1;

            while (top<=bottom && left<=right){

                for(int i=left;i<=right;i++) {
                    System.out.print(" " + mat[top][i]);
                }
                top++;

                for(int i=top;i<=bottom;i++){
                    System.out.print(" "+mat[i][right]);
                }
                right--;

                if(top<=bottom){
                    for(int i=right;i>=left;i--){
                        System.out.print(" "+mat[bottom][i]);
                    }
                    bottom--;
                }
                if(left<=right){
                    for(int i=bottom;i>=top;i--){
                        System.out.print(" "+mat[i][left]);
                    }
                    left++;
                }

            }
        }
    }
    public static void main(String [] args){
        int mat[][]=new int[][]{
                {10,20,30,40},
                {15,30,45,60},
                {20,40,60,80},
                {25,50,75,100}
        };
       // System.out.println(Arrays.toString(mat));
        printSpiral(mat);
    }
}
