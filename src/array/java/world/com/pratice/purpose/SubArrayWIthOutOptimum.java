package array.java.world.com.pratice.purpose;

import java.util.ArrayList;
import java.util.Set;

public class SubArrayWIthOutOptimum {
    public static void sumOfSubArrayWithZero(int [] Array,int sum){

        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
      //  Set<ArrayList<Integer>> set=new S

        for(int i=0;i<Array.length;i++){
            for(int j=i+1;j<Array.length;j++){
                if(Array[i]==0)
             //       list.add(Array[i]);
                for(int k=j+1;k<Array.length;k++){
                    if((Array[i]+Array[j]+Array[k])==sum){
                        ArrayList<Integer> list=new ArrayList<>();
                        list.add(Array[i]);
                        list.add(Array[j]);
                        list.add(Array[k]);
                        mainList.add(list);
                        break;
                    }
                }
            }
        }
   //     mainList.add(list);
        System.out.println(mainList);
    }
    public static void main(String [] args){
        //int [] array ={1,2,3,4,-1,-2,-4,1,3,-5,2,-5,-3,0,-7};
        int [] array ={4,2,-3,-1,0,4};
        int sum=0;
        sumOfSubArrayWithZero(array,sum);
    }
}
