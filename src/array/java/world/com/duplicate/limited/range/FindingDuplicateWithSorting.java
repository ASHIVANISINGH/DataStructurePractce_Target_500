package array.java.world.com.duplicate.limited.range;

import java.util.Arrays;

public class FindingDuplicateWithSorting {

    public static int findingDuplicateArray(int [] Array){
        Arrays.sort(Array);
        for(int i=0;i<Array.length-1;i++){
    
            if(Array[i]==Array[i+1]){
                return Array[i];
            }
        }
        return -1;
    }
    public static void main(String [] args){
        FindingDuplicateWithHashing fine=new FindingDuplicateWithHashing();
        int [] Array={1,2,5,4,0,5,56,9};
        System.out.println(Arrays.toString(Array));
        System.out.println("Duplicate Item in the Array :"+findingDuplicateArray(Array));
    }

}
