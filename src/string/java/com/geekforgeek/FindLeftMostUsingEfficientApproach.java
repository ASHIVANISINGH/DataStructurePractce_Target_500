package string.java.com.geekforgeek;

//import com.sun.org.apache.xpath.internal.operations.String;

//in this method we traverse the string and mark frequency if repeat by-2
// and we traverse array again and check minimum value in array whose value greater than
// 0

public class FindLeftMostUsingEfficientApproach {
    // another method

    public static int firstNonRepeat(String str){

        int result=Integer.MAX_VALUE;
        int firstIndex[]=new int[256];
        for(int i=0;i<256;i++){
            firstIndex[i]=-1;
        }
        for(int i=0;i<str.length();i++){
            if(firstIndex[str.charAt(i)]==-1){
                firstIndex[str.charAt(i)]=i;
            }else {
                firstIndex[str.charAt(i)]=-2;
            }
        }
        for(int i=0;i<str.length();i++){
            if(firstIndex[str.charAt(i)]>=0) {
                result = Math.min(result, firstIndex[str.charAt(i)]);
            }
        }
        return (result==Integer.MAX_VALUE ?-1 : result);
    }

    public static void main(String[] args) {
       // String str="geeksforgeeks";
        String str="geeksforgeeks";
        System.out.println(firstNonRepeat(str));
    }
}
