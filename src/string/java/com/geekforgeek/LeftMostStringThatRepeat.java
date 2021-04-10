package string.java.com.geekforgeek;

public class LeftMostStringThatRepeat {
    // Naive Approach
    // for each character we check after that similar character of that character exist or not
    // if exit then return that value other move to next character
    // repeat whose process
    // if we don't get any element then we return  -1 in end

    public static int findLeftMostStringThatRepeat(String str1){

        for(int i=0;i<str1.length();i++){

            for(int j=i+1;j<str1.length();j++){
                if(str1.charAt(i)==str1.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        String str1="geekforgeeks";
//        String str1="abbcc";
        String str1="abcd";
        System.out.println(findLeftMostStringThatRepeat(str1));
    }
}
