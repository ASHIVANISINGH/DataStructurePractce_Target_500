package array.java.world.com.techie.delight;

import java.util.Arrays;

public class SortBinaryTreeInLinearTime {
    public void sortBinaryTreeIn(int [] Array){
        int i=0,j=Array.length-1;
        while(i<j){
            if(Array[i]==0){
                i++;
            }else{
                int temp=Array[j];
                Array[j]=Array[i];
                Array[i]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args){
        int [] Array={1,0,0,1,0,1,1,0,0,0,1};
        System.out.println(Arrays.toString(Array));
        SortBinaryTreeInLinearTime sort=new SortBinaryTreeInLinearTime();
        sort.sortBinaryTreeIn(Array);
        System.out.println(Arrays.toString(Array));
    }
}
