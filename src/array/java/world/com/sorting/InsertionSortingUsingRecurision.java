package array.java.world.com.sorting;

import java.util.Arrays;

public class InsertionSortingUsingRecurision {
    public static void insertionSort(int [] array,int i,int n){
        int j=i;
        int value=array[i];
        while (j>0 && array[j-1]>value){
            array[j]=array[j-1];
            j--;
        }
        array[j]=value;
        if(i+1<=n){
            insertionSort(array,i+1,n);
        }
      //  System.out.println(Arrays.toString(array));
    }
    public static void main(String [] args){
        int [] array={2,3,4,5,6,7,8,10,3,4,5,6};
        System.out.println(Arrays.toString(array));
        insertionSort(array,1,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
