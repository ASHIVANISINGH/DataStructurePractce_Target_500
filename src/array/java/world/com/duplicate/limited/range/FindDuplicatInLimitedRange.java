package array.java.world.com.duplicate.limited.range;

import java.util.Arrays;
import java.util.HashMap;

public class FindDuplicatInLimitedRange {

    public static int findingDuplicateElement(int [] Array){
        // applay hashmap for find duplicated in the array
        //we applay simple concept put the key with some default value ,if any key present in
        // Hashmap return that key to the user

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i : Array){
            if(map.containsKey(i))
                return i;
            map.put(i,map.getOrDefault(i,0+1));

        }
        return -1;
    }
    public static void  main(String [] args){
        int [] Array=new int []{1,2,3,4,4};
        System.out.println(Arrays.toString(Array));
        System.out.println(""+findingDuplicateElement(Array));
    }
}
