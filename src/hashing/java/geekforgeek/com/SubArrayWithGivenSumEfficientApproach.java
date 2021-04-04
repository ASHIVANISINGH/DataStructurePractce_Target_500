package hashing.java.geekforgeek.com;

import java.util.HashSet;

public class SubArrayWithGivenSumEfficientApproach {
    // In Efficient Approach we simple traverse with first
    // element and add it on current prefix sum
    //we store the prefix sum in hashset because we check any element
    //prefix_sum minus given sum present in hash set or not
    // if present that means (prefix_sum minus given sum) this element
    //where this previous position after this element from that position
    // up to where it get available in array
    // this process goes up to n-1
    // for corner case if element from initial position and goes up n-1 or n-3
    // for that check prefix sum equal to given sum


    public static boolean calculateSubArrayWithGivenSum(int arr[],int sum){
        // creating hashset for store prefix sum and insert and search operation
        // in O(1)
        HashSet<Integer> hashSet=new HashSet<>();
        // prefix sum
        int prefix_sum=0;
        for(int i=0;i<arr.length;i++){
            // add in prefix sum
            prefix_sum+=arr[i];
            if(prefix_sum==sum){
                return true;
            }
            // check element present in hashset or not
            if(hashSet.contains(prefix_sum-sum)){
                return true;
            }
            hashSet.add(prefix_sum);
        }
        return false;
    }
    public static void main(String [] args){
        int arr[]=new int[]{5,8,6,13,3,-1};
        int sum=22;
        System.out.println(calculateSubArrayWithGivenSum(arr,sum));
    }
}
