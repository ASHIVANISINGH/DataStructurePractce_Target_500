package array.java.world.com.geek.forgeek;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementWithEfficientSolution {

    public static int calculateMajorityElement(int []array){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
       // int majority=-1;
        int value=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if((entry.getValue())>=(array.length/2)) {
                value = entry.getKey();
                System.out.println(""+entry.getValue());
            }
        }
        if(value!=Integer.MAX_VALUE){
            for(int i=0;i<array.length;i++){
                if(array[i]==value)
                    return i;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int arr[]={4,3,8,8,8};
        System.out.println("Majority Element of index : "+calculateMajorityElement(arr));
    }
}
