package bitwise.operater.techei.delight;

public class RightMostSetBitPosition {

    public static int rightMostSetBit(int n){
        //if number is odd then
        if((n&1)==1)
            return 1;
      //  n=n&(-n);
        return log(n&-n,2)+1;
    }
    public static int log(int number,int base){
        return(int ) (Math.log(number)/Math.log(2));
    }
    public static void main(String []args){
        //RightMostSetBitPosition right=new RightMostSetBitPosition();
        System.out.println("Position of Right most set bit of a number : "+rightMostSetBit(4));
    }

}
