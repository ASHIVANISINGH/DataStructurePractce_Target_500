package array.java.world.com.geek.forgeek;

public class MaximumConsecutive {
    public static int maximumConsecutiveOne(int [] array){
        int maxCount=0,count=0;
        for(int i : array){
            if(i==1){
                count++;
                maxCount=Math.max(count,maxCount);
            }else {
                count=0;
            }
            //maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }
    public static void main(String []args){
        int []arr={1,1,0,1,1,1,1,0,0,1};
        System.out.println("Maximum Consecutive one : "+maximumConsecutiveOne(arr));
    }
}
