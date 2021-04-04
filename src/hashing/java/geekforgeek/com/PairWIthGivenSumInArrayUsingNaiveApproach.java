package hashing.java.geekforgeek.com;

import java.util.HashMap;

public class PairWIthGivenSumInArrayUsingNaiveApproach {

    public static boolean checkSumAvailable(int arr[],int sum){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        //idea is simple first we create hashmap in key value form
        //we put the value in hashmap sum-arr of element
        //( sum-key ) put as key and check what element in array present in array
        // if present in array then return true otherwise making key value
        // in hashmap and put those value in key value form
        for(int i=0;i<arr.length;i++){
            if(hashMap.containsKey(arr[i])){
                return true;
            }
            hashMap.put(sum-arr[i],arr[i]);
        }
        return false;
    }
    public static void main(String [] args){
//        int arr[]=new int[]{3,2,8,15,-8};
        int arr[]=new int[]{11,5,6};
        //int sum=17;
        int sum=10;
        System.out.println(checkSumAvailable(arr,sum));
    }
}
