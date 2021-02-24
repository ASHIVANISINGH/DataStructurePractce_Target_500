package string.java.com.geekforgeek.pratice;

public class LeftMostRepatingCharacter {

    public static int  checkRepeatingCharacter(String str){
        int res=Integer.MIN_VALUE;
        int[] fun=new int[256];
        for(int i=0;i<256;i++){
            fun[i]=-1;
        }
        int i=0;
        for(char c : str.toCharArray()){
            if(fun[c]==-1)
                fun[c]=c;
            else
                res=Math.min(res,fun[c]);
        }
        return (res==Integer.MIN_VALUE) ?-1 : res;
    }
    public static void main(String[] args){
        LeftMostRepatingCharacter left2=new LeftMostRepatingCharacter();
        System.out.println(" String First Left Most character : "+checkRepeatingCharacter("geekg"));
    }
}
