package bitwise.operater.techei.delight;

public class NumberOfBitNeedToBeFlipedToConvertInAGivenIntegerWithXorOpertion {
    public static int numberOfBitNeedToConveted(int n,int convertedNumber){
        //idea is simple first take operation for xor for same bit become zero
        //and opsite digit become 1
        int xor=n^convertedNumber;
        int count=0;
        //after this apply brink kernighan algorithm
        //for count number of bit
        while(xor!=0){
            count++;
            xor=xor&(xor-1);
        }
        return count;
    }
    public static void main(String [] args){
        int x=80,y=85;
        System.out.println(x+"In Binary represation of a number : "+Integer.toBinaryString(x));
        System.out.println(y+"In Binary represation of a number : "+Integer.toBinaryString(y));
        System.out.println("Number of Bit Need to Fliped to converted in a given integer : "+numberOfBitNeedToConveted(x,y));
    }
}
