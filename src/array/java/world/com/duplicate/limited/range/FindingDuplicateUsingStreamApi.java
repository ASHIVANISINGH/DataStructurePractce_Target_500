package array.java.world.com.duplicate.limited.range;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingDuplicateUsingStreamApi {

    public int findDuplicate(int [] Array){
        int Actual_sum= IntStream.of(Array).sum();
        int expected_sum=Array.length*(Array.length-1)/2;

        return Actual_sum-expected_sum;
    }
    public static void main(String[] args){
        int [] Array={1,2,3,4,2};
        FindingDuplicateUsingStreamApi find=new FindingDuplicateUsingStreamApi();
        System.out.println(Arrays.toString(Array));
        System.out.println("Duplicate Number : "+find.findDuplicate(Array));
        System.out.println(Arrays.toString(Array));
    }
}
