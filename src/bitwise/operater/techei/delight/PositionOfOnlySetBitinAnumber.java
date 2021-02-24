package bitwise.operater.techei.delight;

public class PositionOfOnlySetBitinAnumber {

    public static int positionOfOnlySetBitANumber(int n){
        //check one Bit or not
        if((n&(n-1))!=0){
            System.out.println("Not Correct Number ");
            return -1;
        }
        return log(n&-n,2)+1;
    }
    public static int log(int number,int base){
        return (int)(Math.log(number)/Math.log(base));
    }
    public static void main(String []args){
        System.out.println("Position of only Set Number "+positionOfOnlySetBitANumber(8));
    }
}
