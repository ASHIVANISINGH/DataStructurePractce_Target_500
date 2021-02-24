package array.java.world.com.techie.delight;

import com.sun.deploy.util.SyncAccess;

import java.util.Arrays;

public class SortBinaryTreeWithLinearINBruteForceMethod {

    public void sortBinaryTree(int [] Array){
        int count=0;
        for(int i : Array){
            if(i==0){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            Array[i]=0;
        }
        for(int i=0;i<Array.length-count;i++){
            Array[count+i]=1;
        }
    }
    public static void main(String [] args){
        SortBinaryTreeWithLinearINBruteForceMethod sort=new SortBinaryTreeWithLinearINBruteForceMethod();
        int [] Array={1,0,0,1,0,1,0,1};
        System.out.println(Arrays.toString(Array));
        sort.sortBinaryTree(Array);
        System.out.println(Arrays.toString(Array));
    }
}
