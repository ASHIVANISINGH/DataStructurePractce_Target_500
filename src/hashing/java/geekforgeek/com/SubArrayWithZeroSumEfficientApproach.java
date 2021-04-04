package hashing.java.geekforgeek.com;

import java.util.HashMap;
import java.util.HashSet;

public class SubArrayWithZeroSumEfficientApproach {
    // idea is simple
    // we store prefix sum in hashset if we get any duplicate element and before adding check
    // this element available or not
    // then from element initial after this element point and and get where this element current till
    //subarray sum is zero

    public static boolean checkSubArraySumWithZero(int arr[]){
        // create hashset for store the prefix sum
        HashSet<Integer> hashSet=new HashSet<>();
        //
        int pre_sum=0;
        for(int i=0;i<arr.length;i++){
            pre_sum+=arr[i];
            if(hashSet.contains(pre_sum)){
                return true;
            }
            // pre_sum this for corner case where subarray start with initial point
            // i means with zero index
            if(pre_sum==0){
                return true;
            }
            hashSet.add(pre_sum);
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]=new int[]{1,4,13,-3,-10,5};
        System.out.println(checkSubArraySumWithZero(arr));
    }
}
