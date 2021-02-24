package array.java.world.com.geek.forgeek;

public class MaximumSumOfSubArray {
//    public static int computeMaximumSum(int []array){
//
//        int maxSum=0,currentSum=0;
//        for(int i=0;i<array.length;i++){
//            currentSum=0;
//            for(int j=i;j<array.length;j++){
//                currentSum+=array[j];
//                maxSum=Math.max(currentSum,maxSum);
//            }
//
//        }
//        return maxSum;
//    }
    public static int computeMaximumSum(int []array){
        int maxSum=0,currentSum=0;
        //currentSum+=array[0];
        maxSum=array[0];
        int res=array[0];
        for(int i=1;i<array.length;i++){
           maxSum=Math.max(maxSum+array[i],array[i]);
           res=Math.max(maxSum,res);

        }
        return res;
    }
    public static void main(String [] args){
        int arr[]={2,3,-8,7,-1,2,3};
        System.out.println("Maximum Sum of SubArray : "+computeMaximumSum(arr));
    }
}
