package string.java.com.geekforgeek.pratice;

import java.util.*;

public class LeftFirstRepeatedChaaterBruteForce {

    public int LeftMost(String str){
//        HashSet<Character> hash=new HashSet<>();
//        int k=0;
//        for(char c : str.toCharArray()){
//            k++;
//            if(hash.contains(c)){
//                return k;
//            }
//            hash.add(c);
//        }
//        return -999999999;
//        HashMap<Character,Integer> hash=new HashMap<>();
//        for(char c : str.toCharArray()){
//            hash.put(c,hash.getOrDefault(c,0)+1);
//
//        }
//        int k=0;
//        for(char c : str.toCharArray()){
//            k++;
//            if(hash.get(c)>1){
//                return k;
//            }
//        }
//        return -99999999;
        LinkedHashMap<Character,Integer> link=new LinkedHashMap<>();
        for(char c : str.toCharArray()){
            link.put(c,link.getOrDefault(c,0)+1);
        }
        Set set=link.entrySet();
        Iterator i=set.iterator();

        while (i.hasNext()){
            Map.Entry me=(Map.Entry)i.next();
            if(((Integer)me.getValue())>1){
                return 0;
            }
        }
        return 0;
    }
    public static void main(String [] args){
        LeftFirstRepeatedChaaterBruteForce left=new LeftFirstRepeatedChaaterBruteForce();
        System.out.println("Character is Present at : "+left.LeftMost("gee"));
    }
}
