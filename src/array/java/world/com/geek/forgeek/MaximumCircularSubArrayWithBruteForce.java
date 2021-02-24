package array.java.world.com.geek.forgeek;

public class MaximumCircularSubArrayWithBruteForce {

    public static int calculateMaximumSumOfSubArray(int []array){
        int res=0;
        for(int i=0;i<array.length;i++){
            int currentSum=array[i];
            int maxEnd=array[i];
            for(int j=1;j<array.length;j++){
                int index=(i+j)%array.length;
                currentSum=Math.max(currentSum+array[index],array[index]);
                maxEnd=Math.max(maxEnd,currentSum);
            }
            res=Math.max(res,maxEnd);
        }
        return res;
    }
    public static void main(String [] args){
        //int arr[]={5,-2,3,4};
        int arr[]={3,-4,5,6,-8,7};
        System.out.println("Maximum sum of sub array : "+calculateMaximumSumOfSubArray(arr));
    }
}
