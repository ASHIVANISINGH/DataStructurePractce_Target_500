package hashing.java.geekforgeek.com;

public class LongestCommonSpanWithSameSumInTwoBinaryArrayNaiveApproach {

    // naive approach simple go for each and every element
    //  and count number of os and 1s in both array
    // if 0s and 1s are equal then update max count variable
    // go up to n-1

    public static int calculateLongestCommonSpan(int arr1[],int arr2[]){
        int maxCount=0;


        for(int i=0;i<arr1.length;i++){

            int arr1_c0=0,arr1_c1=0;
            int arr2_c0=0,arr2_c1=0;

            for(int j=i;j<arr1.length;j++){
                if(arr1[j]==0){
                    arr1_c0++;
                }else {
                    arr1_c1++;
                }
                if(arr2[j]==0){
                    arr2_c0++;
                }else {
                    arr2_c1++;
                }

                if(arr1_c1==arr2_c1&&arr1_c0==arr2_c0){
                    maxCount=Math.max(maxCount,j-i+1);
                }
            }
        }
        return maxCount;
    }
    public static void main(String [] args){
        int arr1[]=new int[]{0,1,0,0,0,0};
        int arr2[]=new int[]{1,0,1,0,0,1};
        System.out.println(calculateLongestCommonSpan(arr1,arr2));
    }
}
