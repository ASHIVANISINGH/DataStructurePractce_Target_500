package array.java.world.com.leetcode.com;

import java.util.Arrays;

public class MergeSortArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        int i=0,j=m;
        while ((i<j)&&(j<m+n)){
            if(nums1[i]<nums1[j]){
                //swap(i,j,nums1);
                i++;
            }else if(nums1[i]==nums1[j]) {

                i++;
            }else {
                swap(i,j,nums1);
                i++;
            //    j++;
            }
        }

    }
    public void swap(int i,int j,int [] nums1){
        int temp=nums1[i];
        nums1[i]=nums1[j];
        nums1[j]=temp;
    }

    public static void main(String [] args){
        MergeSortArray me=new MergeSortArray();
        int [] Array={1,2,3,0,0,0};
        int [] Array2={0,1,2};
//        int [] Array={1,2,4,5,6,0};
//        int [] Array2={3};
        System.out.println(Arrays.toString(Array));
        System.out.println(Arrays.toString(Array2));
        me.merge(Array,3,Array2,3);
        System.out.println(Arrays.toString(Array));

    }

}
