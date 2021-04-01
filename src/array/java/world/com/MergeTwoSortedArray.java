package array.java.world.com;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static int mergeTwoSortedArray(int []array1,int []array2){
        // create an new array,new length using sum of given two array
        int []array3=new int[array1.length+array2.length];
        // create three pointer for moving in three array
        int i=0,j=0,k=0;
        // apply a while loop for iterating in both array and check which element is less
        // in both sub array , which element less place it in third array continuous till when both pointer
        // less than array of length
        while ((i<array1.length)&&(j<array2.length)){
            if(array1[i]<array2[j]){
                array3[k]=array1[i];
                i++;
            }else {
                array3[k]=array2[j];
                j++;
            }
            k++;
        }
        // check any element  remaining in this array first , if any element available in first array
        // in element
        while (i<array1.length){
            array3[k]=array1[i];
            i++;
            k++;
        }
        // check element remaining in second array , if any element available in second array
        // in available than copy it third array    
        while (j<array2.length){
            array3[k]=array2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(array3));
        if((array3.length%2)!=0){
            return array3[array3.length/2+1];
        }else {
            return (array3[array3.length/2]+array3[array3.length/2+1])/2;
        }
    }
    public static void main(String [] args){
        int [] array1=new int[]{2,3,4,5,6,8};
        int [] array2=new int[]{12,13,14,15};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("Median of array : "+mergeTwoSortedArray(array1,array2));
//        Thread t=new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        })
    }
}
