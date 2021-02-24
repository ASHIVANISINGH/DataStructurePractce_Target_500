package bitwise.operater.techei.delight;

public class ToggleingTheKthBitOfANumber {

    public static int toggleingKthBitOfANumber(int n,int k){
        return (n^(1<<(k-1)));
    }
    public static void main(String[] args){
        System.out.println("After Toggle 20 th 3 bit toggleing "+toggleingKthBitOfANumber(20,3));
    }
}
