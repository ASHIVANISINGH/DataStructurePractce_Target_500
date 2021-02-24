package array.java.world.com.techie.delight;

import java.util.Arrays;

public class SortBinaryTreeWithQuickSort {

    public static void swap(int [] Array,int i,int j){
        int temp=Array[i];
        Array[i]=Array[j];
        Array[j]=temp;
    }
    public static void sort(int []Array){
        int pivot=1;
        int j=0;
        for(int i=0;i<Array.length;i++){

            if(Array[i]<pivot){
                swap(Array,i,j);
                j++;
            }
        }
    }
    public static void main(String [] args){
        int [] A={0,1,0,1,0,1,0,0,1,0,0};
        System.out.println(Arrays.toString(A));
        sort(A);
        System.out.println(Arrays.toString(A));
    }
}
