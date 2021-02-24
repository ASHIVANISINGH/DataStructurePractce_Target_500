package array.java.world.com.geek.forgeek;

public class SubsetGenerationProblem {

    public void subsetGeneration(String str,int index,String cur){
        //int index=0;
        int n=str.length();
        if(n==index){
            System.out.print(" "+cur);
            return;
        }
        subsetGeneration(str,index+1,cur+str.charAt(index));
        subsetGeneration(str,index+1,cur);



    }
    public static void main(String [] args){
        SubsetGenerationProblem  sub=new SubsetGenerationProblem();
        sub.subsetGeneration("abcd",0,"");
    }
}
