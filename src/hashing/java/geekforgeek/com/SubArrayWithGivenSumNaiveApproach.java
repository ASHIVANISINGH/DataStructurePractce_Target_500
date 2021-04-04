package hashing.java.geekforgeek.com;

public class SubArrayWithGivenSumNaiveApproach {
// we start traverse array with first element and add it on current sum
    // check if current sum equal to given sum if yes then return true
    // otherwise we add next element this process continue  up to last
    // similar process for second element it goes up to n-1 element
    //
    public static boolean calculateSubArrayWithGivenSum(int arr[],int sum){

         // start traverse with first element
        for(int i=0;i<arr.length;i++){
            int curr_sum=0;
           // add it on current sum and check with given sum
            for(int j=i;j<arr.length;j++){
                curr_sum+=arr[j];
                if(curr_sum==sum){
                    // if current sum equal to given sum then
                    // return true otherwise return false
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String [] args){
        int arr[]=new int[]{5,8,6,13,3,-1};
        int sum=22;
        System.out.println(calculateSubArrayWithGivenSum(arr,sum));
    }
}
