package array.java.world.com.duplicate.limited.range;

import java.util.Arrays;

public class FindingDuplicateWithInLimitedRange {

    public int findingDuplicate(int [] Array){
        int xor=0;
        for(int i : Array){
            xor^=i;
        };
      //  int sum=((Array.length-1)*Array.length)/2;
      //  xor^=sum;
        for(int i=1;i<Array.length;i++){
            xor^=i;
        }
        return xor;
    }
    public static void main(String [] args){
        FindingDuplicateWithInLimitedRange find=new FindingDuplicateWithInLimitedRange();
        int [] Array= { 1, 2, 3, 4, 2 };
        System.out.println(Arrays.toString(Array));
        System.out.println("Duplicate Number : "+find.findingDuplicate(Array));
    }
}
