package array.java.world.com.testing.purpose;

import array.java.world.com.sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSortResursion {

    public void insertionSort(int [] array,int i,int arrayLength){

        int value1=array[i];
        int j=i;
        while ( j>0 && array[j-1]>value1){
            array[j]=array[j-1];
            j--;
        }
        array[j]=value1;
        if(i+1<=arrayLength){
            insertionSort(array,i+1,arrayLength);
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String [] args){
        int [] array={9,2,3,4,5,6,2,1};
//        InsertionSortForPracitePurpose in=new InsertionSortForPracitePurpose();
//        in.insertionSortFind(array);
       // InsertionSort in=new InsertionSort();
         InsertionSortResursion in=new InsertionSortResursion();
         in.insertionSort(array,1,array.length-1);
    }
}
