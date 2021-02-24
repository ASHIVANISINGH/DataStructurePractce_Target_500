package bitwise.operater.techei.delight;

public class CheckkThBitOfANumberSetOrNot {

    public static boolean checkKthBitOfANumber(int n,int k){

           // return (n & (1 << (k - 1))) != 0;
        return (n & (1 << (k-1)))!=0;
    }
    public static void main(String [] args){
        CheckkThBitOfANumberSetOrNot check=new CheckkThBitOfANumberSetOrNot();
        System.out.println("7 number ,2 nd bit set or not : "+checkKthBitOfANumber(7,2));
    }
}
