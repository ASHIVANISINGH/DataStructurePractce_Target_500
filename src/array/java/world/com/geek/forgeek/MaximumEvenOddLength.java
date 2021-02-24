package array.java.world.com.geek.forgeek;

import java.util.Scanner;

public class MaximumEvenOddLength {

    public static int countMaximumEvenOddAlternative(int [] array){
        int res=1,current=1;
        for(int i=1;i<array.length;i++){

            if((array[i]%2==0&&array[i-1]%2!=0)||(array[i-1]%2==0&&array[i]%2!=0)){
                current++;
                res=Math.max(res,current);
            }else {
                current=1;
            }
        }
        return res;
    }
    public static void main(String [] args){
        int array[]={7,8,9,10,12,14,7,8,1,2,3,4};
        System.out.println("Maximum even odd length of this array : "+countMaximumEvenOddAlternative(array));
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
    }
}
