package bitwise.operater.techei.delight;

public class SwapWIthUsingThirdVariable {
    public static void swap(int x,int y){
//        x=x^y;
//        y=x^y;
//        x=x^y;


    }
    public static void main(String []args){
        int x=4,y=5;
        System.out.println("Two Number Before Swaping :"+x+" "+y);
       // swap(x,y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Two Number After Swaping :"+x+" "+y);
    }
}
