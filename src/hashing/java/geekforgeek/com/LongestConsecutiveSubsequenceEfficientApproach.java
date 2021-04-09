package hashing.java.geekforgeek.com;

import java.util.HashSet;

public class LongestConsecutiveSubsequenceEfficientApproach {

    public static int calculateLongestConsecutiveSubsequence(int arr[]){
        HashSet<Integer> hashSet=new HashSet<>();
        int currentCount=1,maxCount=1;
        for(int i=0;i<arr.length;i++){
            hashSet.add(arr[i]);
        }
        for(int i=0;i<hashSet.size();i++){
            if(hashSet.contains(arr[i])){
                currentCount=1;
            }
            while (hashSet.contains(arr[i]+currentCount)){
                currentCount++;
            }
            maxCount=Math.max(maxCount,currentCount);
        }
        return maxCount;
    }

    public static void main(String[] args) {

//        int arr[]=new int[]{1,9,3,4,2,20};
        int arr[]=new int[]{8,20,7,30};

        System.out.println(calculateLongestConsecutiveSubsequence(arr));

    }
}
