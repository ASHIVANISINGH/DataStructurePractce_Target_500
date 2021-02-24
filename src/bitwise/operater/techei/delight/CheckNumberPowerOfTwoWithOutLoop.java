package bitwise.operater.techei.delight;

public class CheckNumberPowerOfTwoWithOutLoop {
    public static boolean checkingNumberOfPowerOfTwo(int n ){
        return (n&(n-1))==0;

    }
    public static void main(String []args){
        System.out.println("4 is power of two : "+checkingNumberOfPowerOfTwo(4));
    }
}
