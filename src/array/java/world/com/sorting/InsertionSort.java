package array.java.world.com.sorting;

import java.util.Arrays;

public class InsertionSort {
    public void insertionSortingFunction(int [] array){
        for(int i=1;i<array.length;i++){
            int j=i;
            int value=array[i];
             while (j>0 && array[j-1]>value){
                 array[j]=array[j-1];
                 j--;
             }
             array[j]=value;
        }
    }
    public static void main(String [] args){
        InsertionSort in=new InsertionSort();
        int [] array={2,3,4,5,6,8,9,2};
        System.out.println(Arrays.toString(array));
        in.insertionSortingFunction(array);
        System.out.println(Arrays.toString(array));
    }
}
