package hashing.java.geekforgeek.com;

import java.util.Arrays;

public class LongestConsecutiveSubsequenceFirstApproachUsingSorting {

    // what is my approach
    // i simple assume first element always be consecutive so i assign current count one
    // before apply for loop first sort array because what consecutive element that come to near to
    // each other after this we count number of element whose max difference is one after if we found
    // discontinue this process again start count from one and update max count

    public static int calculateLongestConsecutiveSubsequence(int arr[]){


        int currentCount=1;
        int maxCount=0;
        Arrays.sort(arr);

        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==1){
                currentCount++;
            }else {
                maxCount=Math.max(maxCount,currentCount);
                currentCount=1;
            }
        }
        return maxCount;

    }

    public static void main(String[] args) {
     //   int arr[]=new int[]{1,9,3,4,2,20};
        int arr[]=new int[]{20,30,40};
        System.out.println(calculateLongestConsecutiveSubsequence(arr));
    }
}
