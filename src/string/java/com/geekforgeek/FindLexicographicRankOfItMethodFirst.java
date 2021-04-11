package string.java.com.geekforgeek;

public class FindLexicographicRankOfItMethodFirst {

    public static int calculateLexicoGraphic(String str){
        int count[]=new int[256];
        int length=str.length();
        int multi=calculateFactorial(length);
        int rank=1;

        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=1;i<256;i++){
            count[i]=count[i]+count[i-1];
        }
        for(int i=0;i<length;i++ ){
            multi=multi/(length-i);
            rank=rank+count[str.charAt(i)-1]*multi;
            for(int j=str.charAt(i);j<256;j++){
                count[j]--;
            }

        }
        return rank;

    }
    public static int calculateFactorial(int number){
        if(number==0){
            return 1;
        }else {
            return number*calculateFactorial(number-1);
        }
    }

    public static void main(String[] args) {
        String str="String";
        System.out.println(calculateLexicoGraphic(str));
    }
}
