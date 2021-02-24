package array.java.world.com.geek.forgeek;

public class MajorityElementWithBruteForce {

    public static int majorityElementInArray(int [] array){
        int count=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j])
                    count++;
            }
            if(count>=(array.length/2)){
                return i;
            }else count=0;
        }
        return -1;
    }
    public static void main(String [] args){
        int arr[]={4,3,8,8,8};
        System.out.println("Majority Element of index : "+majorityElementInArray(arr));
    }
}
