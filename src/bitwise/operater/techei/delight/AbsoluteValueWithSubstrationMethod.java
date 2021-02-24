package bitwise.operater.techei.delight;

public class AbsoluteValueWithSubstrationMethod {
    public static int makeAbsoluteValue(int n){
        final int mask=n>>Integer.SIZE*8-1;
        int xor=n^mask;
        return xor-mask;
    }
    public static void main(String [] args){
        int n=-8;
        System.out.println("Absolute value of a number : "+makeAbsoluteValue(-8));
    }
}
