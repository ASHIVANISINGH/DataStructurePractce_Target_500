package bitwise.operater.techei.delight;

public class ComputingTheParityOfANumber {

    public static boolean checkParityOfANumber(int n){
        boolean parity=false;
        while (n>0){
            if((n&1)==1) {
                parity = !parity;
            }
            n=n>>1;
        }
        return parity;
    }
    public static void main(String [] args){
        int n=31;
        boolean parity=checkParityOfANumber(n);
        if(parity) {
            System.out.println("Odd  Parity of this  number " +n);
        }else {
            System.out.println("Even parity of this number "+n);
        }
    }
}
