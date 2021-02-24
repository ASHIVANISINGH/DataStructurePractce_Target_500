package array.java.world.com.testing.purpose;

import java.util.Arrays;

public class InsertionSortForPracitePurpose {
    public void insertionSortFind(int [] array){
        for(int i=1;i<array.length;i++){
            int value=array[i];
            int j=i;
            while (j>0 && array[j-1]>value){
                array[j]=array[j-1];
                j--;
            }
            array[j]=value;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String [] args){
        int [] array={9,2,3,4,5,6,2,1};
        InsertionSortForPracitePurpose in=new InsertionSortForPracitePurpose();
        in.insertionSortFind(array);
    }
}
