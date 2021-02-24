package array.java.world.com.pratice.purpose;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumArray {
    public void twoSumArray(int []array, int sum){
        Arrays.sort(array);
        ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
        int low=0,high=array.length-1;
        while (low<high){
            if(array[low]+array[high]==sum){
                ArrayList<Integer> list=new ArrayList<>();
                list.add(array[low]);
                list.add(array[high]);
                mainList.add(list);
                low++;
                high--;
                //break;
            }
            if(array[low]+array[high]<sum)
                low++;
            if (array[low]+array[high]>sum)
                high--;
        }
        System.out.println(mainList);

    }
    public static void main(String [] args){
        TwoSumArray tw=new TwoSumArray();
        int [] array={8, 7, 2, 5, 3, 1};
        int sum=10;
       // TwoSumArray tw=new TwoSumArray();
        tw.twoSumArray(array,sum);

    }
}
