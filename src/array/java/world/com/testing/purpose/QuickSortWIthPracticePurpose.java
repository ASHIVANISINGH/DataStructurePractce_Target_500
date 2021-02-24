package array.java.world.com.testing.purpose;

import java.util.Arrays;

public class QuickSortWIthPracticePurpose {
    public static void swap(int [] Array,int m,int n){
        int temp=Array[m];
        Array[m]=Array[n];
        Array[n]=temp;
    }
    public static int partion(int []Array,int start,int end){
        int pivot=Array[end];
        int pIndex=start;

        for(int i=start;i<end;i++){
            if(Array[i]<=pivot){
                swap(Array,i,pIndex);
                pIndex++;
            }
        }
        swap(Array,pIndex,end);
        return pIndex;
    }
    public static void quickSortAlgorthim(int [] Array,int start ,int end){
        if(start>=end){
            return;
        }
        int pivot=partion(Array,start,end);
        quickSortAlgorthim(Array,start,pivot-1);
        quickSortAlgorthim(Array,pivot+1,end);
    }
    public static void main(String [] args){
        int []Array={1,3,4,0,1,3,3,4,7,9};
        System.out.println(Arrays.toString(Array));
        quickSortAlgorthim(Array,0,Array.length-1);
        System.out.println(Arrays.toString(Array));

    }
}
