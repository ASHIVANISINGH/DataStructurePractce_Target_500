package hashing.java.geekforgeek.com;

public class PairWithGivenSumNaiveApproach {

    public static boolean checkAvailable(int arr[],int sum){

        // here approach is simple
        // we apply nested for loop
        //pick one element and traverse whole array for finding
        //element available in array
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String [] args){
        int arr1[]=new int[]{3,2,8,15,-8};
        int sum=17;
        System.out.println(checkAvailable(arr1,sum));
    }
}
