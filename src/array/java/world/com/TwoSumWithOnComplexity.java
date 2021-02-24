package array.java.world.com;

import java.util.HashMap;

public class TwoSumWithOnComplexity {

    public static void findSumOfTwoNumber(int[] Array,int sum){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<Array.length;i++){
           //map.put(Array[i],)
            if(map.containsKey(sum-Array[i])){
                System.out.println("Sum of two Number Index at "+map.get(sum-Array[i])+ " Index at "+i);
            }
            map.put(Array[i],i);
        }
    }

    public static void main (String[] args)
    {
        int[] A = { 8, 7, 2, 5, 3, 1 };
        int sum = 10;
        findSumOfTwoNumber(A,sum);
        //findPair(A, sum);
    }
}
