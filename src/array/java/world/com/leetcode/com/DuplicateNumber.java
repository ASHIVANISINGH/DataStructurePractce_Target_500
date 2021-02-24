package array.java.world.com.leetcode.com;

import java.util.Arrays;

public class DuplicateNumber {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
     return 0;
    }
    public static void main(String [] args){
        int [] array={1,2,3,4,5,5};
        System.out.println(Arrays.toString(array));
        DuplicateNumber du=new DuplicateNumber();
        System.out.println(" "+du.findDuplicate(array));
    }

}
