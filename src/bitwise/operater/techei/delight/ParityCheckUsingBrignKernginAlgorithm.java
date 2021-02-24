package bitwise.operater.techei.delight;

public class ParityCheckUsingBrignKernginAlgorithm {

    public static boolean checkParityOfANumber(int n){
        boolean parity=false;
        while (n>0){
            parity=!parity;
            n=n&(n-1);
        }
        return parity;
    }
    public static void main(String [] args){
        int n=31;
         boolean parity=checkParityOfANumber(n);
         if(parity){
             System.out.println("Number is odd parity "+n);
         }else {
             System.out.println("Number is even parity "+n);
         }
    }
}
