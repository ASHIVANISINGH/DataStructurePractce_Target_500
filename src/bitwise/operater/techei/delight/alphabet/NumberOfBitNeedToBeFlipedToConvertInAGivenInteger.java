package bitwise.operater.techei.delight.alphabet;

public class NumberOfBitNeedToBeFlipedToConvertInAGivenInteger {

    public static int numberOfConvertBitOfFliped(int n,int convertdNumber){
        int len=0;
        while ((n!=0)||(convertdNumber!=0)){
            if((n&1)!=(convertdNumber&1)){
                len++;
            }
            n=n>>1;
            convertdNumber=convertdNumber>>1;
        }
        return len;
    }
    public static void main(String [] args){
        int n=2,converted=3;
        System.out.println(n+" Number need number of bit Fliped "+numberOfConvertBitOfFliped(n,converted)+"  to converted "+converted);
    }
}
