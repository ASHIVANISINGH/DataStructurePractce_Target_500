package hashing.java.geekforgeek.com;

import java.util.HashSet;

public class UnionOfTwoUnsortedArray {

    public static int calculateNumberOfElementInUnion(int arr1[],int arr2[]){
        HashSet<Integer> hashSet=new HashSet<>();
        //efficient approach put all element of array first
        // and second array element in hashset
        // and return size of hashset
        for(int i=0;i<arr1.length;i++){
            hashSet.add(arr1[i]);
        }
        for (int i=0;i<arr2.length;i++){
            hashSet.add(arr2[i]);
        }
        return hashSet.size();
    }
    public static void main(String [] args){
        int arr1[]=new int[]{15,20,5,15};
        int arr2[]=new int[]{15,15,15,20,10};
        System.out.println(calculateNumberOfElementInUnion(arr1,arr2));
    }
}
