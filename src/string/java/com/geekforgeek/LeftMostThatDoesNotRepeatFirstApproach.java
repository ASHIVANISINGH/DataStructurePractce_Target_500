package string.java.com.geekforgeek;

public class LeftMostThatDoesNotRepeatFirstApproach {

    // first count the frequency of character in array
    // because every character ascii value belong 0 to 255
    // once we count we again traverse the array using character  and check
    // where firstIndex equal to 1 and return it ,if we not find
    // then we return simple -1
    public static int findLeftMostThatDoesNotRepeat(String str){
        int firstIndex []=new int[256];
        for(int i=0;i<str.length();i++){
            firstIndex[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(firstIndex[str.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str="geeksforgeeks";
        System.out.println(""+findLeftMostThatDoesNotRepeat(str));
    }
}
