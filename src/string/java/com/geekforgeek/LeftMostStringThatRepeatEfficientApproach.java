package string.java.com.geekforgeek;

public class LeftMostStringThatRepeatEfficientApproach {

    // idea is simple first count frequency of each character
    // and again traverse string and check first character whose
    // string is grater than 1 and return it
    // if no character find then return -1

    public static int findLeftMostStringThatRepeat(String str1){
        int count[]=new int[256];

        for(int i=0;i<str1.length();i++){
            count[str1.charAt(i)]++;
        }
        for(int i=0;i<str1.length();i++){
            if(count[str1.charAt(i)]>1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str1="geekforgeek";
        System.out.println(findLeftMostStringThatRepeat(str1));

    }
}
