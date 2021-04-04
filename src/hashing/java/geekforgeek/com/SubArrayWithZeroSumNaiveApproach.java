package hashing.java.geekforgeek.com;

public class SubArrayWithZeroSumNaiveApproach {

    public static boolean checkSubArrayAvailableOrNot(int arr[]){
        // start with first element go up to last and add element in current_sum
        //after adding element check sum equal to zero or not
        //
        for(int i=0;i<arr.length;i++){
            int curr_sum=0;
            for(int j=i;j<arr.length;j++){
                curr_sum+=arr[j];
                if(curr_sum==0){
                    return true;
                }

            }
        }
         return false;
    }
    public static void main(String [] args){
        int arr[]=new int[]{1,4,13,-3,-10,5};
        System.out.println(checkSubArrayAvailableOrNot(arr));
    }
}
