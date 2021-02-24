package array.java.world.com.testing.purpose;

import java.util.Arrays;

public class BubbleSortUsingRecursion {
    public void bubbleSortAlogForSorting(int i,int length,int [] array){

        for(int j=1;j<length-i;j++){
            if(array[j-1]>array[j]){
                swapArray(j-1,j,array);
            }
        }
        if(i+1<length){
            bubbleSortAlogForSorting(i+1,length,array);
        }
    }
    public void swapArray(int m,int n,int[] array){
        int temp=array[m];
        array[m]=array[n];
        array[n]=temp;
    }
    public static void main(String [] args){
        int [] array={4,2,3,6,8,9,1,0};
        System.out.println(Arrays.toString(array));
       // BubbleSortingJustForPractice b=new BubbleSortingJustForPractice();
        BubbleSortUsingRecursion b=new BubbleSortUsingRecursion();
     //   b.sortBubbleAlgo(array);
        b.bubbleSortAlogForSorting(0,array.length,array);
        System.out.println(Arrays.toString(array));

    }
}
