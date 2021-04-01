package array.java.world.com;

public class FindFactorial {

    public int calculateFactorial(int number){
        if(number==1)
            return 1;
        else return number* calculateFactorial(number-1);
    }
    public static void main(String args[]){
        FindFactorial find=new FindFactorial();
        System.out.println(""+find.calculateFactorial(7));
    }
}
