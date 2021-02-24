package array.java.world.com.sorting;

import java.util.Arrays;

public class SelectionSortUsingRecursion {
    public static void swap(int i,int min, int[] Array){
        int temp=Array[i];
        Array[i]=Array[min];
        Array[min]=temp;
    }
    public static void selectionSortRecursion(int i,int n,int [] Array){
        int min=i;
        for(int j=i+1;j<Array.length;j++){
            if(Array[j]<Array[min]){
                min=j;
            }
        }
        swap(i,min,Array);
        if(i+1<=n){
            selectionSortRecursion(i+1,n,Array);
        }
    }
    public static void main(String [] args){
        int [] Array={1,3,4,5,6,7,7,8,2,34,2,2,34,1};
        System.out.println(Arrays.toString(Array));
        selectionSortRecursion(0,Array.length-1,Array);
        System.out.println(Arrays.toString(Array));


    }
}
