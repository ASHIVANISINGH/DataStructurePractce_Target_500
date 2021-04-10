package string.java.com.geekforgeek;

import java.util.HashMap;

public class TwoStringIsAnagramOfEachOtherMethodFirst {


    public static boolean checkGivenStringAnagram(String str,String str2){
        HashMap<Character,Integer> hashMap=new HashMap<>();
        if(str.length()!=str2.length()){
            return false;
        }

        for(int i=0;i<str.length();i++){

            hashMap.put(str.charAt(i),hashMap.getOrDefault(str.charAt(i),0)+1);
        }

        for(int i=0;i<str2.length();i++){

            if(!hashMap.containsKey(str2.charAt(i))){
                return false;
            }
            if(hashMap.get(str2.charAt(i))==1){
                hashMap.remove(str2.charAt(i));
            }else if(hashMap.get(str2.charAt(i))>1){
                hashMap.put(str2.charAt(i),hashMap.getOrDefault(str2.charAt(i),0)-1);
            }else {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {

//        String str="geeks";
//        String str2="ekegs";
        String str="aabcd";
        String str2="abbcd";

        System.out.println(checkGivenStringAnagram(str,str2));
    }
}
