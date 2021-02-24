package array.java.world.com.leetcode.com;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        int sumArray=0;
        for(int i : nums){
            sumArray+=i;
        }
        return sum-sumArray;
    }
    public static void main(String [] args){
        MissingNumber m=new MissingNumber();
        int []array={1,2,3,0,5,6};
        System.out.println(Arrays.toString(array));
        System.out.println(" "+m.missingNumber(array));
    }

}
