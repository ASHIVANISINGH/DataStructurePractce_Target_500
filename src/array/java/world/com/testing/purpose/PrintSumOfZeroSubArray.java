package array.java.world.com.testing.purpose;

import java.util.ArrayList;

public class PrintSumOfZeroSubArray {

    public static void printSubArray(int [] array,int sum){
        ArrayList<ArrayList<Integer>> arrayList=new ArrayList<>();

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){

                for(int k=j+1;j<array.length-1;j++){
                    if(array[i]+array[j]+array[k]==sum){
                        ArrayList<Integer> arrayList1=new ArrayList<>();
                        arrayList1.add(array[i]);
                        arrayList1.add(array[j]);
                        arrayList1.add(array[k]);
                        arrayList.add(arrayList1);
                    }
                }
            }
        }
        System.out.println(arrayList);
    }
    public static void main(String [] args){
        PrintSumOfZeroSubArray pri=new PrintSumOfZeroSubArray();
        int [] array=new int[]{4,2,-3,-1,0,4,-1,1};
        printSubArray(array,0);
    }

}
