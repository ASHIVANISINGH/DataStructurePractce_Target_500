package bitwise.operater.techei.delight.alphabet;

public class ConvertUpperToLower {

    public static void convertLetter(String str){
        char or=' ';
        for(char c : str.toCharArray()){
            char t=(char)(c |or);
            System.out.print(""+t);
        }
    }
    public static void main(String [] args){
        String str="ANVEKFNWOWEDMWM";

        System.out.println("Convert Upper character to lower ");
        convertLetter(str);
    }
}
