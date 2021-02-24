package bitwise.operater.techei.delight;

public class FindItAbsouteValueWithOutBranching {

    public static int findAbsoluteValue(int n){
        final int mask=n>>Integer.SIZE*8-1;
        System.out.println("Mask of value : "+Integer.toBinaryString(mask));
        System.out.println("");
        n=(n+mask)^mask;
        return n;
    }
    public static void main(String [] args){
        FindItAbsouteValueWithOutBranching find=new FindItAbsouteValueWithOutBranching();
        int n=-8;
        System.out.println("Binary Reprenation of a number : "+Integer.toBinaryString(n));
        System.out.println("Absolute value of -8 is "+findAbsoluteValue(-8));
    }
}
