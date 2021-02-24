package bitwise.operater.techei.delight;

public class DetectedTwoBitHaveOppositeSignOrNot {

    public static String detectTwoBitHavingSign(int number1,int number2) {
        if((number1^number2)<0){
            return "True";
        }
        return "False";
    }
    public static void main(String [] args){
      //  DetectedTwoBitHaveOppositeSignOrNot detect=new DetectedTwoBitHaveOppositeSignOrNot();
        System.out.println("Number have Opposite Sign  : "+detectTwoBitHavingSign(5,-2));
    }
}
