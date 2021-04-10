package string.java.com.geekforgeek;

public class FindLeftMostAnotherApproach {
    // this method just one traversal and
    // idea is simple
    // first we initialize the array with -1;
    //and start traversal in string for each and
    // every element check this element index equal to -1 or not
    // if not -1 then it' means simple this repeated character and we store in a result and we always check
    // this is minimum result or not ,if this result is not minimum with current then we update
    // result with this minimum index
    // we traversal whole string  and check in end value of
    // result , if value of result equal to maximum value of integer then it means their is not
    // repeated  character available we return -1 otherwise return value of result

    public static int findLeftMostCharacter(String str){
        int count[]=new int[256];
        for(int i=0;i<256;i++){
            count[i]=-1;
        }
        int result=Integer.MAX_VALUE;
        for(int i=0;i<str.length();i++){

            if(count[str.charAt(i)]==-1){
                count[str.charAt(i)]=i;
            }else {
                result=Math.min(result,count[str.charAt(i)]);
            }
        }

        return (result==Integer.MAX_VALUE ? -1 :result);
    }

    public static void main(String[] args) {

        String str="geekforgeek";
        System.out.println(findLeftMostCharacter(str));
    }
}
