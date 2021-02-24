package array.java.world.com.sorting;

import java.util.Arrays;

public class SelectionSortingAlgo {

    public static void swap(int i,int min, int [] Array){
        int temp=Array[i];
        Array[i]=Array[min];
        Array[min]=temp;
    }
    public static void selectionSortArray(int [] Array){
        int min;
        for(int i=0;i<Array.length;i++){
           min=i;
            for(int j=i+1;j<Array.length;j++){
                if(Array[j]<Array[min]){
                    min=j;
                }
            }
            swap(i,min,Array);
        }
    }
    public static void main(String [] args){
        SelectionSortingAlgo se=new SelectionSortingAlgo();
        int [] Array1={2,3,4,5,6,232,23,4,2,23,2,3,2,23,4,0,-1};
        System.out.println(Arrays.toString(Array1));
        selectionSortArray(Array1);
        System.out.println(Arrays.toString(Array1));
    }
}
