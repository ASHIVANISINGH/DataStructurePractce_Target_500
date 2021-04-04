package hashing.java.geekforgeek.com;

import java.util.HashMap;

public class IntersectionOfTwoArrays {

    public static int numberOfElementCommon(int arr1[],int arr2[]){

        HashMap<Integer,Integer> hash1=new HashMap<>();
        for(int i=0;i<arr1.length;i++){

            if(!hash1.containsKey(arr1[i])){
                hash1.put(arr1[i],hash1.getOrDefault(arr1[i],0)+1);
            }
        }
        int count=0;
        for(int i=0;i<arr2.length;i++){

            if(hash1.containsKey(arr2[i])){
                count++;
                hash1.remove(arr2[i]);
            }
        }

        return count;
    }
    public static void main(String [] args){
//        int arr1[]=new int[]{10,15,20,15,30,30,5};
//        int arr2[]=new int[]{30,5,30,80};
//        int arr1[]=new int[]{10,20};
//        int arr2[]=new int[]{20,30};
        int arr1[]=new int[]{10,10,10};
        int arr2[]=new int[]{10,10,10};
        System.out.println(numberOfElementCommon(arr1,arr2));
    }
}
