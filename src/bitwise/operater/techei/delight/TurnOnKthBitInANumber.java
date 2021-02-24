package bitwise.operater.techei.delight;

public class TurnOnKthBitInANumber {
    public static int turnOnKthBitOfANumber(int n,int k){
        return (n|(1<<(k-1)));
    }
    public static void main(String [] args){
        TurnOnKthBitInANumber turnon=new TurnOnKthBitInANumber();
        System.out.println("Turnm On 20 number 4th bit ="+turnOnKthBitOfANumber(20,4));
    }
}
