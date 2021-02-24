package array.java.world.com.sorting;

import java.util.Arrays;

public class BubbleSortingJustForPractice {
    public void sortBubbleAlgo(int [] array){
        for(int i=0;i< array.length;i++){

            for(int j=1;j<array.length-i;j++){
                if(array[j-1]>array[j]){
                    swap(array,j-1,j);
                }
            }
        }
    }
    public void swap(int [] array,int m,int n){
        int temp=array[m];
        array[m]=array[n];
        array[n]=temp;
    }
    public static void main(String [] args){
        int [] array={4,2,3,6,8,9,1,0};
        System.out.println(Arrays.toString(array));
        BubbleSortingJustForPractice b=new BubbleSortingJustForPractice();
        b.sortBubbleAlgo(array);
        System.out.println(Arrays.toString(array));

    }
}
