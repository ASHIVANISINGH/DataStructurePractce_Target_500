package hashing.java.geekforgeek.com;

public class LongestSubArrayWithEqualNumberOfOneAndZeroNaiveApproach {


    public static int calculateLongestSubArrayWithEqualNumber(int arr[]){
        int maxCount=0;
        for(int i=0;i<arr.length;i++){
            int c0=0,c1=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]==0){
                    c0++;
                }else {
                    c1++;
                }

                if(c0==c1){
                    maxCount=Math.max(maxCount,j-i+1);
                }

            }

        }
        return maxCount;
    }
    public static void main(String args[]){
        int arr[]=new int[]{1,0,1,1,1,0,0};
        System.out.println(calculateLongestSubArrayWithEqualNumber(arr));
    }
}
