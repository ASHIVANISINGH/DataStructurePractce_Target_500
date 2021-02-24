package array.java.world.com.techie.delight;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfSubArrayWithZero {

    public void sumOfArrayWithZero(int [] Array,int sum){
        ArrayList<ArrayList<Integer>> arrayList=new ArrayList<>();
        for(int i=0;i<Array.length;i++){
            int sum1=0;
            for(int j=i;j<Array.length;j++){

                sum1+=Array[j];
                if(sum1==0){
                    ArrayList<Integer> arrayList1=new ArrayList<>();
                    arrayList1.add(Array[i]);
                    arrayList1.add(Array[j]);
                    arrayList.add(arrayList1);
                }

            }
        }
        System.out.println(arrayList);

    }
    public static void main(String [] args){
        SumOfSubArrayWithZero su=new SumOfSubArrayWithZero();
        int [] Array=new int[]{4,2,-3,-1,0,4,-1,1};
        System.out.println(Arrays.toString(Array));
        su.sumOfArrayWithZero(Array,0);
    }
}
