package hashing.java.geekforgeek.com;

import java.util.HashMap;

public class LongestSubArrayWithEqualNumberZeroAndOne {

    // simple trick in this problem assume o as -1
    // and calculate just like longest sum by given some
    //
    public static int calculateLengthOfSubArray(int arr[]){
        int maxCount=0,prefixSum=0;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<arr.length;i++){

            if(arr[i]==0){
                prefixSum+=-1;
            }
            prefixSum+=arr[i];
            if(prefixSum==0){
                maxCount=Math.max(maxCount,i+1);
            }
            if(!hashMap.containsKey(prefixSum)){
                hashMap.put(prefixSum,i);
            }else {

                maxCount = Math.max(maxCount, i - hashMap.get(prefixSum));
            }

        }
        return maxCount;
    }
    public static void main(String [] args){
        int arr[]=new int[]{1,0,1,1,1,0,0};
        System.out.println(calculateLengthOfSubArray(arr));
    }
}
