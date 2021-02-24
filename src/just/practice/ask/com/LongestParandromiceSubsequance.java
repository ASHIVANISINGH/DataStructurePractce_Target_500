package just.practice.ask.com;

public class LongestParandromiceSubsequance {

    public int longestParandromiceSubsequcance(String str,int low,int high){

        if(high-low>=2){
            int length1=0,length2=0;
            int mid=low+(high-low)/2;
            longestParandromiceSubsequcance(str,low,mid);
            longestParandromiceSubsequcance(str,mid+1,high);
            length1=+checkParandomOrNot(str,low,mid);
            length2=+checkParandomOrNot(str,mid+1,high);
            return length1+length2;
        }
        return 0;
    }
    public static int checkParandomOrNot(String str,int low,int high){
        int low1=low,high1=high;
        while (low1<=high1){
            if(str.charAt(low1)!=str.charAt(high))
                return 0;
            low1++;
            high1--;
        }
        return high-low;
    }
    public static void main(String []args){
        LongestParandromiceSubsequance longest=new LongestParandromiceSubsequance();
        String str="aa";
        System.out.println("Length of Longest Parandomic subsequance "+longest.longestParandromiceSubsequcance(str,0,str.length()-1));
    }
}
