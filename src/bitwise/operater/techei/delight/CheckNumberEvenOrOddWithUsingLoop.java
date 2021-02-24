package bitwise.operater.techei.delight;

public class CheckNumberEvenOrOddWithUsingLoop {

    public static boolean checkEvenOrOdd(int n){
        if((n&1)==0)
            return true;
        return false;
    }
    public static void main(String [] args){
        System.out.println("20 Number ie even : "+checkEvenOrOdd(20));
    }
}
