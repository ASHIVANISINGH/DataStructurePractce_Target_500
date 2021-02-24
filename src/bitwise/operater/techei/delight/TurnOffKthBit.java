package bitwise.operater.techei.delight;

public class TurnOffKthBit {

    public static int turnBitOfANumber(int n,int k){
        return (n&(~(1<<(k-1))));
    }
    public static void main(String [] args){
        TurnOffKthBit turn=new TurnOffKthBit();
        System.out.println("After turn of 20 th 3 ts bit "+turnBitOfANumber(20,3));
    }
}
