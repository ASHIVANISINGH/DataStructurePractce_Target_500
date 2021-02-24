package bitwise.operater.geekfor.geek;

import java.util.ArrayList;
import java.util.List;

public class FindTwoOddAppearingNumber {

    public static List  findTwoOddOccuring(int [] array){
        int xor=0;
        List<Integer> list=new ArrayList<>();
        for(int i : array){
            xor^=i;
        }
        int t=xor;
        int l=0;
       for(int i : array){
           xor^=i;
           if(xor==0)
               return list;
       }
       return list;
    }
}
