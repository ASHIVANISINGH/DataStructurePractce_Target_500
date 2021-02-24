package bitwise.operater.techei.delight;

public class CheckBinaryRepresentationINPalindrome {
    public static boolean checkingNumberRepresentation(int n){
        //idea is simple , first we reverse the bit and store in a variable after that compare with
        //integer value
        int res=0;
        int n1=n;
        while (n1 !=0){
            res=(res<<1)|(n1&1);
            n1=n1>>1;
        }
        return n==res;
    }
    public static void main(String [] args){
        int n=3;
        System.out.println(n+" Number in binary representation in palindrome :"+checkingNumberRepresentation(n));
    }
}
