package string.java.com.geekforgeek.pratice;

public class StringAnaram {

    public static void  compareString(String str1,String str2){
        char [] arr1=str1.toCharArray();
        char [] arr2=str2.toCharArray();

        for(int i=0; i< arr1.length;){
            int k=0;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                   k++;
                   if(k==arr2.length)
                       System.out.println(" "+(i-j));
                   i++;
                   continue;
                   //i=(i-j)+1;
                }else
                    i=(i-j)+1;
            }
        }
    }
    public static void main(String [] ars){
        compareString("This is geeks","geeks");
    }
}
