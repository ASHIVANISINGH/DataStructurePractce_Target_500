package hashing.java.geekforgeek.com;

public class UnionOfTwoUnsortedArrayNaiveApproach {

    public static int calculateUnionOfTwoUnsortedArray(int arr1[],int arr2[]){
        int arr3[]=new int[arr1.length+arr2.length];
        int k=0;
        for(int i=0;i<arr1.length;i++){
            arr3[k]=arr1[i];
            k++;
        }
        for (int i=0;i<arr2.length;i++){
            arr3[k]=arr2[i];
            k++;
        }
        int count=0;
        for(int i=0;i<arr3.length;i++){
            boolean flag=false;
            for(int j=0;j<i;j++){
                if(arr3[i]==arr3[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args){
        int arr1[]=new int[]{15,20,5,15};
        int arr2[]=new int[]{15,15,15,20,10};
        System.out.println(calculateUnionOfTwoUnsortedArray(arr1,arr2));
    }
}
