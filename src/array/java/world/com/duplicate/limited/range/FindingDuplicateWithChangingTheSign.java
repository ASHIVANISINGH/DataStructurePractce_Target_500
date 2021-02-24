package array.java.world.com.duplicate.limited.range;

import java.util.Arrays;

public class FindingDuplicateWithChangingTheSign {

    public static int findingDuplicate(int [] Array){
        int duplicate=-1;

        for(int i : Array){
            int val=(i<1) ? -i :i;
            if(Array[val-1]>=0){
                Array[val-1]=-Array[val-1];
            }else{
                duplicate=val;
                break;
            }
        }
        for(int i=0; i<Array.length;i++){
            if(Array[i]<0){
                Array[i]=-Array[i];
            }
        }
        return duplicate;
    }
    public static void main(String [] args){
        int []Array= { 1, 2, 3, 4, 2 };
        System.out.println(Arrays.toString(Array));
        System.out.println("Duplicate value : "+findingDuplicate(Array));
        System.out.println(Arrays.toString(Array));

    }
}
