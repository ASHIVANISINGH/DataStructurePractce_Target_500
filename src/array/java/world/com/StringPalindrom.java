package array.java.world.com;

public class StringPalindrom {
    public boolean checkString(String str){
        int i=0,j=str.length()-1;
        while (i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String [] args){
        StringPalindrom string=new StringPalindrom();
        System.out.println(string.checkString("abba"));
    }
}
