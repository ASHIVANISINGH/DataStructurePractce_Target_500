package hashing.java.geekforgeek.com;

import java.util.HashSet;

public class LongestSubArrayWithGivenSumNaiveApproach {

    public static int calculateLongestSubArray(int arr[],int sum){

        HashSet<Integer> hashSet=new HashSet<>();
        int maxCount=0,currentCount=0;
       // int currentSum=0;

        for(int i=0;i<arr.length;i++){
           int  currentSum=0;
           boolean flag=false;
            for(int j=i;j<arr.length;j++){
                currentSum+=arr[j];
                if(currentSum-sum==0){
                    currentCount=j+1-i;
                    flag=true;
                }
            }
            if(flag){
                maxCount=Math.max(maxCount,currentCount);
            }
        }
        return maxCount;
    }
    public static void main(String [] args){
//        int arr[]=new int[]{5,8,-4,-4,9,-2,2};
//        int sum=0;
        int arr[]=new int[]{3,1,0,1,8,2,3,6};
        int sum=5;
        System.out.println(calculateLongestSubArray(arr,sum));
    }
}
