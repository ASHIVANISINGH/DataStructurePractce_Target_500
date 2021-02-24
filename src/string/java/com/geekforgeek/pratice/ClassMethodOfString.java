package string.java.com.geekforgeek.pratice;

public class ClassMethodOfString {

    public static boolean checkMethod(String str1,String str2){

        if(str1.length()!=str2.length())
            return false;
        int[] count=new int[256];
        //for(int i=0;i<str1.length())
        for(char c : str1.toCharArray()){
            count[c]++;
        }
        for(char c : str2.toCharArray()){
            count[c]--;
        }
        for(int i=0;i<256;i++){
            if(count[i]!=0)
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println("String is Anagram : "+checkMethod("geekgeekfor","geekforgeek"));
    }
}
