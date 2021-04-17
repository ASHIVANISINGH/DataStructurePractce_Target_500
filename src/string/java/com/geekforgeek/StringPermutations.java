package string.java.com.geekforgeek;

public class StringPermutations {

    public static void makePermutationOfAString(String str,int l,int r){

        if(l==r){
            System.out.print("\t "+str);
        }else {
            for(int i=l;i<=r;i++){
                str=swapOfString(str,i,l);
                makePermutationOfAString(str,l+1,r);
                str=swapOfString(str,i,l);
            }
        }

    }
    public static String swapOfString(String str,int l,int r){
        char array[]=str.toCharArray();
        char temp=array[l];
        array[l]=array[r];
        array[r]=temp;
        return String.valueOf(array);
    }

    public static void main(String[] args) {
        String str="ABC";
        makePermutationOfAString(str,0,str.length()-1);
    }
}
