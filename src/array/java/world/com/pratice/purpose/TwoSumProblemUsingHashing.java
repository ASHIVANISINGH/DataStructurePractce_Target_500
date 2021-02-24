package array.java.world.com.pratice.purpose;

import sun.plugin2.message.SetJVMIDMessage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TwoSumProblemUsingHashing {

    public void twoSumProblem(int [] array,int sum){

        HashMap<Integer,Integer> hash=new HashMap<>();
//        for(int i=0;i<array.length;i++){
//            hash.put(array[i],i);
//        }
//
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        for(int i=0;i<array.length;i++){

            if(hash.containsKey(sum-array[i])){
                ArrayList<Integer> list=new ArrayList<>();
                list.add(array[i]);
                list.add(sum-array[i]);
                mainList.add(list);
            }
            hash.put(array[i],i);
        }
        System.out.println(mainList);
    }
    public static void main(String [] args){
        TwoSumProblemUsingHashing two=new TwoSumProblemUsingHashing();
        int [] array={8, 7, 2, 5, 3, 1};
        int sum=10;
        two.twoSumProblem(array,sum);
    }
}
