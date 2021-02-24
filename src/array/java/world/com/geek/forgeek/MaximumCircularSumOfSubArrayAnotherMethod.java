package array.java.world.com.geek.forgeek;

public class MaximumCircularSumOfSubArrayAnotherMethod {
    public static int calculateMaxSumNormalSubArray(int [] array){
        int maxEnding=array[0];
        int res=array[0];
        for(int i=1;i<array.length;i++){
            maxEnding=Math.max(maxEnding+array[i],array[i]);
            res=Math.max(res,maxEnding);
        }
        return res;
    }
    public static int calculateMaxSumOfSubArray(int [] array){
        int max_normal=calculateMaxSumNormalSubArray(array);
        if(max_normal<0)
            return max_normal;
        int sub_sum=0;
        for(int i=0;i<array.length;i++){
            sub_sum+=array[i];
            array[i]=-array[i];
        }
        sub_sum=sub_sum+calculateMaxSumNormalSubArray(array);
        return sub_sum;
    }
    public static void main(String [] args){
        int arr[]={5,-2,3,4};
        System.out.println("Maximum sum of sub array : "+calculateMaxSumOfSubArray(arr));
    }
}
