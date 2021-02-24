package array.java.world.com.geek.forgeek;

public class MaximumCountingConsecutiveCircularSum {

    public static int calculateMaximumConsecutive(int []array){

        int res=array[0];
        int maxEnding=array[0];
        for(int i=1;i<array.length;i++){
            maxEnding=Math.max(maxEnding+array[i],array[i]);
            res=Math.max(res,maxEnding);
        }
//        for(int i=0;i<array.length;i++){
//            maxEnding=Math.max(maxEnding+array[i],array[i]);
//            res=Math.max(res,maxEnding);
//        }
        return res;

    }
    public static void main(String [] args){
        int arr[]={3,-4,5,6,-8,7};
        System.out.println(""+calculateMaximumConsecutive(arr));
    }
}
