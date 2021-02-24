package array.java.world.com.testing.purpose;

import java.util.Arrays;

public class SelectionSortForPracticePurposeRecursion {
    public void selectionSortRecursion(int i,int length,int [] array){
        int min=i;
        for(int j=i;j<length;j++){
            if(array[min]>array[j]){
                min=j;
            }
        }
        swap(min,i,array);
        if(i+1<length){
            selectionSortRecursion(i+1,length,array);
        }
    }
    public void swap(int m,int n,int[] array){
        int temp=array[m];
        array[m]=array[n];
        array[n]=temp;

    }
    public static void main(String [] args){
        int [] array={3,4,5,6,7,8,3,2,0,1,7,8,5};
        SelectionSortForPracticePurposeRecursion se=new SelectionSortForPracticePurposeRecursion();
        System.out.println(Arrays.toString(array));
        se.selectionSortRecursion(0,array.length,array);
        System.out.println(Arrays.toString(array));
    }
}
