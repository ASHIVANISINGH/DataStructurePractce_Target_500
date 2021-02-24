package array.java.world.com.geek.forgeek;

public class PreFIxSumOfArray {
    public  static int[] calculatePreprocessArray(int []array){
        for(int i=1;i<array.length;i++){
            array[i]=array[i]+array[i-1];

        }
        return array;
    }

    public static int calculatePrefixSumOfArray(int [] array,int s,int e){
        // preprocess n element in array for calculate array element
        array=calculatePreprocessArray(array);
        if(s==0){
            return array[e];
        }else return array[e]-array[s-1];

    }
    public static void main(String []args){
        int []array={2,8,3,9,6,5,4};
        System.out.print(""+calculatePrefixSumOfArray(array,1,3));
    }
}
