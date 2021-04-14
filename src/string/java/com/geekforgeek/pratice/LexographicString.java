package string.java.com.geekforgeek.pratice;

public class LexographicString {

    public int rankOfStringInLexographic(String str){
        int rank=1;
        int n=str.length();
        int mal=fuct(n);
        System.out.println(""+mal);
        int[] count=new int[256];
        char []arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<n;i++){
            count[i]=count[i]+count[i-1];
        }
        for(int i=0;i<n;i++){
            mal=mal/(n-i);
            rank=rank+count[arr[i]-1]*mal;
            for(int j=arr[i];j<256;j++) {
                count[j]--;
            }
        }
       return rank+1;
       // return 0;
    }

    public static int fuct(int n){
        if(n==0)
            return 1;
        return n*fuct(n-1);
    }

    public  static void main(String [] args){
        LexographicString lexo=new LexographicString();
        System.out.println("Lexigraphic string : "+lexo.rankOfStringInLexographic("cba"));
    }
}
