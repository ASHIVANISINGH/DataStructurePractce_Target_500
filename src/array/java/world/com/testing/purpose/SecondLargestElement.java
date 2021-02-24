package array.java.world.com.testing.purpose;

import java.util.Arrays;

public class SecondLargestElement {

    public int secondLargest(int [] array){

        int largest=array[0];
        int secondLarest=-1;

        for(int i=0;i<array.length;i++){
            if(largest<array[i]){
                largest=array[i];
            }
            if((secondLarest<array[i])&&(array[i]<largest)){
                secondLarest=array[i];
            }

        }
        return secondLarest;
    }
    public void reverseArray(int [] Array){
        int i=0,j=Array.length-1;
        while (i<j){
            swap(Array,i,j);
            i++;
            j--;
        }
    }
    public static void swap(int [] Array,int i,int j){
        int temp=Array[i];
        Array[i]=Array[j];
        Array[j]=temp;
    }
    public static void main(String[] args){
        SecondLargestElement second=new SecondLargestElement();
        //int []arr={5,20,12,20,10};
        int [] arr={12,8,12,9};
        System.out.println(" Second Largest Element : "+second.secondLargest(arr));
        System.out.println(Arrays.toString(arr));
        second.reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }
}
