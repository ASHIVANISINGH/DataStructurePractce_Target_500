package string.java.techidelight;

import sun.applet.resources.MsgAppletViewer_zh_TW;

import java.util.Arrays;

public class LeftAndRightRotationOfString {

    public void convertRotationLeftAndRight(String str,int d){
        char[] array=str.toCharArray();
        System.out.println("Left Rotation Of Array : "+leftRotationArray(array,d));
        array=str.toCharArray();
        System.out.println("Right Rotation Of Array : "+rightRotationArray(array,d));
    }
    public static String leftRotationArray(char [] arr,int d){
        for(int i=0;i<d;i++){
            swapLeftArray(arr);
        }
        StringBuilder sbk=new StringBuilder("");
        return sbk.append(arr).toString();
    }
    public static void swapLeftArray(char [] arr){
        char a=arr[0];
        int i=1;
        for( i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[i-1]=a;
    }

    public static String rightRotationArray(char [] array,int d){
        for(int i=0;i<d;i++){
            swapRightArray(array);
        }
        StringBuilder sbk=new StringBuilder();
        return sbk.append(array).toString();
    }
    public static void swapRightArray(char[] array){
        char a=array[array.length-1];
        for(int i=array.length-1;i>1;i--){
            array[i]=array[i-1];
        }
        array[0]=a;
    }
    public static void main(String [] args){
        LeftAndRightRotationOfString left=new LeftAndRightRotationOfString();
        left.convertRotationLeftAndRight("geekforgeek",2);
    }
}
