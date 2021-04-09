package hashing.java.geekforgeek.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CountDistinctElementInEveryWindowsNaiveApproachMethod1 {

    public static List calculateCountDistinctElement(int arr[], int k){
       HashMap<Integer,Integer> hashMap=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
//        int j=0,t=k;
//        for(int i=0;i<k;i++){
//            hashSet.add(arr[i]);
//        }
//        list.add(hashSet.size());
//        while (j<arr.length && t<arr.length){
//            hashSet.remove(arr[j]);
//            j++;
//            hashSet.add(arr[t]);
//
//            list.add(hashSet.size());
//            t++;
//        }
        int j=0,t=k;
        for(int i=0;i<k;i++){
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);
        }
        list.add(hashMap.size());
        while (t<arr.length){
           // boolean presentNumber=hashMap.containsKey(arr[j]);
            hashMap.put(arr[t],hashMap.getOrDefault(arr[t],0)+1);
            t++;
            if(hashMap.get(arr[j])!=1){
                hashMap.put(arr[j],hashMap.getOrDefault(arr[j],0)-1);
            }else {
                hashMap.remove(arr[j]);
            }
            j++;
            list.add(hashMap.size());

        }

        return list;

    }

    public static void main(String[] args) {
//        int arr[]=new int[]{10,20,20,10,30,40,10};
        // int k=4;
        int arr[]=new int[]{10,10,10,10};
        int k=3;
        System.out.println(calculateCountDistinctElement(arr,k));
    }
}
