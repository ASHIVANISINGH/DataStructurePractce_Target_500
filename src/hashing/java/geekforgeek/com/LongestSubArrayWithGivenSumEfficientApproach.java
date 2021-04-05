package hashing.java.geekforgeek.com;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubArrayWithGivenSumEfficientApproach {
    //

    public static int calculateLongestSubArray(int arr[],int sum){
        int maxCount=0;
        int  prefixSum=0;
       HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            prefixSum+=arr[i];
            if(prefixSum==sum){
                maxCount=Math.max(maxCount,i+1);
            }
            if(!hashMap.containsKey(prefixSum)){
                hashMap.put(prefixSum,i);
            }
            if(hashMap.containsKey(prefixSum-sum)){
                maxCount=Math.max(maxCount,i-hashMap.get(prefixSum-sum));
               // System.out.println(hashMap.get(prefixSum-sum));
            }
        }
        return maxCount;
    }


    public static void main(String [] args){
//        int arr[]=new int[]{5,8,-4,-4,7,8,-7,-8,9,-2,2};
//        int sum=0;
//        int arr[]=new int[]{3,1,0,1,8,2,3,6};
//        int sum=5;

        int arr[]=new int[]{5,8,-4,-4,7,8,-7,-8,9,-2,2,4,5,6,7,-4,-5,-6,-7,-8,8};
        int sum=0;
        System.out.println(calculateLongestSubArray(arr,sum));
    }
}
