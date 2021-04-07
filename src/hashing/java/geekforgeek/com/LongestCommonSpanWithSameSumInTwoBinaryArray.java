package hashing.java.geekforgeek.com;

import java.util.HashMap;

public class LongestCommonSpanWithSameSumInTwoBinaryArray {

    public static int calculateLongestCommonSpanWithSameSumInTwoBinaryArray(int arr1[],int arr2[]){
        int temp[]=new int [arr1.length];

        for(int i=0;i<arr1.length;i++){
            temp[i]=arr1[i]-arr2[i];
        }
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int prefixSum=0;
        int maxCount=0;
        for(int i=0;i<temp.length;i++){
            prefixSum+=temp[i];

            if(prefixSum==0){
                maxCount=Math.max(maxCount,i+1);
            }
            if(!hashMap.containsKey(prefixSum)){
                hashMap.put(temp[i],i);
            }else {
                maxCount=Math.max(maxCount,i-hashMap.get(prefixSum));
            }
        }
        return maxCount;
    }
    public static void main(String [] args){
//        int arr1[]=new int[]{0,1,0,0,0,0};
//        int arr2[]=new int[]{1,0,1,0,0,1};
        int arr1[]=new int[]{0,1,0,1,1,1,1};
        int arr2[]=new int[]{1,1,1,1,1,0,1};
        System.out.println(calculateLongestCommonSpanWithSameSumInTwoBinaryArray(arr1,arr2));
    }
}
