package array.java.world.com.geek.forgeek;

import java.util.Arrays;

public class MishingElement {

    public int mishingElementInArray(int [] array){
        Arrays.sort(array);
        int repeating=0,missing;
        int sum=0;
        for(int i=0;i<array.length-1;i++){
            sum+=array[i];
            if(array[i]==array[i+1]){
                repeating=array[i];
            }
        }
        sum+=array[array.length-1];
        sum-=repeating;
        int sumtobe=(array.length)*(array.length+1)/2;
        missing=sumtobe-sum;
        return missing;
    }
    public static void main(String args[]){
        MishingElement mish=new MishingElement();
        int [] array={1,2,2,3,5};
        System.out.println("Missing element : "+mish.mishingElementInArray(array));
    }
}
