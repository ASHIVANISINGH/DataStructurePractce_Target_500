package bitwise.operater.geekfor.geek;

public class CountBitInANumber {
    public static int countBit(int n){
        int res=0;
        while (n!=0){
            n=n&(n-1);
            res++;
        }
        return res;
    }
    public static void main(String [] args){
        CountBitInANumber count=new CountBitInANumber();
        System.out.println(" Number of set Bit in a number: "+countBit(5));
    }
}
