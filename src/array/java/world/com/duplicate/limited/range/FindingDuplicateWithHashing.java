package array.java.world.com.duplicate.limited.range;

public class FindingDuplicateWithHashing {

    public static int  findDuplicate(int [] Arrays){
        boolean[] trueArray=new boolean[Arrays.length+1];
        for(int i : Arrays){
            if(trueArray[i]){
                return i;
            }
            trueArray[i]=true;
        }
       return -1;
    }
    public static void main(String [] args){
        FindingDuplicateWithHashing find=new FindingDuplicateWithHashing();
        int [] Array=new int[]{1,2,3,4,4};
        System.out.println(" Duplicate element : "+findDuplicate(Array));

    }
}
