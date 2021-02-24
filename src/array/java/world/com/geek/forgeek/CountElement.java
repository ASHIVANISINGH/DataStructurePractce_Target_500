package array.java.world.com.geek.forgeek;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountElement {

    public int countFrequency(int []Array){
        HashMap<Integer,Integer> hash=new HashMap<>();

        for(int i : Array){
            hash.put(i,hash.getOrDefault(i,0)+1);
        }
        Set set=hash.entrySet();
        Iterator i=set.iterator();
//         for(i.hasNext()){
//            Map.Entry me=(Map.Entry)i.next();
//            System.out.println(me.getKey()+" :");
//            System.out.println(me.getValue()+"");
//        }

     return 0;
    }
}
