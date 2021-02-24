package bitwise.operater.techei.delight;

public class AddingOneGivenInteger {

    public static void main(String [] args){
//        int x=5;
//        System.out.println(x+""+"+"+1+"");
        int x = 4;
        System.out.println(x + " + " + 1 + " is " + -~x);

        x = -5;
        System.out.println(x + " + " + 1 + " is " + -~x);

        x = 0;
        System.out.println(x + " + " + 1 + " is " + -~x);
    }

}
