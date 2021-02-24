package array.java.world.com.geek.forgeek;

public class MaximumCircularSumOfSubArray {

    public static int calculateSumOfSubArray(int [] array){

        int res=array[0];
        int minEnd=array[0];

        for(int i=1;i<array.length;i++){
            minEnd=Math.min(minEnd,array[i]);
            res=Math.min(res,minEnd);

        }
        int total=0;
        for(int i : array){
            total+=i;
        }
        return total-res;
    }
    public static void main(String [] args){
        int arr[]={5,-2,3,4};
        System.out.println("Maximum sum of sub array : "+calculateSumOfSubArray(arr));
    }
}
