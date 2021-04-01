package array.java.matrix.com;

public class MakingTransposeEfficientApproach {

    // Making Transpose of matrix efficient way
    // first we analyze matrix how to convert in transpose
    // we see element opposite side diagonal swap with respective position

    public static void makeTransposeOfMatrix(int matrix[][]){

        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[0].length;j++){
                //swap(matrix[i][j],matrix[j][i]);
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
//     public static void swap(int number1,int number2){
//        int temp=number1;
//        number1=number2;
//        number2=temp;
//    }
    public static void main(String [] args){
        int matrix[][]=new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        makeTransposeOfMatrix(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
    }
    }

