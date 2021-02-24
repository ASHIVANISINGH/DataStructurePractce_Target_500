package bitwise.operater.techei.delight;

public class CheckNumberEvenOrOdd {
    public boolean checkingNumber(int n){
        return (n !=0)&&((n&(n-1))==0);
    }
    public static void main(String [] args){
        CheckNumberEvenOrOdd checking =new CheckNumberEvenOrOdd();
        System.out.println(" Number "+checking.checkingNumber(8));
    }
}
