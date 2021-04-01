package array.java.world.com;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1,5,2,4,3, 1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }


    static  void  quickSort(int[] arr, int start, int end){

        if(start> end){
            return;
        }

        int i = start;

        int j = end;

        int pivot = arr[i];

        while (i <= j){

            while(i< arr.length && arr[i]<= pivot){
                i++;
            }

            while (j > start && arr[j] > pivot){
                j--;
            }
            if((i < j)){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[j];
        arr[j] = arr[start];
        arr[start] = temp;


        quickSort(arr, start, j-1);
        quickSort(arr, j+1, end);

    }

    static int partition(int[] arr, int start, int end) {

        int i = start;

        int j = end;

        int pivot = arr[i];

        while (i <= j && start <= end){

            while(i< arr.length && arr[i]<= pivot){
                i++;
            }

            while (j > start && arr[j] > pivot){
                j--;
            }
            if((i < j)){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[j];
        arr[j] = arr[start];
        arr[start] = temp;

        return j;

    }
}