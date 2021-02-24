package array.java.world.com.testing.purpose;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindPairInTheSum {

    public void findingSumArray(int [] array,int sum){
        Set<ArrayList<Integer>> set=new HashSet<>();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[i]+array[j]==sum){
                    ArrayList<Integer> tempList=new ArrayList<>();
                    tempList.add(array[i]);
                    tempList.add(array[j]);
                    list.add(tempList);
                    set.add(tempList);

                }
            }
        }
        System.out.println(list);
        //System.out.println(set);
    }
    public static void main(String [] args){
        FindPairInTheSum fi=new FindPairInTheSum();
        int [] array={8, 7, 2, 5, 3, 1};
        int sum=10;
        fi.findingSumArray(array,sum);
    }
  }
