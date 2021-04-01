package array.java.world.com;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {1,5,2,4,3, 1};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int start, int end){

        if(start >= end){
            return;
        }

        int mid = start+ (end-start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr,start, mid, end);

    }

   static void merge(int[] arr,  int start,int mid, int end){
        int[] temp = new int[arr.length];
        int k=start;
        int i=start;
        int j=mid+1;

        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                 temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid){
            temp[k++] = arr[i++];
        }
        while (j <= end){
            temp[k++] = arr[j++];
        }

        for(int p=start; p<=end;p++){
            arr[p] = temp[p];
        }
    }
}