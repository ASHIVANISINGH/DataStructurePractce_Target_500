package string.java.com.geekforgeek.pratice;

import java.util.Arrays;

public class TwoStringAnagram {

    public static boolean checkStringAnagram(String str,String str2){
        char [] arr=str.toCharArray();
        Arrays.sort(arr);
        char [] arr2=str2.toCharArray();
        Arrays.sort(arr2);
        if(arr.equals(arr2))
            return true;
        else
            return false;
    }
    public static void main(String [] args){

        System.out.println(checkStringAnagram("geeks","gkees"));
    }
}
