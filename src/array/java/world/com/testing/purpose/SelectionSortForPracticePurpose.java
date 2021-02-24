package array.java.world.com.testing.purpose;

import array.java.world.com.sorting.SelectionSortingAlgo;

import java.util.Arrays;

public class SelectionSortForPracticePurpose {
    public void selectrionSortForSorting(int [] array){
        for(int i=0;i<array.length;i++){
            int min=i;
            for(int j=i+1;j<array.length;j++){
                if(array[min]>array[j]){
                    min=j;
                }
            }
            swap(i,min,array);
        }
    }
    public void swap(int m,int n,int []array){
        int temp=array[m];
        array[m]=array[n];
        array[n]=temp;
    }
    public static void main(String [] args){
        SelectionSortForPracticePurpose s=new SelectionSortForPracticePurpose();
        int [] array={2,4,5,32,1,2,13,5,23,2,3};
        System.out.println(Arrays.toString(array));
        s.selectrionSortForSorting(array);
        System.out.println(Arrays.toString(array));
    }
}
