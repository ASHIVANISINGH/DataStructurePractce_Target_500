package hashing.java.geekforgeek.com;

public class IntersectionOfTwoArrayNaiveApproach {

    public static int  numberOfElementCommon(int arr1[],int arr2[] ){

        int count=0;
        // traverse from first array and
        for(int i=0;i<arr1.length;i++){
            boolean flag=false;
            //check previous element same or not
            // when we find similar element then break that loop
            for(int j=0;j<i;j++){
                if(arr1[j]==arr1[i]){
                    flag=true;
                    break;
                }
            }
            //if same then ignore this element
            if (flag==true){
                continue;
            }
            //if not same then find in second array
            // if meet similar element in second element then  increase
            //count and break that loop
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String [] args){
        int arr1[]=new int[]{10,15,20,15,30,30,5};
        int arr2[]=new int[]{30,5,30,8};
        System.out.println(numberOfElementCommon(arr1,arr2));
    }
}
