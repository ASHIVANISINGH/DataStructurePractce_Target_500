package string.java.techidelight;

public class LongestPalindromeSubseqence {

    public static int calculateLongestPalindromeSubsequnce(String str,int i,int j){
        if(i>j) {
            return 0;
        }
        if(i==j) {
            return 1;
        }
        if(str.charAt(i)==str.charAt(j)){
            return calculateLongestPalindromeSubsequnce(str,i+1,j-1)+2;
        }
        return Integer.max(calculateLongestPalindromeSubsequnce(str,i,j-1),calculateLongestPalindromeSubsequnce(str,i+1,j));

    }
    public static void main(String [] args){
        String str="ABBDCACB";
        System.out.println("Longest Palindrome Subsequnce : "+calculateLongestPalindromeSubsequnce(str,0,str.length()-1));
    }
}
