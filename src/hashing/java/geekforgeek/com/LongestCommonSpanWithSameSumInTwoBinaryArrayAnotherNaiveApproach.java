package hashing.java.geekforgeek.com;

public class LongestCommonSpanWithSameSumInTwoBinaryArrayAnotherNaiveApproach {

    public static int calculateLongestCommonSpanWithSameSumInTwoBinary(int arr1[],int arr2[]){
        int sum1=0,sum2=0;
        int maxCont=0;
        for(int i=0;i<arr1.length;i++){
            sum1=0;
            sum2=0;
            for(int j=i;j<arr1.length;j++){
                sum1+=arr1[j];
                sum2+=arr2[j];

                if(sum1==sum2){
                    maxCont=Math.max(maxCont,j-i+1);
                }
            }
        }
        return maxCont;
    }


    public static void main(String[] args) {
        int arr1[]=new int[]{0,1,0,0,0,0};
        int arr2[]=new int[]{1,0,1,0,0,1};
        System.out.println(calculateLongestCommonSpanWithSameSumInTwoBinary(arr1,arr2));
    }
}
