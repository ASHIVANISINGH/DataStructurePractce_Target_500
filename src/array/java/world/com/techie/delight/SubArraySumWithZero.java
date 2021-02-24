package array.java.world.com.techie.delight;

import java.util.ArrayList;
import java.util.List;

public class SubArraySumWithZero {
    public static List sumArrayZeroSumMethod(int [] array){
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            int sum=0;
            sum+=array[i];
            if(sum==0){
                List<Integer> l3=new ArrayList<>();
                l3.add(array[i]);
                list.add(l3);
            }
            for(int j=i+1;j<array.length;j++){

                sum+=array[j];
                List<Integer> l1=new ArrayList<>();
                l1.add(array[i]);
                l1.add(array[j]);
                if(sum==0){
                    list.add(l1);
                }

            }
        }
        return list;
    }
    public static void main(String [] args){
        SumOfSubArrayWithZero sub=new SumOfSubArrayWithZero();
        int [] arr={4,2,-3,-1,0,4};
        System.out.println("List sum of sub array element : "+sumArrayZeroSumMethod(arr));
    }
}
