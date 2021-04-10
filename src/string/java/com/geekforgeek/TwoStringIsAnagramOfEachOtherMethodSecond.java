package string.java.com.geekforgeek;

public class TwoStringIsAnagramOfEachOtherMethodSecond {
    // here we count frequency of each character we know that each character rang from 0 to 256
    // we treat character as integer in java
    // creating 256 value of ascii value of empty value array
    // what we get character that time increase the value
    // of count integer in the array
    //and iterate the second string each time what value in second string decrease that value
    // after iterating second string we check in array any value is not zero
    // if we get any point not zero then return false
    // otherwise return true

    public static boolean checkTwoStringIsAnagram(String str1,String str2){
        if(str1.length()!=str2.length())
            return false;
        int count[]=new int[256];

        for(int i=0;i<str1.length();i++){
            count[str1.charAt(i)]++;
        }

        for(int i=0;i<str2.length();i++){
            count[str2.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1="geeks";
        String str2="ekegs";
//        String str1="aabcd";
//        String str2="abbcd";
        System.out.println(checkTwoStringIsAnagram(str1,str2));
    }
}
