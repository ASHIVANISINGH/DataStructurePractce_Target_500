package bitwise.operater.techei.delight;

 class CheckNumberBinaryRepresentationIsInPalindrome {

    public static void checkBinaryRePresentation(int n){
        StringBuilder str1=null;
                str1.append(Integer.toBinaryString(n));
        StringBuilder str2=str1.reverse();
        System.out.print("Number Binary Representation : "+str1);
        System.out.println("Number reverse order in Binary Representation :"+str2);
        if(str1.equals(str2)){
            System.out.println("Number is Palindrome ");
        }else
        {
            System.out.println("Number is not Palindrome ");
        }
    }
    public static void main(String [] args){
        checkBinaryRePresentation(3);
    }
}
