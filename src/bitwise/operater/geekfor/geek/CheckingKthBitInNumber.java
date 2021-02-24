package bitwise.operater.geekfor.geek;

public class CheckingKthBitInNumber {

    public String checkingString(int number,int k){
        int i=1;
//        while (k!=0){
//            number=
//        }
        int t=i&(number>>(k-1));
        if(t!=0){
            return "Yes";
        }else {
            return "No";
        }
    }
    public static void main(String [] args){
        CheckingKthBitInNumber check=new CheckingKthBitInNumber();
        System.out.println(" "+check.checkingString(5,1));
    }
}
