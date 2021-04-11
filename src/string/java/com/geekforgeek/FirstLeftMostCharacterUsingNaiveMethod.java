package string.java.com.geekforgeek;

public class FirstLeftMostCharacterUsingNaiveMethod {
    // here we simple traverse the string and check each and every character
    // repeat or not if not repeat then return -1
    //otherwise continue

    public static int findFirstLeftMostCharacter(String str){
        for(int i=0;i<str.length();i++){

            boolean flag=false;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    flag=true;
                }
            }
            if(flag){
                continue;
            }else {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str="geeksforgeeks";
        System.out.println(findFirstLeftMostCharacter(str));
    }
}
