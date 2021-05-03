package string.java.com.geekforgeek;

import java.util.HashMap;

public class TwoStringIsAnagramOfEachOtherMethodFirst {

     // here first we create an hashmap, and copy the whole string in hashmap
    // we create key value in pair key is character and value increase by one
    //and iterate in second string and check character present in the hashmap
    // and decrease the value of key and if key' value equal to one the remove otherwise
    // decrease that value by one and before check value of key first we check value present in
    // hashmap or not , if character is not present in hashmap ,it means
    // string is not anagram so we return false
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
//        String str="aabcd";
//        String str2="abbcd";
        String str="aabdfg";
        String str2="abbcdhgt";

        System.out.println(checkGivenStringAnagram(str,str2));
    }
}
