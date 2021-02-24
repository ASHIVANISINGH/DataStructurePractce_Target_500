package array.java.world.com.geek.forgeek;

import java.util.Arrays;

public class MoveAllZeroInEnd {

    public static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void moveZero(int []arr){
        int t=0,counter=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                swap(arr,t,i);
                t++;
            }
//            if(arr[i]==0){
//                counter++;
//            }
        }
//        for(int i=0;i<counter;i++){
//            arr[arr.length-counter+i]=0;
//        }
    }
    public static void main(String [] args){
        int [] arr={8,5,0,10,0,20};
        System.out.println(Arrays.toString(arr));
        MoveAllZeroInEnd.moveZero(arr);
        System.out.println(Arrays.toString(arr));

    }
}
