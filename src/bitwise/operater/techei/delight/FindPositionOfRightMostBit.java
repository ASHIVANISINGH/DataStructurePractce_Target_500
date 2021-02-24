package bitwise.operater.techei.delight;

public class FindPositionOfRightMostBit {

    public static int findPositionOfRightMostBit(int n){
        // return first position if number is odd because right most bit set in oadd
        if((n&1)==1)
            return 1;
        //unset the left most bit and perform xor operation number with it self
        n=n^(n&(n-1));
        int pos=0;
        while (n>0){
            n=n>>1;
            pos++;
        }
        return pos;
    }
    public static void main(String []args){
        System.out.println("Right most of a Bit in 20 a number : "+findPositionOfRightMostBit(20));
    }
}
